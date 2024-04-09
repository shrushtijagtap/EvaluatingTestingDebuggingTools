package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3001");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        java.lang.String str13 = refinedSoundex11.encode("");
        char char15 = refinedSoundex11.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex4.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3002");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "hi!", "hi!");
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3003");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex4.encode((java.lang.Object) 10.0f);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3004");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex4.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3005");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = refinedSoundex4.difference("", "hi!");
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
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3006");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex3.difference("hi!", "");
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
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3007");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        java.lang.String str16 = soundex5.encode("");
        char[] charArray19 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        int int30 = refinedSoundex27.difference("", "");
        java.lang.Object obj31 = soundex22.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex5.encode((java.lang.Object) soundex22);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
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
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3008");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        char char29 = refinedSoundex24.getMappingCode('a');
        java.lang.String str31 = refinedSoundex24.encode("");
        char char33 = refinedSoundex24.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = refinedSoundex4.encode((java.lang.Object) 'a');
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
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '4' + "'", char29 == '4');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '4' + "'", char33 == '4');
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3009");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.encode("hi!");
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
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3010");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3011");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        int int20 = refinedSoundex4.difference("", "");
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex4.encode(obj21);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3012");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        char[] charArray19 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        java.lang.String str22 = soundex20.encode("");
        java.lang.String str24 = soundex20.soundex("");
        java.lang.String str26 = soundex20.soundex("");
        java.lang.Class<?> wildcardClass27 = soundex20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = refinedSoundex4.encode((java.lang.Object) soundex20);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3013");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3014");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = refinedSoundex4.encode((java.lang.Object) (short) 100);
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
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3015");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        char char11 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3016");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3017");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex8.soundex("hi!");
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3018");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex4.difference("hi!", "");
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
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3019");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3020");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "hi!", "");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3021");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex4.encode((java.lang.Object) (short) 10);
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
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3022");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = soundex4.encode("hi!");
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3023");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3024");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex5.difference("hi!", "");
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
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3025");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        char char11 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex4.encode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '4' + "'", char11 == '4');
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3026");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex4.encode((java.lang.Object) soundex17);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3027");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char[] charArray15 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) charArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, #]");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3028");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        char char15 = refinedSoundex13.getMappingCode(' ');
        char char17 = refinedSoundex13.getMappingCode(' ');
        java.lang.String str19 = refinedSoundex13.soundex("");
        java.lang.String str21 = refinedSoundex13.encode("");
        int int24 = refinedSoundex13.difference("", "");
        java.lang.String str26 = refinedSoundex13.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex5.encode((java.lang.Object) refinedSoundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
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
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3029");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex6.difference("hi!", "");
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
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3030");
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
            java.lang.String str19 = refinedSoundex4.soundex("hi!");
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
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3031");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3032");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        char[] charArray17 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str20 = soundex18.encode("");
        java.lang.String str22 = soundex18.soundex("");
        int int23 = soundex18.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex4.encode((java.lang.Object) int23);
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3033");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex4.difference("", "hi!");
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
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3034");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex6.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3035");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3036");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3037");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        java.lang.String str13 = refinedSoundex11.soundex("");
        java.lang.String str15 = refinedSoundex11.soundex("");
        char char17 = refinedSoundex11.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex6.encode((java.lang.Object) char17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3038");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex4.encode((java.lang.Object) '4');
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3039");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str15 = soundex13.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex7.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3040");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.Class<?> wildcardClass9 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3041");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3042");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.encode("");
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        char char14 = refinedSoundex12.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex5.encode((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3043");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3044");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        int int12 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
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
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3045");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex4.encode((java.lang.Object) (byte) 10);
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
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3046");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        java.lang.Class<?> wildcardClass13 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3047");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = soundex3.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3048");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        int int10 = soundex4.getMaxLength();
        int int11 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex4.difference("hi!", "");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3049");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.encode("hi!");
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3050");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex4.difference("hi!", "hi!");
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
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3051");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex6.difference("", "hi!");
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
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3052");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex4.difference("hi!", "");
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
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3053");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
        char char21 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '4' + "'", char21 == '4');
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3054");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = refinedSoundex4.difference("", "hi!");
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
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3055");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3056");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3057");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray12 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("");
        java.lang.String str17 = soundex13.soundex("");
        int int18 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = refinedSoundex8.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3058");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = refinedSoundex4.encode("hi!");
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
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3059");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3060");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        java.lang.String str15 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "", "hi!");
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
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3061");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = refinedSoundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3062");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a,  , 4, 4]");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3063");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
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
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3064");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex4.encode((java.lang.Object) strArray23);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3065");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex4.soundex("hi!");
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
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3066");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex4.difference("", "hi!");
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
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3067");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        char[] charArray14 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.Class<?> wildcardClass17 = charArray14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = refinedSoundex4.encode((java.lang.Object) charArray14);
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a,  , 4, 4]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3068");
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
            int int22 = refinedSoundex4.difference("hi!", "hi!");
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
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3069");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3070");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        int int16 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = refinedSoundex4.difference("hi!", "");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3071");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        char char19 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = refinedSoundex4.difference("", "hi!");
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3072");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        char char10 = refinedSoundex4.getMappingCode('4');
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
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3073");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3074");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        char[] charArray18 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int20 = soundex19.getMaxLength();
        int int21 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex4.encode((java.lang.Object) int21);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3075");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex8.encode("hi!");
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
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3076");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str9 = refinedSoundex7.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex7.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3077");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex6.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3078");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.soundex("");
        java.lang.String str20 = soundex14.soundex("");
        soundex14.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex6.encode((java.lang.Object) '#');
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3079");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.soundex("");
        int int21 = soundex14.difference("", "");
        java.lang.String str23 = soundex14.encode("");
        java.lang.String str25 = soundex14.encode("");
        java.lang.Object obj26 = soundex4.encode((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex4.encode((java.lang.Object) 10.0f);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3080");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        java.lang.String str21 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3081");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex4.encode("hi!");
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
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3082");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        char[] charArray12 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("");
        java.lang.String str17 = soundex13.soundex("");
        java.lang.String str19 = soundex13.soundex("");
        java.lang.String str21 = soundex13.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex6.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3083");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3084");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex5.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3085");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int8 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex7.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3086");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        int int10 = soundex4.getMaxLength();
        char[] charArray16 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex4.encode((java.lang.Object) charArray16);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , #, a, a, #]");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3087");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        char[] charArray16 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        java.lang.String str19 = soundex17.encode("");
        java.lang.String str21 = soundex17.soundex("");
        int int22 = soundex17.getMaxLength();
        int int23 = soundex17.getMaxLength();
        java.lang.Class<?> wildcardClass24 = soundex17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) soundex17);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3088");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.encode("hi!");
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
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3089");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray6 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray6);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray6);
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex9, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex3.encode((java.lang.Object) refinedSoundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3090");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        char char19 = refinedSoundex4.getMappingCode('4');
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = refinedSoundex4.encode((java.lang.Object) charArray23);
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3091");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        int int10 = soundex4.getMaxLength();
        char[] charArray14 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex4.encode((java.lang.Object) soundex18);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  ]");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3092");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        java.lang.String str14 = refinedSoundex12.soundex("");
        java.lang.String str16 = refinedSoundex12.soundex("");
        char char18 = refinedSoundex12.getMappingCode(' ');
        char char20 = refinedSoundex12.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = refinedSoundex5.encode((java.lang.Object) refinedSoundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3093");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3094");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = soundex5.difference("hi!", "hi!");
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
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3095");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        char[] charArray12 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        soundex13.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex6.encode((java.lang.Object) 1);
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3096");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) ' ', (int) ' ', strArray22);
        java.lang.Class<?> wildcardClass25 = strArray22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex5.encode((java.lang.Object) strArray22);
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
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3097");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.Class<?> wildcardClass14 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3098");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex8.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = refinedSoundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3099");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex6.setMaxLength((int) (byte) 100);
        java.lang.String str10 = soundex6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3100");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
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
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3101");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        int int13 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex4.encode((java.lang.Object) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3102");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char8 = refinedSoundex6.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3103");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        java.lang.Class<?> wildcardClass10 = soundex6.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3104");
        char[] charArray3 = new char[] { '#', '4', ' ' };
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3105");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex5.encode("hi!");
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
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3106");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3107");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3108");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex4.difference("", "hi!");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3109");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex3.soundex("hi!");
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
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3110");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex8.difference("", "hi!");
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3111");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = refinedSoundex4.encode((java.lang.Object) (short) 1);
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
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3112");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = soundex4.encode("hi!");
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3113");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = refinedSoundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3114");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3115");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex3.encode("hi!");
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3116");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.Class<?> wildcardClass7 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3117");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3118");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex4.encode("hi!");
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
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3119");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex3.difference("", "hi!");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3120");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3121");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        int int20 = refinedSoundex4.difference("", "");
        char[] charArray24 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray24);
        char char29 = refinedSoundex27.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = refinedSoundex4.encode((java.lang.Object) refinedSoundex27);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3122");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        int int12 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "");
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
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3123");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex5.encode((java.lang.Object) (short) -1);
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
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3124");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3125");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3126");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex3.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3127");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex3.encode((java.lang.Object) (byte) 10);
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
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3128");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex4.soundex("hi!");
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
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3129");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex4.difference("", "hi!");
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
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3130");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        java.lang.String str19 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3131");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        int int12 = soundex4.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3132");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex5.difference("", "hi!");
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3133");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.encode("");
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3134");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        int int20 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3135");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3136");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) (short) 1);
        soundex4.setMaxLength((int) (short) 10);
        soundex4.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = soundex4.difference("hi!", "");
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
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3137");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex8, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3138");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = soundex4.soundex("hi!");
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
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3139");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
        char char21 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '4' + "'", char21 == '4');
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3140");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex4.encode((java.lang.Object) soundex14);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3141");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = soundex6.soundex("hi!");
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
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3142");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = refinedSoundex6.difference("hi!", "hi!");
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
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3143");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3144");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        char[] charArray11 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("");
        java.lang.String str16 = soundex12.soundex("");
        java.lang.String str18 = soundex12.encode("");
        java.lang.String str20 = soundex12.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex5.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3145");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3146");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex10.difference("hi!", "hi!");
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3147");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3148");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray26);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, (int) ' ', strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex4.encode((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3149");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray6 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray6);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray6);
        int int12 = soundex9.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex3.encode((java.lang.Object) soundex9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3150");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3151");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        int int16 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = refinedSoundex4.encode((java.lang.Object) 0);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3152");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        java.lang.String str16 = refinedSoundex14.soundex("");
        java.lang.String str18 = refinedSoundex14.soundex("");
        char char20 = refinedSoundex14.getMappingCode(' ');
        int int23 = refinedSoundex14.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex4.encode((java.lang.Object) refinedSoundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3154");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = soundex6.difference("hi!", "hi!");
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
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3155");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        int int10 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (short) 10);
        char[] charArray18 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex22 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex4.encode((java.lang.Object) charArray18);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3156");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        int int16 = refinedSoundex4.difference("", "");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray30);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) 'a', strArray30);
        java.lang.Class<?> wildcardClass34 = strArray30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = refinedSoundex4.encode((java.lang.Object) strArray30);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3157");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        char char15 = refinedSoundex4.getMappingCode('#');
        char[] charArray18 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int21 = soundex20.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex4.encode((java.lang.Object) int21);
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
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3158");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = soundex4.soundex("hi!");
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3159");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        char char10 = refinedSoundex5.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3160");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        char char8 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3161");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex8.difference("hi!", "hi!");
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3162");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3163");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3164");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ' ' + "'", char8 == ' ');
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3165");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex5.difference("hi!", "hi!");
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3166");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        char[] charArray10 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("");
        java.lang.String str15 = soundex11.soundex("");
        java.lang.String str17 = soundex11.soundex("");
        soundex11.setMaxLength((-1));
        int int20 = soundex11.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex4.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3167");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex5.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = soundex5.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3168");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = refinedSoundex4.difference("hi!", "hi!");
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
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3169");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        char[] charArray12 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        int int14 = soundex13.getMaxLength();
        int int15 = soundex13.getMaxLength();
        java.lang.Class<?> wildcardClass16 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex3.encode((java.lang.Object) wildcardClass16);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3170");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex5.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex5.encode("hi!");
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
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3171");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex5.soundex("hi!");
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
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3172");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int8 = soundex5.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3173");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        int int12 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = refinedSoundex4.encode("hi!");
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
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3174");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex7.setMaxLength((-1));
        int int10 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex7.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3175");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        char[] charArray16 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        char[] charArray22 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        char char25 = refinedSoundex23.getMappingCode(' ');
        char char27 = refinedSoundex23.getMappingCode(' ');
        java.lang.String str29 = refinedSoundex23.soundex("");
        java.lang.String str31 = refinedSoundex23.encode("");
        int int34 = refinedSoundex23.difference("", "");
        java.lang.String str36 = refinedSoundex23.encode("");
        java.lang.String str38 = refinedSoundex23.encode("");
        java.lang.Object obj39 = refinedSoundex18.encode((java.lang.Object) str38);
        java.lang.String str41 = refinedSoundex18.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = refinedSoundex4.encode((java.lang.Object) refinedSoundex18);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3176");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int8 = soundex7.getMaxLength();
        soundex7.setMaxLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex7.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3177");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        char[] charArray15 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        java.lang.Class<?> wildcardClass18 = charArray15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex4.encode((java.lang.Object) wildcardClass18);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a,  , 4, 4]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3178");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
        java.lang.Class<?> wildcardClass14 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3179");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        java.lang.String str15 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3180");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex3.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3181");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex8.difference("", "hi!");
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
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3182");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        soundex6.setMaxLength((int) (short) 1);
        char[] charArray14 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str18 = soundex16.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex6.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3183");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = refinedSoundex5.difference("", "hi!");
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3184");
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
        char[] charArray31 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray31);
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray31);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex34 = new org.apache.commons.codec.language.RefinedSoundex(charArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = refinedSoundex4.encode((java.lang.Object) refinedSoundex34);
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3185");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = refinedSoundex7.difference("hi!", "hi!");
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
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3186");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str10 = soundex8.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3187");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex4.soundex("hi!");
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
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3188");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex3.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3189");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        char[] charArray17 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str22 = soundex20.encode("");
        java.lang.Object obj23 = soundex4.encode((java.lang.Object) str22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = soundex4.encode("hi!");
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3190");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        char char10 = refinedSoundex4.getMappingCode('4');
        java.lang.String str12 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3191");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) (short) 1);
        soundex4.setMaxLength((int) (short) 10);
        char[] charArray22 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        char char27 = refinedSoundex25.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex4.encode((java.lang.Object) 'a');
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + ' ' + "'", char27 == ' ');
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3192");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3193");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex3.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3194");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex4.encode((java.lang.Object) 100.0f);
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
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3195");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex4.difference("hi!", "");
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
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3196");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) ' ', (int) ' ', strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) strArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3197");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        soundex4.setMaxLength(1);
        char[] charArray18 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex4.encode((java.lang.Object) charArray18);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4]");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3198");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        char char19 = refinedSoundex4.getMappingCode('4');
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
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3199");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3200");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3201");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        int int11 = soundex4.getMaxLength();
        char[] charArray15 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        char char18 = refinedSoundex16.getMappingCode('#');
        int int21 = refinedSoundex16.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex4.encode((java.lang.Object) int21);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3202");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex3.encode("hi!");
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
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3203");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        java.lang.Class<?> wildcardClass12 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3204");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        char[] charArray9 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex4.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3205");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.encode("hi!");
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
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3206");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3207");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('#');
        char[] charArray14 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str17 = soundex15.encode("");
        java.lang.String str19 = soundex15.soundex("");
        java.lang.String str21 = soundex15.soundex("");
        soundex15.setMaxLength((-1));
        soundex15.setMaxLength((int) (short) 1);
        soundex15.setMaxLength((int) (short) 10);
        soundex15.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = refinedSoundex8.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3208");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        java.lang.Class<?> wildcardClass11 = soundex3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3209");
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
        char[] charArray40 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex41 = new org.apache.commons.codec.language.RefinedSoundex(charArray40);
        java.lang.String str43 = refinedSoundex41.soundex("");
        java.lang.String str45 = refinedSoundex41.soundex("");
        java.lang.String str47 = refinedSoundex41.soundex("");
        int int50 = refinedSoundex41.difference("", "");
        char char52 = refinedSoundex41.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = soundex6.encode((java.lang.Object) char52);
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
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\000' + "'", char52 == '\000');
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3210");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        int int10 = soundex4.getMaxLength();
        int int11 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3211");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "hi!", "");
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
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3212");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        java.lang.Class<?> wildcardClass18 = refinedSoundex4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3213");
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
        java.lang.String str22 = refinedSoundex5.encode("");
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
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3214");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        char[] charArray17 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str22 = soundex20.encode("");
        java.lang.Object obj23 = soundex4.encode((java.lang.Object) str22);
        char[] charArray26 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray26);
        org.apache.commons.codec.language.Soundex soundex28 = new org.apache.commons.codec.language.Soundex(charArray26);
        java.lang.String str30 = soundex28.soundex("");
        int int31 = soundex28.getMaxLength();
        java.lang.Class<?> wildcardClass32 = soundex28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex4.encode((java.lang.Object) soundex28);
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3215");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3216");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3217");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = soundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3218");
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
        // The following exception was thrown during execution in test generation
        try {
            int int23 = soundex4.difference("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3219");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "");
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
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3220");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        soundex4.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = soundex4.encode("hi!");
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
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3221");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3222");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        char char15 = refinedSoundex10.getMappingCode('a');
        java.lang.String str17 = refinedSoundex10.encode("");
        char char19 = refinedSoundex10.getMappingCode('a');
        int int22 = refinedSoundex10.difference("", "");
        java.lang.Class<?> wildcardClass23 = refinedSoundex10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex5.encode((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '4' + "'", char19 == '4');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3223");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "hi!");
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
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3224");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength((-1));
        soundex3.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex3.encode("hi!");
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3225");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3226");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "hi!", "");
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
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3227");
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
            java.lang.String str32 = refinedSoundex7.soundex("hi!");
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
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3228");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex4.encode(obj12);
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
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3229");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str9 = refinedSoundex7.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex7.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3230");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray10 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("");
        java.lang.String str15 = soundex11.soundex("");
        java.lang.String str17 = soundex11.soundex("");
        soundex11.setMaxLength((-1));
        soundex11.setMaxLength((int) (short) 1);
        soundex11.setMaxLength((int) (short) 10);
        soundex11.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex6.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3231");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        char char10 = refinedSoundex4.getMappingCode('4');
        java.lang.String str12 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3232");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex3.encode("hi!");
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
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3233");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3234");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = refinedSoundex4.difference("hi!", "hi!");
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
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3235");
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
        java.lang.String str30 = refinedSoundex7.encode("");
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = refinedSoundex7.encode(obj31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3236");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        int int27 = refinedSoundex24.difference("", "");
        java.lang.String str29 = refinedSoundex24.encode("");
        java.lang.String str31 = refinedSoundex24.encode("");
        char char33 = refinedSoundex24.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = refinedSoundex4.encode((java.lang.Object) refinedSoundex24);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3237");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode(' ');
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex4.encode(obj23);
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
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3238");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex8, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3239");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.Class<?> wildcardClass10 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3240");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
        char[] charArray17 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str20 = soundex18.encode("");
        java.lang.String str22 = soundex18.soundex("");
        java.lang.String str24 = soundex18.soundex("");
        soundex18.setMaxLength((-1));
        soundex18.setMaxLength((int) (short) 1);
        soundex18.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass31 = soundex18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = refinedSoundex4.encode((java.lang.Object) soundex18);
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3241");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode(' ');
        int int11 = refinedSoundex6.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3242");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str7 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3243");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        char[] charArray16 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex6.encode((java.lang.Object) charArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , #, a, a, #]");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3244");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex4.difference("hi!", "");
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
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3245");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        char char13 = refinedSoundex4.getMappingCode('#');
        char char15 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = refinedSoundex4.difference("hi!", "hi!");
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
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3246");
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
        char[] charArray40 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex41 = new org.apache.commons.codec.language.Soundex(charArray40);
        int int42 = soundex41.getMaxLength();
        java.lang.String str44 = soundex41.soundex("");
        char[] charArray48 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex49 = new org.apache.commons.codec.language.RefinedSoundex(charArray48);
        java.lang.String str51 = refinedSoundex49.soundex("");
        java.lang.String str53 = refinedSoundex49.encode("");
        char[] charArray57 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex58 = new org.apache.commons.codec.language.RefinedSoundex(charArray57);
        int int61 = refinedSoundex58.difference("", "");
        java.lang.Object obj62 = refinedSoundex49.encode((java.lang.Object) "");
        java.lang.Object obj63 = soundex41.encode((java.lang.Object) "");
        char[] charArray67 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex68 = new org.apache.commons.codec.language.RefinedSoundex(charArray67);
        java.lang.String str70 = refinedSoundex68.encode("");
        java.lang.Object obj71 = soundex41.encode((java.lang.Object) str70);
        int int72 = soundex41.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = refinedSoundex4.encode((java.lang.Object) soundex41);
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
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "" + "'", obj62, "");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "" + "'", obj63, "");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "" + "'", obj71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3247");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex10.encode("hi!");
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
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3248");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) -1);
        char[] charArray12 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("");
        java.lang.Class<?> wildcardClass16 = soundex13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex6.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3249");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        soundex4.setMaxLength(1);
        char[] charArray18 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray18);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray18);
        char char23 = refinedSoundex21.getMappingCode(' ');
        char char25 = refinedSoundex21.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex4.encode((java.lang.Object) char25);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + ' ' + "'", char25 == ' ');
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3250");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str6 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = refinedSoundex4.difference("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3251");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        java.lang.String str11 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3252");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex6.difference("", "hi!");
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
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3253");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3254");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("");
        int int14 = soundex11.getMaxLength();
        java.lang.Class<?> wildcardClass15 = soundex11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex3.encode((java.lang.Object) soundex11);
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
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3255");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.encode("");
        char[] charArray21 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        java.lang.String str24 = soundex22.encode("");
        java.lang.String str26 = soundex22.soundex("");
        java.lang.String str28 = soundex22.soundex("");
        soundex22.setMaxLength((-1));
        int int31 = soundex22.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = refinedSoundex4.encode((java.lang.Object) soundex22);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3256");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) 'a', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 100, 0, strArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = refinedSoundex4.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3257");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "");
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
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3258");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.encode("hi!");
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
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3259");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = refinedSoundex4.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3260");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = refinedSoundex7.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3261");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        java.lang.String str10 = soundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex6.encode("hi!");
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
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3262");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
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
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3263");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode('a');
        char char10 = refinedSoundex6.getMappingCode('4');
        java.lang.String str12 = refinedSoundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex6.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ' ' + "'", char8 == ' ');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3264");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
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
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3265");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        java.lang.String str9 = soundex3.encode("");
        char[] charArray12 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex3.encode((java.lang.Object) refinedSoundex15);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3266");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        java.lang.String str21 = refinedSoundex4.soundex("");
        char[] charArray25 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        int int29 = refinedSoundex26.difference("", "");
        char char31 = refinedSoundex26.getMappingCode('a');
        char char33 = refinedSoundex26.getMappingCode('4');
        java.lang.String str35 = refinedSoundex26.soundex("");
        java.lang.Object obj36 = refinedSoundex4.encode((java.lang.Object) "");
        char[] charArray40 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex41 = new org.apache.commons.codec.language.RefinedSoundex(charArray40);
        org.apache.commons.codec.language.Soundex soundex42 = new org.apache.commons.codec.language.Soundex(charArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = refinedSoundex4.encode((java.lang.Object) charArray40);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '4' + "'", char31 == '4');
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, a, #]");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3267");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex7.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3268");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        char char10 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3269");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = refinedSoundex8.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3270");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = refinedSoundex7.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3271");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        char[] charArray12 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex3.encode((java.lang.Object) charArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #, a, a, #]");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3272");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex8.difference("hi!", "hi!");
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3273");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex3.encode("hi!");
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
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3274");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        soundex5.setMaxLength((int) (short) 0);
        soundex5.setMaxLength((int) (short) 1);
        char[] charArray22 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str25 = soundex23.encode("");
        java.lang.String str27 = soundex23.soundex("");
        java.lang.String str29 = soundex23.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex5.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3275");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        java.lang.String str16 = soundex5.encode("");
        char[] charArray19 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray19);
        int int24 = soundex23.getMaxLength();
        int int25 = soundex23.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex5.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3276");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3277");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3278");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex4.difference("hi!", "hi!");
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
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3279");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        soundex5.setMaxLength((int) (short) 0);
        soundex5.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = soundex5.difference("", "hi!");
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
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3280");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        soundex4.setMaxLength((int) (short) -1);
        char[] charArray20 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        char[] charArray25 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        int int29 = refinedSoundex26.difference("", "");
        java.lang.String str31 = refinedSoundex26.encode("");
        java.lang.Object obj32 = soundex21.encode((java.lang.Object) "");
        java.lang.String str34 = soundex21.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex4.encode((java.lang.Object) soundex21);
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3281");
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
            int int21 = soundex4.difference("", "hi!");
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
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3282");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = refinedSoundex4.difference("hi!", "hi!");
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
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3283");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        char[] charArray13 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        char char18 = refinedSoundex16.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex3.encode((java.lang.Object) refinedSoundex16);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3284");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        java.lang.String str16 = soundex5.encode("");
        char[] charArray20 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str23 = soundex21.encode("");
        java.lang.String str25 = soundex21.soundex("");
        java.lang.String str27 = soundex21.soundex("");
        soundex21.setMaxLength((-1));
        soundex21.setMaxLength((int) (short) 1);
        soundex21.setMaxLength((int) (short) 10);
        java.lang.Class<?> wildcardClass34 = soundex21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex5.encode((java.lang.Object) wildcardClass34);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3285");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex5.setMaxLength(0);
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
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3286");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = refinedSoundex4.encode(obj11);
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
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3287");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode(' ');
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        java.lang.String str15 = refinedSoundex13.soundex("");
        java.lang.String str17 = refinedSoundex13.soundex("");
        char char19 = refinedSoundex13.getMappingCode(' ');
        char char21 = refinedSoundex13.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex6.encode((java.lang.Object) char21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '4' + "'", char21 == '4');
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3288");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex5.encode("hi!");
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
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3289");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = soundex3.difference("", "hi!");
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
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3290");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) "");
        char[] charArray18 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        java.lang.String str21 = soundex19.encode("");
        java.lang.String str23 = soundex19.soundex("");
        java.lang.String str25 = soundex19.soundex("");
        java.lang.Object obj26 = refinedSoundex4.encode((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3291");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char char11 = refinedSoundex4.getMappingCode('4');
        int int14 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3292");
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
            int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
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
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3293");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3294");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        char char13 = refinedSoundex11.getMappingCode(' ');
        char char15 = refinedSoundex11.getMappingCode(' ');
        java.lang.String str17 = refinedSoundex11.soundex("");
        java.lang.String str19 = refinedSoundex11.encode("");
        int int22 = refinedSoundex11.difference("", "");
        java.lang.String str24 = refinedSoundex11.soundex("");
        java.lang.Object obj25 = soundex6.encode((java.lang.Object) "");
        char[] charArray29 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex32 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = soundex6.encode((java.lang.Object) charArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, 4,  ]");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3295");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        char char18 = refinedSoundex13.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex8.encode((java.lang.Object) char18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3296");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3297");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3298");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray13 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex5.encode((java.lang.Object) refinedSoundex16);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a]");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3299");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.encode("");
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        int int16 = soundex15.getMaxLength();
        soundex15.setMaxLength((int) (short) 1);
        int int19 = soundex15.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex6.encode((java.lang.Object) soundex15);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3300");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) ' ');
        soundex3.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex3.soundex("hi!");
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
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3301");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex5.encode("hi!");
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
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3302");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3303");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = refinedSoundex4.encode("hi!");
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
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3304");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "hi!", "");
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
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3305");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        int int12 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = soundex4.encode("hi!");
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
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3306");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3307");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3308");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        int int12 = soundex4.getMaxLength();
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        int int20 = refinedSoundex17.difference("", "");
        char char22 = refinedSoundex17.getMappingCode('a');
        char char24 = refinedSoundex17.getMappingCode('4');
        java.lang.String str26 = refinedSoundex17.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex4.encode((java.lang.Object) refinedSoundex17);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3309");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = soundex5.difference("hi!", "hi!");
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
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3310");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode('a');
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        char char15 = refinedSoundex13.getMappingCode(' ');
        java.lang.String str17 = refinedSoundex13.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) refinedSoundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3311");
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
            java.lang.String str23 = soundex4.encode("hi!");
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
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3312");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ' ' + "'", char8 == ' ');
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3313");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str10 = refinedSoundex8.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3314");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3315");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex3.encode("hi!");
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
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3316");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        java.lang.String str7 = soundex3.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex3.soundex("hi!");
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
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3317");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex5.difference("", "");
        int int9 = soundex5.getMaxLength();
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex5.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3318");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = refinedSoundex4.difference("hi!", "hi!");
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
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3319");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex6.encode((java.lang.Object) (short) 0);
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
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3320");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        java.lang.String str10 = soundex5.soundex("");
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex5.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3321");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        java.lang.String str19 = refinedSoundex17.soundex("");
        java.lang.String str21 = refinedSoundex17.soundex("");
        java.lang.String str23 = refinedSoundex17.soundex("");
        int int26 = refinedSoundex17.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex5.encode((java.lang.Object) refinedSoundex17);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3322");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.soundex("");
        soundex5.setMaxLength((int) (short) 100);
        java.lang.String str11 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3323");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3324");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = soundex5.encode("hi!");
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
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3325");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char[] charArray11 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        int int14 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex4.encode((java.lang.Object) soundex13);
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
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3326");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3327");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3328");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3329");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = refinedSoundex4.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3330");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str17 = soundex15.encode("");
        java.lang.String str19 = soundex15.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex4.encode((java.lang.Object) soundex15);
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3331");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        int int16 = refinedSoundex4.difference("", "");
        char[] charArray22 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        char[] charArray28 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex29 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        char char31 = refinedSoundex29.getMappingCode(' ');
        char char33 = refinedSoundex29.getMappingCode(' ');
        java.lang.String str35 = refinedSoundex29.soundex("");
        java.lang.String str37 = refinedSoundex29.encode("");
        int int40 = refinedSoundex29.difference("", "");
        java.lang.String str42 = refinedSoundex29.encode("");
        java.lang.String str44 = refinedSoundex29.encode("");
        java.lang.Object obj45 = refinedSoundex24.encode((java.lang.Object) str44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = refinedSoundex4.encode((java.lang.Object) refinedSoundex24);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3332");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3333");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3334");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        char char8 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3335");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str8 = soundex6.encode("");
        soundex6.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3336");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        char char13 = refinedSoundex4.getMappingCode('#');
        java.lang.String str15 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3337");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('a');
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.encode("");
        soundex14.setMaxLength((int) (short) 0);
        java.lang.String str22 = soundex14.encode("");
        java.lang.String str24 = soundex14.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex8.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3338");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        java.lang.Class<?> wildcardClass17 = soundex4.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3339");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        int int8 = soundex3.difference("", "");
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
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3340");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3341");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        char char8 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
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
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3342");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex8.difference("", "hi!");
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
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3343");
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
            int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "hi!", "");
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
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3344");
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
        char[] charArray32 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray32);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex34 = new org.apache.commons.codec.language.RefinedSoundex(charArray32);
        org.apache.commons.codec.language.Soundex soundex35 = new org.apache.commons.codec.language.Soundex(charArray32);
        org.apache.commons.codec.language.Soundex soundex36 = new org.apache.commons.codec.language.Soundex(charArray32);
        java.lang.String str38 = soundex36.encode("");
        soundex36.setMaxLength((int) (short) 1);
        soundex36.setMaxLength(0);
        java.lang.String str44 = soundex36.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = refinedSoundex4.encode((java.lang.Object) soundex36);
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
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3345");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        char char13 = refinedSoundex4.getMappingCode('#');
        char[] charArray17 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex(charArray17);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) charArray17);
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
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4,  ]");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3346");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = refinedSoundex4.encode(obj16);
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
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3347");
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
        char[] charArray34 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex35 = new org.apache.commons.codec.language.RefinedSoundex(charArray34);
        int int38 = refinedSoundex35.difference("", "");
        char char40 = refinedSoundex35.getMappingCode('a');
        java.lang.String str42 = refinedSoundex35.encode("");
        char char44 = refinedSoundex35.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = refinedSoundex5.encode((java.lang.Object) refinedSoundex35);
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
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '4' + "'", char40 == '4');
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '4' + "'", char44 == '4');
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3348");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        char char19 = refinedSoundex4.getMappingCode('4');
        java.lang.Class<?> wildcardClass20 = refinedSoundex4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3349");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = refinedSoundex4.difference("hi!", "");
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3350");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex3.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3351");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        int int14 = refinedSoundex11.difference("", "");
        java.lang.String str16 = refinedSoundex11.encode("");
        java.lang.String str18 = refinedSoundex11.encode("");
        char char20 = refinedSoundex11.getMappingCode(' ');
        char char22 = refinedSoundex11.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex6.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3352");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int5 = soundex4.getMaxLength();
        int int6 = soundex4.getMaxLength();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3353");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode(' ');
        int int11 = refinedSoundex6.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex6.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3354");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        char[] charArray17 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str22 = soundex20.encode("");
        java.lang.Object obj23 = soundex4.encode((java.lang.Object) str22);
        int int24 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = soundex4.encode("hi!");
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3355");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        soundex15.setMaxLength(1);
        soundex15.setMaxLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex4.encode((java.lang.Object) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3356");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char char11 = refinedSoundex4.getMappingCode('4');
        int int14 = refinedSoundex4.difference("", "");
        char[] charArray17 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str20 = soundex18.encode("");
        java.lang.String str22 = soundex18.encode("");
        int int23 = soundex18.getMaxLength();
        java.lang.String str25 = soundex18.encode("");
        soundex18.setMaxLength((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = refinedSoundex4.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3357");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex6.encode((java.lang.Object) 100.0d);
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
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3358");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        soundex4.setMaxLength((int) (short) 1);
        soundex4.setMaxLength((int) (short) 10);
        soundex4.setMaxLength((int) (short) 1);
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
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3359");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = refinedSoundex4.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3360");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex10.encode("hi!");
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
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3361");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex5.setMaxLength((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3362");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        java.lang.String str9 = refinedSoundex5.soundex("");
        java.lang.String str11 = refinedSoundex5.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3363");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) "");
        char[] charArray18 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        java.lang.String str21 = soundex19.encode("");
        java.lang.String str23 = soundex19.soundex("");
        java.lang.String str25 = soundex19.soundex("");
        java.lang.Object obj26 = refinedSoundex4.encode((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3364");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = refinedSoundex5.difference("", "hi!");
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
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3365");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        char char19 = refinedSoundex4.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '4' + "'", char19 == '4');
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3366");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        java.lang.String str12 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "");
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
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3367");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.soundex("");
        java.lang.String str20 = soundex14.soundex("");
        java.lang.String str22 = soundex14.soundex("");
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        java.lang.String str29 = refinedSoundex27.encode("");
        char char31 = refinedSoundex27.getMappingCode('a');
        java.lang.String str33 = refinedSoundex27.soundex("");
        java.lang.Object obj34 = soundex14.encode((java.lang.Object) str33);
        java.lang.Object obj35 = refinedSoundex4.encode(obj34);
        char char37 = refinedSoundex4.getMappingCode(' ');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '4' + "'", char31 == '4');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "" + "'", obj35, "");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3368");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = soundex5.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3369");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        int int12 = refinedSoundex4.difference("", "");
        char[] charArray16 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        java.lang.String str19 = soundex17.encode("");
        java.lang.String str21 = soundex17.soundex("");
        int int24 = soundex17.difference("", "");
        java.lang.String str26 = soundex17.encode("");
        java.lang.String str28 = soundex17.encode("");
        char[] charArray31 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray31);
        java.lang.String str34 = soundex32.encode("");
        java.lang.String str36 = soundex32.encode("");
        java.lang.Object obj37 = soundex17.encode((java.lang.Object) "");
        char[] charArray41 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex42 = new org.apache.commons.codec.language.RefinedSoundex(charArray41);
        char char44 = refinedSoundex42.getMappingCode(' ');
        char char46 = refinedSoundex42.getMappingCode(' ');
        java.lang.String str48 = refinedSoundex42.soundex("");
        java.lang.String str50 = refinedSoundex42.encode("");
        java.lang.Object obj52 = refinedSoundex42.encode((java.lang.Object) "");
        char[] charArray56 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex57 = new org.apache.commons.codec.language.Soundex(charArray56);
        java.lang.String str59 = soundex57.encode("");
        java.lang.String str61 = soundex57.soundex("");
        java.lang.String str63 = soundex57.soundex("");
        java.lang.Object obj64 = refinedSoundex42.encode((java.lang.Object) str63);
        java.lang.Class<?> wildcardClass65 = obj64.getClass();
        java.lang.Object obj66 = soundex17.encode(obj64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = refinedSoundex4.encode((java.lang.Object) soundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "" + "'", obj37, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\000' + "'", char44 == '\000');
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\000' + "'", char46 == '\000');
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "" + "'", obj64, "");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "" + "'", obj66, "");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3370");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3371");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3372");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3373");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        char[] charArray11 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("");
        java.lang.String str16 = soundex12.soundex("");
        int int19 = soundex12.difference("", "");
        java.lang.String str21 = soundex12.encode("");
        int int22 = soundex12.getMaxLength();
        int int23 = soundex12.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex7.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3374");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = refinedSoundex4.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3375");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.Class<?> wildcardClass9 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3376");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) -1);
        soundex6.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex6.difference("", "hi!");
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
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3377");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String str9 = soundex6.soundex("");
        soundex6.setMaxLength(0);
        soundex6.setMaxLength((int) ' ');
        char[] charArray19 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        char char23 = refinedSoundex21.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex6.encode((java.lang.Object) refinedSoundex21);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3378");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 10, (int) (short) 10, strArray15);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) 'a', (int) '4', strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex6.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3379");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        java.lang.String str8 = soundex3.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        char char19 = refinedSoundex17.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex3.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3380");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        soundex4.setMaxLength((int) (byte) 10);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex4.encode(obj19);
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
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3381");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3382");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = refinedSoundex5.difference("", "hi!");
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
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3383");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) "");
        char[] charArray18 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        java.lang.String str21 = soundex19.encode("");
        java.lang.String str23 = soundex19.soundex("");
        java.lang.String str25 = soundex19.soundex("");
        java.lang.Object obj26 = refinedSoundex4.encode((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = refinedSoundex4.difference("hi!", "");
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3384");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int8 = soundex5.difference("", "");
        int int9 = soundex5.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3385");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        java.lang.String str10 = soundex3.soundex("");
        java.lang.String str12 = soundex3.encode("");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3386");
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
            int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3387");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) ' ');
        soundex3.setMaxLength((int) '#');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        soundex3.setMaxLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3388");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        soundex4.setMaxLength((int) (short) -1);
        soundex4.setMaxLength((int) (byte) -1);
        java.lang.String str20 = soundex4.encode("");
        int int21 = soundex4.getMaxLength();
        soundex4.setMaxLength((int) ' ');
        int int26 = soundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = soundex4.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3389");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.encode("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 100, 0, strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '4', 1, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 10, (-1), strArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = soundex4.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3390");
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
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3391");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3392");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        int int12 = soundex5.difference("", "");
        int int13 = soundex5.getMaxLength();
        char[] charArray19 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex22 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex5.encode((java.lang.Object) charArray19);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , #, a, a, #]");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3393");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        java.lang.String str13 = refinedSoundex11.soundex("");
        java.lang.String str15 = refinedSoundex11.soundex("");
        java.lang.String str17 = refinedSoundex11.soundex("");
        int int20 = refinedSoundex11.difference("", "");
        char char22 = refinedSoundex11.getMappingCode('#');
        java.lang.String str24 = refinedSoundex11.encode("");
        char[] charArray28 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex29 = new org.apache.commons.codec.language.Soundex(charArray28);
        char[] charArray33 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex34 = new org.apache.commons.codec.language.RefinedSoundex(charArray33);
        int int37 = refinedSoundex34.difference("", "");
        java.lang.String str39 = refinedSoundex34.encode("");
        java.lang.Object obj40 = soundex29.encode((java.lang.Object) "");
        java.lang.Object obj41 = refinedSoundex11.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = refinedSoundex6.encode((java.lang.Object) refinedSoundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3394");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
        char[] charArray22 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) refinedSoundex24);
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4]");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3395");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex3.encode(obj14);
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
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3396");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        int int10 = refinedSoundex5.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex5.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3397");
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
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
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3398");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = refinedSoundex4.difference("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3399");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        soundex5.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex5.difference("hi!", "");
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
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3400");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char11 = refinedSoundex9.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex9.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3401");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.soundex("");
        java.lang.Class<?> wildcardClass8 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3402");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3403");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength(1);
        int int9 = soundex6.getMaxLength();
        soundex6.setMaxLength((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex6.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3404");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex9.difference("hi!", "");
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
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3405");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3406");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        java.lang.Object obj14 = refinedSoundex4.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3407");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "", "");
        char char10 = refinedSoundex5.getMappingCode('a');
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.encode("");
        java.lang.String str20 = soundex14.encode("");
        java.lang.String str22 = soundex14.soundex("");
        java.lang.Object obj23 = refinedSoundex5.encode((java.lang.Object) "");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3408");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        java.lang.String str13 = refinedSoundex4.encode("");
        java.lang.String str15 = refinedSoundex4.soundex("");
        char char17 = refinedSoundex4.getMappingCode(' ');
        int int20 = refinedSoundex4.difference("", "");
        char char22 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3409");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        int int13 = soundex4.getMaxLength();
        java.lang.String str15 = soundex4.encode("");
        char[] charArray19 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex4.encode((java.lang.Object) charArray19);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, 4,  ]");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3410");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.Class<?> wildcardClass15 = charArray11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex4.encode((java.lang.Object) charArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3411");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        char[] charArray13 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        char char18 = refinedSoundex16.getMappingCode(' ');
        int int21 = refinedSoundex16.difference("", "");
        char char23 = refinedSoundex16.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex4.encode((java.lang.Object) '#');
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3412");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        int int8 = soundex3.getMaxLength();
        soundex3.setMaxLength((int) 'a');
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = soundex3.encode(obj11);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3413");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        java.lang.String str21 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3414");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
        char char13 = refinedSoundex4.getMappingCode('#');
        java.lang.String str15 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3415");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        char char15 = refinedSoundex10.getMappingCode('a');
        char char17 = refinedSoundex10.getMappingCode('4');
        java.lang.String str19 = refinedSoundex10.soundex("");
        java.lang.Object obj20 = soundex5.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3416");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex4.encode("hi!");
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
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3417");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.soundex("");
        char[] charArray21 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray21);
        java.lang.String str24 = soundex22.encode("");
        java.lang.String str26 = soundex22.soundex("");
        java.lang.String str28 = soundex22.soundex("");
        soundex22.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = refinedSoundex4.encode((java.lang.Object) soundex22);
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
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3418");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex4.encode((java.lang.Object) (short) 0);
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
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3419");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        char char11 = refinedSoundex4.getMappingCode('4');
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3420");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        int int11 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = refinedSoundex4.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3421");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        int int20 = refinedSoundex4.difference("", "");
        char[] charArray23 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex26 = new org.apache.commons.codec.language.Soundex(charArray23);
        java.lang.String str28 = soundex26.soundex("");
        soundex26.setMaxLength((int) (short) 100);
        soundex26.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = refinedSoundex4.encode((java.lang.Object) soundex26);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3422");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        char char14 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = refinedSoundex4.difference("hi!", "");
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
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3423");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char12 = refinedSoundex10.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex10.difference("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3424");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char11 = refinedSoundex9.getMappingCode('#');
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
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3425");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str7 = refinedSoundex5.soundex("");
        char char9 = refinedSoundex5.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3426");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex9.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3427");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex8.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = refinedSoundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3428");
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
            int int14 = soundex5.difference("hi!", "hi!");
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
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3429");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        int int7 = soundex6.getMaxLength();
        int int8 = soundex6.getMaxLength();
        int int11 = soundex6.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex6.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3430");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char8 = refinedSoundex6.getMappingCode('a');
        char char10 = refinedSoundex6.getMappingCode('4');
        java.lang.String str12 = refinedSoundex6.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ' ' + "'", char8 == ' ');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3431");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3432");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3433");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        int int6 = soundex3.getMaxLength();
        int int7 = soundex3.getMaxLength();
        java.lang.String str9 = soundex3.encode("");
        char[] charArray15 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex3.encode((java.lang.Object) refinedSoundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , #, a, a, #]");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3434");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        char char12 = refinedSoundex4.getMappingCode(' ');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        char char17 = refinedSoundex4.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3435");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char char10 = refinedSoundex4.getMappingCode(' ');
        int int13 = refinedSoundex4.difference("", "");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3436");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex6.soundex("hi!");
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
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3437");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = refinedSoundex8.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3438");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char char7 = refinedSoundex5.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3439");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        int int8 = refinedSoundex5.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex5, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3440");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char[] charArray13 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex4.encode((java.lang.Object) refinedSoundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3441");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = refinedSoundex4.soundex("hi!");
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
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3442");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        char[] charArray12 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("");
        java.lang.String str17 = soundex13.soundex("");
        int int18 = soundex13.getMaxLength();
        int int19 = soundex13.getMaxLength();
        int int20 = soundex13.getMaxLength();
        int int21 = soundex13.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex8.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3443");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        char[] charArray9 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        int int13 = refinedSoundex10.difference("", "");
        java.lang.Object obj14 = soundex5.encode((java.lang.Object) "");
        soundex5.setMaxLength((int) (short) 0);
        soundex5.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "hi!", "hi!");
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
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3444");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3445");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        char[] charArray23 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray23);
        int int26 = soundex25.getMaxLength();
        soundex25.setMaxLength((int) (short) 1);
        int int29 = soundex25.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = refinedSoundex4.encode((java.lang.Object) soundex25);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3446");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        int int8 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex4.difference("", "hi!");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3447");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        int int6 = soundex5.getMaxLength();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex5, "", "");
        java.lang.Class<?> wildcardClass10 = soundex5.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3448");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        int int8 = soundex5.getMaxLength();
        java.lang.String str10 = soundex5.soundex("");
        int int11 = soundex5.getMaxLength();
        char[] charArray14 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        soundex15.setMaxLength(1);
        soundex15.setMaxLength(100);
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex15, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = soundex5.encode((java.lang.Object) int22);
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3449");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('#');
        int int12 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = refinedSoundex4.difference("", "hi!");
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
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3450");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        char char14 = refinedSoundex4.getMappingCode(' ');
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
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3451");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        char[] charArray10 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex3.encode((java.lang.Object) wildcardClass16);
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
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3452");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        java.lang.String str15 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3453");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        java.lang.String str9 = soundex3.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3454");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        char char19 = refinedSoundex4.getMappingCode('4');
        char[] charArray23 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex24 = new org.apache.commons.codec.language.Soundex(charArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) soundex24);
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
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, 4,  ]");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3455");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        soundex3.setMaxLength((int) (short) 0);
        java.lang.String str11 = soundex3.encode("");
        java.lang.String str13 = soundex3.encode("");
        char[] charArray16 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex3.encode((java.lang.Object) charArray16);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4]");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3456");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        java.lang.String str13 = soundex4.encode("");
        soundex4.setMaxLength(1);
        char[] charArray18 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        soundex19.setMaxLength((-1));
        soundex19.setMaxLength((-1));
        int int24 = soundex19.getMaxLength();
        int int25 = soundex19.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = soundex4.encode((java.lang.Object) soundex19);
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3457");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.soundex("");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3458");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        char[] charArray11 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex3.encode((java.lang.Object) soundex14);
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
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4,  ]");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3459");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        int int12 = refinedSoundex4.difference("", "");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3460");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str5 = soundex3.encode("");
        java.lang.String str7 = soundex3.encode("");
        java.lang.String str9 = soundex3.encode("");
        char[] charArray15 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex3.encode((java.lang.Object) charArray15);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  ,  , 4,  ]");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3461");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) -1);
        soundex6.setMaxLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "hi!", "hi!");
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
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3462");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('a');
        java.lang.String str12 = refinedSoundex8.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = refinedSoundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3463");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        char[] charArray17 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray17);
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str22 = soundex20.encode("");
        int int23 = soundex20.getMaxLength();
        java.lang.String str25 = soundex20.soundex("");
        char[] charArray29 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex30 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        java.lang.String str32 = refinedSoundex30.soundex("");
        java.lang.String str34 = refinedSoundex30.encode("");
        char[] charArray38 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex39 = new org.apache.commons.codec.language.RefinedSoundex(charArray38);
        int int42 = refinedSoundex39.difference("", "");
        java.lang.Object obj43 = refinedSoundex30.encode((java.lang.Object) "");
        java.lang.String str45 = refinedSoundex30.soundex("");
        java.lang.String str47 = refinedSoundex30.soundex("");
        java.lang.Object obj48 = soundex20.encode((java.lang.Object) str47);
        soundex20.setMaxLength(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = soundex4.encode((java.lang.Object) soundex20);
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "" + "'", obj48, "");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3464");
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
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3465");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int6 = soundex5.getMaxLength();
        soundex5.setMaxLength((int) (short) 1);
        java.lang.String str10 = soundex5.soundex("");
        java.lang.String str12 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3466");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '4', strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 100, (int) (short) -1, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = refinedSoundex4.encode((java.lang.Object) boolean21);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3467");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        int int7 = soundex4.getMaxLength();
        java.lang.String str9 = soundex4.soundex("");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.soundex("");
        int int21 = soundex14.difference("", "");
        java.lang.String str23 = soundex14.encode("");
        java.lang.String str25 = soundex14.encode("");
        java.lang.Object obj26 = soundex4.encode((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = soundex4.soundex("hi!");
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3468");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
        java.lang.Class<?> wildcardClass20 = refinedSoundex4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3469");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
        java.lang.String str9 = soundex5.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex5.encode("hi!");
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
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3470");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        char[] charArray8 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        int int12 = refinedSoundex9.difference("", "");
        java.lang.String str14 = refinedSoundex9.encode("");
        java.lang.Object obj15 = soundex4.encode((java.lang.Object) "");
        java.lang.String str17 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = soundex4.soundex("hi!");
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
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3471");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int8 = soundex3.getMaxLength();
        java.lang.String str10 = soundex3.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex3.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3472");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3473");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode('#');
        java.lang.String str8 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex4.encode("hi!");
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
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3474");
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
        int int38 = soundex6.getMaxLength();
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex6.encode(obj39);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3475");
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
        java.lang.String str30 = refinedSoundex7.encode("");
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
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3476");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        java.lang.String str6 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3477");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.encode("");
        java.lang.String str12 = soundex4.soundex("");
        soundex4.setMaxLength((int) '#');
        java.lang.String str16 = soundex4.encode("");
        char[] charArray19 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex20 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray19);
        org.apache.commons.codec.language.Soundex soundex22 = new org.apache.commons.codec.language.Soundex(charArray19);
        char[] charArray26 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex(charArray26);
        int int30 = refinedSoundex27.difference("", "");
        java.lang.Object obj31 = soundex22.encode((java.lang.Object) "");
        soundex22.setMaxLength((int) (short) 0);
        soundex22.setMaxLength((int) (short) 1);
        java.lang.Class<?> wildcardClass36 = soundex22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = soundex4.encode((java.lang.Object) wildcardClass36);
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3478");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        soundex5.setMaxLength((int) '4');
        java.lang.String str9 = soundex5.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3479");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray3);
        int int8 = soundex7.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3480");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str9 = refinedSoundex7.encode("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3481");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = refinedSoundex8.soundex("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3482");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = soundex5.difference("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, 4,  ]");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3483");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "");
        java.lang.String str11 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex4.encode((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
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
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3484");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex7, "", "");
        soundex7.setMaxLength(0);
        int int15 = soundex7.getMaxLength();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3485");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.encode("");
        char char12 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3486");
        char[] charArray3 = new char[] { '4', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char7 = refinedSoundex5.getMappingCode('a');
        java.lang.String str9 = refinedSoundex5.encode("");
        char[] charArray12 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str18 = soundex16.encode("");
        java.lang.String str20 = soundex16.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = refinedSoundex5.encode((java.lang.Object) soundex16);
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3487");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode(' ');
        char[] charArray16 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        int int22 = refinedSoundex19.difference("", "");
        java.lang.String str24 = refinedSoundex19.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex4.encode((java.lang.Object) refinedSoundex19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3488");
        char[] charArray5 = new char[] { '#', 'a', ' ', '4', '4' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str9 = soundex7.encode("");
        int int12 = soundex7.difference("", "");
        java.lang.String str14 = soundex7.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a,  , 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3489");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4, a]");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3490");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.encode("");
        char char8 = refinedSoundex4.getMappingCode('a');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3491");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.encode("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        int int16 = refinedSoundex13.difference("", "");
        java.lang.Object obj17 = refinedSoundex4.encode((java.lang.Object) "");
        java.lang.String str19 = refinedSoundex4.soundex("");
        java.lang.Class<?> wildcardClass20 = refinedSoundex4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3492");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = refinedSoundex4.difference("hi!", "");
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
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3493");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        int int10 = soundex4.getMaxLength();
        int int11 = soundex4.getMaxLength();
        int int12 = soundex4.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3494");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.soundex("");
        soundex5.setMaxLength((int) (short) 100);
        java.lang.String str11 = soundex5.encode("");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex5.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3495");
        char[] charArray5 = new char[] { ' ', ' ', ' ', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        char char10 = refinedSoundex8.getMappingCode('a');
        java.lang.String str12 = refinedSoundex8.encode("");
        java.lang.String str14 = refinedSoundex8.soundex("");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "   4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3496");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        soundex3.setMaxLength(1);
        soundex3.setMaxLength(100);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex3.encode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3497");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
        java.lang.String str11 = refinedSoundex4.encode("");
        char char13 = refinedSoundex4.getMappingCode('a');
        int int16 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = refinedSoundex4.soundex("hi!");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3498");
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
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex4.encode(obj24);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3499");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        java.lang.String str10 = refinedSoundex4.soundex("");
        int int13 = refinedSoundex4.difference("", "");
        char char15 = refinedSoundex4.getMappingCode('#');
        java.lang.String str17 = refinedSoundex4.soundex("");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3500");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        java.lang.String str9 = refinedSoundex7.soundex("");
        java.lang.Class<?> wildcardClass10 = refinedSoundex7.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

