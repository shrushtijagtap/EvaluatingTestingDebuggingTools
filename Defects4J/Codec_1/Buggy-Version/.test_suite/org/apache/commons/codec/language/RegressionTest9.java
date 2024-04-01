package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str10 = refinedSoundex8.soundex("");
        java.lang.String str12 = refinedSoundex8.encode("");
        char char14 = refinedSoundex8.getMappingCode('#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex4.setMaxLength(1);
        java.lang.String str8 = soundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        char char15 = refinedSoundex13.getMappingCode(' ');
        char char17 = refinedSoundex13.getMappingCode(' ');
        java.lang.String str19 = refinedSoundex13.soundex("");
        char char21 = refinedSoundex13.getMappingCode(' ');
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex13, "", "");
        char char26 = refinedSoundex13.getMappingCode('#');
        char char28 = refinedSoundex13.getMappingCode('4');
        java.lang.String str30 = refinedSoundex13.soundex("");
        java.lang.Object obj31 = soundex4.encode((java.lang.Object) str30);
        java.lang.String str33 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        char[] charArray20 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray20);
        char char25 = refinedSoundex23.getMappingCode(' ');
        int int28 = refinedSoundex23.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = refinedSoundex4.encode((java.lang.Object) refinedSoundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode(' ');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) (short) 0, strArray29);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 1, (int) (byte) 1, strArray29);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, 1, strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = refinedSoundex4.encode((java.lang.Object) strArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        java.lang.String str11 = refinedSoundex4.soundex("");
        char char13 = refinedSoundex4.getMappingCode('#');
        char char15 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char12 = refinedSoundex10.getMappingCode('#');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex10, "", "");
        char char17 = refinedSoundex10.getMappingCode('#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        java.lang.Class<?> wildcardClass8 = refinedSoundex5.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str16 = soundex14.encode("");
        int int17 = soundex14.getMaxLength();
        java.lang.String str19 = soundex14.soundex("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        java.lang.String str26 = refinedSoundex24.soundex("");
        java.lang.String str28 = refinedSoundex24.encode("");
        char[] charArray32 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex(charArray32);
        int int36 = refinedSoundex33.difference("", "");
        java.lang.Object obj37 = refinedSoundex24.encode((java.lang.Object) "");
        java.lang.String str39 = refinedSoundex24.soundex("");
        java.lang.String str41 = refinedSoundex24.soundex("");
        java.lang.Object obj42 = soundex14.encode((java.lang.Object) str41);
        soundex14.setMaxLength(10);
        int int47 = soundex14.difference("", "");
        java.lang.Object obj48 = soundex4.encode((java.lang.Object) "");
        java.lang.String str50 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = soundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "" + "'", obj48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        soundex6.setMaxLength(0);
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str19 = soundex17.encode("");
        java.lang.String str21 = soundex17.soundex("");
        java.lang.Object obj22 = soundex6.encode((java.lang.Object) "");
        int int23 = soundex6.getMaxLength();
        int int24 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (byte) 1);
        char[] charArray29 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray29);
        int int33 = soundex32.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex6.encode((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        java.lang.String str12 = soundex3.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        int int12 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char[] charArray14 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        char[] charArray19 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        soundex21.setMaxLength((int) '4');
        java.lang.String str25 = soundex21.encode("");
        java.lang.Object obj26 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.Object obj27 = refinedSoundex8.encode((java.lang.Object) "");
        java.lang.String str29 = refinedSoundex8.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('#');
        java.lang.String str12 = refinedSoundex8.encode("");
        java.lang.String str14 = refinedSoundex8.encode("");
        int int17 = refinedSoundex8.difference("", "");
        char[] charArray23 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = refinedSoundex8.encode((java.lang.Object) refinedSoundex25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , #, a, a, #]");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        soundex6.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex3.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char[] charArray15 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        char char20 = refinedSoundex18.getMappingCode('#');
        java.lang.String str22 = refinedSoundex18.encode("");
        java.lang.String str24 = refinedSoundex18.encode("");
        java.lang.Object obj25 = refinedSoundex9.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = refinedSoundex9.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        soundex4.setMaxLength((int) (short) -1);
        soundex4.setMaxLength((int) (byte) -1);
        int int21 = soundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
        char char21 = refinedSoundex4.getMappingCode('a');
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str26 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '4' + "'", char21 == '4');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        soundex4.setMaxLength((int) 'a');
        java.lang.String str19 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "" + "'", obj15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        java.lang.String str18 = soundex4.encode("");
        java.lang.String str20 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.encode("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        java.lang.Class<?> wildcardClass13 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        int int8 = soundex3.getMaxLength();
        int int9 = soundex3.getMaxLength();
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        java.lang.String str16 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        int int12 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        char[] charArray2 = new char[] { 'a', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int6 = refinedSoundex3.difference("", "");
        java.lang.Class<?> wildcardClass7 = refinedSoundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex13, "", "");
        java.lang.Object obj17 = soundex3.encode((java.lang.Object) "");
        java.lang.String str19 = soundex3.encode("");
        int int20 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = soundex3.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int10 = refinedSoundex7.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char char10 = refinedSoundex4.getMappingCode('4');
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        int int18 = refinedSoundex15.difference("", "");
        char char20 = refinedSoundex15.getMappingCode('a');
        java.lang.String str22 = refinedSoundex15.encode("");
        java.lang.String str24 = refinedSoundex15.encode("");
        java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) str24);
        char char27 = refinedSoundex4.getMappingCode('#');
        java.lang.String str29 = refinedSoundex4.soundex("");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean46 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, 0, strArray45);
        boolean boolean47 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) 'a', strArray45);
        boolean boolean48 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, 1, strArray45);
        boolean boolean49 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 100, (int) ' ', strArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = refinedSoundex4.encode((java.lang.Object) strArray45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (short) 10);
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        char char15 = refinedSoundex13.getMappingCode(' ');
        char char17 = refinedSoundex13.getMappingCode(' ');
        java.lang.String str19 = refinedSoundex13.soundex("");
        java.lang.String str21 = refinedSoundex13.encode("");
        int int24 = refinedSoundex13.difference("", "");
        java.lang.String str26 = refinedSoundex13.encode("");
        char char28 = refinedSoundex13.getMappingCode('4');
        char char30 = refinedSoundex13.getMappingCode(' ');
        java.lang.Class<?> wildcardClass31 = refinedSoundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex6.encode((java.lang.Object) refinedSoundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        java.lang.String str16 = refinedSoundex14.soundex("");
        java.lang.String str18 = refinedSoundex14.encode("");
        char[] charArray22 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        int int26 = refinedSoundex23.difference("", "");
        java.lang.Object obj27 = refinedSoundex14.encode((java.lang.Object) "");
        java.lang.Object obj28 = soundex6.encode((java.lang.Object) "");
        int int29 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.soundex("");
        char char16 = refinedSoundex9.getMappingCode('4');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'a', (int) '4', strArray30);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) (short) 100, strArray30);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) '4', (int) 'a', strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = refinedSoundex9.encode((java.lang.Object) strArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        int int13 = soundex7.getMaxLength();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray27);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray27);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, (int) (byte) 1, strArray27);
        java.lang.Object obj31 = soundex7.encode((java.lang.Object) "");
        java.lang.String str33 = soundex7.soundex("");
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        java.lang.String str38 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        java.lang.String str12 = refinedSoundex5.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.encode("");
        int int10 = soundex5.getMaxLength();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        int int19 = soundex5.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex13, "", "");
        java.lang.Object obj17 = soundex3.encode((java.lang.Object) "");
        java.lang.String str19 = soundex3.encode("");
        int int20 = soundex3.getMaxLength();
        java.lang.String str22 = soundex3.soundex("");
        java.lang.String str24 = soundex3.soundex("");
        char[] charArray28 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex3.encode((java.lang.Object) refinedSoundex31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, 4,  ]");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        int int10 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex3.encode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char[] charArray11 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("");
        java.lang.String str16 = soundex12.soundex("");
        int int19 = soundex12.difference("", "");
        int int20 = soundex12.getMaxLength();
        int int21 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex5.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int13 = soundex10.difference("", "");
        java.lang.String str15 = soundex10.encode("");
        int int16 = soundex10.getMaxLength();
        char[] charArray20 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        char[] charArray25 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        java.lang.String str28 = refinedSoundex26.soundex("");
        java.lang.Object obj29 = soundex21.encode((java.lang.Object) str28);
        soundex21.setMaxLength((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex10.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int13 = refinedSoundex10.difference("", "");
        char char15 = refinedSoundex10.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = refinedSoundex10.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex4.setMaxLength((int) (short) 0);
        java.lang.String str8 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        char[] charArray2 = new char[] { 'a', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = refinedSoundex4.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, a]");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        java.lang.String str19 = refinedSoundex17.soundex("");
        java.lang.String str21 = refinedSoundex17.soundex("");
        char char23 = refinedSoundex17.getMappingCode(' ');
        int int26 = refinedSoundex17.difference("", "");
        java.lang.String str28 = refinedSoundex17.encode("");
        java.lang.Object obj29 = refinedSoundex4.encode((java.lang.Object) "");
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str34 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('a');
        java.lang.String str9 = refinedSoundex5.encode("");
        char char11 = refinedSoundex5.getMappingCode('a');
        java.lang.String str13 = refinedSoundex5.encode("");
        char[] charArray17 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        char char29 = refinedSoundex24.getMappingCode('a');
        java.lang.String str31 = refinedSoundex24.encode("");
        char char33 = refinedSoundex24.getMappingCode('a');
        int int36 = refinedSoundex24.difference("", "");
        java.lang.Object obj37 = soundex19.encode((java.lang.Object) "");
        java.lang.Object obj38 = refinedSoundex5.encode(obj37);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '4' + "'", char11 == '4');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '4' + "'", char29 == '4');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '4' + "'", char33 == '4');
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('a');
        java.lang.String str9 = refinedSoundex5.encode("");
        char char11 = refinedSoundex5.getMappingCode('4');
        java.lang.String str13 = refinedSoundex5.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) (short) 1);
        soundex4.setMaxLength((int) (short) 10);
        soundex4.setMaxLength((int) (short) 1);
        int int19 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex4.setMaxLength((int) (short) 0);
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        char char15 = refinedSoundex4.getMappingCode('#');
        char[] charArray19 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        char char22 = refinedSoundex20.getMappingCode(' ');
        java.lang.String str24 = refinedSoundex20.encode("");
        java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
        int int22 = refinedSoundex4.difference("", "");
        java.lang.String str24 = refinedSoundex4.encode("");
        java.lang.String str26 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int29 = refinedSoundex4.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        soundex12.setMaxLength((int) '4');
        java.lang.String str16 = soundex12.encode("");
        java.lang.Object obj17 = refinedSoundex6.encode((java.lang.Object) "");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "", "");
        char char22 = refinedSoundex6.getMappingCode('#');
        char[] charArray25 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray25);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex28 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        char char30 = refinedSoundex28.getMappingCode(' ');
        java.lang.String str32 = refinedSoundex28.encode("");
        java.lang.Object obj33 = refinedSoundex6.encode((java.lang.Object) str32);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (byte) 1);
        java.lang.String str10 = soundex6.soundex("");
        int int11 = soundex6.getMaxLength();
        int int12 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        java.lang.String str11 = refinedSoundex4.soundex("");
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str17 = soundex15.encode("");
        int int18 = soundex15.getMaxLength();
        int int19 = soundex15.getMaxLength();
        char[] charArray22 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str27 = soundex25.encode("");
        java.lang.String str29 = soundex25.encode("");
        int int30 = soundex25.getMaxLength();
        char[] charArray34 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex35 = new org.apache.commons.codec.language.Soundex(charArray34);
        java.lang.String str37 = soundex35.encode("");
        java.lang.Object obj38 = soundex25.encode((java.lang.Object) "");
        java.lang.Object obj39 = soundex15.encode((java.lang.Object) "");
        java.lang.Object obj40 = refinedSoundex4.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int14 = soundex11.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex11.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.soundex("");
        char char16 = refinedSoundex9.getMappingCode('4');
        char char18 = refinedSoundex9.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = refinedSoundex9.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        java.lang.String str11 = soundex7.encode("");
        soundex7.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char[] charArray9 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("");
        java.lang.String str14 = soundex10.soundex("");
        java.lang.String str16 = soundex10.soundex("");
        java.lang.String str18 = soundex10.soundex("");
        int int19 = soundex10.getMaxLength();
        int int22 = soundex10.difference("", "");
        java.lang.Object obj23 = refinedSoundex5.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex6.encode("");
        java.lang.String str12 = soundex6.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        int int18 = refinedSoundex15.difference("", "");
        char char20 = refinedSoundex15.getMappingCode('a');
        char char22 = refinedSoundex15.getMappingCode('4');
        java.lang.String str24 = refinedSoundex15.encode("");
        java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) str24);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray36);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'a', (int) '4', strArray36);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) (short) 100, strArray36);
        java.lang.Object obj40 = refinedSoundex4.encode((java.lang.Object) "");
        char char42 = refinedSoundex4.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '4' + "'", char42 == '4');
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.encode("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        char[] charArray15 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        java.lang.String str18 = soundex16.encode("");
        java.lang.Class<?> wildcardClass19 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex4.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        soundex4.setMaxLength((int) (byte) 10);
        java.lang.String str20 = soundex4.encode("");
        java.lang.String str22 = soundex4.soundex("");
        soundex4.setMaxLength((int) (short) 10);
        int int25 = soundex4.getMaxLength();
        char[] charArray28 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex35 = new org.apache.commons.codec.language.Soundex(charArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex4.encode((java.lang.Object) charArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4]");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        java.lang.String str15 = soundex4.encode("");
        char[] charArray18 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        java.lang.String str21 = soundex19.encode("");
        java.lang.String str23 = soundex19.encode("");
        java.lang.Object obj24 = soundex4.encode((java.lang.Object) "");
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex4.encode(obj25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex9.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        char char10 = refinedSoundex4.getMappingCode('4');
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char[] charArray15 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        char char20 = refinedSoundex18.getMappingCode('#');
        java.lang.String str22 = refinedSoundex18.encode("");
        java.lang.String str24 = refinedSoundex18.encode("");
        java.lang.Object obj25 = refinedSoundex9.encode((java.lang.Object) "");
        char[] charArray28 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex30 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        int int34 = refinedSoundex31.difference("", "");
        char[] charArray37 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex38 = new org.apache.commons.codec.language.Soundex(charArray37);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex39 = new org.apache.commons.codec.language.RefinedSoundex(charArray37);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex40 = new org.apache.commons.codec.language.RefinedSoundex(charArray37);
        int int43 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex40, "", "");
        java.lang.Object obj44 = refinedSoundex31.encode((java.lang.Object) "");
        char char46 = refinedSoundex31.getMappingCode('4');
        char[] charArray50 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex51 = new org.apache.commons.codec.language.RefinedSoundex(charArray50);
        java.lang.String str53 = refinedSoundex51.soundex("");
        java.lang.String str55 = refinedSoundex51.encode("");
        java.lang.Object obj56 = refinedSoundex31.encode((java.lang.Object) "");
        int int59 = refinedSoundex31.difference("", "");
        char[] charArray63 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex64 = new org.apache.commons.codec.language.RefinedSoundex(charArray63);
        java.lang.String str66 = refinedSoundex64.encode("");
        char char68 = refinedSoundex64.getMappingCode('a');
        java.lang.String str70 = refinedSoundex64.soundex("");
        java.lang.String str72 = refinedSoundex64.encode("");
        char char74 = refinedSoundex64.getMappingCode(' ');
        java.lang.String[] strArray82 = new java.lang.String[] { "" };
        boolean boolean83 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray82);
        boolean boolean84 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) (short) 0, strArray82);
        java.lang.Object obj85 = refinedSoundex64.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass86 = obj85.getClass();
        java.lang.Object obj87 = refinedSoundex31.encode(obj85);
        char char89 = refinedSoundex31.getMappingCode('#');
        char char91 = refinedSoundex31.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj92 = refinedSoundex9.encode((java.lang.Object) refinedSoundex31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\000' + "'", char46 == '\000');
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "" + "'", obj56, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + char68 + "' != '" + '4' + "'", char68 == '4');
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + char74 + "' != '" + '\000' + "'", char74 == '\000');
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + "" + "'", obj85, "");
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + "" + "'", obj87, "");
        org.junit.Assert.assertTrue("'" + char89 + "' != '" + '\000' + "'", char89 == '\000');
        org.junit.Assert.assertTrue("'" + char91 + "' != '" + ' ' + "'", char91 == ' ');
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        int int13 = soundex4.getMaxLength();
        int int14 = soundex4.getMaxLength();
        int int15 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        soundex4.setMaxLength((int) (byte) 100);
        char[] charArray15 = new char[] { '#', ' ', '#' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        char char20 = refinedSoundex18.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex4.encode((java.lang.Object) char20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#,  , #]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char12 = refinedSoundex10.getMappingCode(' ');
        java.lang.String str14 = refinedSoundex10.encode("");
        char[] charArray20 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray20);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray20);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.String str29 = refinedSoundex24.encode("");
        java.lang.String str31 = refinedSoundex24.soundex("");
        java.lang.Object obj32 = refinedSoundex10.encode((java.lang.Object) str31);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.encode("");
        char[] charArray14 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex22 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex4.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  ]");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('a');
        char char12 = refinedSoundex8.getMappingCode('a');
        char char14 = refinedSoundex8.getMappingCode(' ');
        char[] charArray18 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        java.lang.String str21 = refinedSoundex19.soundex("");
        java.lang.String str23 = refinedSoundex19.encode("");
        java.lang.Object obj24 = refinedSoundex8.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ' ' + "'", char12 == ' ');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char char11 = refinedSoundex4.getMappingCode('4');
        int int14 = refinedSoundex4.difference("", "");
        java.lang.String str16 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        java.lang.String str13 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int7 = soundex6.getMaxLength();
        int int10 = soundex6.difference("", "");
        int int11 = soundex6.getMaxLength();
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        int int20 = refinedSoundex17.difference("", "");
        char[] charArray23 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex26, "", "");
        java.lang.Object obj30 = refinedSoundex17.encode((java.lang.Object) "");
        char char32 = refinedSoundex17.getMappingCode('4');
        char[] charArray36 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex37 = new org.apache.commons.codec.language.RefinedSoundex(charArray36);
        java.lang.String str39 = refinedSoundex37.soundex("");
        java.lang.String str41 = refinedSoundex37.encode("");
        java.lang.Object obj42 = refinedSoundex17.encode((java.lang.Object) "");
        int int45 = refinedSoundex17.difference("", "");
        java.lang.Object obj46 = soundex6.encode((java.lang.Object) "");
        java.lang.String str48 = soundex6.encode("");
        char[] charArray54 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex55 = new org.apache.commons.codec.language.Soundex(charArray54);
        org.apache.commons.codec.language.Soundex soundex56 = new org.apache.commons.codec.language.Soundex(charArray54);
        org.apache.commons.codec.language.Soundex soundex57 = new org.apache.commons.codec.language.Soundex(charArray54);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex58 = new org.apache.commons.codec.language.RefinedSoundex(charArray54);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex59 = new org.apache.commons.codec.language.RefinedSoundex(charArray54);
        java.lang.Class<?> wildcardClass60 = refinedSoundex59.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = soundex6.encode((java.lang.Object) wildcardClass60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str7 = refinedSoundex5.encode("");
        char char9 = refinedSoundex5.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex5.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex3.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        java.lang.String str11 = refinedSoundex9.soundex("");
        java.lang.Object obj12 = soundex4.encode((java.lang.Object) str11);
        soundex4.setMaxLength((int) 'a');
        java.lang.String str16 = soundex4.encode("");
        int int17 = soundex4.getMaxLength();
        java.lang.String str19 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex13, "", "");
        java.lang.Object obj17 = soundex3.encode((java.lang.Object) "");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray34);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray34);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 100, 0, strArray34);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '#', (-1), strArray34);
        java.lang.Object obj39 = soundex3.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode(' ');
        char char15 = refinedSoundex4.getMappingCode(' ');
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str20 = refinedSoundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int13 = soundex10.difference("", "");
        java.lang.String str15 = soundex10.encode("");
        java.lang.String str17 = soundex10.soundex("");
        soundex10.setMaxLength(0);
        java.lang.String str21 = soundex10.encode("");
        java.lang.Class<?> wildcardClass22 = soundex10.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex9, "", "");
        java.lang.String str19 = refinedSoundex9.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        char char14 = refinedSoundex9.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ' ' + "'", char14 == ' ');
    }
}

