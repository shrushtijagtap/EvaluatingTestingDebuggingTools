package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str10 = doubleMetaphone0.encode(" H# ");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 97;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone(" H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str17 = doubleMetaphone0.encode("ARKPKMNSKT");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'A' + "'", char8 == 'A');
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKPKMNSKT" + "'", str17, "ARKPKMNSKT");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone(" ");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = doubleMetaphone0.encode((java.lang.Object) 'K');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode(" a");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("HAorg.apac", " H\000");
        java.lang.String str9 = doubleMetaphone0.encode("");
        int int10 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('.', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aorg.apach" + "'", str20, "aorg.apach");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        doubleMetaphone0.maxCodeLen = (short) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'T');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = 'o';
        java.lang.String str19 = doubleMetaphone0.encode("");
        int int20 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 111 + "'", int20 == 111);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(111);
        char char18 = doubleMetaphone0.charAt(" H# a", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        char char13 = doubleMetaphone0.charAt("#org.apach", (int) (short) -1);
        doubleMetaphone0.maxCodeLen = 'e';
        java.lang.String str17 = doubleMetaphone0.encode(" Horg.apac");
        char char20 = doubleMetaphone0.charAt("ARKPKSKMNSK", 0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str23 = doubleMetaphone21.encode("hi!");
        char char26 = doubleMetaphone21.charAt("", 100);
        java.lang.String str28 = doubleMetaphone21.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int29 = doubleMetaphone21.getMaxCodeLen();
        doubleMetaphone21.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone32 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str34 = doubleMetaphone32.doubleMetaphone("");
        doubleMetaphone32.setMaxCodeLen((int) (byte) 10);
        int int37 = doubleMetaphone32.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult39 = doubleMetaphone32.new DoubleMetaphoneResult(10);
        boolean boolean40 = doubleMetaphoneResult39.isComplete();
        doubleMetaphoneResult39.append("");
        doubleMetaphoneResult39.append('a', '#');
        doubleMetaphoneResult39.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult39.appendAlternate("");
        doubleMetaphoneResult39.appendPrimary("a");
        java.lang.Object obj52 = doubleMetaphone21.encode((java.lang.Object) "a");
        java.lang.Object obj53 = doubleMetaphone0.encode((java.lang.Object) "a");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HRKPK" + "'", str17, "HRKPK");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'A' + "'", char20 == 'A');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ARKP" + "'", str28, "ARKP");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "A" + "'", obj53, "A");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", true);
        java.lang.String str11 = doubleMetaphone0.encode("a");
        java.lang.String str13 = doubleMetaphone0.encode("RKPK");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("H\000#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RKPK" + "'", str13, "RKPK");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        char char6 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) '#');
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str11 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'e' + "'", char6 == 'e');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache", true);
        java.lang.String str9 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult11.append("ARKPXKMNSKTKNKTRKSPXN");
        doubleMetaphoneResult11.appendAlternate('A');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!org.apa");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "#", true);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str24 = doubleMetaphone0.encode("aAaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HRKP" + "'", str12, "HRKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKPKSK", (int) (byte) 10, (int) 'o', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.encode(" RKPK ");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "hi!org.apa", false);
        char char18 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", (int) 'T');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RKPK" + "'", str11, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String[] strArray19 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 1, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException:   ", (int) '\000', (int) '\000', strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.append('o', 'K');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!org.apa" + "'", str15, "hi!org.apa");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('R');
        java.lang.String str24 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate(" HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " H#R" + "'", str24, " H#R");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('.');
        doubleMetaphoneResult7.appendPrimary('A');
        doubleMetaphoneResult7.appendAlternate("\000AARKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#org.apach" + "'", str16, "#org.apach");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str12 = doubleMetaphone0.encode("");
        java.lang.String str14 = doubleMetaphone0.encode(" H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.appendAlternate(" HHAa");
        doubleMetaphoneResult17.append("ARKPKSKMNS", "org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult17.append("org.apache.commons.codec.EncoderException: AH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str9 = doubleMetaphone0.encode("  #\000");
        doubleMetaphone0.maxCodeLen = 72;
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ARKPX");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPKS" + "'", str13, "ARKPXKMNSKTKNKTRKSPXNRKPKS");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.append(" Ho");
        doubleMetaphoneResult7.appendPrimary("ARKPXKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.String[] strArray25 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Horg.apac", (int) (short) 10, (int) 'r', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains(" org.apach", (int) (byte) -1, (int) '\000', strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", 35, (int) (short) 1, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'a', (int) (byte) 1, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H\000hi!\000ARK", 32, (int) 'm', strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("aAaa");
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str9 = doubleMetaphone0.encode(" HHA ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("Ha", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", true);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: AH", "\000aa#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str17 = doubleMetaphone0.encode("");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException22);
        java.lang.Throwable[] throwableArray24 = encoderException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = encoderException23.getSuppressed();
        java.lang.Class<?> wildcardClass26 = encoderException23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate("hi!");
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("a");
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append(' ');
        doubleMetaphoneResult6.appendPrimary("  #");
        doubleMetaphoneResult6.appendAlternate("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int16 = doubleMetaphone0.maxCodeLen;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult13.append('\000', 'A');
        boolean boolean17 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.appendPrimary("HRKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains(" org.apach", (int) (short) 100, (int) 'T', strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMNSK", 35, (int) '4', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKS", 101, 35, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains(" HHAa\000", 65, (int) (short) 100, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!", (int) '#', (int) (short) 1, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.append("hi!", " ");
        doubleMetaphoneResult7.append("hi!");
        doubleMetaphoneResult7.appendAlternate('#');
        doubleMetaphoneResult7.appendAlternate("#hi!org.ap");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str5 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!ARKPXK", "hi!.", false);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKPKSKMNS" + "'", str5, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        char char7 = doubleMetaphone0.charAt(" ", 65);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(65);
        java.lang.String str13 = doubleMetaphone0.encode("#hi!ARKPXK");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RKPKSK" + "'", str13, "RKPKSK");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = doubleMetaphone0.encode(obj9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.append("", "ARKPKSKMNSKTKNKTRKSPKSNRKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('E');
        doubleMetaphoneResult7.appendAlternate('r');
        boolean boolean26 = doubleMetaphoneResult7.isComplete();
        java.lang.String str27 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(" H\000.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache" + "'", str27, "org.apache");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "#org.apach");
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("o", "H", true);
        int int23 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone0.encode(" HHA");
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 111 + "'", int23 == 111);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 111 + "'", int26 == 111);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.encode("Aar");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone10.setMaxCodeLen((int) (short) 0);
        java.lang.String str18 = doubleMetaphone10.encode("");
        doubleMetaphone10.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone10.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult22.appendAlternate(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AR" + "'", str7, "AR");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", "H", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("  ", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPKSKM", "RKP", true);
        doubleMetaphone0.maxCodeLen = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary("ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" org.apach", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone20.encode("hi!");
        char char25 = doubleMetaphone20.charAt("", 100);
        java.lang.String str27 = doubleMetaphone20.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int28 = doubleMetaphone20.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone20.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone20.maxCodeLen = (short) 1;
        java.lang.String str34 = doubleMetaphone20.doubleMetaphone("");
        java.lang.String str37 = doubleMetaphone20.doubleMetaphone("AR", true);
        java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) str37);
        char char41 = doubleMetaphone0.charAt("ARKPKSKMNSKTKNKTRKSPKSN", (int) 'K');
        int int42 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone43 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str45 = doubleMetaphone43.doubleMetaphone("");
        doubleMetaphone43.setMaxCodeLen((int) (byte) 10);
        int int48 = doubleMetaphone43.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult50 = doubleMetaphone43.new DoubleMetaphoneResult(10);
        boolean boolean51 = doubleMetaphoneResult50.isComplete();
        doubleMetaphoneResult50.appendPrimary(' ');
        java.lang.String str54 = doubleMetaphoneResult50.getPrimary();
        doubleMetaphoneResult50.append('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPK" + "'", str19, "ARKPK");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKP" + "'", str27, "ARKP");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "A" + "'", obj38, "A");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + " " + "'", str54, " ");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache", true);
        java.lang.String str9 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen(0);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        char char11 = doubleMetaphone0.charAt(" org.apach", 4);
        doubleMetaphone0.maxCodeLen = (short) 0;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aaARKPKMN", " H\000ARKPXKM", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '.' + "'", char11 == '.');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult17.append("", "hi!A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str7 = doubleMetaphone0.encode("H");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone(" H#");
        doubleMetaphone0.setMaxCodeLen(72);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: #hi!org.ap", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKKMNSKTKNKTRKSPXNRKP" + "'", str14, "ARKPKKMNSKTKNKTRKSPXNRKP");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone(" H#");
        char char16 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: H", (int) (byte) 1);
        java.lang.String str18 = doubleMetaphone0.encode(" Horg.apac");
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'r' + "'", char16 == 'r');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HRKPK" + "'", str18, "HRKPK");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", "H", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        java.lang.String str10 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "ARKPKMNSK");
        doubleMetaphone0.setMaxCodeLen(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN" + "'", str10, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A");
        int int14 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone(" Ho", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append("org.apache");
        boolean boolean27 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('T', 'E');
        doubleMetaphoneResult7.appendAlternate("#hi!ARKPXK");
        java.lang.String str33 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", " H\000ARKPXKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " Horg.apac" + "'", str33, " Horg.apac");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = 'o';
        char char20 = doubleMetaphone0.charAt("ARKPKS", (int) (byte) 1);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("r", "", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str27 = doubleMetaphoneResult26.getPrimary();
        boolean boolean28 = doubleMetaphoneResult26.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'R' + "'", char20 == 'R');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate(" ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate(" Horg.apac");
        doubleMetaphoneResult7.appendAlternate("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H\000AARKPKSK", "HAorg.apac", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        int int16 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone17.doubleMetaphone("");
        doubleMetaphone17.setMaxCodeLen((int) (byte) 10);
        int int22 = doubleMetaphone17.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone17.new DoubleMetaphoneResult(10);
        boolean boolean25 = doubleMetaphoneResult24.isComplete();
        doubleMetaphoneResult24.appendPrimary(' ');
        doubleMetaphoneResult24.appendPrimary("H");
        doubleMetaphoneResult24.append('\000', ' ');
        doubleMetaphoneResult24.append("ARKPXKMNSK");
        doubleMetaphoneResult24.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str5 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('#', '4');
        doubleMetaphoneResult7.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKPKSKMNS" + "'", str5, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", false);
        java.lang.String str10 = doubleMetaphone0.encode("hi!.");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.getMaxCodeLen();
        java.lang.Object obj18 = doubleMetaphone11.encode((java.lang.Object) "hi!");
        java.lang.String str20 = doubleMetaphone11.encode("  #\000");
        java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) "  #\000");
        java.lang.String str23 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: A");
        int int24 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone25 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str27 = doubleMetaphone25.doubleMetaphone("");
        doubleMetaphone25.setMaxCodeLen((int) (byte) 10);
        int int30 = doubleMetaphone25.getMaxCodeLen();
        int int31 = doubleMetaphone25.getMaxCodeLen();
        doubleMetaphone25.maxCodeLen = (short) 10;
        int int34 = doubleMetaphone25.getMaxCodeLen();
        char char37 = doubleMetaphone25.charAt(" org.apach", (int) '\000');
        doubleMetaphone25.maxCodeLen = 0;
        char char42 = doubleMetaphone25.charAt(" a#hi!ARKP", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = doubleMetaphone0.encode((java.lang.Object) char42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "H" + "'", obj18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str23, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + ' ' + "'", char37 == ' ');
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str20 = doubleMetaphone0.encode("");
        char char23 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", 111);
        int int24 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "");
        int int28 = doubleMetaphone0.maxCodeLen;
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ARKPXKMNSK" + "'", str30, "ARKPXKMNSK");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.append('\000', 'a');
        doubleMetaphoneResult7.append('4', 'a');
        java.lang.String str25 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "aAaa" + "'", str25, "aAaa");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str8 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str9 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary("ARKPKS");
        doubleMetaphoneResult7.append('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append("A");
        doubleMetaphoneResult12.appendPrimary(' ');
        doubleMetaphoneResult12.append('a');
        doubleMetaphoneResult12.appendAlternate(" HHA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", "H", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        doubleMetaphone0.maxCodeLen = (short) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKS", false);
        doubleMetaphone0.maxCodeLen = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.append("ARKPXKMNSK");
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('R');
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append(" org.apach");
        java.lang.String str12 = doubleMetaphoneResult9.getPrimary();
        doubleMetaphoneResult9.appendPrimary('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " org.apach" + "'", str12, " org.apach");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult14.appendPrimary("R");
        doubleMetaphoneResult14.append('r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: HRKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('A');
        doubleMetaphoneResult7.append('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("org.apache", " ");
        doubleMetaphoneResult7.append('E', ' ');
        doubleMetaphoneResult7.append("ARKPK");
        doubleMetaphoneResult7.appendPrimary('T');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone(" ");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt(" ", (int) '4');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKT", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.appendPrimary('e');
        doubleMetaphoneResult7.append('A', '4');
        doubleMetaphoneResult7.appendPrimary('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("");
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:   ", "ARKPXKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache");
        doubleMetaphone0.setMaxCodeLen((int) 'e');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 10);
        int int15 = doubleMetaphone10.getMaxCodeLen();
        char char18 = doubleMetaphone10.charAt("", (int) (byte) -1);
        boolean boolean22 = doubleMetaphone10.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str24 = doubleMetaphone10.encode("A");
        boolean boolean28 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str31 = doubleMetaphone10.doubleMetaphone("HRKPK", true);
        char char34 = doubleMetaphone10.charAt("org.apache.commons.codec.EncoderException: ARKPX", (int) 'R');
        java.lang.String str37 = doubleMetaphone10.doubleMetaphone("aorg.apach", false);
        java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) "aorg.apach");
        char char41 = doubleMetaphone0.charAt(" Ha", (int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RKPK" + "'", str31, "RKPK");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ARKPK" + "'", str37, "ARKPK");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "ARKPK" + "'", obj38, "ARKPK");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult10.append('a', 'A');
        doubleMetaphoneResult10.appendAlternate('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.append(" HHAa\000", "org.apache.commons.codec.EncoderException: #org.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("ARKPKSKMNS");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "RKPK");
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append(" org.apach", "#");
        doubleMetaphoneResult7.append("Aar");
        doubleMetaphoneResult7.appendPrimary("\000org.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        java.lang.Object obj14 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: a");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone(" H#", true);
        doubleMetaphone0.maxCodeLen = 'o';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "ARKP" + "'", obj14, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.encode("Aar");
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ahi!H");
        char char14 = doubleMetaphone0.charAt("RKPK", (int) '.');
        doubleMetaphone0.setMaxCodeLen(111);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone17.doubleMetaphone("");
        doubleMetaphone17.setMaxCodeLen((int) (byte) 10);
        int int22 = doubleMetaphone17.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone17.new DoubleMetaphoneResult(10);
        boolean boolean25 = doubleMetaphoneResult24.isComplete();
        boolean boolean26 = doubleMetaphoneResult24.isComplete();
        doubleMetaphoneResult24.appendAlternate('\000');
        doubleMetaphoneResult24.append('\000', 'A');
        doubleMetaphoneResult24.append("ARKPKSKMNS");
        doubleMetaphoneResult24.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult24.appendPrimary("HARKP");
        doubleMetaphoneResult24.append("a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AR" + "'", str7, "AR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("a", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("RKPK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str18 = doubleMetaphone16.doubleMetaphone("");
        doubleMetaphone16.setMaxCodeLen((int) (byte) 10);
        int int21 = doubleMetaphone16.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone16.new DoubleMetaphoneResult(10);
        boolean boolean24 = doubleMetaphoneResult23.isComplete();
        java.lang.String str25 = doubleMetaphoneResult23.getPrimary();
        doubleMetaphoneResult23.appendAlternate("ARKPXKMNSK");
        java.lang.String str28 = doubleMetaphoneResult23.getAlternate();
        doubleMetaphoneResult23.appendPrimary('\000');
        java.lang.String str31 = doubleMetaphoneResult23.getPrimary();
        doubleMetaphoneResult23.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult23.append("", "");
        java.lang.String str37 = doubleMetaphoneResult23.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ARKPXKMNSK" + "'", str28, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000" + "'", str31, "\000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\000org.apach" + "'", str37, "\000org.apach");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('R');
        java.lang.String str24 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " H#R" + "'", str24, " H#R");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendPrimary("H\000AARKPKSK");
        doubleMetaphoneResult7.appendPrimary("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('a');
        java.lang.String str24 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HAa" + "'", str24, "HAa");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("a", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("RKPK");
        doubleMetaphone0.setMaxCodeLen((int) 'R');
        int int18 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 82 + "'", int18 == 82);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str16 = doubleMetaphone0.encode("  Horg.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPXKMNSK" + "'", str14, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HRKP" + "'", str16, "HRKP");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append('#');
        doubleMetaphoneResult7.appendAlternate("\000");
        doubleMetaphoneResult7.append("", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: A", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str8 = doubleMetaphone6.encode("hi!");
        java.lang.String str10 = doubleMetaphone6.encode("");
        char char13 = doubleMetaphone6.charAt("hi!", 4);
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.encode("RKPK");
        char char19 = doubleMetaphone6.charAt("  #\000", (int) '.');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone20.doubleMetaphone("");
        doubleMetaphone20.setMaxCodeLen((int) (byte) 10);
        int int25 = doubleMetaphone20.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone20.new DoubleMetaphoneResult(10);
        boolean boolean28 = doubleMetaphoneResult27.isComplete();
        doubleMetaphoneResult27.appendPrimary(' ');
        doubleMetaphoneResult27.appendPrimary("H");
        doubleMetaphoneResult27.append('\000', ' ');
        doubleMetaphoneResult27.append("ARKPXKMNSK");
        doubleMetaphoneResult27.appendPrimary('a');
        boolean boolean40 = doubleMetaphoneResult27.isComplete();
        doubleMetaphoneResult27.append("Aar");
        java.lang.Object obj43 = doubleMetaphone6.encode((java.lang.Object) "Aar");
        java.lang.String str46 = doubleMetaphone6.doubleMetaphone("ARKPKSKMNSKTKNKTRKSPKSN", true);
        java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) str46);
        java.lang.String str49 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RKPK" + "'", str16, "RKPK");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "AR" + "'", obj43, "AR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ARKP" + "'", str46, "ARKP");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "ARKP" + "'", obj47, "ARKP");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ARKP" + "'", str49, "ARKP");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 1, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!", (int) (short) 0, 111, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("o", (int) (short) -1, (int) '#', strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPXKMNSK", (int) 'H', (int) '.', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) -1, (int) (short) 10, strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(82);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str19, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        doubleMetaphone0.maxCodeLen = '.';
        java.lang.String str13 = doubleMetaphone0.encode(" HHA");
        java.lang.String str15 = doubleMetaphone0.encode("");
        char char18 = doubleMetaphone0.charAt(" \000a RKPK ", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ' ' + "'", char18 == ' ');
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append('m');
        doubleMetaphoneResult7.appendAlternate('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone8.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str15 = doubleMetaphone8.doubleMetaphone("org.apache", true);
        java.lang.String str17 = doubleMetaphone8.encode("H");
        java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) str17);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.String str22 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) 'T');
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("  #", "AHH", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKP" + "'", str15, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        char char13 = doubleMetaphone0.charAt("", (int) 'a');
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("HRKPK", "aAARKPKSKM", false);
        java.lang.String str19 = doubleMetaphone0.encode("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        java.lang.String str21 = doubleMetaphone0.encode(" HHAa\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append('K');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = doubleMetaphone5.maxCodeLen;
        java.lang.String str8 = doubleMetaphone5.encode("");
        java.lang.String str10 = doubleMetaphone5.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str12 = doubleMetaphone5.encode("H");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'e');
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("E");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("", false);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("RKP", "ARKPXKMNSKTKNKTRKSPXNRKPK");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: RKPK", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.appendAlternate('a');
        doubleMetaphoneResult6.appendAlternate("ARKPXKMNSK");
        doubleMetaphoneResult6.appendPrimary("org.apache.commons.codec.EncoderException: ARKP");
        java.lang.String str14 = doubleMetaphoneResult6.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('o', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        doubleMetaphone0.maxCodeLen = 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "hi!", true);
        java.lang.String str17 = doubleMetaphone0.encode("a");
        doubleMetaphone0.maxCodeLen = 'A';
        int int20 = doubleMetaphone0.maxCodeLen;
        java.lang.String str22 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!org.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 65 + "'", int20 == 65);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKP" + "'", str22, "ARKPXKMNSKTKNKTRKSPXNRKP");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK", false);
        doubleMetaphone0.maxCodeLen = 'a';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNSK" + "'", str9, "ARKPKSKMNSK");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        java.lang.String str14 = doubleMetaphone0.encode("a");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.encode("\000aa#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("Aar", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str20 = doubleMetaphone18.encode("hi!");
        int int21 = doubleMetaphone18.maxCodeLen;
        boolean boolean25 = doubleMetaphone18.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str27 = doubleMetaphone18.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean30 = doubleMetaphone18.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean34 = doubleMetaphone18.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str36 = doubleMetaphone18.encode(" HHA");
        boolean boolean39 = doubleMetaphone18.isDoubleMetaphoneEqual("A", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult41 = doubleMetaphone18.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str43 = doubleMetaphone18.doubleMetaphone("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj44 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        int int45 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AR" + "'", str17, "AR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKP" + "'", str27, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ARKP" + "'", str43, "ARKP");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "ARKPXKMNSK" + "'", obj44, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        doubleMetaphone0.maxCodeLen = 4;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" \000a RKPK ", "A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("\000");
        doubleMetaphoneResult7.append('\000');
        boolean boolean23 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('m');
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        char char9 = doubleMetaphone0.charAt(" ", (int) '#');
        doubleMetaphone0.maxCodeLen = 'T';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000\000ARKPKSKM", "aA");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.encode("ARKPARKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 84 + "'", int15 == 84);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKPRKPK" + "'", str17, "ARKPRKPK");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000', 'o');
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#org.apach" + "'", str20, "#org.apach");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('#');
        doubleMetaphoneResult7.append('T', '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str24 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('E');
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000AARKPKSKM" + "'", str19, "\000AARKPKSKM");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000AARKPKSKM" + "'", str24, "\000AARKPKSKM");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.append("\000AARKPKSKM", "");
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendAlternate('H');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str13 = doubleMetaphone0.encode(" H#");
        int int14 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        java.lang.String str18 = doubleMetaphone15.encode("");
        doubleMetaphone15.maxCodeLen = (byte) 0;
        java.lang.String str23 = doubleMetaphone15.doubleMetaphone("H", false);
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone15.maxCodeLen = 0;
        doubleMetaphone15.setMaxCodeLen(0);
        int int30 = doubleMetaphone15.maxCodeLen;
        boolean boolean33 = doubleMetaphone15.isDoubleMetaphoneEqual("#hi!ARKPXK", "aorg.apach");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone15.new DoubleMetaphoneResult(4);
        java.lang.String str37 = doubleMetaphone15.doubleMetaphone("#org.apach");
        java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        java.lang.String str41 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "RKPK" + "'", obj38, "RKPK");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ARKPXKMNSK" + "'", str41, "ARKPXKMNSK");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        doubleMetaphone0.maxCodeLen = 0;
        char char16 = doubleMetaphone0.charAt("HHorg.apac", (int) (byte) 10);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("AHH", "\000AARKPKSKM", true);
        doubleMetaphone0.setMaxCodeLen(84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str9 = doubleMetaphone7.doubleMetaphone("");
        doubleMetaphone7.setMaxCodeLen((int) (byte) 10);
        int int12 = doubleMetaphone7.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone7.new DoubleMetaphoneResult(10);
        boolean boolean15 = doubleMetaphoneResult14.isComplete();
        boolean boolean16 = doubleMetaphoneResult14.isComplete();
        doubleMetaphoneResult14.appendAlternate("");
        java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) "");
        java.lang.String str21 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen((int) ':');
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!org.apa", "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 65;
        char char15 = doubleMetaphone0.charAt("ARKPKSKMNS", (int) (short) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("#hi!org.ap", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str22 = doubleMetaphone0.encode(" H\000 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RKP" + "'", str18, "RKP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.getMaxCodeLen();
        int int17 = doubleMetaphone11.getMaxCodeLen();
        int int18 = doubleMetaphone11.getMaxCodeLen();
        char char21 = doubleMetaphone11.charAt("ARKP", (int) (byte) -1);
        java.lang.String str23 = doubleMetaphone11.doubleMetaphone("org.apache");
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) str23);
        java.lang.String str26 = doubleMetaphone0.encode(" H#");
        doubleMetaphone0.setMaxCodeLen(0);
        int int29 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'A' + "'", char8 == 'A');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPX" + "'", str23, "ARKPX");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "ARKPKS" + "'", obj24, "ARKPKS");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        int int13 = doubleMetaphone0.maxCodeLen;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("a\000AARKPKSK", "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKT", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendAlternate('o');
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "o" + "'", str13, "o");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", true);
        java.lang.String str11 = doubleMetaphone0.encode("a");
        java.lang.String str13 = doubleMetaphone0.encode("RKPK");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.maxCodeLen = 'T';
        char char23 = doubleMetaphone0.charAt("RKP", (int) ':');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RKPK" + "'", str13, "RKPK");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.appendAlternate(" ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendPrimary('m');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        boolean boolean16 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendPrimary(" a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult18.append("\000ARKPKSKMN");
        doubleMetaphoneResult18.appendAlternate("HAorg.apac");
        doubleMetaphoneResult18.appendAlternate('.');
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSKTKNKTRKSPXNRKP");
        doubleMetaphoneResult7.appendPrimary("ARKPXKMNSKTKNKTRKSPXNRKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.append("\000AARKPKSKM", "");
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendAlternate('H');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append('e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'o');
        doubleMetaphoneResult10.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException");
        boolean boolean14 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append("HRKPK");
        doubleMetaphoneResult10.appendAlternate("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        char char13 = doubleMetaphone0.charAt("", (int) 'a');
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPX", "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str18 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXNRKPK");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException:   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append("H\000");
        doubleMetaphoneResult6.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!org.apa", "ARKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("ARKPKKMNSK", false);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: HRKP", "org.apache.commons.codec.EncoderException", true);
        java.lang.String str28 = doubleMetaphone0.encode("AH");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPKSKMNS" + "'", str18, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ARKPKMNSK" + "'", str21, "ARKPKMNSK");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary('4');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append("", "aAorg.apac");
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str21 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "   " + "'", str21, "   ");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str9 = doubleMetaphone0.encode("r");
        doubleMetaphone0.setMaxCodeLen(114);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKT", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "R" + "'", str9, "R");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKT" + "'", str14, "ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKT");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.append("hi!", " ");
        doubleMetaphoneResult7.append('H');
        java.lang.String str19 = doubleMetaphoneResult7.getPrimary();
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        java.lang.String str21 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ahi!H" + "'", str19, "ahi!H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ahi!H" + "'", str21, "ahi!H");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str7 = doubleMetaphone0.encode("H");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone(" H#");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: AH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str12 = doubleMetaphoneResult11.getAlternate();
        doubleMetaphoneResult11.append('\000', '.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult13.append('\000', 'A');
        java.lang.String str17 = doubleMetaphoneResult13.getPrimary();
        doubleMetaphoneResult13.append("ARKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000" + "'", str17, "\000");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen(101);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        char char15 = doubleMetaphone0.charAt("", (int) (short) 100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN" + "'", str18, "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append('#', 'E');
        java.lang.String str26 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('o');
        doubleMetaphoneResult7.append('m', 'o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000aa#" + "'", str26, "\000aa#");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        java.lang.String str17 = doubleMetaphone0.encode("hi!\000ARKPKS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HRKPKS" + "'", str17, "HRKPKS");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult12.getPrimary();
        doubleMetaphoneResult12.appendPrimary('4');
        doubleMetaphoneResult12.append('a', 'a');
        boolean boolean22 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendPrimary('o');
        doubleMetaphoneResult12.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str29 = doubleMetaphoneResult12.getAlternate();
        doubleMetaphoneResult12.append('.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode(" Horg.apac");
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("\000org.apach", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HRKP" + "'", str2, "HRKP");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone14.encode("hi!");
        char char19 = doubleMetaphone14.charAt("", 100);
        java.lang.String str21 = doubleMetaphone14.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int22 = doubleMetaphone14.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone14.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone14.maxCodeLen = (short) 1;
        java.lang.String str28 = doubleMetaphone14.doubleMetaphone("");
        int int29 = doubleMetaphone14.getMaxCodeLen();
        boolean boolean33 = doubleMetaphone14.isDoubleMetaphoneEqual("RKPK", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone14.new DoubleMetaphoneResult(32);
        java.lang.String str38 = doubleMetaphone14.doubleMetaphone("\000H", false);
        java.lang.Object obj39 = doubleMetaphone0.encode((java.lang.Object) "\000H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ARKP" + "'", str21, "ARKP");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary('E');
        doubleMetaphoneResult7.appendPrimary("ARKPX");
        boolean boolean26 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult13.appendPrimary("HRKPKS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        java.lang.String str13 = doubleMetaphone0.encode(" H#");
        java.lang.String str15 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: #org.apach");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult17.append("a\000", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTK");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKPXKMNSK" + "'", str15, "ARKPXKMNSK");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str18 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#org.apach" + "'", str16, "#org.apach");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#org.apach" + "'", str18, "#org.apach");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("\000aa#", "");
        doubleMetaphoneResult7.appendPrimary("org.apache");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendAlternate(" org.apach");
        boolean boolean27 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("ARKPX");
        boolean boolean30 = doubleMetaphoneResult7.isComplete();
        boolean boolean31 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("ARKPKMNSKo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPKMNSK" + "'", str12, "ARKPKMNSK");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getPrimary();
        doubleMetaphoneResult6.append('H', '\000');
        java.lang.String str11 = doubleMetaphoneResult6.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult6.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#org.apach" + "'", str16, "#org.apach");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#org.apach" + "'", str17, "#org.apach");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a" + "'", str18, "a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#org.apach" + "'", str19, "#org.apach");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String[] strArray25 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Horg.apac", (int) (short) 10, (int) 'r', strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains(" org.apach", (int) (byte) -1, (int) '\000', strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", 35, (int) (short) 1, strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("HARKP", 0, (int) (byte) 0, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 84, 100, strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        doubleMetaphone0.maxCodeLen = 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        char char17 = doubleMetaphone0.charAt(" Ha", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + 'H' + "'", char17 == 'H');
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('a');
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        boolean boolean21 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ha" + "'", str20, "Ha");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = ':';
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        boolean boolean23 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult7.append(" RKPK 4hi!");
        doubleMetaphoneResult7.appendAlternate(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H\000#H", "org.apache.commons.codec.EncoderException: a");
        char char18 = doubleMetaphone0.charAt("aAARKPKSKM", (int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'A' + "'", char18 == 'A');
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.encode(" ");
        java.lang.String str19 = doubleMetaphone0.encode("ARKPKS");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("", true);
        int int23 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str26 = doubleMetaphone24.doubleMetaphone("");
        doubleMetaphone24.setMaxCodeLen((int) (byte) 10);
        int int29 = doubleMetaphone24.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone24.new DoubleMetaphoneResult(10);
        boolean boolean32 = doubleMetaphoneResult31.isComplete();
        boolean boolean33 = doubleMetaphoneResult31.isComplete();
        doubleMetaphoneResult31.appendAlternate('A');
        boolean boolean36 = doubleMetaphoneResult31.isComplete();
        doubleMetaphoneResult31.appendPrimary("ARKPKSKMNS");
        doubleMetaphoneResult31.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "RKPK");
        doubleMetaphoneResult31.appendAlternate('r');
        doubleMetaphoneResult31.append(' ');
        doubleMetaphoneResult31.append("org.apache.commons.codec.EncoderException: a ");
        doubleMetaphoneResult31.append("org.apache.commons.codec.EncoderException: #org.apach");
        doubleMetaphoneResult31.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPKS" + "'", str19, "ARKPKS");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphone0.setMaxCodeLen(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        doubleMetaphoneResult7.appendPrimary('#');
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str19 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache");
        java.lang.String str24 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "  #" + "'", str16, "  #");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "  #\000" + "'", str19, "  #\000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "  #\000" + "'", str24, "  #\000");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("AR", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int19 = doubleMetaphone18.maxCodeLen;
        java.lang.String str21 = doubleMetaphone18.encode("");
        doubleMetaphone18.maxCodeLen = (byte) 0;
        java.lang.String str25 = doubleMetaphone18.doubleMetaphone("");
        doubleMetaphone18.maxCodeLen = 100;
        java.lang.String str29 = doubleMetaphone18.encode("ARKPXKMNSKTKNKTRKSPXNRKP");
        doubleMetaphone18.maxCodeLen = 111;
        boolean boolean35 = doubleMetaphone18.isDoubleMetaphoneEqual("aAARKPa", "HARKPA", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNRKP" + "'", str29, "ARKPKSKMNSKTKNKTRKSPKSNRKP");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.String[] strArray22 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) (short) 1, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!", (int) (short) 0, 111, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("e", 1, 114, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode(" Horg.apac");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean5 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HRKP" + "'", str2, "HRKP");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        java.lang.String str14 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone(" Ha");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSN", " a#hi!ARKP", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!org.apa");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "#", true);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str21 = doubleMetaphone0.encode("\000hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HRKP" + "'", str12, "HRKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str15 = doubleMetaphone0.encode("");
        char char18 = doubleMetaphone0.charAt(" HHA", (int) 'K');
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("e", "hi!ET", false);
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!org.apa", "  ", false);
        java.lang.String str17 = doubleMetaphone0.encode("aAa\000");
        char char20 = doubleMetaphone0.charAt("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", (int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'T' + "'", char20 == 'T');
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getPrimary();
        doubleMetaphoneResult6.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult6.append("\000aaARKPKMN", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.");
        doubleMetaphoneResult6.append("a", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.");
        doubleMetaphoneResult6.appendPrimary(':');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("or", " hi!\000a");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult18.append('4', 'T');
        java.lang.String str22 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.appendAlternate("a\000AARKPKSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" RKPK 4hi!", "org.apache.commons.codec.EncoderException", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("a");
        int int4 = doubleMetaphone0.maxCodeLen;
        java.lang.String str6 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('K');
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("hi!\000ARKPKS", "Aorg.apach");
        doubleMetaphoneResult7.appendAlternate('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult12.getPrimary();
        doubleMetaphoneResult12.appendPrimary('4');
        doubleMetaphoneResult12.append('a', 'a');
        boolean boolean22 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendPrimary('o');
        doubleMetaphoneResult12.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str29 = doubleMetaphoneResult12.getAlternate();
        doubleMetaphoneResult12.appendAlternate("ARKPX");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('a', ' ');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: H", " HHAa");
        doubleMetaphoneResult7.appendAlternate('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendPrimary("#hi!ARKPXK");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ARKPX");
        java.lang.String str26 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " a#hi!ARKP" + "'", str26, " a#hi!ARKP");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        char char7 = doubleMetaphone0.charAt("#H", (int) 'H');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.encode(" H# a");
        doubleMetaphone0.setMaxCodeLen((int) 'K');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKPKKMNSK" + "'", str10, "ARKPKKMNSK");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("a", "ARKPX");
        doubleMetaphoneResult7.appendAlternate('r');
        java.lang.String str21 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append(':', '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a" + "'", str21, "\000a");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        doubleMetaphoneResult21.append('.', '.');
        doubleMetaphoneResult21.appendPrimary(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str19, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKM", "ARKPKS");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("RKPK", false);
        doubleMetaphone0.maxCodeLen = 'r';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("HRKP", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str15 = doubleMetaphone13.encode("hi!");
        char char18 = doubleMetaphone13.charAt("", 100);
        java.lang.String str20 = doubleMetaphone13.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int21 = doubleMetaphone13.getMaxCodeLen();
        doubleMetaphone13.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str26 = doubleMetaphone24.doubleMetaphone("");
        doubleMetaphone24.setMaxCodeLen((int) (byte) 10);
        int int29 = doubleMetaphone24.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone24.new DoubleMetaphoneResult(10);
        boolean boolean32 = doubleMetaphoneResult31.isComplete();
        doubleMetaphoneResult31.append("");
        doubleMetaphoneResult31.append('a', '#');
        doubleMetaphoneResult31.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult31.appendAlternate("");
        doubleMetaphoneResult31.appendPrimary("a");
        java.lang.Object obj44 = doubleMetaphone13.encode((java.lang.Object) "a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult46 = doubleMetaphone13.new DoubleMetaphoneResult((int) 'r');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) 'r');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKP" + "'", str12, "RKP");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        java.lang.String str17 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen((int) 'K');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.appendPrimary("aAaa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" org.apach", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone20.encode("hi!");
        char char25 = doubleMetaphone20.charAt("", 100);
        java.lang.String str27 = doubleMetaphone20.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int28 = doubleMetaphone20.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone20.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone20.maxCodeLen = (short) 1;
        java.lang.String str34 = doubleMetaphone20.doubleMetaphone("");
        java.lang.String str37 = doubleMetaphone20.doubleMetaphone("AR", true);
        java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) str37);
        char char41 = doubleMetaphone0.charAt("ARKPKSKMNSKTKNKTRKSPKSN", (int) 'K');
        java.lang.String str43 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!org.apa");
        java.lang.Class<?> wildcardClass44 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPK" + "'", str19, "ARKPK");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKP" + "'", str27, "ARKP");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "A" + "'", obj38, "A");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ARKPXKMNSK" + "'", str43, "ARKPXKMNSK");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = doubleMetaphone0.encode(obj9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append(" Horg.apac");
        doubleMetaphoneResult7.appendAlternate('e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" RKPK 4hi!");
        int int12 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) ':');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "R" + "'", str11, "R");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt(" ", (int) '4');
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone(" a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.encode("");
        doubleMetaphone14.maxCodeLen = (byte) 0;
        java.lang.String str21 = doubleMetaphone14.doubleMetaphone("");
        int int22 = doubleMetaphone14.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary('H');
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("A", " RKPK ");
        doubleMetaphoneResult7.append('R', '4');
        doubleMetaphoneResult7.appendPrimary('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000org.apach" + "'", str20, "\000org.apach");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKS", false);
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("");
        encoderException21.addSuppressed((java.lang.Throwable) encoderException23);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException23);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException(" ", (java.lang.Throwable) encoderException27);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException(" ", (java.lang.Throwable) encoderException28);
        java.lang.Throwable[] throwableArray30 = encoderException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = encoderException29.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException36);
        java.lang.Throwable[] throwableArray38 = encoderException37.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("#H", (java.lang.Throwable) encoderException37);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException37);
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException("  #", (java.lang.Throwable) encoderException37);
        encoderException29.addSuppressed((java.lang.Throwable) encoderException41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = doubleMetaphone0.encode((java.lang.Object) encoderException29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("ARKPKMNSK", "\000");
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " H" + "'", str14, " H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("RKPK");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ha", "\000aa", false);
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKPK" + "'", str12, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = (byte) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(114);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 10);
        int int15 = doubleMetaphone10.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult(10);
        boolean boolean18 = doubleMetaphoneResult17.isComplete();
        boolean boolean19 = doubleMetaphoneResult17.isComplete();
        doubleMetaphoneResult17.append(" ");
        java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) " ");
        int int23 = doubleMetaphone0.maxCodeLen;
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPKSKMNS", "org.apache.commons.codec.EncoderException: org.apache", true);
        java.lang.String str29 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        int int30 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException", " HHa4", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("HRKPK", true);
        char char24 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ARKPX", (int) 'R');
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("aorg.apach", false);
        java.lang.String str29 = doubleMetaphone0.encode("ARKPKSKM");
        char char32 = doubleMetaphone0.charAt("a ", (int) 'a');
        int int33 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RKPK" + "'", str21, "RKPK");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKPK" + "'", str27, "ARKPK");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKPKSKM" + "'", str29, "ARKPKSKM");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("AR", 0, (int) (short) 0, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMNSK", (int) (byte) 100, 4, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Ha#", 0, (int) (short) 1, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("a ", (-1), (int) '#', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("Aorg.apach", (int) ':', (int) 'o', strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult18.appendPrimary(" H# ");
        doubleMetaphoneResult18.appendAlternate(" a");
        doubleMetaphoneResult18.append('a', '4');
        java.lang.String str26 = doubleMetaphoneResult18.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str11 = doubleMetaphone0.encode(" RKPK ");
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RKPK" + "'", str11, "RKPK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSK" + "'", str13, "ARKPXKMNSK");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("");
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", "\000AARKPKSKM");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("ahi!hi!ahi");
        doubleMetaphoneResult7.appendPrimary("o");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ARKPXKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str20 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: a ");
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR", "hi!", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000AARKPKSKM");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str19 = doubleMetaphone0.encode("AR");
        int int20 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.append('r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        java.lang.String str21 = doubleMetaphone0.encode("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        int int22 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HRKPK" + "'", str19, "HRKPK");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ARKPKMNSKT" + "'", str21, "ARKPKMNSKT");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.encode(" RKPK ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "Aa", true);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.append('4', ' ');
        doubleMetaphoneResult7.append("AR");
        doubleMetaphoneResult7.append('T', '.');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone(" Horg.apac", true);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HRKPK" + "'", str10, "HRKPK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSK" + "'", str13, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        java.lang.String str13 = doubleMetaphone0.encode("");
        java.lang.String str15 = doubleMetaphone0.encode("ARKPX\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:   #\000");
        doubleMetaphoneResult7.append("Aa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "#org.apach");
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("o", "H", true);
        int int23 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual(".", "\000ARKPXo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 111 + "'", int23 == 111);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult13.append('\000', 'A');
        doubleMetaphoneResult13.append(' ', 'a');
        doubleMetaphoneResult13.appendAlternate("\000");
        doubleMetaphoneResult13.append('.', 'A');
        boolean boolean25 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.appendPrimary("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult13.appendAlternate("\000AARKPKSKM");
        java.lang.String str30 = doubleMetaphoneResult13.getAlternate();
        boolean boolean31 = doubleMetaphoneResult13.isComplete();
        java.lang.String str32 = doubleMetaphoneResult13.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Aa\000A\000AARKP" + "'", str30, "Aa\000A\000AARKP");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Aa\000A\000AARKP" + "'", str32, "Aa\000A\000AARKP");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str9 = doubleMetaphone0.encode(" ");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPKSKMNS" + "'", str12, "ARKPKSKMNS");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(111);
        java.lang.String str17 = doubleMetaphone0.encode("aE");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str16 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: a");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        char char10 = doubleMetaphone0.charAt(" org.apach", 0);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!ET", "org.apache.commons.codec.EncoderException:  org.apach", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.String str9 = doubleMetaphone0.encode("");
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException14);
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("A", (java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) encoderException17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        char char7 = doubleMetaphone0.charAt("#H", (int) 'H');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKPKKMNSK" + "'", str10, "ARKPKKMNSK");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone(" H# ", true);
        doubleMetaphone0.setMaxCodeLen((int) '.');
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKMNSKT", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('K');
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("hi!\000ARKPKS", "Aorg.apach");
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str24 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " H\000hi!\000ARK" + "'", str23, " H\000hi!\000ARK");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " KAorg.apa" + "'", str24, " KAorg.apa");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append('#', 'E');
        doubleMetaphoneResult7.appendPrimary("ARKPKSKMN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ho", "ahi!H", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("A", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendPrimary(" RKPK 4hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult18.appendPrimary(" H# ");
        doubleMetaphoneResult18.append("#", "org.apache.commons.codec.EncoderException: #org.apach");
        doubleMetaphoneResult18.appendAlternate(" HHAa");
        doubleMetaphoneResult18.append('R');
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append("A");
        doubleMetaphoneResult12.append('H', 'o');
        doubleMetaphoneResult12.append(' ', 'E');
        doubleMetaphoneResult12.append('4', 'r');
        doubleMetaphoneResult12.appendPrimary('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        doubleMetaphone0.maxCodeLen = 35;
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.maxCodeLen = 82;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HRKP" + "'", str6, "HRKP");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone8.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str15 = doubleMetaphone8.doubleMetaphone("org.apache", true);
        java.lang.String str17 = doubleMetaphone8.encode("H");
        java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) str17);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        char char23 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("ARKPKSKMNSK");
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("AK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKP" + "'", str15, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache");
        doubleMetaphone0.maxCodeLen = 65;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("H");
        char char16 = doubleMetaphone10.charAt("RKPK", (int) (byte) 10);
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "RKPK");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual(" ARKPXKMNS", "HHorg.apac", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "RKPK" + "'", obj17, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        char char16 = doubleMetaphone0.charAt("HRKP", 0);
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'H' + "'", char16 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.maxCodeLen = 'A';
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKPXKMNSK" + "'", str6, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 65 + "'", int9 == 65);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendAlternate('A');
        java.lang.String str16 = doubleMetaphoneResult13.getAlternate();
        doubleMetaphoneResult13.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        java.lang.String str14 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone(" Ha");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSN", " a#hi!ARKP", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int23 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        boolean boolean20 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("ARKPKSKM");
        java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) "ARKPKSKM");
        doubleMetaphone0.setMaxCodeLen(4);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "A" + "'", obj23, "A");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.lang.String[] strArray31 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a", (int) 'o', (int) 'A', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKPK", (int) (byte) 100, (int) 'r', strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'o', (int) (short) 10, strArray31);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (byte) 10, strArray31);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a ", (int) (byte) 10, (int) (short) 1, strArray31);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("AHH", 0, (int) '\000', strArray31);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains(" HHAa\000", (int) 'R', (int) (short) 0, strArray31);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("ARKPKSKM", false);
        char char22 = doubleMetaphone0.charAt("aAARKPa", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPKSKM" + "'", str19, "ARKPKSKM");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.String[] strArray22 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'a', 4, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("R", (int) 'T', 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("HARKPA", 84, (int) (short) 1, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("HARKP", 0, (int) (short) 0, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("A", false);
        int int8 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache" + "'", str15, "org.apache");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate("ARKPKSKMNSKTKNKTRKSPKSN");
        doubleMetaphoneResult7.appendPrimary("ARKPARKPK");
        boolean boolean27 = doubleMetaphoneResult7.isComplete();
        boolean boolean28 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("RKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ARKP");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!org.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache" + "'", str13, "org.apache");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('a', ' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str19 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!org.apa", "");
        doubleMetaphoneResult7.append("A", "Aar");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " org.apach" + "'", str19, " org.apach");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("a");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: A", "H");
        doubleMetaphoneResult7.append("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: hi!org.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache" + "'", str13, "org.apache");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache");
        doubleMetaphoneResult7.appendAlternate("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'r');
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("\000", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult40 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("ARKPXKMNSK");
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException42);
        java.lang.Throwable[] throwableArray44 = encoderException42.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = doubleMetaphone0.encode((java.lang.Object) throwableArray44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = doubleMetaphone5.maxCodeLen;
        java.lang.String str8 = doubleMetaphone5.encode("");
        java.lang.String str10 = doubleMetaphone5.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str12 = doubleMetaphone5.encode("H");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'e');
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("E");
        java.lang.String str20 = doubleMetaphone0.encode("R");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "R" + "'", str20, "R");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("a");
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append(" ");
        doubleMetaphoneResult7.appendAlternate("RKPKSK");
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("rT", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RT" + "'", str12, "RT");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone(" H#");
        char char16 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: H", (int) (byte) 1);
        java.lang.String str18 = doubleMetaphone0.encode(" Horg.apac");
        char char21 = doubleMetaphone0.charAt("hi!.", (int) '4');
        int int22 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'r' + "'", char16 == 'r');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HRKPK" + "'", str18, "HRKPK");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str8 = doubleMetaphone0.encode(" ");
        java.lang.String str10 = doubleMetaphone0.encode("a\000AARKPKSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKPKSK" + "'", str10, "ARKPKSK");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H", "H");
        doubleMetaphoneResult7.append('a', 'A');
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "a", true);
        java.lang.String str19 = doubleMetaphone0.encode("RKP");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int22 = doubleMetaphone0.maxCodeLen;
        java.lang.String str24 = doubleMetaphone0.encode("H\000 ARKPKKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RKP" + "'", str19, "RKP");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.lang.String[] strArray22 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKKMNSK", 0, 0, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("aAARKPa", (int) '.', 114, strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) (byte) 0, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.appendAlternate('a');
        doubleMetaphoneResult6.append("ARKP");
        doubleMetaphoneResult6.appendPrimary(" ");
        java.lang.String str14 = doubleMetaphoneResult6.getPrimary();
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append(" HHAa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "ARKPX");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual(" HHAa\000", " Ha", true);
        java.lang.String str24 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendPrimary("  ");
        java.lang.String str16 = doubleMetaphoneResult13.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.append("\000aaARKPKMN");
        doubleMetaphoneResult7.append('.', 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("Aar", "org.apache.commons.codec.EncoderException: hi!");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: A", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("  H", "HH", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate(':');
        doubleMetaphoneResult7.append(':', '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache");
        doubleMetaphone0.setMaxCodeLen((int) 'e');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult11.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKKMNSK", 0, 0, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMNSKTKNKTRKSPKSN", (int) '4', 35, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains(" HHAa", (int) 'R', (int) (byte) 1, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: hi!org.apa", (int) '.', (int) '\000', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("ahi!H", (int) (short) 100, (int) ':', strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult8.append("aK");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKMNSK", 65, 58, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.appendAlternate('a');
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append("ahi!hi!ahi", " a#hi!ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("", false);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("# hi!a", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSK" + "'", str11, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains(" Horg.apac", (int) (short) 10, (int) 'r', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains(" KAorg.apa", (int) (short) 0, (int) '.', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String[] strArray26 = new java.lang.String[] { "org.apache", "RKPK" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: H", (int) (short) 10, (int) (short) 0, strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) (byte) 100, (int) 'H', strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("R", (int) 'R', 4, strArray26);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", 0, (int) (short) 1, strArray26);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H#", (int) 'r', 114, strArray26);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("Aa", (int) ' ', 111, strArray26);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", 32, (int) (byte) 1, strArray26);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains(" H# ", 84, 65, strArray26);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 'a';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append('A', 'a');
        doubleMetaphoneResult7.append(" HHAa", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('\000', ' ');
        doubleMetaphoneResult7.append("ARKPXKMNSK");
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary('T');
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " H\000ARKPXKM" + "'", str22, " H\000ARKPXKM");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " H\000ARKPXKM" + "'", str23, " H\000ARKPXKM");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        char char7 = doubleMetaphone0.charAt(" ", 0);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.encode("H\000 ARKPKKM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RKPK" + "'", str10, "RKPK");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.append('.', 'H');
        doubleMetaphoneResult7.append("H", "");
        doubleMetaphoneResult7.appendPrimary(" Horg.apac");
        doubleMetaphoneResult7.append("\000hi!", "\000aa#");
        java.lang.String str27 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000org.apach" + "'", str27, "\000org.apach");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendAlternate(" org.apach");
        doubleMetaphoneResult7.append('r');
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('a', 'a');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: HARKPX");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a", false);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" H", false);
        doubleMetaphone0.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.encode("");
        doubleMetaphone14.maxCodeLen = (byte) 0;
        java.lang.String str22 = doubleMetaphone14.doubleMetaphone("H", false);
        java.lang.String str24 = doubleMetaphone14.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str26 = doubleMetaphone14.encode("org.apache");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "org.apache");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "ARKPX" + "'", obj27, "ARKPX");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: #org.apach", "org.apache.commons.codec.EncoderException:  ");
        int int17 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str7 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "  #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNRKP", "H\000#H");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache");
        doubleMetaphone0.maxCodeLen = 65;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPKSKM" + "'", str11, "ARKPKSKM");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPX" + "'", str13, "ARKPXKMNSKTKNKTRKSPXNRKPX");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000AARKPKSKM", "org.apache.commons.codec.EncoderException: hi!org.apa");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  org.apach", "org.apache.commons.codec.EncoderException:  ", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str24 = doubleMetaphone22.doubleMetaphone("");
        doubleMetaphone22.setMaxCodeLen((int) (byte) 10);
        int int27 = doubleMetaphone22.maxCodeLen;
        java.lang.String str29 = doubleMetaphone22.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone22.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult31.append("H");
        boolean boolean34 = doubleMetaphoneResult31.isComplete();
        java.lang.String str35 = doubleMetaphoneResult31.getAlternate();
        java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) str35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKPKSKMNS" + "'", str29, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "HRKP");
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("\000ARKPKSKMN");
        java.lang.String str26 = doubleMetaphone0.encode("ARKPKS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) '#', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        doubleMetaphoneResult7.appendPrimary('#');
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate(':');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "  #" + "'", str16, "  #");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str17 = doubleMetaphone0.encode("");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        int int21 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass22 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str11 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.appendAlternate(" HHAa");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.appendAlternate("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        doubleMetaphoneResult10.appendPrimary('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " HHAa" + "'", str14, " HHAa");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('R');
        doubleMetaphoneResult7.appendAlternate("ARKPKSKMNSKTKNKTRKSPKSNRKP");
        doubleMetaphoneResult7.append("ARKPKMNSKT", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('\000');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary('H');
        doubleMetaphoneResult7.append('a', 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append(' ', 'o');
        boolean boolean22 = doubleMetaphoneResult7.isComplete();
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('A');
        java.lang.String str26 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache" + "'", str18, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " Horg.apac" + "'", str23, " Horg.apac");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache" + "'", str26, "org.apache");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException:   #\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "org.apache", false);
        java.lang.String str7 = doubleMetaphone0.encode("a");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode(" HH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.getMaxCodeLen();
        int int17 = doubleMetaphone11.getMaxCodeLen();
        int int18 = doubleMetaphone11.getMaxCodeLen();
        char char21 = doubleMetaphone11.charAt("ARKP", (int) (byte) -1);
        java.lang.String str23 = doubleMetaphone11.doubleMetaphone("org.apache");
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) str23);
        java.lang.String str26 = doubleMetaphone0.encode(" H#");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        doubleMetaphoneResult30.append('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'A' + "'", char8 == 'A');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPX" + "'", str23, "ARKPX");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "ARKPKS" + "'", obj24, "ARKPKS");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.appendAlternate('a');
        doubleMetaphoneResult6.append("ARKP");
        doubleMetaphoneResult6.append("H");
        doubleMetaphoneResult6.appendPrimary('.');
        doubleMetaphoneResult6.append("aAa\000", "AR");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.append("HHorg.apac", ".");
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " HHAHHorg." + "'", str23, " HHAHHorg.");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone15.doubleMetaphone("");
        doubleMetaphone15.setMaxCodeLen((int) (byte) 10);
        int int20 = doubleMetaphone15.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone15.new DoubleMetaphoneResult(10);
        boolean boolean23 = doubleMetaphoneResult22.isComplete();
        boolean boolean24 = doubleMetaphoneResult22.isComplete();
        doubleMetaphoneResult22.appendAlternate('\000');
        doubleMetaphoneResult22.append('\000', 'A');
        doubleMetaphoneResult22.append("ARKPKSKMNS");
        doubleMetaphoneResult22.appendAlternate("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult22.appendAlternate('#');
        doubleMetaphoneResult22.appendAlternate('E');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) 'E');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR" + "'", str14, "ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        doubleMetaphone0.maxCodeLen = '.';
        java.lang.String str13 = doubleMetaphone0.encode(" HHA");
        doubleMetaphone0.setMaxCodeLen(82);
        char char18 = doubleMetaphone0.charAt("aA", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        java.lang.String str14 = doubleMetaphone0.encode("aAo");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" H");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H\000#H", "org.apache.commons.codec.EncoderException: a");
        doubleMetaphone0.maxCodeLen = (short) -1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache", true);
        java.lang.String str9 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        char char14 = doubleMetaphone0.charAt("  ", (int) (short) 10);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!org.apa", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HRKP" + "'", str18, "HRKP");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        char char11 = doubleMetaphone0.charAt("a ", (int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone12.doubleMetaphone("");
        doubleMetaphone12.setMaxCodeLen((int) (byte) 10);
        int int17 = doubleMetaphone12.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone12.new DoubleMetaphoneResult(10);
        boolean boolean20 = doubleMetaphoneResult19.isComplete();
        boolean boolean21 = doubleMetaphoneResult19.isComplete();
        doubleMetaphoneResult19.append("ARKPX");
        doubleMetaphoneResult19.append('\000');
        java.lang.String str26 = doubleMetaphoneResult19.getAlternate();
        doubleMetaphoneResult19.append('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ARKPX\000" + "'", str26, "ARKPX\000");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.append("ARKPKSKM", "");
        doubleMetaphoneResult13.appendAlternate('r');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.String[] strArray19 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("  ", (int) 'A', (int) '\000', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMN", (int) 'o', 111, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("a\000", 32, 35, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(114);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("RKPK", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", false);
        doubleMetaphone0.setMaxCodeLen(65);
        doubleMetaphone0.setMaxCodeLen((int) 'm');
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Class<?> wildcardClass26 = doubleMetaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append("A");
        doubleMetaphoneResult12.appendPrimary(' ');
        doubleMetaphoneResult12.append('a');
        doubleMetaphoneResult12.appendPrimary('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        char char6 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) '#');
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPKSKMNSK");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("aA", true);
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = doubleMetaphone0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'e' + "'", char6 == 'e');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HA" + "'", str20, "HA");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary(" H\000");
        doubleMetaphoneResult7.appendPrimary('\000');
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("A", " Horg.apac", false);
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("Aar");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AR" + "'", str15, "AR");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("", "ARKPRKPK");
        doubleMetaphoneResult7.append(" H\000ARKPXKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#org.apach" + "'", str16, "#org.apach");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append('a', ' ');
        doubleMetaphoneResult7.append("ARKPKMNSKT", "ARKPKSKMNSK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(' ');
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSK" + "'", str12, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a", (int) 'o', (int) 'A', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKPK", (int) (byte) 100, (int) 'r', strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'o', (int) (short) 10, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains(" ", 1, (int) 'a', strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("Aa", 65, (int) 'K', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("aA", (int) 'o', (int) '.', strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.append(" H#");
        doubleMetaphoneResult6.append(" a", "");
        doubleMetaphoneResult6.appendAlternate(" Ha#");
        doubleMetaphoneResult6.appendAlternate(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        char char12 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: \000 .", (int) 'E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKP");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ARKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPXKMNSK" + "'", str14, "ARKPXKMNSK");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult13.append("", "o");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('a', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache" + "'", str11, "org.apache");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        char char11 = doubleMetaphone0.charAt("", 0);
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("", (int) (byte) 1);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual(" HHA ", "H\000 ARKPKKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append("RKPK", "org.apache.commons.codec.EncoderException:   ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.encode("\000ARKPKSKMN");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("R");
        java.lang.String str16 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str8, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPKSKMN" + "'", str11, "ARKPKSKMN");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "R" + "'", str14, "R");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str17 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.append("\000AARKPKSKM");
        doubleMetaphoneResult7.append('a', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "  " + "'", str17, "  ");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "a", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("a");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("AaR");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AR" + "'", str21, "AR");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "", false);
        int int18 = doubleMetaphone0.maxCodeLen;
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: #org.apach", "ARKPKKMNSK", false);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "aAARKPKSKM", false);
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("HRKPK");
        char char31 = doubleMetaphone0.charAt("ARKPXKMNSKTKNKTRKSPXNRKPK", 84);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN" + "'", str11, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str13, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RKPK" + "'", str28, "RKPK");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTK", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = doubleMetaphoneResult12.getPrimary();
        doubleMetaphoneResult12.appendPrimary('4');
        doubleMetaphoneResult12.append('a', 'a');
        boolean boolean22 = doubleMetaphoneResult12.isComplete();
        doubleMetaphoneResult12.appendPrimary('o');
        doubleMetaphoneResult12.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str29 = doubleMetaphoneResult12.getAlternate();
        doubleMetaphoneResult12.appendAlternate(" ARKPXKMNS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" RKPK 4hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone12.encode("hi!");
        java.lang.String str16 = doubleMetaphone12.encode("");
        char char19 = doubleMetaphone12.charAt(" ", (int) 'a');
        java.lang.String str21 = doubleMetaphone12.encode("HARKP");
        char char24 = doubleMetaphone12.charAt("org.apache.commons.codec.EncoderException: hi!org.apa", 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) char24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "R" + "'", str11, "R");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HRKP" + "'", str21, "HRKP");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'E' + "'", char24 == 'E');
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!ARKPXK", "aorg.apach");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKS", " Horg.apac", false);
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        java.lang.String str18 = doubleMetaphone0.encode(" Ha#");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str21 = doubleMetaphone19.doubleMetaphone("");
        java.lang.String str23 = doubleMetaphone19.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone19.new DoubleMetaphoneResult(0);
        java.lang.String str26 = doubleMetaphoneResult25.getPrimary();
        doubleMetaphoneResult25.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        doubleMetaphoneResult25.append("\000aaARKPKMN", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKP" + "'", str23, "ARKP");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aaARKPKMN", " a#hi!ARKP");
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.encode(" ");
        java.lang.String str19 = doubleMetaphone0.encode("ARKPKS");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPKS" + "'", str19, "ARKPKS");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.String str9 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException:  ");
        java.lang.String str11 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = 32;
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: #org.apach");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str9, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPK" + "'", str16, "ARKPXKMNSKTKNKTRKSPXNRKPK");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str15 = doubleMetaphone0.encode(" HHA");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aaARKPKMN", false);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKP" + "'", str18, "ARKP");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult8.appendAlternate("\000AARKPKSKM");
        doubleMetaphoneResult8.append("AH");
        java.lang.Class<?> wildcardClass13 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.appendAlternate('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone9.doubleMetaphone("");
        doubleMetaphone9.setMaxCodeLen((int) (byte) 10);
        int int14 = doubleMetaphone9.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone9.new DoubleMetaphoneResult(10);
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        doubleMetaphoneResult16.appendPrimary(' ');
        doubleMetaphoneResult16.appendPrimary("H");
        doubleMetaphoneResult16.append("", "");
        doubleMetaphoneResult16.append("org.apache.commons.codec.EncoderException: ");
        java.lang.String str27 = doubleMetaphoneResult16.getAlternate();
        java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) str27);
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: a", "hi!");
        doubleMetaphone0.setMaxCodeLen((int) '.');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache" + "'", str27, "org.apache");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "ARKP" + "'", obj28, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str9 = doubleMetaphone0.encode(" ");
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'T');
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("ARKPRKPK", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone(" HHA ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKPRKPK" + "'", str15, "ARKPRKPK");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual(" H#", "");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("#H", " H\000");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("HARKP", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSK" + "'", str11, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HRKP" + "'", str22, "HRKP");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone11.doubleMetaphone("");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 10);
        int int16 = doubleMetaphone11.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone11.new DoubleMetaphoneResult(10);
        boolean boolean19 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.append("");
        doubleMetaphoneResult18.append('a', '#');
        doubleMetaphoneResult18.appendAlternate("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult18.appendAlternate("");
        doubleMetaphoneResult18.appendPrimary("a");
        java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) "a");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        char char36 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: #org.apach", 0);
        java.lang.String str38 = doubleMetaphone0.doubleMetaphone("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult40 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int41 = doubleMetaphone0.getMaxCodeLen();
        char char44 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + 'o' + "'", char36 == 'o');
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ARKPKSKMNS" + "'", str38, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + 'e' + "'", char44 == 'e');
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKS", false);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" Horg.apac", "Aar");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!org.ap", "\000\000ARKPKSKM");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "ARKP" + "'", obj17, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str10 = doubleMetaphone0.encode(" H# ");
        char char13 = doubleMetaphone0.charAt("Aorg.apach", 82);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary("");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("\000AARKPKSKM", "#org.apach");
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache" + "'", str13, "org.apache");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache" + "'", str17, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "ARKPKSKMNS");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("a");
        char char16 = doubleMetaphone0.charAt("ARKPXKMNSK", 65);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str7 = doubleMetaphoneResult6.getAlternate();
        doubleMetaphoneResult6.appendAlternate('a');
        doubleMetaphoneResult6.appendAlternate("ARKPXKMNSK");
        doubleMetaphoneResult6.appendAlternate("ARKPKSK");
        doubleMetaphoneResult6.appendPrimary('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult6.appendPrimary('a');
        doubleMetaphoneResult6.append(' ');
        doubleMetaphoneResult6.appendPrimary("  #");
        doubleMetaphoneResult6.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.");
        doubleMetaphoneResult6.appendAlternate('K');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.encode("Aar");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult9.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ARKPXKMNSK");
        doubleMetaphoneResult9.appendPrimary("org.apache.commons.codec.EncoderException: ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AR" + "'", str7, "AR");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.appendAlternate(' ');
        java.lang.String str20 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("ARKPKMNSKT", "org.apache.commons.codec.EncoderException: ARKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a " + "'", str20, "a ");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("aAa\000", 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode(" a");
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.Class<?> wildcardClass7 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPX", "");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphone0.setMaxCodeLen(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: A", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        doubleMetaphone0.maxCodeLen = 'E';
        doubleMetaphone0.maxCodeLen = 35;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(72);
        java.lang.String str15 = doubleMetaphoneResult14.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 65;
        char char15 = doubleMetaphone0.charAt("ARKPKSKMNS", (int) (short) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("#hi!org.ap", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("aAo");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RKP" + "'", str18, "RKP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone(" org.apach", false);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        int int17 = doubleMetaphone0.maxCodeLen;
        java.lang.String str19 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: # Ha#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        java.lang.String str14 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        int int15 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'H';
        java.lang.String str19 = doubleMetaphone0.encode("");
        java.lang.String str21 = doubleMetaphone0.encode("hi!.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.appendAlternate(" HHAa");
        doubleMetaphoneResult17.appendAlternate(' ');
        java.lang.Class<?> wildcardClass24 = doubleMetaphoneResult17.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", true);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN" + "'", str10, "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN" + "'", str12, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = doubleMetaphone0.maxCodeLen;
        int int13 = doubleMetaphone0.maxCodeLen;
        char char16 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", (int) (short) 100);
        char char19 = doubleMetaphone0.charAt("ARKPKMNSKT", 82);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual(".", "org.apache.commons.codec.EncoderException:  ", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65 + "'", int13 == 65);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) 'm');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('a', '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary('4');
        doubleMetaphoneResult7.append("\000ARKPKSKMN", "ARKPX");
        doubleMetaphoneResult7.append('o');
        doubleMetaphoneResult7.append('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: a", "ARKPKSKMNS");
        doubleMetaphoneResult7.appendAlternate("\000aaARKPKMN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache" + "'", str23, "org.apache");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKP");
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSK" + "'", str13, "ARKPXKMNSK");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        char char11 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKS", false);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        char char20 = doubleMetaphone0.charAt("Aa", (int) 'T');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "ARKP" + "'", obj17, "ARKP");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str10 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual(" org.apach", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", false);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        int int9 = doubleMetaphone0.maxCodeLen;
        int int10 = doubleMetaphone0.getMaxCodeLen();
        int int11 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("ARKP", (int) (byte) -1);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("#hi!ARKPXK", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str20 = doubleMetaphoneResult19.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPX" + "'", str12, "ARKPX");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RKPKSK" + "'", str17, "RKPKSK");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 10;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual(" \000a RKPK ", "aA", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'r');
        doubleMetaphoneResult10.appendAlternate('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPKSKMNS" + "'", str8, "ARKPKSKMNS");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        char char9 = doubleMetaphone0.charAt(" ", (int) '#');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" Horg.apac");
        java.lang.String str13 = doubleMetaphone0.encode("aA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HRKPK" + "'", str11, "HRKPK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        char char7 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", (int) '\000');
        doubleMetaphone0.maxCodeLen = 84;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'o' + "'", char7 == 'o');
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.appendAlternate('R');
        java.lang.String str21 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#org.apach" + "'", str21, "#org.apach");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "aA" + "'", str22, "aA");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("\000AARKPKSKM");
        doubleMetaphoneResult7.appendPrimary(" H\000ARKPXKM");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: HRKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append('e');
        doubleMetaphoneResult12.append('r', ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        doubleMetaphone0.maxCodeLen = '.';
        java.lang.String str13 = doubleMetaphone0.encode(" HHA");
        doubleMetaphone0.setMaxCodeLen(82);
        java.lang.String str17 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: HRKP");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKP" + "'", str17, "ARKPXKMNSKTKNKTRKSPXNRKP");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 10);
        int int15 = doubleMetaphone10.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult(10);
        boolean boolean18 = doubleMetaphoneResult17.isComplete();
        boolean boolean19 = doubleMetaphoneResult17.isComplete();
        doubleMetaphoneResult17.append(" ");
        java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) " ");
        int int23 = doubleMetaphone0.maxCodeLen;
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("aAorg.apac");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 10;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000hi!", "  Horg.apa");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone20.doubleMetaphone("");
        doubleMetaphone20.setMaxCodeLen((int) (byte) 10);
        int int25 = doubleMetaphone20.maxCodeLen;
        char char28 = doubleMetaphone20.charAt("ARKP", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone20.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult30.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ", "a\000AARKPKSK");
        doubleMetaphoneResult30.appendPrimary('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HRKPK" + "'", str19, "HRKPK");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'A' + "'", char28 == 'A');
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        java.lang.String str13 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        java.lang.String str15 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate(' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " H" + "'", str14, " H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " H" + "'", str15, " H");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        java.lang.String str18 = doubleMetaphone15.encode("");
        java.lang.String str20 = doubleMetaphone15.encode("org.apache.commons.codec.EncoderException: hi!");
        char char23 = doubleMetaphone15.charAt("", (int) (short) 10);
        doubleMetaphone15.setMaxCodeLen(35);
        java.lang.String str27 = doubleMetaphone15.encode("#hi!ARKPXK");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR" + "'", str14, "ARKPKMNSKTKNKTRKSPKSNRKPKMNSKTKNKTR");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RKPKSK" + "'", str27, "RKPKSK");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str15 = doubleMetaphone0.encode(" HHA");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.appendPrimary('E');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.appendAlternate(" HHAa");
        doubleMetaphoneResult17.appendAlternate(' ');
        doubleMetaphoneResult17.append("E");
        java.lang.String str26 = doubleMetaphoneResult17.getPrimary();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str18 = doubleMetaphone0.encode(" HHA");
        doubleMetaphone0.maxCodeLen = 65;
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa#", "");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone27 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str29 = doubleMetaphone27.doubleMetaphone("");
        doubleMetaphone27.setMaxCodeLen((int) (byte) 10);
        int int32 = doubleMetaphone27.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone27.new DoubleMetaphoneResult(10);
        boolean boolean35 = doubleMetaphoneResult34.isComplete();
        doubleMetaphoneResult34.append("");
        doubleMetaphoneResult34.append('a', '#');
        doubleMetaphoneResult34.appendAlternate("a");
        doubleMetaphoneResult34.append("\000AARKPKSKM", "");
        java.lang.Object obj46 = doubleMetaphone0.encode((java.lang.Object) "\000AARKPKSKM");
        java.lang.String str49 = doubleMetaphone0.doubleMetaphone("", false);
        int int50 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 65 + "'", int21 == 65);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "ARKPKSKM" + "'", obj46, "ARKPKSKM");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 65 + "'", int50 == 65);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '.');
        boolean boolean16 = doubleMetaphoneResult15.isComplete();
        java.lang.String str17 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendAlternate(" org.apach");
        boolean boolean27 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("hi!.");
        doubleMetaphoneResult7.appendPrimary("\000aaARKPKMN");
        doubleMetaphoneResult7.append('.', '\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str18 = doubleMetaphone0.encode(" a#hi!ARKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult20.append("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", "#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPKSKMNS" + "'", str18, "ARKPKSKMNS");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        doubleMetaphone0.maxCodeLen = '\000';
        java.lang.String str8 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        char char17 = doubleMetaphone0.charAt("\000AARKPKSKM", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(114);
        doubleMetaphoneResult19.appendAlternate("org.apache.commons.codec.EncoderException: HARKPX");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains(" a#hi!ARKP", (int) 'r', 35, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'R';
        java.lang.String str18 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ARKP");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone(" Horg.apac", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKP" + "'", str18, "ARKPXKMNSKTKNKTRKSPXNRKP");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HRKPK" + "'", str21, "HRKPK");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str18 = doubleMetaphone0.encode(" HHA");
        doubleMetaphone0.maxCodeLen = 65;
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa#", "");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone27 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str29 = doubleMetaphone27.doubleMetaphone("");
        doubleMetaphone27.setMaxCodeLen((int) (byte) 10);
        int int32 = doubleMetaphone27.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone27.new DoubleMetaphoneResult(10);
        boolean boolean35 = doubleMetaphoneResult34.isComplete();
        doubleMetaphoneResult34.append("");
        doubleMetaphoneResult34.append('a', '#');
        doubleMetaphoneResult34.appendAlternate("a");
        doubleMetaphoneResult34.append("\000AARKPKSKM", "");
        java.lang.Object obj46 = doubleMetaphone0.encode((java.lang.Object) "\000AARKPKSKM");
        doubleMetaphone0.setMaxCodeLen(101);
        java.lang.String str50 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: RKPK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 65 + "'", int21 == 65);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "ARKPKSKM" + "'", obj46, "ARKPKSKM");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPK" + "'", str50, "ARKPXKMNSKTKNKTRKSPXNRKPK");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual(" Horg.apac", "org.apache.commons.codec.EncoderException: ");
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKKMNSKTKNKTRKSPXNRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append(' ');
        java.lang.String str16 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("", "RKPK");
        doubleMetaphoneResult7.appendAlternate(" ");
        java.lang.String str22 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('\000');
        doubleMetaphoneResult7.appendPrimary(" HHA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 0;
        char char14 = doubleMetaphone0.charAt("", 65);
        java.lang.String str16 = doubleMetaphone0.encode("ARKP");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        java.lang.String str14 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "hi!");
        doubleMetaphoneResult7.append('E');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "ARKPKSKMNS");
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray20 = encoderException19.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("");
        encoderException27.addSuppressed((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException31);
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException31);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException("hi!.", (java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray40 = encoderException39.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException46 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException48 = new org.apache.commons.codec.EncoderException("");
        encoderException46.addSuppressed((java.lang.Throwable) encoderException48);
        org.apache.commons.codec.EncoderException encoderException50 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException48);
        org.apache.commons.codec.EncoderException encoderException51 = new org.apache.commons.codec.EncoderException("", (java.lang.Throwable) encoderException48);
        encoderException42.addSuppressed((java.lang.Throwable) encoderException48);
        org.apache.commons.codec.EncoderException encoderException53 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException54 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException53);
        encoderException33.addSuppressed((java.lang.Throwable) encoderException54);
        java.lang.Throwable[] throwableArray56 = encoderException54.getSuppressed();
        java.lang.Throwable[] throwableArray57 = encoderException54.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = doubleMetaphone0.encode((java.lang.Object) throwableArray57);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPXKMNSK" + "'", str14, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("hi!\000ARKPKS");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.append("hi!", " ");
        doubleMetaphoneResult7.append("hi!");
        doubleMetaphoneResult7.appendAlternate('a');
        doubleMetaphoneResult7.append('T', 'A');
        doubleMetaphoneResult7.appendPrimary("or");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        char char10 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException", 1);
        char char13 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: \000org.apach", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(84);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'r' + "'", char10 == 'r');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'o' + "'", char13 == 'o');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult12.append(" ", "org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult12.append('4');
        doubleMetaphoneResult12.append('E', '\000');
        doubleMetaphoneResult12.appendPrimary('o');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (short) -1);
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        char char20 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: \000", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("HH", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        java.lang.String str24 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " H##org.ap" + "'", str24, " H##org.ap");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str20 = doubleMetaphone0.encode("");
        char char23 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", 111);
        int int24 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("AR", "hi!\000ARKPKS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary("#org.apach");
        doubleMetaphoneResult7.appendPrimary("HH");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("aAorg.apac", false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPK" + "'", str9, "ARKPK");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "\000org.apach");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append("aAARKPKSKM", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTK");
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        char char13 = doubleMetaphone0.charAt("", (int) 'a');
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("HRKPK", "aAARKPKSKM", false);
        doubleMetaphone0.maxCodeLen = 4;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = 100;
        java.lang.String str11 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXNRKP");
        doubleMetaphone0.maxCodeLen = 111;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000 .", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone17.doubleMetaphone("a");
        int int21 = doubleMetaphone17.maxCodeLen;
        int int22 = doubleMetaphone17.getMaxCodeLen();
        doubleMetaphone17.maxCodeLen = '.';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNRKP" + "'", str11, "ARKPKSKMNSKTKNKTRKSPKSNRKP");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.appendAlternate(' ');
        doubleMetaphoneResult7.appendPrimary('#');
        java.lang.String str20 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append(" \000a RKPK ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " H#" + "'", str20, " H#");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphoneResult8.append('.', 'a');
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("ARKPKSK");
        doubleMetaphoneResult8.appendPrimary('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult9.append("H");
        doubleMetaphoneResult9.appendPrimary('e');
        doubleMetaphoneResult9.appendPrimary('4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.lang.String[] strArray22 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException:  ", (int) '#', (int) (byte) 10, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (byte) 1, (int) 'R', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 84, (int) (byte) 10, strArray22);
        java.lang.Class<?> wildcardClass29 = strArray22.getClass();
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char17 = doubleMetaphone10.charAt("#org.apach", 65);
        int int18 = doubleMetaphone10.maxCodeLen;
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean23 = doubleMetaphone10.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone10.new DoubleMetaphoneResult((int) '.');
        java.lang.String str26 = doubleMetaphoneResult25.getAlternate();
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('a', 'A');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "ARKPARKPK");
        doubleMetaphoneResult7.append("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.maxCodeLen = 58;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.String str9 = doubleMetaphone0.encode("R");
        java.lang.String str11 = doubleMetaphone0.encode(" H\000hi!\000ARK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "R" + "'", str9, "R");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RK" + "'", str11, "RK");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("a");
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append(" ");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        boolean boolean18 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        char char18 = doubleMetaphone0.charAt(" Horg.apac", 114);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'K');
        doubleMetaphoneResult21.appendPrimary(':');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        java.lang.String str18 = doubleMetaphone0.encode(" HHA");
        doubleMetaphone0.maxCodeLen = 65;
        int int21 = doubleMetaphone0.maxCodeLen;
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("# hi!a", true);
        char char27 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: HARKPX", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 65 + "'", int21 == 65);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'e' + "'", char27 == 'e');
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.append('\000');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult18.append("\000ARKPKSKMN");
        doubleMetaphoneResult18.appendAlternate('a');
        doubleMetaphoneResult18.append('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary('a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.lang.String[] strArray28 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: a", (int) 'o', (int) 'A', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("RKPK", (int) (byte) 100, (int) 'r', strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'o', (int) (short) 10, strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains(" ", 1, (int) 'a', strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("Aa", 65, (int) 'K', strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", (int) (byte) -1, (int) 'e', strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary('.');
        doubleMetaphoneResult7.appendAlternate("\000ARKPXo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.appendPrimary(" ");
        doubleMetaphoneResult7.appendAlternate("ARKPX");
        doubleMetaphoneResult7.append('R', 'H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.encode("");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(84);
        char char17 = doubleMetaphone0.charAt("ARKPX\000", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + 'A' + "'", char17 == 'A');
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate("");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str15 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append('a', 'A');
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        boolean boolean20 = doubleMetaphoneResult7.isComplete();
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.append('\000', 'A');
        doubleMetaphoneResult7.append("ARKPKSKMNS");
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append("H", "");
        doubleMetaphoneResult7.append(" ");
        doubleMetaphoneResult7.appendAlternate("hi!");
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: # Ha#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        boolean boolean10 = doubleMetaphoneResult9.isComplete();
        java.lang.String str11 = doubleMetaphoneResult9.getAlternate();
        doubleMetaphoneResult9.append('r', ' ');
        java.lang.String str15 = doubleMetaphoneResult9.getPrimary();
        boolean boolean16 = doubleMetaphoneResult9.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "r" + "'", str15, "r");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.setMaxCodeLen(0);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("#org.apach", "ARKPX");
        doubleMetaphone0.setMaxCodeLen(65);
        java.lang.String str22 = doubleMetaphone0.encode("aorg.apach");
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa#", "hi!org.apa");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("HRKP", "HA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPK" + "'", str22, "ARKPK");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone(" org.apach", false);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSK", "");
        java.lang.String str21 = doubleMetaphone0.encode(" HH");
        char char24 = doubleMetaphone0.charAt(" HHAa", (int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPK" + "'", str16, "ARKPK");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'H' + "'", char24 == 'H');
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '\000';
        int int11 = doubleMetaphone0.maxCodeLen;
        java.lang.String[] strArray31 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (short) 10, (int) (short) 100, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: ", 100, (int) 'a', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException:  ", (int) '#', (int) (byte) 10, strArray31);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", (int) (byte) 1, (int) 'R', strArray31);
        java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str39 = doubleMetaphone0.encode(" HHA ");
        doubleMetaphone0.setMaxCodeLen((int) 'm');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        char char16 = doubleMetaphone0.charAt("HRKP", 0);
        java.lang.String str18 = doubleMetaphone0.encode("HRKPKS");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'H' + "'", char16 == 'H');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RKPK" + "'", str18, "RKPK");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.encode("RKPK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'E');
        java.lang.String str13 = doubleMetaphoneResult12.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RKPK" + "'", str10, "RKPK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "org.apache.commons.codec.EncoderException: hi!", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("HRKPK", true);
        char char24 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ARKPX", (int) 'R');
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("aorg.apach", false);
        java.lang.String str29 = doubleMetaphone0.encode("ARKPKSKM");
        int int30 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RKPK" + "'", str21, "RKPK");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKPK" + "'", str27, "ARKPK");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKPKSKM" + "'", str29, "ARKPKSKM");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.String str5 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('#', '4');
        doubleMetaphoneResult7.appendPrimary('4');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException:   #\000", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKPKSKMNS" + "'", str5, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKPKSKMNS" + "'", str7, "ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSK" + "'", str11, "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKPXKMNSK" + "'", str15, "ARKPXKMNSK");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append("hi!", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendAlternate("ARKPKSKMNSKTKNKTRKSPKSNRKPK");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult10.append(' ', '4');
        doubleMetaphoneResult10.appendPrimary(" Horg.apac");
        doubleMetaphoneResult10.append('A', '\000');
        doubleMetaphoneResult10.appendAlternate(" H");
        java.lang.String str21 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult5.append('a', ' ');
        boolean boolean9 = doubleMetaphoneResult5.isComplete();
        java.lang.String str10 = doubleMetaphoneResult5.getPrimary();
        doubleMetaphoneResult5.appendPrimary('o');
        java.lang.String str13 = doubleMetaphoneResult5.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult5.append("hi!ET");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult17.appendAlternate("");
        doubleMetaphoneResult17.append("#hi!ARKPXK", "HRKP");
        doubleMetaphoneResult17.append('m', '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append(' ');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append("org.apache");
        boolean boolean27 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('T', 'E');
        doubleMetaphoneResult7.appendAlternate("#hi!ARKPXK");
        java.lang.String str33 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('R');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache" + "'", str22, "org.apache");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " Horg.apac" + "'", str33, " Horg.apac");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "#org.apach");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNS", "Aar", false);
        char char15 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: a", (int) 'r');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "RKPK" + "'", obj8, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('E', 'R');
        doubleMetaphoneResult7.append(':');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        java.lang.String str9 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate("ARKPXKMNSK");
        doubleMetaphoneResult7.appendPrimary('\000');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("hi!\000ARKPKS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("ARKPKSKMNS", "H");
        doubleMetaphoneResult7.append("H", "org.apache");
        doubleMetaphoneResult7.append('\000', 'a');
        java.lang.String str22 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHorg.apac" + "'", str22, "HHorg.apac");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache" + "'", str23, "org.apache");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append("");
        boolean boolean17 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('A');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!", "\000org.apach");
        doubleMetaphoneResult7.append('A', 'r');
        doubleMetaphoneResult7.appendAlternate("AH");
        java.lang.Class<?> wildcardClass30 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: H");
        doubleMetaphoneResult7.appendPrimary(" H\000");
        doubleMetaphoneResult7.appendPrimary('\000');
        doubleMetaphoneResult7.appendPrimary('a');
        doubleMetaphoneResult7.appendPrimary("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("", true);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "ARKPKSKMNS");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSN", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!org.apa");
        java.lang.Throwable throwable16 = null;
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("Aorg.apach", throwable16);
        java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) "Aorg.apach");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "ARKPK" + "'", obj18, "ARKPK");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('\000');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("aAa\000", "hi!A");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        char char11 = doubleMetaphone0.charAt("", (int) 'o');
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!org.apa");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKP" + "'", str16, "ARKP");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("Aa");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("ARKPKMN hi", true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException:  ");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKSKM");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.encode("a");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTK", " a", false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ARKP" + "'", str4, "ARKP");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ARKP" + "'", str6, "ARKP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H");
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.encode("");
        int int18 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: a", "4", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult13.appendAlternate("ARKPKSKMNS");
        boolean boolean16 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.appendAlternate("ARKPARKPK");
        doubleMetaphoneResult13.appendAlternate('A');
        doubleMetaphoneResult13.append(':', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.append('a');
        java.lang.String str25 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#org.apach" + "'", str25, "#org.apach");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 1;
        char char12 = doubleMetaphone0.charAt("", (int) (short) 10);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("HH");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "H" + "'", obj7, "H");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("ARKPKSKMNS");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", "RKPK");
        doubleMetaphoneResult7.appendAlternate('r');
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: a ");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: #org.apach");
        java.lang.String str26 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('K');
        doubleMetaphoneResult7.append('T', 'e');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ARKPKSKMNS" + "'", str26, "ARKPKSKMNS");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = 'o';
        char char20 = doubleMetaphone0.charAt("ARKPKS", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str23 = doubleMetaphoneResult22.getPrimary();
        doubleMetaphoneResult22.append('A');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'R' + "'", char20 == 'R');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("");
        doubleMetaphoneResult7.append('a', '#');
        doubleMetaphoneResult7.appendAlternate("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("A");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append('a');
        doubleMetaphoneResult7.append('a');
        java.lang.String str25 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "aAorg.apac" + "'", str25, "aAorg.apac");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual(" Horg.apac", "org.apache.commons.codec.EncoderException: ");
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("# hi!a", "AaR");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "Aar", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("ARKPXKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: a");
        doubleMetaphoneResult7.append('#');
        doubleMetaphoneResult7.appendAlternate("\000");
        doubleMetaphoneResult7.append('H', 'a');
        doubleMetaphoneResult7.appendAlternate(':');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("RKPK", false);
        doubleMetaphone0.setMaxCodeLen(35);
        java.lang.String str16 = doubleMetaphone0.encode(" HHA");
        java.lang.String str18 = doubleMetaphone0.encode("RKPKSKM");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKPK" + "'", str12, "RKPK");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RKPKSKM" + "'", str18, "RKPKSKM");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual(" a", "org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("H");
        doubleMetaphoneResult7.append("", "");
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendAlternate("HARKP");
        doubleMetaphoneResult7.appendPrimary('H');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'e');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ARKPKSKMN", "hi!org.apa");
        char char16 = doubleMetaphone0.charAt("AR", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ARKPX", (int) ':', 0, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.append(' ', 'a');
        boolean boolean14 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendAlternate('A');
        doubleMetaphoneResult7.appendPrimary("");
        boolean boolean19 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult7.appendPrimary('A');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str4 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKP", true);
        java.lang.String str9 = doubleMetaphone0.encode(" ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 10);
        int int15 = doubleMetaphone10.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult(10);
        java.lang.String str18 = doubleMetaphoneResult17.getPrimary();
        doubleMetaphoneResult17.appendPrimary('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult13.append('\000', 'A');
        doubleMetaphoneResult13.append(' ', 'a');
        doubleMetaphoneResult13.appendAlternate('r');
        java.lang.String str22 = doubleMetaphoneResult13.getAlternate();
        doubleMetaphoneResult13.appendPrimary("org.apache.commons.codec.EncoderException: A");
        doubleMetaphoneResult13.append('K', 'R');
        doubleMetaphoneResult13.appendPrimary("a");
        doubleMetaphoneResult13.append("RKPKSK", " H#");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Aar" + "'", str22, "Aar");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("a", true);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN", "");
        char char19 = doubleMetaphone0.charAt("  H", 111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("RKPK");
        char char13 = doubleMetaphone0.charAt("  #\000", (int) '.');
        doubleMetaphone0.maxCodeLen = 10;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'T');
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RKPK" + "'", str10, "RKPK");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.append("ARKP");
        doubleMetaphoneResult7.append('A');
        java.lang.String str17 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.append("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HARKPA" + "'", str17, "HARKPA");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode(" a");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("HAorg.apac", " H\000");
        java.lang.String str9 = doubleMetaphone0.encode("");
        java.lang.String str11 = doubleMetaphone0.encode("R");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "R" + "'", str11, "R");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "");
        char char18 = doubleMetaphone0.charAt("aorg.apach", 101);
        java.lang.String str20 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.setMaxCodeLen((int) 'T');
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str24, "ARKPKSKMNSKTKNKTRKSPKSN");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = '.';
        doubleMetaphone0.maxCodeLen = 65;
        doubleMetaphone0.maxCodeLen = '#';
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKT" + "'", str16, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKT");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("hi!");
        java.lang.Throwable[] throwableArray16 = encoderException15.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("H", (java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("");
        encoderException23.addSuppressed((java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException27);
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException27);
        encoderException15.addSuppressed((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("hi!.", (java.lang.Throwable) encoderException29);
        java.lang.Throwable[] throwableArray32 = encoderException29.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException38 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("");
        encoderException38.addSuppressed((java.lang.Throwable) encoderException40);
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("hi!", (java.lang.Throwable) encoderException40);
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!", (java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException44 = new org.apache.commons.codec.EncoderException("ARKP", (java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException45 = new org.apache.commons.codec.EncoderException((java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException46 = new org.apache.commons.codec.EncoderException("org.apache.commons.codec.EncoderException: hi!org.apa", (java.lang.Throwable) encoderException45);
        encoderException29.addSuppressed((java.lang.Throwable) encoderException46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = doubleMetaphone0.encode((java.lang.Object) encoderException46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        char char14 = doubleMetaphone0.charAt("org.apache", (-1));
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("Aar", false);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000a");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNS" + "'", str9, "ARKPKSKMNS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AR" + "'", str17, "AR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone(" ");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.String str16 = doubleMetaphone0.encode("#");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("ARKPKSKMNS");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPXKMNSK" + "'", str8, "ARKPXKMNSK");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPKSKMNS" + "'", str18, "ARKPKSKMNS");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str15 = doubleMetaphone13.encode("hi!");
        char char18 = doubleMetaphone13.charAt("", 100);
        java.lang.String str20 = doubleMetaphone13.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int21 = doubleMetaphone13.getMaxCodeLen();
        doubleMetaphone13.maxCodeLen = '\000';
        int int24 = doubleMetaphone13.maxCodeLen;
        int int25 = doubleMetaphone13.maxCodeLen;
        char char28 = doubleMetaphone13.charAt("", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone13.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str32 = doubleMetaphone13.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) str32);
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPARKPK", " HHA ", false);
        doubleMetaphone0.setMaxCodeLen((int) 'r');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone40 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str42 = doubleMetaphone40.doubleMetaphone("");
        doubleMetaphone40.setMaxCodeLen((int) (byte) 10);
        int int45 = doubleMetaphone40.maxCodeLen;
        doubleMetaphone40.maxCodeLen = 'A';
        doubleMetaphone40.maxCodeLen = 32;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = doubleMetaphone0.encode((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("#", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        java.lang.String str13 = doubleMetaphone0.encode("");
        java.lang.String str15 = doubleMetaphone0.encode("ARKPX\000");
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.lang.String[] strArray16 = new java.lang.String[] { "ARKPXKMNSK", "", "ARKP", "H" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", 100, (int) (short) 1, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) 'A', 4, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'e', (int) (short) 100, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", 0, (int) ' ', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary(' ');
        doubleMetaphoneResult7.appendPrimary("");
        doubleMetaphoneResult7.append('r');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphoneResult7.append("H");
        doubleMetaphoneResult7.append('H', 'a');
        doubleMetaphoneResult7.appendPrimary("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

