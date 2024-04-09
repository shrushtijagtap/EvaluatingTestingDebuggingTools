package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4501");
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
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4502");
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
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4503");
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
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4504");
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
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4505");
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4506");
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
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4507");
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
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4508");
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

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4509");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int9 = refinedSoundex6.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4510");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str11 = refinedSoundex9.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex9.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4511");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex8.setMaxLength(0);
        java.lang.String str12 = soundex8.encode("");
        soundex8.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex8, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4512");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        int int14 = soundex3.getMaxLength();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray31);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, (int) ' ', strArray31);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 10, strArray31);
        java.lang.Class<?> wildcardClass36 = strArray31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex3.encode((java.lang.Object) wildcardClass36);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4513");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4514");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = soundex3.soundex("hi!");
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
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4515");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str7 = refinedSoundex5.encode("");
        char char9 = refinedSoundex5.getMappingCode('a');
        char[] charArray13 = new char[] { '#', ' ', '#' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.Object obj17 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#,  , #]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4516");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        char char13 = refinedSoundex4.getMappingCode(' ');
        char char15 = refinedSoundex4.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4517");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4518");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        java.lang.String str22 = refinedSoundex5.soundex("");
        int int25 = refinedSoundex5.difference("", "");
        char[] charArray29 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        java.lang.String str32 = soundex30.encode("");
        java.lang.String str34 = soundex30.soundex("");
        java.lang.String str36 = soundex30.soundex("");
        java.lang.Object obj37 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = refinedSoundex5.encode(obj38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4519");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray7 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray7);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray7);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray7);
        int int13 = refinedSoundex10.difference("", "");
        char[] charArray16 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex19, "", "");
        java.lang.Object obj23 = refinedSoundex10.encode((java.lang.Object) "");
        char[] charArray27 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray27);
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray27);
        soundex29.setMaxLength((int) '#');
        java.lang.String str33 = soundex29.encode("");
        java.lang.Object obj34 = refinedSoundex10.encode((java.lang.Object) "");
        java.lang.Object obj35 = soundex4.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "" + "'", obj35, "");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4520");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        soundex7.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4521");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4522");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4523");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
        char char21 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str23 = refinedSoundex4.encode("");
        java.lang.String str25 = refinedSoundex4.soundex("");
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
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4524");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        int int15 = soundex4.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4525");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        char char17 = refinedSoundex4.getMappingCode('#');
        char char19 = refinedSoundex4.getMappingCode('a');
        char[] charArray23 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        int int25 = soundex24.getMaxLength();
        java.lang.String str27 = soundex24.encode("");
        soundex24.setMaxLength((int) (byte) 100);
        java.lang.String str31 = soundex24.soundex("");
        java.lang.Object obj32 = refinedSoundex4.encode((java.lang.Object) str31);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '4' + "'", char19 == '4');
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4526");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char12 = refinedSoundex10.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex10.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4527");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('4');
        java.lang.String str9 = refinedSoundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4528");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str16 = soundex14.encode("");
        int int17 = soundex14.getMaxLength();
        java.lang.String str19 = soundex14.soundex("");
        java.lang.Object obj20 = soundex3.encode((java.lang.Object) str19);
        char[] charArray24 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        java.lang.String str27 = refinedSoundex25.soundex("");
        java.lang.String str29 = refinedSoundex25.encode("");
        char[] charArray33 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex34 = new org.apache.commons.codec.language.RefinedSoundex(charArray33);
        int int37 = refinedSoundex34.difference("", "");
        java.lang.Object obj38 = refinedSoundex25.encode((java.lang.Object) "");
        java.lang.String str40 = refinedSoundex25.soundex("");
        java.lang.String str42 = refinedSoundex25.soundex("");
        java.lang.Object obj43 = soundex3.encode((java.lang.Object) "");
        soundex3.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4529");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str16 = refinedSoundex14.soundex("");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4530");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str14 = refinedSoundex12.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4531");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str17 = soundex15.encode("");
        java.lang.String str19 = soundex15.encode("");
        java.lang.String str21 = soundex15.encode("");
        java.lang.String str23 = soundex15.soundex("");
        java.lang.Object obj24 = soundex11.encode((java.lang.Object) "");
        soundex11.setMaxLength(0);
        char[] charArray29 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex32 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex32, "", "");
        java.lang.String str37 = refinedSoundex32.soundex("");
        java.lang.Object obj38 = soundex11.encode((java.lang.Object) str37);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4532");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = refinedSoundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4533");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.encode("");
        char char19 = refinedSoundex4.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '4' + "'", char19 == '4');
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4534");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        char[] charArray8 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray8);
        java.lang.String str13 = soundex11.encode("");
        java.lang.String str15 = soundex11.encode("");
        int int16 = soundex11.getMaxLength();
        char[] charArray20 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str23 = soundex21.encode("");
        java.lang.Object obj24 = soundex11.encode((java.lang.Object) "");
        java.lang.Object obj25 = soundex3.encode(obj24);
        java.lang.String str27 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = soundex3.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4535");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        char char10 = refinedSoundex5.getMappingCode('a');
        java.lang.String str12 = refinedSoundex5.soundex("");
        char char14 = refinedSoundex5.getMappingCode('a');
        char char16 = refinedSoundex5.getMappingCode('#');
        char char18 = refinedSoundex5.getMappingCode(' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ' ' + "'", char14 == ' ');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4536");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        java.lang.String str8 = soundex4.soundex("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        char char18 = refinedSoundex13.getMappingCode('a');
        java.lang.String str20 = refinedSoundex13.encode("");
        char char22 = refinedSoundex13.getMappingCode('a');
        char char24 = refinedSoundex13.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex4.encode((java.lang.Object) refinedSoundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '4' + "'", char18 == '4');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4537");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('#');
        java.lang.String str12 = refinedSoundex8.encode("");
        java.lang.String str14 = refinedSoundex8.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = refinedSoundex8.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4538");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex6.setMaxLength(0);
        int int9 = soundex6.getMaxLength();
        java.lang.String str11 = soundex6.soundex("");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex6.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4539");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char10 = refinedSoundex8.getMappingCode(' ');
        java.lang.String str12 = refinedSoundex8.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4540");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        char char17 = refinedSoundex4.getMappingCode('#');
        char char19 = refinedSoundex4.getMappingCode('4');
        char char21 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = refinedSoundex4.difference("hi!", "");
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
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4541");
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
        int int34 = soundex4.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4542");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int12 = soundex7.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex7.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4543");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.encode("");
        java.lang.Class<?> wildcardClass10 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4544");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex6.setMaxLength(0);
        int int9 = soundex6.getMaxLength();
        java.lang.String str11 = soundex6.soundex("");
        char[] charArray17 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex22 = new org.apache.commons.codec.language.RefinedSoundex(charArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex6.encode((java.lang.Object) refinedSoundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a,  , 4, 4]");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4545");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex6.encode("");
        soundex6.setMaxLength((int) '#');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "", "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4546");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4547");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str9 = refinedSoundex7.soundex("");
        int int12 = refinedSoundex7.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = refinedSoundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4548");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex7.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex7.difference("hi!", "hi!");
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
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4549");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        java.lang.String str10 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 100);
        int int13 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4550");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        java.lang.String str22 = refinedSoundex5.soundex("");
        java.lang.String str24 = refinedSoundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = refinedSoundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4551");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        soundex4.setMaxLength((int) 'a');
        java.lang.String str19 = soundex4.encode("");
        char[] charArray22 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str27 = soundex25.encode("");
        java.lang.String str29 = soundex25.encode("");
        int int30 = soundex25.getMaxLength();
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex25, "", "");
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex25, "", "");
        java.lang.Object obj37 = soundex4.encode((java.lang.Object) "");
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4552");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        char char14 = refinedSoundex12.getMappingCode(' ');
        char char16 = refinedSoundex12.getMappingCode(' ');
        java.lang.String str18 = refinedSoundex12.soundex("");
        java.lang.String str20 = refinedSoundex12.encode("");
        int int23 = refinedSoundex12.difference("", "");
        java.lang.String str25 = refinedSoundex12.encode("");
        java.lang.String str27 = refinedSoundex12.encode("");
        java.lang.Object obj28 = refinedSoundex7.encode((java.lang.Object) str27);
        java.lang.String str30 = refinedSoundex7.soundex("");
        char char32 = refinedSoundex7.getMappingCode(' ');
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex7, "", "");
        java.lang.Class<?> wildcardClass36 = refinedSoundex7.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4553");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        int int11 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex6.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4554");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex3.difference("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4555");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int10 = soundex7.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4556");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        soundex4.setMaxLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "");
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
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4557");
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
        java.lang.String str26 = soundex4.soundex("");
        char[] charArray30 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray30);
        java.lang.String str33 = refinedSoundex31.soundex("");
        java.lang.String str35 = refinedSoundex31.encode("");
        char[] charArray39 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex40 = new org.apache.commons.codec.language.RefinedSoundex(charArray39);
        int int43 = refinedSoundex40.difference("", "");
        java.lang.Object obj44 = refinedSoundex31.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex4.encode((java.lang.Object) refinedSoundex31);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4558");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4559");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        int int10 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4560");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str14 = refinedSoundex12.soundex("");
        char[] charArray18 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        int int22 = refinedSoundex19.difference("", "");
        char char24 = refinedSoundex19.getMappingCode('a');
        char char26 = refinedSoundex19.getMappingCode('4');
        java.lang.String str28 = refinedSoundex19.encode("");
        java.lang.String str30 = refinedSoundex19.soundex("");
        char char32 = refinedSoundex19.getMappingCode(' ');
        int int35 = refinedSoundex19.difference("", "");
        char char37 = refinedSoundex19.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = refinedSoundex12.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '4' + "'", char24 == '4');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4561");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        soundex4.setMaxLength((int) (short) -1);
        soundex4.setMaxLength(0);
        java.lang.String str20 = soundex4.encode("");
        soundex4.setMaxLength(1);
        int int23 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4562");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        int int13 = soundex4.getMaxLength();
        java.lang.String str15 = soundex4.encode("");
        java.lang.String str17 = soundex4.encode("");
        int int18 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4563");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex6.encode("");
        soundex6.setMaxLength((int) '#');
        soundex6.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4564");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char char9 = refinedSoundex5.getMappingCode('a');
        java.lang.String str11 = refinedSoundex5.encode("");
        java.lang.String str13 = refinedSoundex5.encode("");
        int int16 = refinedSoundex5.difference("", "");
        char[] charArray19 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        int int30 = refinedSoundex27.difference("", "");
        java.lang.Object obj31 = soundex22.encode((java.lang.Object) "");
        int int32 = soundex22.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = refinedSoundex5.encode((java.lang.Object) soundex22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4565");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        int int11 = soundex4.getMaxLength();
        java.lang.String str13 = soundex4.encode("");
        java.lang.String str15 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4566");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4567");
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
        java.lang.String str26 = soundex4.soundex("");
        soundex4.setMaxLength((int) ' ');
        soundex4.setMaxLength(10);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4568");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray11 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str15 = soundex13.encode("");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "", "");
        char[] charArray22 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        java.lang.String str26 = refinedSoundex24.soundex("");
        java.lang.Object obj27 = soundex13.encode((java.lang.Object) "");
        java.lang.Object obj28 = soundex5.encode(obj27);
        int int29 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4569");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int13 = soundex10.difference("", "");
        java.lang.String str15 = soundex10.encode("");
        java.lang.String str17 = soundex10.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = soundex10.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4570");
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
        char[] charArray32 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex(charArray32);
        java.lang.String str35 = refinedSoundex33.encode("");
        java.lang.Object obj36 = soundex6.encode((java.lang.Object) str35);
        int int37 = soundex6.getMaxLength();
        soundex6.setMaxLength((int) (short) 100);
        soundex6.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4571");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) (short) 1);
        soundex4.setMaxLength((int) (short) 10);
        soundex4.setMaxLength((int) (short) 1);
        char[] charArray22 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str25 = soundex23.encode("");
        java.lang.String str27 = soundex23.soundex("");
        java.lang.String str29 = soundex23.encode("");
        java.lang.String str31 = soundex23.soundex("");
        soundex23.setMaxLength((int) (short) 100);
        java.lang.String str35 = soundex23.encode("");
        java.lang.Object obj36 = soundex4.encode((java.lang.Object) str35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = soundex4.encode("hi!");
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4572");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int7 = soundex6.getMaxLength();
        char[] charArray11 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("");
        java.lang.String str16 = soundex12.soundex("");
        java.lang.String str18 = soundex12.soundex("");
        java.lang.String str20 = soundex12.soundex("");
        char[] charArray24 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        java.lang.String str27 = refinedSoundex25.encode("");
        char char29 = refinedSoundex25.getMappingCode('a');
        java.lang.String str31 = refinedSoundex25.soundex("");
        java.lang.Object obj32 = soundex12.encode((java.lang.Object) str31);
        java.lang.String str34 = soundex12.encode("");
        char[] charArray38 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex39 = new org.apache.commons.codec.language.RefinedSoundex(charArray38);
        java.lang.String str41 = refinedSoundex39.soundex("");
        int int44 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex39, "", "");
        java.lang.String str46 = refinedSoundex39.encode("");
        java.lang.String str48 = refinedSoundex39.encode("");
        java.lang.Object obj49 = soundex12.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = soundex6.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '4' + "'", char29 == '4');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4573");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        java.lang.String str11 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4574");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char char9 = refinedSoundex5.getMappingCode('a');
        char char11 = refinedSoundex5.getMappingCode('4');
        char[] charArray17 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        int int19 = soundex18.getMaxLength();
        java.lang.String str21 = soundex18.soundex("");
        char[] charArray25 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        java.lang.String str28 = refinedSoundex26.soundex("");
        java.lang.String str30 = refinedSoundex26.encode("");
        char[] charArray34 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex35 = new org.apache.commons.codec.language.RefinedSoundex(charArray34);
        int int38 = refinedSoundex35.difference("", "");
        java.lang.Object obj39 = refinedSoundex26.encode((java.lang.Object) "");
        java.lang.Object obj40 = soundex18.encode((java.lang.Object) "");
        char[] charArray44 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex45 = new org.apache.commons.codec.language.RefinedSoundex(charArray44);
        java.lang.String str47 = refinedSoundex45.encode("");
        java.lang.Object obj48 = soundex18.encode((java.lang.Object) str47);
        int int49 = soundex18.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = refinedSoundex5.encode((java.lang.Object) int49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "" + "'", obj48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4575");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        char char14 = refinedSoundex12.getMappingCode(' ');
        char char16 = refinedSoundex12.getMappingCode(' ');
        java.lang.String str18 = refinedSoundex12.soundex("");
        java.lang.String str20 = refinedSoundex12.encode("");
        int int23 = refinedSoundex12.difference("", "");
        java.lang.String str25 = refinedSoundex12.encode("");
        java.lang.String str27 = refinedSoundex12.encode("");
        java.lang.Object obj28 = refinedSoundex7.encode((java.lang.Object) str27);
        java.lang.String str30 = refinedSoundex7.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = refinedSoundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4576");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        int int8 = soundex3.getMaxLength();
        int int9 = soundex3.getMaxLength();
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        soundex3.setMaxLength(0);
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
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4577");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.String str14 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4578");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4579");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        java.lang.String str20 = refinedSoundex18.soundex("");
        java.lang.Object obj21 = soundex7.encode((java.lang.Object) "");
        soundex7.setMaxLength(10);
        java.lang.String str25 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4580");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        int int13 = soundex4.getMaxLength();
        int int14 = soundex4.getMaxLength();
        int int15 = soundex4.getMaxLength();
        soundex4.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = soundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4581");
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
        java.lang.Class<?> wildcardClass23 = refinedSoundex4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4582");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        soundex5.setMaxLength((int) (short) 100);
        soundex5.setMaxLength((int) '4');
        soundex5.setMaxLength((int) (byte) 1);
        java.lang.String str20 = soundex5.encode("");
        java.lang.String str22 = soundex5.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4583");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        char char13 = refinedSoundex4.getMappingCode('#');
        char char15 = refinedSoundex4.getMappingCode('a');
        int int18 = refinedSoundex4.difference("", "");
        char char20 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4584");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        soundex8.setMaxLength((int) (short) 100);
        int int13 = soundex8.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4585");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = refinedSoundex7.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4586");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        char char15 = refinedSoundex4.getMappingCode('#');
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4587");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex4.setMaxLength((int) (byte) 0);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        java.lang.String str13 = refinedSoundex11.soundex("");
        java.lang.String str15 = refinedSoundex11.encode("");
        char[] charArray19 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        int int23 = refinedSoundex20.difference("", "");
        java.lang.Object obj24 = refinedSoundex11.encode((java.lang.Object) "");
        java.lang.String str26 = refinedSoundex11.soundex("");
        java.lang.String str28 = refinedSoundex11.soundex("");
        java.lang.Object obj29 = soundex4.encode((java.lang.Object) "");
        soundex4.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4588");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        char char20 = refinedSoundex5.getMappingCode('4');
        char[] charArray24 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        java.lang.String str27 = refinedSoundex25.soundex("");
        java.lang.String str29 = refinedSoundex25.encode("");
        java.lang.Object obj30 = refinedSoundex5.encode((java.lang.Object) "");
        int int33 = refinedSoundex5.difference("", "");
        char[] charArray37 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex38 = new org.apache.commons.codec.language.RefinedSoundex(charArray37);
        java.lang.String str40 = refinedSoundex38.encode("");
        char char42 = refinedSoundex38.getMappingCode('a');
        java.lang.String str44 = refinedSoundex38.soundex("");
        java.lang.String str46 = refinedSoundex38.encode("");
        char char48 = refinedSoundex38.getMappingCode(' ');
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        boolean boolean57 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray56);
        boolean boolean58 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) (short) 0, strArray56);
        java.lang.Object obj59 = refinedSoundex38.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        java.lang.Object obj61 = refinedSoundex5.encode(obj59);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean76 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray75);
        boolean boolean77 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) ' ', strArray75);
        boolean boolean78 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, 0, strArray75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = refinedSoundex5.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '4' + "'", char42 == '4');
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\000' + "'", char48 == '\000');
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "" + "'", obj59, "");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "" + "'", obj61, "");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4589");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int11 = soundex10.getMaxLength();
        char[] charArray15 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        char char18 = refinedSoundex16.getMappingCode(' ');
        java.lang.String str20 = refinedSoundex16.encode("");
        java.lang.Object obj21 = soundex10.encode((java.lang.Object) str20);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4590");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        char char9 = refinedSoundex5.getMappingCode('a');
        char[] charArray15 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        soundex16.setMaxLength((int) (byte) 1);
        int int19 = soundex16.getMaxLength();
        soundex16.setMaxLength((int) (short) -1);
        java.lang.String str23 = soundex16.encode("");
        java.lang.Object obj24 = refinedSoundex5.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4591");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        soundex5.setMaxLength((int) (short) 100);
        soundex5.setMaxLength((int) '4');
        java.lang.String str18 = soundex5.encode("");
        int int19 = soundex5.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4592");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int11 = soundex10.getMaxLength();
        char[] charArray15 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        char char18 = refinedSoundex16.getMappingCode(' ');
        char char20 = refinedSoundex16.getMappingCode(' ');
        java.lang.String str22 = refinedSoundex16.encode("");
        char char24 = refinedSoundex16.getMappingCode(' ');
        java.lang.String str26 = refinedSoundex16.soundex("");
        java.lang.Object obj27 = soundex10.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4593");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str16 = refinedSoundex4.soundex("");
        char char18 = refinedSoundex4.getMappingCode('#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4594");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4595");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str9 = soundex7.encode("");
        char[] charArray15 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        java.lang.String str18 = soundex16.soundex("");
        java.lang.Object obj19 = soundex7.encode((java.lang.Object) "");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4596");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        int int8 = soundex3.getMaxLength();
        int int9 = soundex3.getMaxLength();
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        char[] charArray17 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray17);
        char char20 = refinedSoundex18.getMappingCode(' ');
        char char22 = refinedSoundex18.getMappingCode(' ');
        java.lang.String str24 = refinedSoundex18.soundex("");
        java.lang.String str26 = refinedSoundex18.encode("");
        int int29 = refinedSoundex18.difference("", "");
        java.lang.String str31 = refinedSoundex18.encode("");
        java.lang.Object obj32 = soundex3.encode((java.lang.Object) str31);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4597");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str14 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4598");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex11.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4599");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4600");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex6.encode("");
        java.lang.String str12 = soundex6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4601");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        java.lang.String str11 = soundex9.encode("");
        java.lang.String str13 = soundex9.soundex("");
        java.lang.String str15 = soundex9.encode("");
        int int16 = soundex9.getMaxLength();
        java.lang.String str18 = soundex9.encode("");
        java.lang.Object obj19 = soundex4.encode((java.lang.Object) "");
        char[] charArray23 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        char[] charArray28 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        java.lang.String str31 = soundex29.encode("");
        java.lang.String str33 = soundex29.soundex("");
        java.lang.String str35 = soundex29.encode("");
        int int36 = soundex29.getMaxLength();
        java.lang.String str38 = soundex29.encode("");
        java.lang.Object obj39 = soundex24.encode((java.lang.Object) "");
        int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex24, "", "");
        java.lang.String str44 = soundex24.soundex("");
        soundex24.setMaxLength((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = soundex4.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4602");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex7.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4603");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray7 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray7);
        soundex8.setMaxLength(1);
        soundex8.setMaxLength(100);
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex8, "", "");
        java.lang.String str17 = soundex8.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex4.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4604");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        soundex4.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = soundex4.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4605");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode('a');
        char char24 = refinedSoundex4.getMappingCode('a');
        char[] charArray27 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray27);
        java.lang.String str30 = soundex28.encode("");
        java.lang.String str32 = soundex28.encode("");
        soundex28.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = refinedSoundex4.encode((java.lang.Object) soundex28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '4' + "'", char24 == '4');
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4606");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char12 = refinedSoundex10.getMappingCode('#');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex10, "", "");
        char char17 = refinedSoundex10.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = refinedSoundex10.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4607");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
        char char21 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str23 = refinedSoundex4.encode("");
        char[] charArray29 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray29);
        java.lang.String str34 = soundex32.encode("");
        int int35 = soundex32.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = refinedSoundex4.encode((java.lang.Object) int35);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4608");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str12 = soundex10.encode("");
        soundex10.setMaxLength((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = soundex10.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4609");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.encode("");
        char char12 = refinedSoundex4.getMappingCode('a');
        char char14 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4610");
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
        java.lang.String str22 = soundex4.encode("");
        java.lang.String str24 = soundex4.soundex("");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4611");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        char char22 = refinedSoundex5.getMappingCode('4');
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        char char29 = refinedSoundex27.getMappingCode(' ');
        char char31 = refinedSoundex27.getMappingCode(' ');
        java.lang.String str33 = refinedSoundex27.soundex("");
        java.lang.String str35 = refinedSoundex27.encode("");
        int int38 = refinedSoundex27.difference("", "");
        java.lang.String str40 = refinedSoundex27.soundex("");
        java.lang.String str42 = refinedSoundex27.encode("");
        java.lang.Class<?> wildcardClass43 = refinedSoundex27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = refinedSoundex5.encode((java.lang.Object) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4612");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        int int13 = soundex5.getMaxLength();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex5.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4613");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex9, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4614");
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
        java.lang.Class<?> wildcardClass28 = refinedSoundex8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4615");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        java.lang.String str12 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4616");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        java.lang.String str14 = soundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4617");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        int int11 = soundex4.getMaxLength();
        java.lang.String str13 = soundex4.encode("");
        soundex4.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = soundex4.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4618");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode('a');
        java.lang.String str24 = refinedSoundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4619");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str7 = soundex5.soundex("");
        java.lang.String str9 = soundex5.encode("");
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex5.encode((java.lang.Object) charArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4620");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        char char14 = refinedSoundex12.getMappingCode(' ');
        char char16 = refinedSoundex12.getMappingCode(' ');
        java.lang.String str18 = refinedSoundex12.soundex("");
        java.lang.String str20 = refinedSoundex12.encode("");
        int int23 = refinedSoundex12.difference("", "");
        java.lang.String str25 = refinedSoundex12.encode("");
        java.lang.String str27 = refinedSoundex12.encode("");
        java.lang.Object obj28 = refinedSoundex7.encode((java.lang.Object) str27);
        java.lang.String str30 = refinedSoundex7.soundex("");
        char[] charArray34 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex35 = new org.apache.commons.codec.language.Soundex(charArray34);
        org.apache.commons.codec.language.Soundex soundex36 = new org.apache.commons.codec.language.Soundex(charArray34);
        org.apache.commons.codec.language.Soundex soundex37 = new org.apache.commons.codec.language.Soundex(charArray34);
        int int38 = soundex37.getMaxLength();
        int int41 = soundex37.difference("", "");
        int int42 = soundex37.getMaxLength();
        char[] charArray45 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex46 = new org.apache.commons.codec.language.Soundex(charArray45);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex47 = new org.apache.commons.codec.language.RefinedSoundex(charArray45);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex48 = new org.apache.commons.codec.language.RefinedSoundex(charArray45);
        int int51 = refinedSoundex48.difference("", "");
        char[] charArray54 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex55 = new org.apache.commons.codec.language.Soundex(charArray54);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex56 = new org.apache.commons.codec.language.RefinedSoundex(charArray54);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex57 = new org.apache.commons.codec.language.RefinedSoundex(charArray54);
        int int60 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex57, "", "");
        java.lang.Object obj61 = refinedSoundex48.encode((java.lang.Object) "");
        char char63 = refinedSoundex48.getMappingCode('4');
        char[] charArray67 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex68 = new org.apache.commons.codec.language.RefinedSoundex(charArray67);
        java.lang.String str70 = refinedSoundex68.soundex("");
        java.lang.String str72 = refinedSoundex68.encode("");
        java.lang.Object obj73 = refinedSoundex48.encode((java.lang.Object) "");
        int int76 = refinedSoundex48.difference("", "");
        java.lang.Object obj77 = soundex37.encode((java.lang.Object) "");
        java.lang.Object obj78 = refinedSoundex7.encode(obj77);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "" + "'", obj61, "");
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + '\000' + "'", char63 == '\000');
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "" + "'", obj73, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + "" + "'", obj77, "");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + "" + "'", obj78, "");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4621");
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
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4622");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray13 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        char[] charArray18 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        char char21 = refinedSoundex19.getMappingCode(' ');
        char char23 = refinedSoundex19.getMappingCode(' ');
        java.lang.String str25 = refinedSoundex19.soundex("");
        java.lang.String str27 = refinedSoundex19.encode("");
        int int30 = refinedSoundex19.difference("", "");
        java.lang.String str32 = refinedSoundex19.soundex("");
        java.lang.Object obj33 = soundex14.encode((java.lang.Object) "");
        java.lang.Object obj34 = refinedSoundex7.encode(obj33);
        char char36 = refinedSoundex7.getMappingCode(' ');
        java.lang.String str38 = refinedSoundex7.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4623");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        java.lang.String str10 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = refinedSoundex4.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4624");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4625");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        int int10 = soundex7.getMaxLength();
        int int13 = soundex7.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4626");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str12 = refinedSoundex10.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4627");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4628");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.encode("");
        soundex6.setMaxLength((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4629");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        java.lang.String str14 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4630");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex13.setMaxLength((int) (byte) 10);
        int int16 = soundex13.getMaxLength();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "", "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4631");
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
        soundex6.setMaxLength((int) 'a');
        java.lang.Class<?> wildcardClass26 = soundex6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4632");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        java.lang.String str20 = refinedSoundex18.soundex("");
        java.lang.Object obj21 = soundex7.encode((java.lang.Object) "");
        java.lang.String str23 = soundex7.encode("");
        soundex7.setMaxLength((int) (byte) 10);
        int int26 = soundex7.getMaxLength();
        soundex7.setMaxLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4633");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex5.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4634");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex6.getMaxLength();
        soundex6.setMaxLength(0);
        java.lang.String str11 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex6.encode((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4635");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str9 = refinedSoundex7.soundex("");
        int int12 = refinedSoundex7.difference("", "");
        java.lang.String str14 = refinedSoundex7.encode("");
        java.lang.String str16 = refinedSoundex7.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4636");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.soundex("");
        java.lang.String str13 = soundex3.encode("");
        int int14 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4637");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray12 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("");
        java.lang.String str17 = soundex13.soundex("");
        java.lang.String str19 = soundex13.soundex("");
        java.lang.Object obj20 = soundex8.encode((java.lang.Object) str19);
        int int21 = soundex8.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = soundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4638");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        java.lang.String str17 = refinedSoundex15.soundex("");
        java.lang.String str19 = refinedSoundex15.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.String str30 = refinedSoundex15.soundex("");
        java.lang.String str32 = refinedSoundex15.soundex("");
        java.lang.Object obj33 = soundex5.encode((java.lang.Object) str32);
        int int34 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = soundex5.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4639");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        java.lang.String str17 = soundex4.soundex("");
        java.lang.String str19 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int22 = soundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4640");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.encode("");
        char char12 = refinedSoundex4.getMappingCode('a');
        java.lang.String str14 = refinedSoundex4.encode("");
        int int17 = refinedSoundex4.difference("", "");
        char[] charArray21 = new char[] { '#', ' ', '#' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        java.lang.String str24 = soundex22.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) soundex22);
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
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#,  , #]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4641");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4642");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        char char13 = refinedSoundex4.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4643");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        char char17 = refinedSoundex4.getMappingCode('#');
        char char19 = refinedSoundex4.getMappingCode('4');
        char char21 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4644");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        char[] charArray8 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray8);
        java.lang.String str13 = soundex11.encode("");
        java.lang.String str15 = soundex11.encode("");
        int int16 = soundex11.getMaxLength();
        char[] charArray20 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str23 = soundex21.encode("");
        java.lang.Object obj24 = soundex11.encode((java.lang.Object) "");
        java.lang.Object obj25 = soundex3.encode(obj24);
        java.lang.String str27 = soundex3.encode("");
        char[] charArray31 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex32 = new org.apache.commons.codec.language.RefinedSoundex(charArray31);
        int int35 = refinedSoundex32.difference("", "");
        java.lang.String str37 = refinedSoundex32.encode("");
        java.lang.String str39 = refinedSoundex32.encode("");
        char char41 = refinedSoundex32.getMappingCode(' ');
        char char43 = refinedSoundex32.getMappingCode(' ');
        int int46 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex32, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = soundex3.encode((java.lang.Object) int46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\000' + "'", char43 == '\000');
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4645");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        int int15 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4646");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char char9 = refinedSoundex5.getMappingCode('a');
        char char11 = refinedSoundex5.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4647");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        char char19 = refinedSoundex4.getMappingCode('4');
        char[] charArray22 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        int int25 = soundex24.getMaxLength();
        java.lang.String str27 = soundex24.soundex("");
        java.lang.Object obj28 = refinedSoundex4.encode((java.lang.Object) str27);
        java.lang.String str30 = refinedSoundex4.encode("");
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4648");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex5.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4649");
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
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        char char29 = refinedSoundex27.getMappingCode(' ');
        char char31 = refinedSoundex27.getMappingCode(' ');
        java.lang.String str33 = refinedSoundex27.encode("");
        char char35 = refinedSoundex27.getMappingCode(' ');
        java.lang.String str37 = refinedSoundex27.encode("");
        java.lang.Object obj38 = soundex4.encode((java.lang.Object) str37);
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
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4650");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        java.lang.String str17 = refinedSoundex15.soundex("");
        java.lang.String str19 = refinedSoundex15.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.String str30 = refinedSoundex15.soundex("");
        java.lang.String str32 = refinedSoundex15.soundex("");
        java.lang.Object obj33 = soundex5.encode((java.lang.Object) str32);
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        soundex5.setMaxLength((int) '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4651");
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
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "hi!");
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4652");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        java.lang.String str17 = refinedSoundex15.soundex("");
        java.lang.String str19 = refinedSoundex15.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.String str30 = refinedSoundex15.soundex("");
        java.lang.String str32 = refinedSoundex15.soundex("");
        java.lang.Object obj33 = soundex5.encode((java.lang.Object) str32);
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        soundex5.setMaxLength(10);
        char[] charArray42 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex43 = new org.apache.commons.codec.language.RefinedSoundex(charArray42);
        char char45 = refinedSoundex43.getMappingCode(' ');
        char char47 = refinedSoundex43.getMappingCode(' ');
        java.lang.String str49 = refinedSoundex43.soundex("");
        char char51 = refinedSoundex43.getMappingCode(' ');
        int int54 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex43, "", "");
        java.lang.String str56 = refinedSoundex43.encode("");
        java.lang.Object obj57 = soundex5.encode((java.lang.Object) str56);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\000' + "'", char45 == '\000');
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\000' + "'", char47 == '\000');
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '\000' + "'", char51 == '\000');
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "" + "'", obj57, "");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4653");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) ' ', strArray24);
        java.lang.Class<?> wildcardClass27 = strArray24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = refinedSoundex10.encode((java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4654");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray10 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("");
        java.lang.String str15 = soundex11.soundex("");
        java.lang.String str17 = soundex11.soundex("");
        soundex11.setMaxLength((-1));
        soundex11.setMaxLength((int) (short) 1);
        soundex11.setMaxLength((int) (short) 10);
        soundex11.setMaxLength((int) (short) 1);
        java.lang.String str27 = soundex11.encode("");
        int int28 = soundex11.getMaxLength();
        java.lang.String str30 = soundex11.encode("");
        java.lang.Object obj31 = soundex6.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4655");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        int int13 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = soundex4.difference("", "hi!");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4656");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        java.lang.String str17 = refinedSoundex15.soundex("");
        java.lang.String str19 = refinedSoundex15.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.String str30 = refinedSoundex15.soundex("");
        java.lang.String str32 = refinedSoundex15.soundex("");
        java.lang.Object obj33 = soundex5.encode((java.lang.Object) str32);
        int int34 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4657");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex9.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4658");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str9 = refinedSoundex7.soundex("");
        java.lang.String str11 = refinedSoundex7.encode("");
        int int14 = refinedSoundex7.difference("", "");
        java.lang.String str16 = refinedSoundex7.soundex("");
        char[] charArray22 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        int int24 = soundex23.getMaxLength();
        java.lang.String str26 = soundex23.soundex("");
        char[] charArray30 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray30);
        java.lang.String str33 = refinedSoundex31.soundex("");
        java.lang.String str35 = refinedSoundex31.encode("");
        char[] charArray39 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex40 = new org.apache.commons.codec.language.RefinedSoundex(charArray39);
        int int43 = refinedSoundex40.difference("", "");
        java.lang.Object obj44 = refinedSoundex31.encode((java.lang.Object) "");
        java.lang.Object obj45 = soundex23.encode((java.lang.Object) "");
        char[] charArray49 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex50 = new org.apache.commons.codec.language.RefinedSoundex(charArray49);
        java.lang.String str52 = refinedSoundex50.encode("");
        java.lang.Object obj53 = soundex23.encode((java.lang.Object) str52);
        int int54 = soundex23.getMaxLength();
        int int55 = soundex23.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = refinedSoundex7.encode((java.lang.Object) soundex23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4659");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        int int15 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) '4');
        soundex5.setMaxLength((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4660");
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
        java.lang.String str24 = refinedSoundex4.soundex("");
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4661");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        java.lang.String str10 = soundex5.soundex("");
        java.lang.String str12 = soundex5.encode("");
        java.lang.String str14 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4662");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str9 = soundex7.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4663");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4664");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str7 = soundex5.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4665");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex5.difference("", "");
        java.lang.String str10 = soundex5.soundex("");
        int int13 = soundex5.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4666");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        soundex6.setMaxLength((int) (short) 1);
        soundex6.setMaxLength(0);
        java.lang.String str14 = soundex6.soundex("");
        soundex6.setMaxLength((int) (short) 0);
        int int19 = soundex6.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4667");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.encode("");
        soundex6.setMaxLength((int) (byte) 10);
        char[] charArray15 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        java.lang.Class<?> wildcardClass19 = refinedSoundex18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex6.encode((java.lang.Object) refinedSoundex18);
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
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, #]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4668");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        char char11 = refinedSoundex4.getMappingCode('a');
        java.lang.String str13 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = refinedSoundex4.difference("hi!", "");
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
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '4' + "'", char11 == '4');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4669");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        java.lang.String str10 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 100);
        java.lang.String str14 = soundex3.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4670");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        soundex4.setMaxLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex4.encode("hi!");
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
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4671");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4672");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str12 = refinedSoundex10.encode("");
        int int15 = refinedSoundex10.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4673");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4674");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex8.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex8.soundex("");
        char char21 = refinedSoundex8.getMappingCode('4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4675");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        java.lang.String str17 = refinedSoundex15.soundex("");
        java.lang.String str19 = refinedSoundex15.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.String str30 = refinedSoundex15.soundex("");
        java.lang.String str32 = refinedSoundex15.soundex("");
        java.lang.Object obj33 = soundex5.encode((java.lang.Object) str32);
        soundex5.setMaxLength(10);
        char[] charArray38 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex39 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex40 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex(charArray38);
        org.apache.commons.codec.language.Soundex soundex42 = new org.apache.commons.codec.language.Soundex(charArray38);
        soundex42.setMaxLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = soundex5.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4]");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4676");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.encode("");
        int int10 = soundex5.getMaxLength();
        char[] charArray14 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str17 = soundex15.encode("");
        java.lang.Object obj18 = soundex5.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4677");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
        java.lang.String str15 = refinedSoundex4.encode("");
        char[] charArray18 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        soundex19.setMaxLength(1);
        int int22 = soundex19.getMaxLength();
        java.lang.String str24 = soundex19.soundex("");
        java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) str24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = refinedSoundex4.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4678");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex4.setMaxLength((int) (byte) 0);
        int int7 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4679");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char char9 = refinedSoundex5.getMappingCode('a');
        java.lang.String str11 = refinedSoundex5.encode("");
        java.lang.String str13 = refinedSoundex5.encode("");
        java.lang.Class<?> wildcardClass14 = refinedSoundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4680");
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
        java.lang.String str23 = soundex4.encode("");
        int int24 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4681");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.encode("");
        char[] charArray21 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        int int30 = refinedSoundex27.difference("", "");
        java.lang.String str32 = refinedSoundex27.encode("");
        java.lang.Object obj33 = soundex22.encode((java.lang.Object) "");
        java.lang.Object obj34 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str36 = refinedSoundex4.encode("");
        char char38 = refinedSoundex4.getMappingCode('a');
        java.lang.String str40 = refinedSoundex4.soundex("");
        char[] charArray46 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex47 = new org.apache.commons.codec.language.RefinedSoundex(charArray46);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex48 = new org.apache.commons.codec.language.RefinedSoundex(charArray46);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex49 = new org.apache.commons.codec.language.RefinedSoundex(charArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = refinedSoundex4.encode((java.lang.Object) refinedSoundex49);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '4' + "'", char38 == '4');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , #, a, a, #]");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4682");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('#');
        java.lang.String str12 = refinedSoundex8.encode("");
        java.lang.String str14 = refinedSoundex8.encode("");
        int int17 = refinedSoundex8.difference("", "");
        java.lang.String str19 = refinedSoundex8.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int22 = refinedSoundex8.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4683");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        int int11 = soundex5.getMaxLength();
        char[] charArray17 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str21 = soundex19.encode("");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex19, "", "");
        int int25 = soundex19.getMaxLength();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray39);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray39);
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, (int) (byte) 1, strArray39);
        java.lang.Object obj43 = soundex19.encode((java.lang.Object) "");
        java.lang.String str45 = soundex19.soundex("");
        int int48 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex19, "", "");
        soundex19.setMaxLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = soundex5.encode((java.lang.Object) soundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4684");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.soundex("");
        int int10 = soundex5.difference("", "");
        soundex5.setMaxLength(100);
        soundex5.setMaxLength(100);
        soundex5.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4685");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.soundex("");
        char char16 = refinedSoundex9.getMappingCode('4');
        char[] charArray19 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex22 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray19);
        java.lang.String str25 = soundex23.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = refinedSoundex9.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4686");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        soundex4.setMaxLength((int) 'a');
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex4.encode(obj18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4687");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        soundex4.setMaxLength((int) 'a');
        java.lang.String str19 = soundex4.encode("");
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex4.encode(obj20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4688");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int11 = soundex8.difference("", "");
        soundex8.setMaxLength((int) (byte) 100);
        soundex8.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4689");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        char char19 = refinedSoundex4.getMappingCode('4');
        char[] charArray22 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray22);
        int int25 = soundex24.getMaxLength();
        java.lang.String str27 = soundex24.soundex("");
        java.lang.Object obj28 = refinedSoundex4.encode((java.lang.Object) str27);
        char char30 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '4' + "'", char30 == '4');
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4690");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        int int10 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (short) 10);
        java.lang.String str14 = soundex4.soundex("");
        int int17 = soundex4.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4691");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        java.lang.String str15 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = soundex3.difference("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4692");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        char char14 = refinedSoundex4.getMappingCode(' ');
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) (short) 0, strArray22);
        java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) "");
        int int28 = refinedSoundex4.difference("", "");
        char[] charArray32 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex(charArray32);
        int int36 = refinedSoundex33.difference("", "");
        char char38 = refinedSoundex33.getMappingCode('a');
        java.lang.String str40 = refinedSoundex33.encode("");
        java.lang.String str42 = refinedSoundex33.encode("");
        java.lang.Object obj43 = refinedSoundex4.encode((java.lang.Object) "");
        int int46 = refinedSoundex4.difference("", "");
        char char48 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '4' + "'", char38 == '4');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '4' + "'", char48 == '4');
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4693");
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
        char[] charArray32 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex(charArray32);
        java.lang.String str35 = refinedSoundex33.encode("");
        java.lang.Object obj36 = soundex6.encode((java.lang.Object) str35);
        int int37 = soundex6.getMaxLength();
        char[] charArray40 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex(charArray40);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex42 = new org.apache.commons.codec.language.RefinedSoundex(charArray40);
        org.apache.commons.codec.language.Soundex soundex43 = new org.apache.commons.codec.language.Soundex(charArray40);
        java.lang.String str45 = soundex43.encode("");
        int int46 = soundex43.getMaxLength();
        java.lang.String str48 = soundex43.soundex("");
        char[] charArray52 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex53 = new org.apache.commons.codec.language.RefinedSoundex(charArray52);
        java.lang.String str55 = refinedSoundex53.soundex("");
        java.lang.String str57 = refinedSoundex53.encode("");
        char[] charArray61 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex62 = new org.apache.commons.codec.language.RefinedSoundex(charArray61);
        int int65 = refinedSoundex62.difference("", "");
        java.lang.Object obj66 = refinedSoundex53.encode((java.lang.Object) "");
        java.lang.String str68 = refinedSoundex53.soundex("");
        java.lang.String str70 = refinedSoundex53.soundex("");
        java.lang.Object obj71 = soundex43.encode((java.lang.Object) str70);
        int int74 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex43, "", "");
        java.lang.Object obj75 = soundex6.encode((java.lang.Object) "");
        int int78 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "", "");
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
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "" + "'", obj66, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "" + "'", obj71, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + "" + "'", obj75, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4694");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str16 = refinedSoundex4.soundex("");
        char[] charArray22 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = refinedSoundex4.encode((java.lang.Object) charArray22);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #, a, a, #]");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4695");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray13 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        char[] charArray18 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        char char21 = refinedSoundex19.getMappingCode(' ');
        char char23 = refinedSoundex19.getMappingCode(' ');
        java.lang.String str25 = refinedSoundex19.soundex("");
        java.lang.String str27 = refinedSoundex19.encode("");
        int int30 = refinedSoundex19.difference("", "");
        java.lang.String str32 = refinedSoundex19.soundex("");
        java.lang.Object obj33 = soundex14.encode((java.lang.Object) "");
        java.lang.Object obj34 = refinedSoundex7.encode(obj33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = refinedSoundex7.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4696");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('a');
        java.lang.String str9 = refinedSoundex5.encode("");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex15.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4697");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        int int15 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) '4');
        char[] charArray20 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str23 = soundex21.encode("");
        int int24 = soundex21.getMaxLength();
        int int25 = soundex21.getMaxLength();
        java.lang.String str27 = soundex21.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex5.encode((java.lang.Object) soundex21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4698");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        char char10 = refinedSoundex4.getMappingCode('#');
        char char12 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex4.difference("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4699");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex14.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4700");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        java.lang.String str15 = soundex4.encode("");
        char[] charArray19 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex20, "", "");
        char[] charArray28 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        char char33 = refinedSoundex31.getMappingCode(' ');
        java.lang.String str35 = refinedSoundex31.soundex("");
        java.lang.Object obj36 = soundex20.encode((java.lang.Object) "");
        java.lang.Object obj37 = soundex4.encode(obj36);
        java.lang.String str39 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = soundex4.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4701");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = refinedSoundex4.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4702");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str10 = refinedSoundex8.soundex("");
        int int13 = refinedSoundex8.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4703");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        char char13 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4704");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str14 = refinedSoundex12.encode("");
        char char16 = refinedSoundex12.getMappingCode('4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4705");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char char9 = refinedSoundex5.getMappingCode(' ');
        int int12 = refinedSoundex5.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4706");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) ' ');
        soundex3.setMaxLength((int) '#');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4707");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        int int11 = soundex6.difference("", "");
        java.lang.String str13 = soundex6.encode("");
        int int14 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4708");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode('a');
        char char24 = refinedSoundex4.getMappingCode('#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4709");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str7 = soundex5.soundex("");
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        int int14 = soundex13.getMaxLength();
        soundex13.setMaxLength((int) (short) 1);
        java.lang.String str18 = soundex13.soundex("");
        java.lang.Object obj19 = soundex5.encode((java.lang.Object) str18);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4710");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(1);
        int int9 = soundex6.getMaxLength();
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        int int17 = refinedSoundex14.difference("", "");
        char char19 = refinedSoundex14.getMappingCode('a');
        char char21 = refinedSoundex14.getMappingCode('4');
        java.lang.String str23 = refinedSoundex14.encode("");
        java.lang.String str25 = refinedSoundex14.soundex("");
        char char27 = refinedSoundex14.getMappingCode(' ');
        int int30 = refinedSoundex14.difference("", "");
        char char32 = refinedSoundex14.getMappingCode('a');
        char char34 = refinedSoundex14.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex6.encode((java.lang.Object) char34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '4' + "'", char19 == '4');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '4' + "'", char32 == '4');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '4' + "'", char34 == '4');
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4711");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex13, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4712");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.encode("");
        char[] charArray21 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        int int30 = refinedSoundex27.difference("", "");
        java.lang.String str32 = refinedSoundex27.encode("");
        java.lang.Object obj33 = soundex22.encode((java.lang.Object) "");
        java.lang.Object obj34 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str36 = refinedSoundex4.encode("");
        char char38 = refinedSoundex4.getMappingCode('a');
        int int41 = refinedSoundex4.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '4' + "'", char38 == '4');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4713");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) ' ');
        soundex3.setMaxLength((int) '#');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        char[] charArray21 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex22 = new org.apache.commons.codec.language.RefinedSoundex(charArray21);
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray26);
        soundex28.setMaxLength((int) '4');
        java.lang.String str32 = soundex28.encode("");
        java.lang.Object obj33 = refinedSoundex22.encode((java.lang.Object) "");
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex22, "", "");
        char[] charArray40 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex41 = new org.apache.commons.codec.language.RefinedSoundex(charArray40);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex42 = new org.apache.commons.codec.language.RefinedSoundex(charArray40);
        org.apache.commons.codec.language.Soundex soundex43 = new org.apache.commons.codec.language.Soundex(charArray40);
        java.lang.String str45 = soundex43.soundex("");
        java.lang.Object obj46 = refinedSoundex22.encode((java.lang.Object) "");
        java.lang.Object obj47 = soundex3.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "" + "'", obj47, "");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4714");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        soundex5.setMaxLength((int) (short) 100);
        soundex5.setMaxLength((int) '4');
        soundex5.setMaxLength((int) (byte) 1);
        java.lang.String str20 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = soundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4715");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode('a');
        java.lang.String str9 = refinedSoundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4716");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char[] charArray9 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        soundex10.setMaxLength(1);
        soundex10.setMaxLength(100);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex10, "", "");
        java.lang.String str19 = soundex10.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex6.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4717");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4718");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        int int11 = soundex4.getMaxLength();
        java.lang.String str13 = soundex4.encode("");
        soundex4.setMaxLength((-1));
        int int16 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4719");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex12, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = refinedSoundex12.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4720");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str16 = soundex14.soundex("");
        int int19 = soundex14.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4721");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        char char8 = refinedSoundex4.getMappingCode(' ');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4722");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int9 = soundex8.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex8.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4723");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        int int10 = refinedSoundex5.difference("", "");
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex14.setMaxLength(1);
        soundex14.setMaxLength(100);
        int int19 = soundex14.getMaxLength();
        char[] charArray22 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str27 = soundex25.encode("");
        int int28 = soundex25.getMaxLength();
        java.lang.String str30 = soundex25.soundex("");
        java.lang.Object obj31 = soundex14.encode((java.lang.Object) str30);
        char[] charArray35 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex36 = new org.apache.commons.codec.language.Soundex(charArray35);
        org.apache.commons.codec.language.Soundex soundex37 = new org.apache.commons.codec.language.Soundex(charArray35);
        char[] charArray41 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex42 = new org.apache.commons.codec.language.RefinedSoundex(charArray41);
        int int45 = refinedSoundex42.difference("", "");
        char char47 = refinedSoundex42.getMappingCode('a');
        char char49 = refinedSoundex42.getMappingCode('4');
        java.lang.String str51 = refinedSoundex42.soundex("");
        java.lang.Object obj52 = soundex37.encode((java.lang.Object) "");
        java.lang.Object obj53 = soundex14.encode(obj52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = refinedSoundex5.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '4' + "'", char47 == '4');
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\000' + "'", char49 == '\000');
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4724");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str13 = soundex11.soundex("");
        java.lang.String str15 = soundex11.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4725");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str15 = soundex13.encode("");
        java.lang.String str17 = soundex13.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "", "");
        java.lang.Class<?> wildcardClass21 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex7.encode((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4726");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        int int11 = soundex7.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4727");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        java.lang.String str11 = refinedSoundex9.soundex("");
        java.lang.Object obj12 = soundex4.encode((java.lang.Object) str11);
        soundex4.setMaxLength((int) 'a');
        java.lang.String str16 = soundex4.encode("");
        int int17 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = soundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4728");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4729");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex5.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4730");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str13 = refinedSoundex11.soundex("");
        java.lang.String str15 = refinedSoundex11.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4731");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        soundex5.setMaxLength((int) (short) 0);
        soundex5.setMaxLength((int) (byte) -1);
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
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4732");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (byte) 0);
        int int11 = soundex5.getMaxLength();
        java.lang.String str13 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4733");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        int int11 = soundex6.getMaxLength();
        int int12 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4734");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        soundex7.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex7.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4735");
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
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex4.encode(obj34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4736");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        char char10 = refinedSoundex4.getMappingCode('#');
        char char12 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4737");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('4');
        java.lang.String str9 = refinedSoundex5.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4738");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode('a');
        java.lang.String str24 = refinedSoundex4.encode("");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4739");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        char char22 = refinedSoundex5.getMappingCode('4');
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray36);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'a', (int) '4', strArray36);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 0, (int) (byte) 10, strArray36);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 100, (int) (short) 1, strArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = refinedSoundex5.encode((java.lang.Object) boolean40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4740");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "", "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4741");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.soundex("");
        soundex3.setMaxLength((int) '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4742");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        int int8 = soundex3.getMaxLength();
        int int9 = soundex3.getMaxLength();
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        int int14 = soundex3.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4743");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        java.lang.String str8 = soundex4.encode("");
        char[] charArray12 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray12);
        soundex16.setMaxLength((-1));
        soundex16.setMaxLength(100);
        int int21 = soundex16.getMaxLength();
        java.lang.Class<?> wildcardClass22 = soundex16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex4.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4744");
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
        java.lang.String str26 = soundex4.soundex("");
        soundex4.setMaxLength((int) (short) 100);
        java.lang.String str30 = soundex4.encode("");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4745");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        java.lang.String str12 = soundex3.soundex("");
        char[] charArray15 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex3.encode((java.lang.Object) charArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4]");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4746");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex12.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4747");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        java.lang.String str15 = soundex4.encode("");
        char[] charArray19 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        int int21 = soundex20.getMaxLength();
        int int22 = soundex20.getMaxLength();
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex20, "", "");
        char[] charArray28 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        char char33 = refinedSoundex31.getMappingCode(' ');
        java.lang.String str35 = refinedSoundex31.soundex("");
        java.lang.Object obj36 = soundex20.encode((java.lang.Object) "");
        java.lang.Object obj37 = soundex4.encode(obj36);
        java.lang.String str39 = soundex4.encode("");
        char[] charArray43 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex44 = new org.apache.commons.codec.language.Soundex(charArray43);
        org.apache.commons.codec.language.Soundex soundex45 = new org.apache.commons.codec.language.Soundex(charArray43);
        org.apache.commons.codec.language.Soundex soundex46 = new org.apache.commons.codec.language.Soundex(charArray43);
        org.apache.commons.codec.language.Soundex soundex47 = new org.apache.commons.codec.language.Soundex(charArray43);
        org.apache.commons.codec.language.Soundex soundex48 = new org.apache.commons.codec.language.Soundex(charArray43);
        org.apache.commons.codec.language.Soundex soundex49 = new org.apache.commons.codec.language.Soundex(charArray43);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex50 = new org.apache.commons.codec.language.RefinedSoundex(charArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = soundex4.encode((java.lang.Object) charArray43);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, 4,  ]");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4748");
        char[] charArray2 = new char[] { 'a', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4749");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        soundex12.setMaxLength((int) '4');
        java.lang.String str16 = soundex12.encode("");
        java.lang.Object obj17 = refinedSoundex6.encode((java.lang.Object) "");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "", "");
        char char22 = refinedSoundex6.getMappingCode('4');
        java.lang.String str24 = refinedSoundex6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = refinedSoundex6.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4750");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        int int11 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4751");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        java.lang.String str11 = soundex7.soundex("");
        soundex7.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4752");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex13.setMaxLength((int) (byte) 10);
        int int16 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex13.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4753");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode('a');
        char char24 = refinedSoundex4.getMappingCode('a');
        char[] charArray28 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex30 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray28);
        java.lang.String str33 = soundex31.soundex("");
        java.lang.String str35 = soundex31.encode("");
        java.lang.String str37 = soundex31.encode("");
        java.lang.Object obj38 = refinedSoundex4.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '4' + "'", char24 == '4');
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4754");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str14 = refinedSoundex12.soundex("");
        char char16 = refinedSoundex12.getMappingCode(' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4755");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) (short) 1);
        soundex4.setMaxLength((int) (short) 10);
        soundex4.setMaxLength((int) (short) 1);
        java.lang.String str20 = soundex4.encode("");
        int int21 = soundex4.getMaxLength();
        soundex4.setMaxLength((-1));
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4756");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4757");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.encode("");
        char char12 = refinedSoundex4.getMappingCode('a');
        java.lang.String str14 = refinedSoundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4758");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        java.lang.String str17 = refinedSoundex15.soundex("");
        java.lang.String str19 = refinedSoundex15.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = refinedSoundex15.encode((java.lang.Object) "");
        java.lang.String str30 = refinedSoundex15.soundex("");
        java.lang.String str32 = refinedSoundex15.soundex("");
        java.lang.Object obj33 = soundex5.encode((java.lang.Object) str32);
        java.lang.String str35 = soundex5.soundex("");
        soundex5.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4759");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('#');
        char[] charArray16 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray16);
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.Object obj28 = soundex19.encode((java.lang.Object) "");
        java.lang.String str30 = soundex19.encode("");
        char[] charArray36 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex37 = new org.apache.commons.codec.language.RefinedSoundex(charArray36);
        char char39 = refinedSoundex37.getMappingCode(' ');
        int int42 = refinedSoundex37.difference("", "");
        java.lang.String str44 = refinedSoundex37.soundex("");
        java.lang.Object obj45 = soundex19.encode((java.lang.Object) str44);
        java.lang.Object obj46 = refinedSoundex4.encode(obj45);
        int int49 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4760");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.encode("");
        int int11 = soundex4.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4761");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        soundex5.setMaxLength((int) (short) 100);
        soundex5.setMaxLength((int) '4');
        soundex5.setMaxLength((int) (byte) 1);
        java.lang.String str20 = soundex5.encode("");
        soundex5.setMaxLength(1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4762");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex3.encode("hi!");
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
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4763");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        int int9 = soundex5.getMaxLength();
        int int10 = soundex5.getMaxLength();
        java.lang.String str12 = soundex5.encode("");
        java.lang.String str14 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4764");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        char[] charArray23 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        int int27 = soundex26.getMaxLength();
        java.lang.String str29 = soundex26.encode("");
        java.lang.Object obj30 = refinedSoundex4.encode((java.lang.Object) str29);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4765");
        char[] charArray2 = new char[] { 'a', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int6 = refinedSoundex3.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = refinedSoundex3.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4766");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "");
        java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) "");
        java.lang.String str20 = refinedSoundex5.encode("");
        java.lang.String str22 = refinedSoundex5.soundex("");
        int int25 = refinedSoundex5.difference("", "");
        char[] charArray28 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        java.lang.String str31 = soundex29.encode("");
        java.lang.String str33 = soundex29.encode("");
        soundex29.setMaxLength((int) (short) 0);
        java.lang.String str37 = soundex29.soundex("");
        java.lang.String str39 = soundex29.encode("");
        java.lang.Object obj40 = refinedSoundex5.encode((java.lang.Object) str39);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = refinedSoundex5.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4767");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.encode("");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.soundex("");
        java.lang.String str20 = soundex14.encode("");
        java.lang.String str22 = soundex14.soundex("");
        soundex14.setMaxLength((int) '#');
        soundex14.setMaxLength((int) (short) -1);
        soundex14.setMaxLength(0);
        java.lang.String str30 = soundex14.encode("");
        java.lang.Object obj31 = soundex6.encode((java.lang.Object) str30);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4768");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char12 = refinedSoundex10.getMappingCode(' ');
        java.lang.String str14 = refinedSoundex10.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4769");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        java.lang.String str13 = refinedSoundex4.encode("");
        int int16 = refinedSoundex4.difference("", "");
        char[] charArray19 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        java.lang.String str24 = soundex22.soundex("");
        int int27 = soundex22.difference("", "");
        soundex22.setMaxLength(100);
        java.lang.String str31 = soundex22.soundex("");
        java.lang.Object obj32 = refinedSoundex4.encode((java.lang.Object) "");
        char char34 = refinedSoundex4.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '4' + "'", char34 == '4');
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4770");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex7.setMaxLength((int) (short) 1);
        int int10 = soundex7.getMaxLength();
        java.lang.String str12 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4771");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        soundex7.setMaxLength(100);
        int int12 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex7.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4772");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str14 = refinedSoundex12.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4773");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str11 = refinedSoundex9.soundex("");
        java.lang.String str13 = refinedSoundex9.encode("");
        int int16 = refinedSoundex9.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4774");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int11 = soundex8.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4775");
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
        char[] charArray36 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex37 = new org.apache.commons.codec.language.RefinedSoundex(charArray36);
        int int40 = refinedSoundex37.difference("", "");
        char char42 = refinedSoundex37.getMappingCode('#');
        char char44 = refinedSoundex37.getMappingCode('a');
        java.lang.String str46 = refinedSoundex37.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = refinedSoundex4.encode((java.lang.Object) refinedSoundex37);
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '4' + "'", char44 == '4');
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4776");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        soundex4.setMaxLength((int) (short) -1);
        soundex4.setMaxLength(0);
        java.lang.String str20 = soundex4.encode("");
        soundex4.setMaxLength(1);
        java.lang.String str24 = soundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4777");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        int int11 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4778");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex11.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4779");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        char char13 = refinedSoundex4.getMappingCode(' ');
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex4.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4780");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int5 = soundex4.getMaxLength();
        java.lang.String str7 = soundex4.soundex("");
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        char char17 = refinedSoundex15.getMappingCode('#');
        java.lang.String str19 = refinedSoundex15.soundex("");
        java.lang.Object obj20 = soundex4.encode((java.lang.Object) "");
        int int21 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4781");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        char char14 = refinedSoundex4.getMappingCode(' ');
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, (int) (short) 0, strArray22);
        java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) "");
        int int28 = refinedSoundex4.difference("", "");
        char[] charArray32 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex(charArray32);
        int int36 = refinedSoundex33.difference("", "");
        char char38 = refinedSoundex33.getMappingCode('a');
        java.lang.String str40 = refinedSoundex33.encode("");
        java.lang.String str42 = refinedSoundex33.encode("");
        java.lang.Object obj43 = refinedSoundex4.encode((java.lang.Object) "");
        int int46 = refinedSoundex4.difference("", "");
        char[] charArray50 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex51 = new org.apache.commons.codec.language.Soundex(charArray50);
        org.apache.commons.codec.language.Soundex soundex52 = new org.apache.commons.codec.language.Soundex(charArray50);
        org.apache.commons.codec.language.Soundex soundex53 = new org.apache.commons.codec.language.Soundex(charArray50);
        org.apache.commons.codec.language.Soundex soundex54 = new org.apache.commons.codec.language.Soundex(charArray50);
        org.apache.commons.codec.language.Soundex soundex55 = new org.apache.commons.codec.language.Soundex(charArray50);
        org.apache.commons.codec.language.Soundex soundex56 = new org.apache.commons.codec.language.Soundex(charArray50);
        org.apache.commons.codec.language.Soundex soundex57 = new org.apache.commons.codec.language.Soundex(charArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = refinedSoundex4.encode((java.lang.Object) soundex57);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '4' + "'", char38 == '4');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, 4,  ]");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4782");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        int int13 = soundex5.getMaxLength();
        java.lang.Class<?> wildcardClass14 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4783");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex5.difference("", "");
        java.lang.String str10 = soundex5.soundex("");
        int int11 = soundex5.getMaxLength();
        int int12 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4784");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) -1);
        java.lang.String str10 = soundex6.encode("");
        soundex6.setMaxLength((int) '#');
        char[] charArray18 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        char[] charArray24 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        char char27 = refinedSoundex25.getMappingCode(' ');
        char char29 = refinedSoundex25.getMappingCode(' ');
        java.lang.String str31 = refinedSoundex25.soundex("");
        java.lang.String str33 = refinedSoundex25.encode("");
        int int36 = refinedSoundex25.difference("", "");
        java.lang.String str38 = refinedSoundex25.encode("");
        java.lang.String str40 = refinedSoundex25.encode("");
        java.lang.Object obj41 = refinedSoundex20.encode((java.lang.Object) str40);
        char[] charArray44 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex45 = new org.apache.commons.codec.language.Soundex(charArray44);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex46 = new org.apache.commons.codec.language.RefinedSoundex(charArray44);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex47 = new org.apache.commons.codec.language.RefinedSoundex(charArray44);
        int int50 = refinedSoundex47.difference("", "");
        char[] charArray53 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex54 = new org.apache.commons.codec.language.Soundex(charArray53);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex55 = new org.apache.commons.codec.language.RefinedSoundex(charArray53);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex56 = new org.apache.commons.codec.language.RefinedSoundex(charArray53);
        int int59 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex56, "", "");
        java.lang.Object obj60 = refinedSoundex47.encode((java.lang.Object) "");
        java.lang.String str62 = refinedSoundex47.encode("");
        java.lang.Object obj63 = refinedSoundex20.encode((java.lang.Object) str62);
        java.lang.Object obj64 = soundex6.encode((java.lang.Object) str62);
        int int65 = soundex6.getMaxLength();
        java.lang.String str67 = soundex6.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "" + "'", obj60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "" + "'", obj63, "");
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "" + "'", obj64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4785");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (short) 10);
        java.lang.String str10 = soundex6.encode("");
        int int11 = soundex6.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4786");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4787");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4788");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char[] charArray14 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray14);
        int int19 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) (short) -1);
        soundex18.setMaxLength((-1));
        int int26 = soundex18.difference("", "");
        java.lang.Object obj27 = refinedSoundex10.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4789");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char9 = refinedSoundex7.getMappingCode('#');
        java.lang.String str11 = refinedSoundex7.soundex("");
        java.lang.Class<?> wildcardClass12 = refinedSoundex7.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4790");
        char[] charArray3 = new char[] { '#', ' ', '#' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int5 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  , #]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4791");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str8 = refinedSoundex6.encode("");
        java.lang.Class<?> wildcardClass9 = refinedSoundex6.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4792");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str14 = refinedSoundex12.encode("");
        char[] charArray18 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        java.lang.String str21 = refinedSoundex19.soundex("");
        java.lang.String str23 = refinedSoundex19.encode("");
        char char25 = refinedSoundex19.getMappingCode('4');
        char[] charArray29 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex30 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        int int33 = refinedSoundex30.difference("", "");
        char char35 = refinedSoundex30.getMappingCode('a');
        java.lang.String str37 = refinedSoundex30.encode("");
        java.lang.String str39 = refinedSoundex30.encode("");
        java.lang.Object obj40 = refinedSoundex19.encode((java.lang.Object) str39);
        char char42 = refinedSoundex19.getMappingCode('#');
        java.lang.String str44 = refinedSoundex19.soundex("");
        java.lang.Object obj45 = refinedSoundex12.encode((java.lang.Object) "");
        char[] charArray49 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex50 = new org.apache.commons.codec.language.Soundex(charArray49);
        org.apache.commons.codec.language.Soundex soundex51 = new org.apache.commons.codec.language.Soundex(charArray49);
        org.apache.commons.codec.language.Soundex soundex52 = new org.apache.commons.codec.language.Soundex(charArray49);
        org.apache.commons.codec.language.Soundex soundex53 = new org.apache.commons.codec.language.Soundex(charArray49);
        org.apache.commons.codec.language.Soundex soundex54 = new org.apache.commons.codec.language.Soundex(charArray49);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex55 = new org.apache.commons.codec.language.RefinedSoundex(charArray49);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex56 = new org.apache.commons.codec.language.RefinedSoundex(charArray49);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex57 = new org.apache.commons.codec.language.RefinedSoundex(charArray49);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex58 = new org.apache.commons.codec.language.RefinedSoundex(charArray49);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex59 = new org.apache.commons.codec.language.RefinedSoundex(charArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = refinedSoundex12.encode((java.lang.Object) charArray49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '4' + "'", char35 == '4');
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, 4,  ]");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4793");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str14 = soundex12.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4794");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex10.encode("hi!");
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
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4795");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        java.lang.String str17 = soundex4.soundex("");
        java.lang.String str19 = soundex4.encode("");
        java.lang.String str21 = soundex4.soundex("");
        soundex4.setMaxLength(100);
        java.lang.String str25 = soundex4.encode("");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4796");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str9 = soundex7.encode("");
        java.lang.String str11 = soundex7.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4797");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        int int10 = soundex7.getMaxLength();
        java.lang.String str12 = soundex7.soundex("");
        int int13 = soundex7.getMaxLength();
        int int14 = soundex7.getMaxLength();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4798");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex9.encode("hi!");
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
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4799");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        java.lang.String str10 = soundex5.encode("");
        java.lang.String str12 = soundex5.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4800");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.encode("");
        soundex3.setMaxLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4801");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.soundex("");
        char char16 = refinedSoundex9.getMappingCode('4');
        char char18 = refinedSoundex9.getMappingCode('4');
        java.lang.String str20 = refinedSoundex9.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4802");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int10 = soundex3.difference("", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4803");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        char[] charArray14 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) refinedSoundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  ]");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4804");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
        java.lang.String str21 = refinedSoundex4.encode("");
        java.lang.String str23 = refinedSoundex4.encode("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4805");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex3.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4806");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        java.lang.String str9 = refinedSoundex5.soundex("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4807");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        char char19 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = refinedSoundex4.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4808");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) ' ');
        soundex3.setMaxLength((int) '#');
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        java.lang.String str19 = refinedSoundex17.soundex("");
        java.lang.String str21 = refinedSoundex17.soundex("");
        char char23 = refinedSoundex17.getMappingCode(' ');
        char[] charArray27 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex28 = new org.apache.commons.codec.language.RefinedSoundex(charArray27);
        int int31 = refinedSoundex28.difference("", "");
        char char33 = refinedSoundex28.getMappingCode('a');
        char char35 = refinedSoundex28.getMappingCode('4');
        java.lang.String str37 = refinedSoundex28.encode("");
        java.lang.Object obj38 = refinedSoundex17.encode((java.lang.Object) str37);
        java.lang.Object obj39 = soundex3.encode(obj38);
        char[] charArray45 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex46 = new org.apache.commons.codec.language.Soundex(charArray45);
        soundex46.setMaxLength(1);
        int int49 = soundex46.getMaxLength();
        soundex46.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = soundex3.encode((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '4' + "'", char33 == '4');
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4809");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int7 = soundex6.getMaxLength();
        soundex6.setMaxLength(10);
        soundex6.setMaxLength((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4810");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str15 = refinedSoundex4.soundex("");
        java.lang.Class<?> wildcardClass16 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4811");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int11 = refinedSoundex8.difference("", "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4812");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex13.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
    }
}

