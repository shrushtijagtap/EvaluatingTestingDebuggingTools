package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "#org.apach");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ", true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKSKMNS");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str12 = doubleMetaphone0.encode("a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ", false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKP");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKSKM", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.maxCodeLen = 'A';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKP");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", " H#");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "org.apache.commons.codec.EncoderException:  ");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "ARKPKSKMNS");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("  ", " org.apach", true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", " ");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "H", false);
        char char7 = doubleMetaphone0.charAt("#org.apach", 65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("  ", "ARKPKKMNSK", false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        char char4 = doubleMetaphone0.charAt("ARKPXKMNSK", (int) (byte) 0);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "\000", true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        char char7 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", (int) '\000');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("H");
        char char6 = doubleMetaphone0.charAt("", 1);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", true);
        java.lang.String str11 = doubleMetaphone0.encode("a");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", " HHA");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str12 = doubleMetaphone0.encode("org.apache");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKSKMNS");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.maxCodeLen = 'A';
        java.lang.String str10 = doubleMetaphone0.encode(" ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPX", true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "org.apache.commons.codec.EncoderException: A");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("", " ");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "RKPK");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.maxCodeLen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000", false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "ARKP", false);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "  ");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTKNKTRKSPXN", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000org.apach", false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: hi!", (int) (byte) 1);
        int int15 = doubleMetaphone0.maxCodeLen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "RKPK", true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKM", "", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKKMNSK");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException:  ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("  ", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: H", true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("", "aorg.apach", true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", false);
        doubleMetaphone0.maxCodeLen = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "ARKPKSKM", false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) 'A');
        doubleMetaphone0.setMaxCodeLen(65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: a", false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        java.lang.String str19 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", " H\000");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char char11 = doubleMetaphone0.charAt("", 4);
        char char14 = doubleMetaphone0.charAt("H", (int) '#');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("ARKP");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "o", false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", " H# ");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt(" ", (int) 'a');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "R");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt("", 100);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int10 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "\000AARKPKSKM", true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.String str9 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "AR", true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'o');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", " Horg.apac", false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: H", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("  #", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "Aar", true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKP");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        char char13 = doubleMetaphone0.charAt("", (int) 'a');
        int int14 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("", "#hi!org.ap", true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNS", false);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("ARKPKSKM");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000H", false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException:  ");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(65);
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: a");
        java.lang.String str15 = doubleMetaphone0.encode("\000org.apach");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("", " Horg.apac", false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        char char8 = doubleMetaphone0.charAt("", (int) (byte) -1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H", "H", false);
        java.lang.String str14 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000 .", false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.maxCodeLen = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "org.apache.commons.codec.EncoderException: \000org.apach", false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) " H#");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000AARKPKSKM");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone15.doubleMetaphone("");
        doubleMetaphone15.setMaxCodeLen((int) (byte) 10);
        java.lang.String str21 = doubleMetaphone15.encode("ARKP");
        char char24 = doubleMetaphone15.charAt(" ", (int) '#');
        java.lang.String str26 = doubleMetaphone15.doubleMetaphone(" Horg.apac");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) " Horg.apac");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("", "\000 .", true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("ARKP", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ARKP", false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str4 = doubleMetaphone0.encode("ARKPXKMNSK");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.String str9 = doubleMetaphone0.encode("");
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKS");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException:  ", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: #org.apach");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual(" ", "RKPKSKM");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str15 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str19 = doubleMetaphone0.encode("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKSKMNSKTKNKTRKSPKSNRKP");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException:  ", "");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str17 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ");
        doubleMetaphone0.maxCodeLen = 'r';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "# Ha#");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str6 = doubleMetaphone0.encode("ARKP");
        char char9 = doubleMetaphone0.charAt(" ", (int) '#');
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone(" Horg.apac");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException:  ", false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "HARKP", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKMN hi", false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str9 = doubleMetaphone0.encode("ARKPKSKMNS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKSKMNSKTKNKTRKSPKSNRKP", false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        int int38 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
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
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual(" H", "HRKP", false);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone(" Horg.apac", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("", " H\000ARKPXKM", false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        char char14 = doubleMetaphone0.charAt(" H\000", (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ARKPKKMNSK", false);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        java.lang.String str5 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        char char8 = doubleMetaphone0.charAt("", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult(84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", " org.apach");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        int int3 = doubleMetaphone0.maxCodeLen;
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache", "", true);
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone(" Horg.apac", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", " HHA ", true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone(" Horg.apac");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str23 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: H");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("", " \000a RKPK ");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = (byte) 10;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKP", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'R');
        doubleMetaphone0.maxCodeLen = 'o';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPXKMNSKTKNKTRKSPXNRKPK");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str10 = doubleMetaphone0.encode("ARKPKSKMNS");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("a", true);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("RKPK");
        doubleMetaphone0.setMaxCodeLen((int) 'R');
        java.lang.String str19 = doubleMetaphone0.encode("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("", "aAa\000");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ARKPXKMNSK");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "hi!", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str18 = doubleMetaphone16.doubleMetaphone("");
        doubleMetaphone16.setMaxCodeLen((int) (byte) 10);
        int int21 = doubleMetaphone16.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone16.new DoubleMetaphoneResult(10);
        boolean boolean24 = doubleMetaphoneResult23.isComplete();
        doubleMetaphoneResult23.appendPrimary("org.apache.commons.codec.EncoderException: hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("", "E");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str8 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen(0);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!ARKPXK", "ARKPKSKMNSKTKNKTRKSPKSN", true);
        int int17 = doubleMetaphone0.maxCodeLen;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("", " ", true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        java.lang.String str4 = doubleMetaphone0.encode("");
        char char7 = doubleMetaphone0.charAt("hi!", 4);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("ARKP");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone(" org.apach", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("   ", "", false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
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
        java.lang.String str27 = doubleMetaphone0.encode("ARKPKMNSK");
        int int28 = doubleMetaphone0.getMaxCodeLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HA");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        char char9 = doubleMetaphone0.charAt(" ", (int) 'A');
        doubleMetaphone0.maxCodeLen = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("", "ARKPKSKMNSK", false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
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
        boolean boolean40 = doubleMetaphone0.isDoubleMetaphoneEqual("  #", "ARKPX", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone41 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str43 = doubleMetaphone41.doubleMetaphone("");
        doubleMetaphone41.setMaxCodeLen((int) (byte) 10);
        int int46 = doubleMetaphone41.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult48 = doubleMetaphone41.new DoubleMetaphoneResult(10);
        boolean boolean49 = doubleMetaphoneResult48.isComplete();
        doubleMetaphoneResult48.appendPrimary(' ');
        doubleMetaphoneResult48.appendPrimary("H");
        doubleMetaphoneResult48.append("", "");
        doubleMetaphoneResult48.append("org.apache.commons.codec.EncoderException: ");
        doubleMetaphoneResult48.appendPrimary("#org.apach");
        doubleMetaphoneResult48.appendPrimary(" ");
        java.lang.Object obj63 = doubleMetaphone0.encode((java.lang.Object) " ");
        boolean boolean66 = doubleMetaphone0.isDoubleMetaphoneEqual("# hi!a", "ARKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXNRKPKKMNSKTKNKTRKSPXN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean70 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str15 = doubleMetaphone0.encode(" ");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        char char19 = doubleMetaphone0.charAt(" H#", (int) 'R');
        java.lang.String str21 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'o');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", " RKPK ");
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("", "org.apache.commons.codec.EncoderException:  H\000", true);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("hi!");
        char char5 = doubleMetaphone0.charAt(" HHAa\000", (int) 'r');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000", "org.apache.commons.codec.EncoderException: HRKPK", false);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 1;
        char char12 = doubleMetaphone0.charAt("", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("", " Horg.apac", true);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: hi!", "#org.apach", false);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPX", "org.apache.commons.codec.EncoderException:  ");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("", "", true);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 'A';
        doubleMetaphone0.maxCodeLen = 32;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        int int12 = doubleMetaphone0.maxCodeLen;
        char char15 = doubleMetaphone0.charAt("", 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }
}

