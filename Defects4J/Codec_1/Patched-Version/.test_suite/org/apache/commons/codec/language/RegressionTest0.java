package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException("");
        encoderException5.addSuppressed((java.lang.Throwable) encoderException7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = refinedSoundex0.encode((java.lang.Object) encoderException5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = doubleMetaphone0.encode((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "H000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = metaphone0.encode((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        char[] charArray4 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = soundex1.encode((java.lang.Object) charArray4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = metaphone0.encode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTION" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("H0", "org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!", "");
        doubleMetaphone10.maxCodeLen = '4';
        java.lang.String str17 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean24 = doubleMetaphone10.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone10.setMaxCodeLen(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = metaphone0.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        char[] charArray8 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = metaphone0.encode((java.lang.Object) soundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex();
        char char8 = refinedSoundex6.getMappingCode('a');
        char char10 = refinedSoundex6.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex1.encode((java.lang.Object) refinedSoundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("1111111111", "01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("O094010303080830603083060905301608", "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex();
        char char22 = refinedSoundex20.getMappingCode('a');
        java.lang.String str24 = refinedSoundex20.soundex("org.apache.commons.codec.EncoderException: ");
        char char26 = refinedSoundex20.getMappingCode('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) char26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '0' + "'", char22 == '0');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O094010303080830603083060905301608" + "'", str24, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKP", "AA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = refinedSoundex0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "H0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARKPXKMNSKTSNKTRKSPXN" + "'", str1, "ARKPXKMNSKTSNKTRKSPXN");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = doubleMetaphone0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone5.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone5.maxCodeLen = 100;
        doubleMetaphone5.setMaxCodeLen((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = metaphone0.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str8 = doubleMetaphone5.doubleMetaphone("", false);
        int int9 = doubleMetaphone5.maxCodeLen;
        doubleMetaphone5.setMaxCodeLen(0);
        int int12 = doubleMetaphone5.maxCodeLen;
        int int13 = doubleMetaphone5.maxCodeLen;
        java.lang.String str15 = doubleMetaphone5.doubleMetaphone("O000");
        int int16 = doubleMetaphone5.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = refinedSoundex0.encode((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone7.doubleMetaphone("", false);
        boolean boolean13 = doubleMetaphone7.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex6.encode((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: H");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.EncoderException encoderException7 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("");
        encoderException9.addSuppressed((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray13 = encoderException9.getSuppressed();
        encoderException7.addSuppressed((java.lang.Throwable) encoderException9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode((java.lang.Object) encoderException9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = refinedSoundex0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        encoderException6.addSuppressed((java.lang.Throwable) encoderException8);
        java.lang.Throwable[] throwableArray10 = encoderException6.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = caverphone0.encode((java.lang.Object) throwableArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex();
        char char16 = refinedSoundex14.getMappingCode('a');
        java.lang.String str18 = refinedSoundex14.soundex("H000");
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "ORKP", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '0' + "'", char16 == '0');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H0" + "'", str18, "H0");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        org.apache.commons.codec.EncoderException encoderException5 = new org.apache.commons.codec.EncoderException("01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = refinedSoundex0.encode((java.lang.Object) encoderException5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone18, "hi!", "");
        doubleMetaphone18.maxCodeLen = '4';
        java.lang.String str25 = doubleMetaphone18.doubleMetaphone("");
        int int26 = doubleMetaphone18.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) int26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("");
        encoderException9.addSuppressed((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray13 = encoderException9.getSuppressed();
        java.lang.Class<?> wildcardClass14 = throwableArray13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode((java.lang.Object) throwableArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        char char16 = doubleMetaphone0.charAt("H0", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("", false);
        int int14 = doubleMetaphone10.maxCodeLen;
        int int15 = doubleMetaphone10.maxCodeLen;
        boolean boolean18 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj19 = doubleMetaphone9.encode((java.lang.Object) "HI");
        java.lang.String str21 = doubleMetaphone9.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        org.apache.commons.codec.language.Metaphone metaphone4 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str6 = metaphone4.metaphone("H0");
        boolean boolean9 = metaphone4.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = metaphone4.encode("hi!");
        boolean boolean14 = metaphone4.isMetaphoneEqual("H0", "HI");
        int int15 = metaphone4.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex1.encode((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        doubleMetaphone11.setMaxCodeLen(0);
        java.lang.String str20 = doubleMetaphone11.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone21.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone21.maxCodeLen = 100;
        java.lang.String str27 = doubleMetaphone21.encode("HI");
        java.lang.String str29 = doubleMetaphone21.encode("O094010303080830603083060905301608");
        java.lang.Object obj30 = doubleMetaphone11.encode((java.lang.Object) "O094010303080830603083060905301608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.Class<?> wildcardClass14 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        char char7 = refinedSoundex5.getMappingCode('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex5.encode("HI");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex15, "", "hi!");
        java.lang.Object obj20 = refinedSoundex15.encode((java.lang.Object) "hi!");
        int int23 = refinedSoundex15.difference("org.apache.commons.codec.EncoderException: ", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = metaphone0.encode((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H0" + "'", obj20, "H0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A111111111", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.encode("O941");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O000" + "'", str9, "O000");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str6 = doubleMetaphone3.doubleMetaphone("", false);
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str11 = doubleMetaphone3.encode("hi!");
        java.lang.String str13 = doubleMetaphone3.doubleMetaphone("H000");
        doubleMetaphone3.maxCodeLen = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex0.encode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = caverphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = doubleMetaphone0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '4');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        int int13 = refinedSoundex0.difference("hi!", "AKP1111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKP", "AKP");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.getMaxCodeLen();
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj8 = caverphone6.encode((java.lang.Object) "HI");
        java.lang.String str10 = caverphone6.caverphone("org.apache.commons.codec.EncoderException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) caverphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AA11111111" + "'", obj8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        char[] charArray7 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = metaphone0.encode((java.lang.Object) soundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("");
        encoderException8.addSuppressed((java.lang.Throwable) encoderException10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) encoderException10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        doubleMetaphone14.maxCodeLen = '4';
        java.lang.String str21 = doubleMetaphone14.doubleMetaphone("");
        int int22 = doubleMetaphone14.getMaxCodeLen();
        java.lang.String str24 = doubleMetaphone14.doubleMetaphone("hi!");
        java.lang.Object obj26 = doubleMetaphone14.encode((java.lang.Object) "HI");
        boolean boolean29 = doubleMetaphone14.isDoubleMetaphoneEqual("HI", "H0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = doubleMetaphone0.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("01230120022455012623010202");
        boolean boolean23 = caverphone18.isCaverphoneEqual("ARKP", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("1111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ARKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARKP" + "'", str1, "ARKP");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendAlternate("ORKP");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone24, "hi!", "");
        char char30 = doubleMetaphone24.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str33 = doubleMetaphone24.doubleMetaphone("1111111111", true);
        boolean boolean36 = doubleMetaphone24.isDoubleMetaphoneEqual("1111111111", "H000");
        int int37 = doubleMetaphone24.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = soundex1.encode((java.lang.Object) doubleMetaphone24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '0' + "'", char30 == '0');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        char[] charArray1 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray1);
        java.lang.String str4 = refinedSoundex2.soundex("a1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metaphone0.encode((java.lang.Object) refinedSoundex2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0" + "'", str4, "A0");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ORKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORKP" + "'", str1, "ORKP");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O941");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A931");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) "AKPK");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone9.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.doubleMetaphone("A0313836");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        char char10 = refinedSoundex8.getMappingCode('a');
        java.lang.String str12 = refinedSoundex8.soundex("H000");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex8, "ORKP", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex0.encode((java.lang.Object) refinedSoundex8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '0' + "'", char10 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H0" + "'", str12, "H0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex0.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AKP1111111", "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex8.difference("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "O941");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int12 = doubleMetaphone8.getMaxCodeLen();
        int int13 = doubleMetaphone8.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex0.encode((java.lang.Object) charArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("HI");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("AKPKKMNSKT");
        java.lang.Throwable[] throwableArray14 = encoderException13.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode((java.lang.Object) throwableArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI3", "A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        java.lang.Class<?> wildcardClass8 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("O094010303080830603083060905301608", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str9 = soundex0.encode("AKPK");
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex0.encode((java.lang.Object) charArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A212" + "'", str9, "A212");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "AKP", false);
        org.apache.commons.codec.language.SoundexUtils soundexUtils8 = new org.apache.commons.codec.language.SoundexUtils();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = doubleMetaphone0.encode((java.lang.Object) soundexUtils8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        java.lang.Object obj13 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = caverphone0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKP", "org.apache.commons.codec.EncoderException: 01230120022455012623010202", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        int int18 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "AKP1111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone5, "hi!", "");
        char char11 = doubleMetaphone5.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str14 = doubleMetaphone5.doubleMetaphone("1111111111", true);
        boolean boolean17 = doubleMetaphone5.isDoubleMetaphoneEqual("1111111111", "H000");
        char char20 = doubleMetaphone5.charAt("H0", 2);
        int int21 = doubleMetaphone5.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A031");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "AA11111111", "ARKP");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = caverphone0.encode((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        char char9 = refinedSoundex3.getMappingCode('\000');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.metaphone("H0");
        boolean boolean8 = metaphone3.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = metaphone3.metaphone("");
        java.lang.String str12 = metaphone3.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "ARKPXKMNSKTSNKTRKSPXN");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A931", "A03138363");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = '3';
        java.lang.String str17 = doubleMetaphone0.encode("HI");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int15 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        java.lang.String str12 = doubleMetaphone0.encode("");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        char char20 = doubleMetaphone14.charAt("O094010303080830603083060905301608", (int) ' ');
        int int21 = doubleMetaphone14.maxCodeLen;
        boolean boolean25 = doubleMetaphone14.isDoubleMetaphoneEqual("H0", "1111111111", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '0' + "'", char20 == '0');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.soundex("AKP");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "A111111111");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex();
        char char6 = refinedSoundex4.getMappingCode('a');
        char char8 = refinedSoundex4.getMappingCode('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = caverphone0.encode((java.lang.Object) char8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ", "");
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray9);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) refinedSoundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("O000", "AA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "AKPKMNSKTS", "hi!");
        char[] charArray13 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        int int15 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex0.encode((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("");
        encoderException8.addSuppressed((java.lang.Throwable) encoderException10);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) encoderException15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: AKPKMNSKTS", "A031");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A212", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!", "");
        doubleMetaphone10.maxCodeLen = '4';
        java.lang.String str17 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean24 = doubleMetaphone10.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone10.setMaxCodeLen(0);
        char char29 = doubleMetaphone10.charAt("O", (int) (byte) -1);
        java.lang.String str31 = doubleMetaphone10.encode("HI3");
        doubleMetaphone10.maxCodeLen = '4';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKP" + "'", str1, "AKP");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        java.lang.String str13 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone7.doubleMetaphone("", false);
        doubleMetaphone7.maxCodeLen = 4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = caverphone0.encode((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        char char8 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        char[] charArray1 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray1);
        soundex2.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metaphone0.encode((java.lang.Object) soundex2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone10.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone10.maxCodeLen = 100;
        java.lang.String str16 = doubleMetaphone10.encode("HI");
        java.lang.String str18 = doubleMetaphone10.encode("O094010303080830603083060905301608");
        int int19 = doubleMetaphone10.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = metaphone0.encode((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex5 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str7 = soundex5.soundex("H");
        java.lang.String str9 = soundex5.soundex("H");
        java.lang.String str11 = soundex5.encode("O094010303080830603083060905301608");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "O094010303080830603083060905301608");
        java.lang.String str14 = caverphone0.caverphone("HIA212");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertNotNull(soundex5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A111111111" + "'", obj12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        java.lang.Class<?> wildcardClass8 = refinedSoundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AKPK", "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("A0", "ARKPXKMNSKTSNKTRKSPXN");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.Soundex soundex18 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str20 = soundex18.soundex("H");
        java.lang.String str22 = soundex18.soundex("H");
        int int23 = soundex18.getMaxLength();
        soundex18.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(soundex18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        int int8 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKP", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = refinedSoundex5.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "A000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = refinedSoundex7.encode("ARKPKSKMNSKTSNKTRKSPKSN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.metaphone("AKPKMNSKTS");
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        soundex14.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = metaphone0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPK" + "'", str12, "AKPK");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("O0", "");
        int int23 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Metaphone metaphone24 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str26 = metaphone24.metaphone("H0");
        boolean boolean29 = metaphone24.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str31 = metaphone24.metaphone("");
        java.lang.String str33 = metaphone24.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int34 = metaphone24.getMaxCodeLen();
        metaphone24.setMaxCodeLen((int) 'K');
        java.lang.String str38 = metaphone24.encode("ARKPXKMNSKTSNKTRKSPXN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = soundex1.encode((java.lang.Object) metaphone24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ARKP" + "'", str33, "ARKP");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str38, "ARKPKSKMNSKTSNKTRKSPKSN");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.caverphone("H000");
        boolean boolean9 = caverphone0.isCaverphoneEqual("O0931", "H000");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.Class<?> wildcardClass6 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "O094010303080830603083060905301608094010303080830603083060905301608", "AR");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str19 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Class<?> wildcardClass20 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        int int5 = soundex0.difference("org.apache.commons.codec.EncoderException: hi!", "H0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("");
        char char18 = refinedSoundex0.getMappingCode('K');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '3' + "'", char18 == '3');
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        char[] charArray12 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("HI");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "01230120022455012623010202", "HI");
        soundex13.setMaxLength(10);
        int int23 = soundex13.difference("ARKP", "01230120022455012623010202");
        java.lang.String str25 = soundex13.soundex("AA11111111");
        java.lang.String str27 = soundex13.soundex("ARKP");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = refinedSoundex0.encode((java.lang.Object) soundex13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A000" + "'", str25, "A000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A931" + "'", str27, "A931");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex();
        int int14 = refinedSoundex11.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str16 = refinedSoundex11.encode("hi!");
        char[] charArray17 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str20 = soundex18.encode("HI");
        java.lang.Object obj21 = refinedSoundex11.encode((java.lang.Object) str20);
        java.lang.Object obj22 = refinedSoundex0.encode(obj21);
        int int25 = refinedSoundex0.difference("a1", "");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H0" + "'", str16, "H0");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H0" + "'", obj21, "H0");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H0" + "'", obj22, "H0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI3", "O0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("a1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.soundex("O094010303080830603083060905301608");
        int int29 = soundex1.difference("AKPKMNSKTS", "org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O000" + "'", str26, "O000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 100;
        java.lang.String str6 = doubleMetaphone0.encode("HI");
        java.lang.String str8 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        org.apache.commons.codec.language.Metaphone metaphone9 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str11 = metaphone9.metaphone("H0");
        boolean boolean14 = metaphone9.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = metaphone9.encode("hi!");
        metaphone9.setMaxCodeLen(100);
        int int19 = metaphone9.getMaxCodeLen();
        boolean boolean22 = metaphone9.isMetaphoneEqual("AKP1111111", "01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        char[] charArray0 = null;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = refinedSoundex1.encode("A031");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "HI3", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("HI3", "A0931");
        java.lang.Class<?> wildcardClass19 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "1111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str28 = soundex1.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "O941" + "'", str28, "O941");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("HI");
        soundex11.setMaxLength(10);
        soundex11.setMaxLength((int) ' ');
        soundex11.setMaxLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("A000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.Soundex soundex14 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str16 = soundex14.soundex("H");
        java.lang.String str18 = soundex14.soundex("H");
        int int21 = soundex14.difference("AKPKKMNSKT", "H000");
        int int22 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertNotNull(soundex14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("a1", false);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("A03138363", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) '1');
        char[] charArray5 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.encode("HI");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex6, "01230120022455012623010202", "HI");
        soundex6.setMaxLength((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex2.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.encode("");
        java.lang.String str9 = refinedSoundex0.encode("01230120022455012623010202");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("HI", "hi!");
        java.lang.String str8 = refinedSoundex0.encode("O000");
        char[] charArray9 = new char[] {};
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray9);
        char char12 = refinedSoundex10.getMappingCode('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex0.encode((java.lang.Object) char12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.Object obj10 = caverphone0.encode((java.lang.Object) "AKPKMNSKTS");
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = caverphone0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "AKPKMNSKTS" + "'", obj10, "AKPKMNSKTS");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("A0931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone5, "hi!", "");
        doubleMetaphone5.maxCodeLen = '4';
        java.lang.String str12 = doubleMetaphone5.doubleMetaphone("");
        int int13 = doubleMetaphone5.getMaxCodeLen();
        char[] charArray14 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray14);
        java.lang.String str17 = soundex15.encode("HI");
        java.lang.String str19 = soundex15.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone20, "hi!", "");
        doubleMetaphone20.maxCodeLen = '4';
        java.lang.String str27 = doubleMetaphone20.doubleMetaphone("");
        int int28 = doubleMetaphone20.getMaxCodeLen();
        java.lang.String str30 = doubleMetaphone20.doubleMetaphone("hi!");
        java.lang.Object obj31 = soundex15.encode((java.lang.Object) "hi!");
        java.lang.Object obj32 = doubleMetaphone5.encode((java.lang.Object) "hi!");
        char char35 = doubleMetaphone5.charAt("AKP1111111", 1);
        doubleMetaphone5.setMaxCodeLen((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = soundex2.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H000" + "'", obj31, "H000");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H" + "'", obj32, "H");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + 'K' + "'", char35 == 'K');
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("K", "AKP");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "hi!", "");
        doubleMetaphone13.maxCodeLen = '4';
        java.lang.String str20 = doubleMetaphone13.doubleMetaphone("");
        int int21 = doubleMetaphone13.getMaxCodeLen();
        doubleMetaphone13.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("04");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.encode("");
        char[] charArray14 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray14);
        soundex16.setMaxLength((int) '1');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = caverphone0.encode((java.lang.Object) '1');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        java.lang.Class<?> wildcardClass12 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str12 = soundex10.soundex("A0313836");
        soundex10.setMaxLength(8);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A000" + "'", str12, "A000");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int12 = doubleMetaphone8.maxCodeLen;
        doubleMetaphone8.setMaxCodeLen(0);
        boolean boolean18 = doubleMetaphone8.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        java.lang.String str20 = doubleMetaphone8.encode("H");
        doubleMetaphone8.maxCodeLen = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = refinedSoundex0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "HIA212");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        int int11 = doubleMetaphone0.maxCodeLen;
        char char14 = doubleMetaphone0.charAt("A111111111", 52);
        char char17 = doubleMetaphone0.charAt("", 2);
        org.apache.commons.codec.language.Metaphone metaphone18 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str20 = metaphone18.metaphone("H0");
        boolean boolean23 = metaphone18.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str25 = metaphone18.encode("hi!");
        boolean boolean28 = metaphone18.isMetaphoneEqual("H0", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) metaphone18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int27 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('4');
        java.lang.String str6 = refinedSoundex0.soundex("ARKP");
        java.lang.String str8 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str11 = caverphone9.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex();
        char char14 = refinedSoundex12.getMappingCode('a');
        java.lang.String str16 = refinedSoundex12.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj17 = caverphone9.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str19 = caverphone9.caverphone("ORKP");
        boolean boolean22 = caverphone9.isCaverphoneEqual("", "AKPK");
        java.lang.String str24 = caverphone9.encode("A111111111");
        boolean boolean27 = caverphone9.isCaverphoneEqual("HI3", "A0931");
        java.lang.Object obj28 = refinedSoundex0.encode((java.lang.Object) "HI3");
        int int31 = refinedSoundex0.difference("\0000", "A031");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0931" + "'", str6, "A0931");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKMNSKTS" + "'", str11, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '0' + "'", char14 == '0');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O094010303080830603083060905301608" + "'", str16, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "AKPKKMNSKT" + "'", obj17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKP1111111" + "'", str19, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A111111111" + "'", str24, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H0" + "'", obj28, "H0");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKPK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKPK" + "'", str1, "AKPK");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA11111111a a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA" + "'", str1, "AAAA");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex();
        int int8 = refinedSoundex5.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str10 = refinedSoundex5.encode("hi!");
        java.lang.String str12 = refinedSoundex5.soundex("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex0.encode((java.lang.Object) refinedSoundex5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H0" + "'", str10, "H0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H0" + "'", str12, "H0");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone9.doubleMetaphone("", false);
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone9, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str17 = doubleMetaphone9.encode("hi!");
        java.lang.String str19 = doubleMetaphone9.doubleMetaphone("H000");
        int int20 = doubleMetaphone9.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex8.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.encode("AKPKKMNSKT");
        java.lang.String str6 = refinedSoundex0.soundex("");
        java.lang.String str8 = refinedSoundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0313836" + "'", str4, "A0313836");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str8, "O094010303080830603083060905301608094010303080830603083060905301608");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: HIA212", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str13, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        int int10 = refinedSoundex0.difference("", "O941");
        java.lang.String str12 = refinedSoundex0.encode("AKPK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("", false);
        int int17 = doubleMetaphone13.maxCodeLen;
        doubleMetaphone13.setMaxCodeLen((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex0.encode((java.lang.Object) doubleMetaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A0313" + "'", str12, "A0313");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.String str11 = refinedSoundex0.soundex("A031");
        char char13 = refinedSoundex0.getMappingCode('O');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.soundex("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = refinedSoundex0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O0" + "'", str7, "O0");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AR" + "'", str1, "AR");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "AA11111111a a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone16.doubleMetaphone("", false);
        int int20 = doubleMetaphone16.getMaxCodeLen();
        int int21 = doubleMetaphone16.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone1.doubleMetaphone("", false);
        int int5 = doubleMetaphone1.maxCodeLen;
        int int6 = doubleMetaphone1.maxCodeLen;
        boolean boolean9 = doubleMetaphone1.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "HI");
        java.lang.String str12 = doubleMetaphone0.encode("H000");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex();
        int int17 = refinedSoundex14.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str19 = refinedSoundex14.encode("hi!");
        java.lang.String str21 = refinedSoundex14.soundex("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) refinedSoundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H" + "'", obj10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H0" + "'", str19, "H0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H0" + "'", str21, "H0");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "a1", "O");
        int int30 = soundex1.getMaxLength();
        soundex1.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean12 = metaphone0.isMetaphoneEqual("ARKP", "");
        metaphone0.setMaxCodeLen(0);
        int int15 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("O0940103030808306030830609053016080", "H0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        java.lang.String str8 = refinedSoundex0.encode("O0");
        int int11 = refinedSoundex0.difference("A0", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AA11111111a a", "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        java.lang.Class<?> wildcardClass8 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.caverphone("H000");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "O000", "org.apache.commons.codec.EncoderException: A931");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "AA");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        java.lang.Throwable[] throwableArray15 = encoderException14.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray20 = encoderException19.getSuppressed();
        encoderException17.addSuppressed((java.lang.Throwable) encoderException19);
        encoderException14.addSuppressed((java.lang.Throwable) encoderException19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = caverphone0.encode((java.lang.Object) encoderException14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKPKSKMNSKTKNKTRKSPKSN", "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        char char15 = doubleMetaphone0.charAt("", (int) (short) 100);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str18 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN" + "'", str18, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.Class<?> wildcardClass11 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "a1", "O");
        java.lang.String str31 = soundex1.encode("A0931538363836931583138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A000" + "'", str31, "A000");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone16.doubleMetaphone("", false);
        int int20 = doubleMetaphone16.maxCodeLen;
        doubleMetaphone16.setMaxCodeLen(0);
        java.lang.String str25 = doubleMetaphone16.doubleMetaphone("", true);
        doubleMetaphone16.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone16.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult29.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = caverphone0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.Class<?> wildcardClass10 = refinedSoundex3.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("HI");
        java.lang.String str14 = soundex10.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.Object obj26 = soundex10.encode((java.lang.Object) "hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str29 = doubleMetaphone0.encode("ORKP");
        int int30 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ARKP" + "'", str29, "ARKP");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.String str15 = soundex1.encode("HI");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = soundex1.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        int int22 = soundex1.difference("O0", "");
        int int23 = soundex1.getMaxLength();
        int int24 = soundex1.getMaxLength();
        int int27 = soundex1.difference("H", "hi!");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("A0", "01230120022455012623010202", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) '1');
        char[] charArray5 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.encode("HI");
        java.lang.String str10 = soundex6.encode("H");
        soundex6.setMaxLength((int) (byte) 10);
        int int13 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex2.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.encode("AKPKKMNSKT");
        java.lang.Class<?> wildcardClass5 = refinedSoundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0313836" + "'", str4, "A0313836");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AR", "org.apache.commons.codec.EncoderException: \000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "A0313836");
        java.lang.String str5 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AKPKKMNSKT" + "'", str5, "AKPKKMNSKT");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str25 = metaphone0.metaphone("a1");
        java.lang.String str27 = metaphone0.encode("\0000");
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN", "O941");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.encode("AKPKKMNSKT");
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray9 = encoderException8.getSuppressed();
        encoderException6.addSuppressed((java.lang.Throwable) encoderException8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) encoderException6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0313836" + "'", str4, "A0313836");
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        java.lang.String str9 = metaphone0.encode("HIA212");
        java.lang.String str11 = metaphone0.metaphone("O941");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.encode("org.apache.commons.codec.EncoderException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean21 = doubleMetaphoneResult20.isComplete();
        doubleMetaphoneResult20.appendAlternate("#HIK");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        boolean boolean13 = metaphone0.isMetaphoneEqual("01230120022455012623010202", "");
        java.lang.String str15 = metaphone0.encode("ORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORKP" + "'", str15, "ORKP");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = metaphone0.encode(obj19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKPXKMNSK", "O0931");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        char[] charArray5 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        java.lang.String str8 = soundex6.encode("HI");
        java.lang.String str10 = soundex6.encode("H");
        int int13 = soundex6.difference("AKPK", "a1");
        java.lang.Class<?> wildcardClass14 = soundex6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex0.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        soundex1.setMaxLength(3);
        int int15 = soundex1.difference("O", "A931");
        soundex1.setMaxLength((int) 'a');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "1111111111");
        doubleMetaphone0.setMaxCodeLen((int) 'O');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str6 = refinedSoundex4.encode("a");
        java.lang.Class<?> wildcardClass7 = refinedSoundex4.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "O0931");
        java.lang.String str10 = caverphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("\000", "");
        java.lang.String str20 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "a1", "O");
        java.lang.String str31 = soundex1.encode("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone32 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str34 = metaphone32.metaphone("H0");
        java.lang.String str36 = metaphone32.metaphone("org.apache.commons.codec.EncoderException: ");
        int int39 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone32, "H", "A931");
        java.lang.Object obj40 = soundex1.encode((java.lang.Object) "H");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A000" + "'", str31, "A000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORKP" + "'", str36, "ORKP");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "H000" + "'", obj40, "H000");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.encode("");
        boolean boolean16 = caverphone0.isCaverphoneEqual("A031", "O000");
        java.lang.Class<?> wildcardClass17 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        java.lang.String str9 = metaphone0.encode("HIA212");
        java.lang.Class<?> wildcardClass10 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A09313836383693138", "A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: \000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str16, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: AKPKMNSKTS", "AA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        int int6 = soundex2.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        boolean boolean14 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = metaphone0.encode(obj18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("HI");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex12, "01230120022455012623010202", "HI");
        soundex12.setMaxLength((int) '#');
        java.lang.String str21 = soundex12.soundex("O0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex10.encode((java.lang.Object) "O0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "O000" + "'", str21, "O000");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        int int10 = refinedSoundex3.difference("AKPK", "ARKPKSKMNSKTSNKTRKSPKSN");
        char char12 = refinedSoundex3.getMappingCode('3');
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = refinedSoundex3.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("0", "A03138363");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("O0");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = soundex2.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('\000');
        java.lang.Class<?> wildcardClass5 = refinedSoundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("A0");
        java.lang.Class<?> wildcardClass27 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A000" + "'", str26, "A000");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.Metaphone metaphone15 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str17 = metaphone15.metaphone("H0");
        boolean boolean20 = metaphone15.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str22 = metaphone15.metaphone("");
        java.lang.String str24 = metaphone15.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str26 = metaphone15.encode("O000");
        metaphone15.setMaxCodeLen((int) 'K');
        boolean boolean31 = metaphone15.isMetaphoneEqual("H0", "A931");
        java.lang.Object obj32 = metaphone0.encode((java.lang.Object) "A931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str14, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ARKP" + "'", str24, "ARKP");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O" + "'", str26, "O");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "A" + "'", obj32, "A");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.doubleMetaphone("A931", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("0", "A031");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        soundex1.setMaxLength(10);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("HI");
        java.lang.String str18 = soundex14.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone19, "hi!", "");
        doubleMetaphone19.maxCodeLen = '4';
        java.lang.String str26 = doubleMetaphone19.doubleMetaphone("");
        int int27 = doubleMetaphone19.getMaxCodeLen();
        java.lang.String str29 = doubleMetaphone19.doubleMetaphone("hi!");
        java.lang.Object obj30 = soundex14.encode((java.lang.Object) "hi!");
        java.lang.String str32 = soundex14.encode("");
        java.lang.String str34 = soundex14.encode("");
        java.lang.String str36 = soundex14.encode("01230120022455012623010202");
        int int37 = soundex14.getMaxLength();
        soundex14.setMaxLength(8);
        java.lang.Class<?> wildcardClass40 = soundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "H000" + "'", obj30, "H000");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.encode("A4");
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = refinedSoundex0.encode(obj6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A0" + "'", str5, "A0");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.Class<?> wildcardClass8 = refinedSoundex0.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        org.apache.commons.codec.language.Soundex soundex19 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str21 = soundex19.soundex("H");
        java.lang.String str23 = soundex19.soundex("H");
        int int26 = soundex19.difference("AKPKKMNSKT", "H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = metaphone0.encode((java.lang.Object) int26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertNotNull(soundex19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("HI");
        java.lang.String str14 = soundex10.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.Object obj26 = soundex10.encode((java.lang.Object) "hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char30 = doubleMetaphone0.charAt("AKP1111111", 1);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("");
        java.lang.Class<?> wildcardClass35 = encoderException34.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) encoderException34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'K' + "'", char30 == 'K');
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A000A212", "HI3");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("HI");
        java.lang.String str11 = caverphone0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKKMNSKT" + "'", str11, "AKPKKMNSKT");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str25 = metaphone0.metaphone("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) (short) 1);
        java.lang.String str5 = soundex1.encode("HI");
        int int6 = soundex1.getMaxLength();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int12 = doubleMetaphone8.maxCodeLen;
        int int13 = doubleMetaphone8.maxCodeLen;
        boolean boolean16 = doubleMetaphone8.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj17 = doubleMetaphone7.encode((java.lang.Object) "HI");
        java.lang.String str19 = doubleMetaphone7.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex1.encode((java.lang.Object) doubleMetaphone7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        java.lang.String str5 = doubleMetaphone0.encode("ORKP");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202", "");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "01230120022455012623010202\000");
        char char13 = doubleMetaphone0.charAt("A03138363", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'A' + "'", char13 == 'A');
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        char char9 = refinedSoundex0.getMappingCode('A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        java.lang.String str8 = caverphone0.caverphone("HI3");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.maxCodeLen;
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("A0", "ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A0313836", "04", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "04", false);
        org.apache.commons.codec.language.Metaphone metaphone24 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str26 = metaphone24.metaphone("H0");
        boolean boolean29 = metaphone24.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int30 = metaphone24.getMaxCodeLen();
        int int31 = metaphone24.getMaxCodeLen();
        java.lang.String str33 = metaphone24.metaphone("AR");
        int int34 = metaphone24.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) metaphone24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AR" + "'", str33, "AR");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        char char10 = doubleMetaphone0.charAt("ARKPXKMNSKTSNKTRKSPXN", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'X' + "'", char10 == 'X');
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex();
        char char13 = refinedSoundex11.getMappingCode('a');
        int int16 = refinedSoundex11.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str18 = refinedSoundex11.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex19 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str21 = refinedSoundex19.encode("01230120022455012623010202");
        java.lang.Object obj22 = refinedSoundex11.encode((java.lang.Object) str21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = metaphone0.encode((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H0" + "'", str18, "H0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean21 = doubleMetaphoneResult20.isComplete();
        java.lang.String str22 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1111111111", "H0");
        char[] charArray16 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        java.lang.String str20 = soundex18.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str22 = soundex18.soundex("AKPKMNSKTS");
        int int23 = soundex18.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = metaphone0.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O941" + "'", str20, "O941");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A313" + "'", str22, "A313");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("a1");
        java.lang.String str12 = metaphone0.metaphone("O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('4');
        java.lang.String str6 = refinedSoundex0.soundex("ARKP");
        java.lang.String str8 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str11 = caverphone9.encode("01230120022455012623010202");
        boolean boolean14 = caverphone9.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str16 = caverphone9.encode("AA11111111");
        java.lang.String str18 = caverphone9.encode("A111111111");
        java.lang.String str20 = caverphone9.caverphone("A212");
        java.lang.Object obj21 = refinedSoundex0.encode((java.lang.Object) "A212");
        int int24 = refinedSoundex0.difference("", "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0931" + "'", str6, "A0931");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A111111111" + "'", str18, "A111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "A0" + "'", obj21, "A0");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean20 = caverphone0.isCaverphoneEqual("O", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str22 = caverphone0.encode("01230120022455012623010202");
        boolean boolean25 = caverphone0.isCaverphoneEqual("O094010303080830603083060905301608", "04");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str19 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.Metaphone metaphone20 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str22 = metaphone20.metaphone("H0");
        java.lang.String str24 = metaphone20.metaphone("");
        java.lang.String str26 = metaphone20.encode("H000");
        int int27 = metaphone20.getMaxCodeLen();
        boolean boolean30 = metaphone20.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str32 = metaphone20.metaphone("O941");
        java.lang.String str34 = metaphone20.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "H000", "O094010303080830603083060905301608", "org.apache.commons.codec.EncoderException: " };
        boolean boolean53 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) (short) 100, strArray52);
        boolean boolean54 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (-1), (int) (short) -1, strArray52);
        boolean boolean55 = org.apache.commons.codec.language.DoubleMetaphone.contains("O000", (int) '1', (int) (byte) -1, strArray52);
        boolean boolean56 = org.apache.commons.codec.language.DoubleMetaphone.contains("ORGAPACHECOMMONSCODECENCODEREXCEPTION", 0, (int) '\000', strArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = doubleMetaphone0.encode((java.lang.Object) boolean56);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "O" + "'", str32, "O");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ARKP" + "'", str34, "ARKP");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", obj35, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("ARKPXKMNSK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("", false);
        doubleMetaphone14.maxCodeLen = 4;
        java.lang.String str21 = doubleMetaphone14.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone22 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str24 = metaphone22.metaphone("H0");
        java.lang.String str26 = metaphone22.metaphone("");
        java.lang.String str28 = metaphone22.encode("H000");
        java.lang.Object obj29 = doubleMetaphone14.encode((java.lang.Object) str28);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone14.new DoubleMetaphoneResult(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = metaphone0.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "a1", "O");
        soundex1.setMaxLength((int) (short) 0);
        char[] charArray32 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex33 = new org.apache.commons.codec.language.Soundex(charArray32);
        java.lang.String str35 = soundex33.encode("HI");
        java.lang.String str37 = soundex33.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone38 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int41 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone38, "hi!", "");
        doubleMetaphone38.maxCodeLen = '4';
        java.lang.String str45 = doubleMetaphone38.doubleMetaphone("");
        int int46 = doubleMetaphone38.getMaxCodeLen();
        java.lang.String str48 = doubleMetaphone38.doubleMetaphone("hi!");
        java.lang.Object obj49 = soundex33.encode((java.lang.Object) "hi!");
        java.lang.String str51 = soundex33.encode("");
        java.lang.String str53 = soundex33.encode("");
        int int54 = soundex33.getMaxLength();
        soundex33.setMaxLength(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = soundex1.encode((java.lang.Object) soundex33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H000" + "'", str37, "H000");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H" + "'", str48, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "H000" + "'", obj49, "H000");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        boolean boolean10 = caverphone0.isCaverphoneEqual("#HIK", "A310");
        java.lang.String str12 = caverphone0.encode("AKPKMNSKTS");
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray13);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        char char18 = refinedSoundex16.getMappingCode('1');
        java.lang.String str20 = refinedSoundex16.encode("");
        java.lang.String str22 = refinedSoundex16.encode("");
        java.lang.String str24 = refinedSoundex16.encode("O");
        java.lang.String str26 = refinedSoundex16.soundex("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = caverphone0.encode((java.lang.Object) refinedSoundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKKMNSKT" + "'", str7, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPKMNSKTS" + "'", str12, "AKPKMNSKTS");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O0" + "'", str24, "O0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O094010303080830603083060905301608" + "'", str26, "O094010303080830603083060905301608");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("A0");
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("");
        encoderException8.addSuppressed((java.lang.Throwable) encoderException10);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException15);
        encoderException6.addSuppressed((java.lang.Throwable) encoderException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = caverphone0.encode((java.lang.Object) encoderException15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A0313836", "04");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        java.lang.String str7 = soundex2.soundex("hi!");
        int int10 = soundex2.difference("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN", "01230120022455012623010202\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("", "01230120022455012623010202");
        int int16 = refinedSoundex0.difference("A0", "A0");
        int int19 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.Metaphone metaphone20 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str22 = metaphone20.metaphone("H0");
        boolean boolean25 = metaphone20.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int26 = metaphone20.getMaxCodeLen();
        int int27 = metaphone20.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = refinedSoundex0.encode((java.lang.Object) metaphone20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("HI");
        java.lang.String str14 = soundex10.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.Object obj26 = soundex10.encode((java.lang.Object) "hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("A0");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.encode("O");
        int int18 = refinedSoundex0.difference("", "");
        java.lang.String str20 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O094010303080830603083060905301608" + "'", str20, "O094010303080830603083060905301608");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        java.lang.String str25 = soundex1.encode("A310");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex();
        char char28 = refinedSoundex26.getMappingCode('a');
        int int31 = refinedSoundex26.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char33 = refinedSoundex26.getMappingCode('K');
        int int36 = refinedSoundex26.difference("", "O941");
        int int39 = refinedSoundex26.difference("O941", "ORKP");
        char char41 = refinedSoundex26.getMappingCode('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex1.encode((java.lang.Object) refinedSoundex26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A000" + "'", str25, "A000");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '0' + "'", char28 == '0');
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '3' + "'", char33 == '3');
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("a1", "ARKPKSKMNSKTKNKTRKSPKSN", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("A03138363");
        doubleMetaphoneResult8.appendPrimary('o');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str23 = doubleMetaphone20.doubleMetaphone("", false);
        int int24 = doubleMetaphone20.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex1.encode((java.lang.Object) int24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ", "");
        char char10 = refinedSoundex0.getMappingCode('1');
        java.lang.String str12 = refinedSoundex0.encode("A212");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A0" + "'", str12, "A0");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.metaphone("AKPKMNSKTS");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = metaphone0.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPK" + "'", str12, "AKPK");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "hi!");
        int int15 = soundex1.difference("org.apache.commons.codec.EncoderException: A0", "O094010303080830603083060905301608");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        java.lang.String str12 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "hi!", "");
        doubleMetaphone13.maxCodeLen = '4';
        java.lang.String str20 = doubleMetaphone13.doubleMetaphone("");
        int int21 = doubleMetaphone13.getMaxCodeLen();
        java.lang.String str23 = doubleMetaphone13.doubleMetaphone("hi!");
        java.lang.Object obj25 = doubleMetaphone13.encode((java.lang.Object) "HI");
        char char28 = doubleMetaphone13.charAt("", (int) (short) 100);
        int int29 = doubleMetaphone13.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) int29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTION" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone16.doubleMetaphone("", false);
        int int20 = doubleMetaphone16.getMaxCodeLen();
        int int21 = doubleMetaphone16.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) doubleMetaphone16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("O000");
        boolean boolean9 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "O09401030308083060308306090530160803138363");
        java.lang.String str11 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 100;
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "A", false);
        char char22 = doubleMetaphone0.charAt("O0", (int) 'A');
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "#HIK", "A031");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.soundex("AKPK");
        java.lang.String str8 = soundex0.encode("H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A212" + "'", str6, "A212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str11 = doubleMetaphone0.encode("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean19 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AA11111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        java.lang.String[] strArray21 = new java.lang.String[] { "H" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("H000", 100, (int) 'a', strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", (int) (byte) 1, (int) (short) 0, strArray21);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", 10, 1, strArray21);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) ' ', (int) 'a', strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = metaphone0.encode((java.lang.Object) strArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        char[] charArray0 = null;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = soundex1.soundex("AA11111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A000H0H000", "a1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.encode("A09313836383693138");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone0.metaphone("AA");
        char[] charArray22 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str25 = soundex23.encode("HI");
        soundex23.setMaxLength(10);
        soundex23.setMaxLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("");
        char char18 = refinedSoundex0.getMappingCode('4');
        java.lang.String str20 = refinedSoundex0.soundex("O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O0" + "'", str20, "O0");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("AKPa", "");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "H000", "O094010303080830603083060905301608", "org.apache.commons.codec.EncoderException: " };
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) (short) 100, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        int int13 = doubleMetaphone0.maxCodeLen;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "AA11111111");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        java.lang.String str8 = caverphone0.encode("AKPK");
        java.lang.String str10 = caverphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPK111111" + "'", str8, "AKPK111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSKTK" + "'", str10, "AKPKMNSKTK");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AKPK", "A");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "a");
        java.lang.String str19 = metaphone0.encode("O0940103030808306030830609053016080");
        java.lang.String[] strArray30 = new java.lang.String[] { "H" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("H000", 100, (int) 'a', strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", (int) (byte) 1, (int) (short) 0, strArray30);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 2, (int) (short) 10, strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = metaphone0.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O" + "'", str19, "O");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = refinedSoundex10.difference("AKPKKMNSKT#", "01230120022455012623010202");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex();
        char char8 = refinedSoundex6.getMappingCode('a');
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "", "hi!");
        java.lang.String str13 = refinedSoundex6.soundex("01230120022455012623010202");
        java.lang.Object obj14 = metaphone3.encode((java.lang.Object) str13);
        java.lang.String str16 = metaphone3.metaphone("");
        java.lang.Object obj18 = metaphone3.encode((java.lang.Object) "ORKP");
        metaphone3.setMaxCodeLen(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex2.encode((java.lang.Object) metaphone3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "ORKP" + "'", obj18, "ORKP");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone0.encode("");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A031", "org.apache.commons.codec.EncoderException: A931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int4 = soundex1.getMaxLength();
        org.apache.commons.codec.language.Metaphone metaphone5 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str7 = metaphone5.metaphone("H0");
        boolean boolean10 = metaphone5.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = metaphone5.encode("hi!");
        boolean boolean15 = metaphone5.isMetaphoneEqual("H0", "HI");
        java.lang.Object obj16 = soundex1.encode((java.lang.Object) "H0");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORKP", "");
        java.lang.String str21 = soundex1.encode("A111111111");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str24 = caverphone22.encode("01230120022455012623010202");
        boolean boolean27 = caverphone22.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str29 = caverphone22.caverphone("01230120022455012623010202");
        java.lang.Object obj30 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "H000" + "'", obj16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A000" + "'", str21, "A000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        java.lang.String str7 = soundex2.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        java.lang.String str9 = soundex2.soundex("ARKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O941" + "'", str7, "O941");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A931" + "'", str9, "A931");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = soundex11.difference("ORKPXKMNSKTKNKTRKSSPXN", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        int int12 = refinedSoundex0.difference("AKPK", "1111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("", false);
        int int17 = doubleMetaphone13.maxCodeLen;
        int int18 = doubleMetaphone13.maxCodeLen;
        boolean boolean21 = doubleMetaphone13.isDoubleMetaphoneEqual("H", "HI");
        boolean boolean24 = doubleMetaphone13.isDoubleMetaphoneEqual("H000", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex0.encode((java.lang.Object) doubleMetaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        doubleMetaphone14.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone14.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str24 = doubleMetaphone14.doubleMetaphone("a1", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = caverphone0.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "org.apache.commons.codec.EncoderException: \000", "A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone0.setMaxCodeLen(0);
        char char19 = doubleMetaphone0.charAt("O", (int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = doubleMetaphone0.doubleMetaphone("K", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        java.lang.String str13 = refinedSoundex3.encode("012301200224550126230102021");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        char[] charArray8 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = refinedSoundex0.encode((java.lang.Object) charArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , \000, a]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("O0940103030808306030830609053016080", "O0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        char[] charArray5 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        soundex6.setMaxLength((int) (short) 1);
        java.lang.String str10 = soundex6.encode("HI");
        int int11 = soundex6.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = metaphone0.encode((java.lang.Object) soundex6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H000" + "'", str10, "H000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.encode("A212");
        int int14 = metaphone0.getMaxCodeLen();
        int int15 = metaphone0.getMaxCodeLen();
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = soundex7.soundex("ORKP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        int int12 = refinedSoundex3.difference("H000", "O09401030308083060308306090530160803138363");
        java.lang.String str14 = refinedSoundex3.encode("O0");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O0" + "'", str14, "O0");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        char char9 = doubleMetaphone0.charAt("ORKPXKMNSKTKNKTRKSSPXN", (int) 'I');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendPrimary("A0931538363836931583138363");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('3');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "#HIK", "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        soundex1.setMaxLength(0);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex();
        int int13 = soundex10.difference("01230120022455012623010202\000", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex1.encode((java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex9.soundex("org.apache.commons.codec.EncoderException: A0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("A0931538363836931583138363", "A0931538363836931583138363");
        java.lang.String str13 = soundex1.encode("0#");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O621");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.encode("O");
        int int18 = refinedSoundex0.difference("", "");
        java.lang.String str20 = refinedSoundex0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str22 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A09313836383693138" + "'", str20, "A09313836383693138");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("A212");
        java.lang.String str10 = caverphone0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AKPKMNSKTS", "ARKPKSKMNSKTSNKTRKSPKSN");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ARKPKSKMNSKTSNKTRKSPKSN", "A000A212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: \000", "#HIK");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "01230120022455012623010202\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str13 = caverphone11.encode("01230120022455012623010202");
        java.lang.String str15 = caverphone11.encode("");
        java.lang.String str17 = caverphone11.encode("H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex10.encode((java.lang.Object) caverphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex9.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        int int8 = soundex1.getMaxLength();
        int int9 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        java.lang.String str7 = soundex1.encode("");
        int int10 = soundex1.difference("", "");
        java.lang.String str12 = soundex1.encode("ARKP");
        java.lang.String[] strArray29 = new java.lang.String[] { "H" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("H000", 100, (int) 'a', strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKP", (int) (byte) 1, (int) (short) 0, strArray29);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("O094010303080830603083060905301608", 1, (int) (short) 10, strArray29);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) '4', strArray29);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("A0", 8, 0, strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = soundex1.encode((java.lang.Object) strArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A931" + "'", str12, "A931");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: AR", "H03");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("A0313836");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A09313836383693138", "H");
        java.lang.String str11 = caverphone0.caverphone("H000");
        java.lang.String str13 = caverphone0.caverphone("0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str19 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        java.lang.String str23 = doubleMetaphone0.encode("04");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        java.lang.String str11 = metaphone0.encode("HI3");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        java.lang.Object obj9 = refinedSoundex0.encode((java.lang.Object) "AA11111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "A0" + "'", obj9, "A0");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        char char12 = doubleMetaphone0.charAt("A212", (int) '1');
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: AR", "A000H0H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone11, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str19 = doubleMetaphone11.encode("hi!");
        java.lang.String str21 = doubleMetaphone11.doubleMetaphone("H000");
        doubleMetaphone11.maxCodeLen = 10;
        int int24 = doubleMetaphone11.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone11.encode("");
        java.lang.String str28 = doubleMetaphone11.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) str28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.encode("A09313836383693138");
        java.lang.String str15 = soundex1.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("O000");
        java.lang.String str8 = caverphone0.encode(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HI", "AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone6 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str8 = metaphone6.metaphone("H0");
        boolean boolean11 = metaphone6.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str13 = metaphone6.metaphone("");
        int int14 = metaphone6.getMaxCodeLen();
        int int15 = metaphone6.getMaxCodeLen();
        java.lang.String str17 = metaphone6.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = caverphone0.encode((java.lang.Object) metaphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        char char16 = doubleMetaphone0.charAt("01230120022455012623010202", (int) (short) 0);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("AA", true);
        java.lang.String str21 = doubleMetaphone0.encode("O0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '0' + "'", char16 == '0');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "ORKP");
        metaphone0.setMaxCodeLen(0);
        java.lang.String str19 = metaphone0.encode("AKP1111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ORKP" + "'", obj15, "ORKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("", false);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str22 = doubleMetaphone14.encode("hi!");
        java.lang.String str24 = doubleMetaphone14.doubleMetaphone("H000");
        int int25 = doubleMetaphone14.getMaxCodeLen();
        java.lang.String str27 = doubleMetaphone14.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone14.maxCodeLen = '3';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex1.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ARKP" + "'", str27, "ARKP");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("O000");
        boolean boolean9 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "O09401030308083060308306090530160803138363");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex();
        char char12 = refinedSoundex10.getMappingCode('a');
        java.lang.String str14 = refinedSoundex10.soundex("org.apache.commons.codec.EncoderException: ");
        char char16 = refinedSoundex10.getMappingCode('#');
        int int19 = refinedSoundex10.difference("H000", "");
        char char21 = refinedSoundex10.getMappingCode('\000');
        java.lang.Class<?> wildcardClass22 = refinedSoundex10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = caverphone0.encode((java.lang.Object) refinedSoundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '0' + "'", char12 == '0');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O094010303080830603083060905301608" + "'", str14, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "ORKP");
        java.lang.Class<?> wildcardClass16 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ORKP" + "'", obj15, "ORKP");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.caverphone("AKPK111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AKPKMNSKTK", "ORKP");
        java.lang.String str16 = caverphone0.encode("org.apache.commons.codec.EncoderException: A0");
        java.lang.Class<?> wildcardClass17 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPK111111" + "'", str11, "AKPK111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKPKKMNSKT" + "'", str16, "AKPKKMNSKT");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.Class<?> wildcardClass14 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult7.appendAlternate(" ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("0#", "\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("AA11111111", "");
        boolean boolean8 = metaphone0.isMetaphoneEqual("K3", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        java.lang.String str10 = soundex1.soundex("O0");
        java.lang.String str12 = soundex1.encode("O0");
        int int13 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O000" + "'", str10, "O000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O000" + "'", str12, "O000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("AKPKKMNSKT", false);
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode(obj22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AKPK" + "'", str21, "AKPK");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "A310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "A111111111" + "'", obj11, "A111111111");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = refinedSoundex8.difference("HI3", "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("A212");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("A000", "A0313836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone8, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = doubleMetaphone8.encode("hi!");
        java.lang.String str18 = doubleMetaphone8.doubleMetaphone("H000");
        int int19 = doubleMetaphone8.getMaxCodeLen();
        java.lang.String str21 = doubleMetaphone8.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj22 = soundex1.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int25 = soundex1.difference("AKPKKMNSKT", "ARKPKSKMNSKTKNKTRKSPKSN");
        soundex1.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ARKP" + "'", str21, "ARKP");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "O941" + "'", obj22, "O941");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("1111111111", "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        char char6 = refinedSoundex0.getMappingCode('a');
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex();
        int int10 = soundex7.difference("01230120022455012623010202\000", "HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = soundex0.encode(obj3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.caverphone("H03");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A111111111" + "'", str2, "A111111111");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = metaphone0.encode((java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        int int13 = refinedSoundex0.difference("1111111111", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int16 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", "H");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str3 = refinedSoundex1.soundex("a1");
        char char5 = refinedSoundex1.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A0" + "'", str3, "A0");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AKPK", "A");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "a");
        java.lang.String str19 = metaphone0.encode("O0940103030808306030830609053016080");
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O" + "'", str19, "O");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str5 = refinedSoundex0.encode("1");
        char[] charArray6 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray6);
        java.lang.String str9 = refinedSoundex7.soundex("a1");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex7, "O0940103030808306030830609053016080", "A093153836383693158");
        java.lang.String str14 = refinedSoundex7.encode("A212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex0.encode((java.lang.Object) refinedSoundex7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A0" + "'", str14, "A0");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.encode("H000");
        boolean boolean13 = caverphone0.isCaverphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        char char20 = doubleMetaphone14.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("1111111111", true);
        boolean boolean26 = doubleMetaphone14.isDoubleMetaphoneEqual("1111111111", "H000");
        int int27 = doubleMetaphone14.getMaxCodeLen();
        char char30 = doubleMetaphone14.charAt("01230120022455012623010202", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = caverphone0.encode((java.lang.Object) char30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '0' + "'", char20 == '0');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '0' + "'", char30 == '0');
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.String str11 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphoneResult14.append("a1", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "A931");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: AKPKMNSKTS", "AKPKMNSK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A0931538363836931583138363", "O0931");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        java.lang.String str15 = doubleMetaphone0.encode("A0310");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        int int8 = refinedSoundex0.difference("AAAA", "org.apache.commons.codec.EncoderException: \000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str5 = caverphone0.encode("A000H0H000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        org.apache.commons.codec.EncoderException encoderException6 = new org.apache.commons.codec.EncoderException("01230120022455012623010202");
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException10 = new org.apache.commons.codec.EncoderException("");
        encoderException8.addSuppressed((java.lang.Throwable) encoderException10);
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        encoderException19.addSuppressed((java.lang.Throwable) encoderException21);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException19);
        encoderException6.addSuppressed((java.lang.Throwable) encoderException19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = caverphone0.encode((java.lang.Object) encoderException19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        java.lang.String str7 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKKMNSKT" + "'", str7, "AKPKKMNSKT");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        java.lang.String str25 = soundex1.soundex("ARKPXKMNSK");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A931" + "'", str25, "A931");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("AKPK111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str20 = metaphone0.encode("HI");
        java.lang.String str22 = metaphone0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str24 = metaphone0.encode(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str22, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean20 = caverphone0.isCaverphoneEqual("O", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str22 = caverphone0.caverphone("A0931538363836931583138363");
        java.lang.String str24 = caverphone0.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = caverphone0.encode((java.lang.Object) 'A');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A111111111" + "'", str22, "A111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1111111111" + "'", str24, "1111111111");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: ", "AA11111111a a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        java.lang.String str20 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int21 = metaphone0.getMaxCodeLen();
        boolean boolean24 = metaphone0.isMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "AKPKKMNSKT#");
        char[] charArray25 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        org.apache.commons.codec.language.Soundex soundex27 = new org.apache.commons.codec.language.Soundex(charArray25);
        java.lang.String str29 = soundex27.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str31 = soundex27.soundex("AKPKMNSKTS");
        int int32 = soundex27.getMaxLength();
        int int33 = soundex27.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = metaphone0.encode((java.lang.Object) soundex27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "O941" + "'", str29, "O941");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A313" + "'", str31, "A313");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        char char8 = doubleMetaphone0.charAt("1111111111", (int) (short) 1);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex();
        char char11 = refinedSoundex9.getMappingCode('a');
        int int14 = refinedSoundex9.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str16 = refinedSoundex9.soundex("");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("");
        encoderException19.addSuppressed((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("");
        encoderException24.addSuppressed((java.lang.Throwable) encoderException26);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("");
        encoderException30.addSuppressed((java.lang.Throwable) encoderException32);
        org.apache.commons.codec.EncoderException encoderException35 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException("");
        encoderException35.addSuppressed((java.lang.Throwable) encoderException37);
        encoderException30.addSuppressed((java.lang.Throwable) encoderException37);
        org.apache.commons.codec.EncoderException encoderException41 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray44 = encoderException43.getSuppressed();
        encoderException41.addSuppressed((java.lang.Throwable) encoderException43);
        encoderException30.addSuppressed((java.lang.Throwable) encoderException41);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = doubleMetaphone0.encode((java.lang.Object) encoderException19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("AKPK111111", "ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str21 = caverphone19.encode("01230120022455012623010202");
        java.lang.String str23 = caverphone19.caverphone("");
        java.lang.Object obj24 = metaphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1111111111" + "'", str23, "1111111111");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "H200");
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = metaphone0.encode(obj9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("A0931");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str7 = refinedSoundex5.encode("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex5.soundex("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = refinedSoundex5.encode((java.lang.Object) str22);
        java.lang.Object obj24 = soundex2.encode(obj23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H0" + "'", obj23, "H0");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H000" + "'", obj24, "H000");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex0.encode("ORKP");
        java.lang.String str11 = refinedSoundex0.encode("HI3");
        char char13 = refinedSoundex0.getMappingCode('o');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        char char20 = doubleMetaphone14.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("1111111111", true);
        boolean boolean26 = doubleMetaphone14.isDoubleMetaphoneEqual("1111111111", "H000");
        char char29 = doubleMetaphone14.charAt("H0", 2);
        char char32 = doubleMetaphone14.charAt("hi!", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone14.new DoubleMetaphoneResult(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = refinedSoundex0.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0931" + "'", str9, "O0931");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H0" + "'", str11, "H0");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '0' + "'", char20 == '0');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        java.lang.String str8 = metaphone0.metaphone("O");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O" + "'", str8, "O");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.metaphone("1111111111");
        java.lang.String str16 = metaphone0.metaphone("O621");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O" + "'", str16, "O");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex();
        char char12 = refinedSoundex10.getMappingCode('a');
        int int15 = refinedSoundex10.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str17 = refinedSoundex10.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.Metaphone metaphone18 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str20 = metaphone18.metaphone("H0");
        boolean boolean23 = metaphone18.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str25 = metaphone18.encode("hi!");
        boolean boolean28 = metaphone18.isMetaphoneEqual("H0", "HI");
        int int29 = metaphone18.getMaxCodeLen();
        boolean boolean32 = metaphone18.isMetaphoneEqual("", "HI");
        java.lang.Object obj33 = refinedSoundex10.encode((java.lang.Object) "");
        java.lang.Object obj34 = caverphone0.encode(obj33);
        java.lang.String str36 = caverphone0.caverphone("ORKPXKMNSKTKNKTRKSSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '0' + "'", char12 == '0');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A093153836383693158" + "'", str17, "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "1111111111" + "'", obj34, "1111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AKPKMNSKTK" + "'", str36, "AKPKMNSKTK");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        char char15 = doubleMetaphone0.charAt("", (int) '0');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone16.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone16.maxCodeLen = 100;
        java.lang.String str22 = doubleMetaphone16.doubleMetaphone("A03138363");
        boolean boolean26 = doubleMetaphone16.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: H000", "O", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.String str15 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("");
        encoderException17.addSuppressed((java.lang.Throwable) encoderException19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex1.encode((java.lang.Object) encoderException17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A931" + "'", str15, "A931");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        java.lang.String str14 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean17 = metaphone0.isMetaphoneEqual("K", "");
        metaphone0.setMaxCodeLen((int) '0');
        boolean boolean22 = metaphone0.isMetaphoneEqual("K", "org.apache.commons.codec.EncoderException: \000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: A931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = caverphone0.caverphone("01230120022455012623010202\000");
        boolean boolean18 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.Class<?> wildcardClass19 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str6 = refinedSoundex4.encode("a");
        int int9 = refinedSoundex4.difference("HI", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        int int12 = refinedSoundex4.difference("AA11111111a a", "org.apache.commons.codec.EncoderException: HIA212");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTSNKTRKSPXN", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult14.appendPrimary("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A0310");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKPXKMNSK", "A03");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        java.lang.String str9 = refinedSoundex0.encode("");
        java.lang.String str11 = refinedSoundex0.encode("0123012002245501262301020211111111111");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        boolean boolean15 = metaphone0.isMetaphoneEqual("A000AKP1111111", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A212");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        int int16 = doubleMetaphone0.maxCodeLen;
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ORKPXKMNSKTKNKTRKSSPXN", "AKP");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        java.lang.String str7 = caverphone0.caverphone("AA11111111a a");
        java.lang.String str9 = caverphone0.encode("AKPKMNSKT1");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKPKMNSKT1" + "'", str9, "AKPKMNSKT1");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "AA", "A0931");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone10.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone10.maxCodeLen = 100;
        java.lang.String str16 = doubleMetaphone10.encode("HI");
        java.lang.String str18 = doubleMetaphone10.encode("O094010303080830603083060905301608");
        java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) "O094010303080830603083060905301608");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("H000");
        java.lang.String str23 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone24, "hi!", "");
        char char30 = doubleMetaphone24.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str33 = doubleMetaphone24.doubleMetaphone("1111111111", true);
        char char36 = doubleMetaphone24.charAt("A212", (int) '1');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) char36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '0' + "'", char30 == '0');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex2.soundex("AKPKMNSKTS");
        java.lang.String str8 = soundex2.encode("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str10 = soundex2.encode("A931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O941" + "'", str4, "O941");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A313" + "'", str6, "A313");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O000" + "'", str8, "O000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("AKPa", "");
        metaphone0.setMaxCodeLen(75);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int9 = soundex1.getMaxLength();
        java.lang.Class<?> wildcardClass10 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "AR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex();
        char char18 = refinedSoundex16.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) char18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '0' + "'", char18 == '0');
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "a1", "O");
        int int30 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) 'A');
        soundex1.setMaxLength(0);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = soundex1.encode(obj35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('1');
        boolean boolean11 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('O');
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1O" + "'", str14, "1O");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex2.soundex("AKPKMNSKTS");
        int int7 = soundex2.getMaxLength();
        java.lang.String str9 = soundex2.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex2.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O941" + "'", str4, "O941");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A313" + "'", str6, "A313");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A931" + "'", str9, "A931");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        org.apache.commons.codec.language.Soundex soundex9 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str11 = soundex9.soundex("H");
        java.lang.String str13 = soundex9.soundex("H");
        java.lang.String str15 = soundex9.soundex("AKPK");
        java.lang.String str17 = soundex9.encode("0");
        java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) "0");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
        org.junit.Assert.assertNotNull(soundex9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A212" + "'", str15, "A212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "" + "'", obj18, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = soundex1.difference("A", "HIA212");
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex1.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex12, "A0313", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.metaphone("H0");
        boolean boolean18 = metaphone13.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str20 = metaphone13.encode("hi!");
        boolean boolean23 = metaphone13.isMetaphoneEqual("H0", "HI");
        int int24 = metaphone13.getMaxCodeLen();
        java.lang.String str26 = metaphone13.encode("HI");
        int int27 = metaphone13.getMaxCodeLen();
        java.lang.String str29 = metaphone13.encode("hi!");
        java.lang.String str31 = metaphone13.encode("ORKP");
        java.lang.String str33 = metaphone13.metaphone("A212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = refinedSoundex12.encode((java.lang.Object) metaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORKP" + "'", str31, "ORKP");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "A" + "'", str33, "A");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int29 = soundex1.difference("AA", "HIA212");
        java.lang.String str31 = soundex1.soundex("a1");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A931" + "'", str26, "A931");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A000" + "'", str31, "A000");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Caverphone caverphone7 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str9 = caverphone7.encode("01230120022455012623010202");
        java.lang.String str11 = caverphone7.caverphone("H000");
        java.lang.String str13 = caverphone7.caverphone("1111111111");
        java.lang.String str15 = caverphone7.caverphone("O000");
        java.lang.Object obj16 = metaphone0.encode((java.lang.Object) "O000");
        java.lang.String str18 = metaphone0.encode("0");
        metaphone0.setMaxCodeLen((int) '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "O" + "'", obj16, "O");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "H200");
        int int9 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        java.lang.String str5 = doubleMetaphone0.encode("ORKP");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202", "");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "01230120022455012623010202\000");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex();
        char char13 = refinedSoundex11.getMappingCode('a');
        java.lang.String str15 = refinedSoundex11.soundex("H000");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex11, "ORKP", "H");
        java.lang.String str20 = refinedSoundex11.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str22 = refinedSoundex11.soundex("A000");
        int int25 = refinedSoundex11.difference("H0", "\0000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) refinedSoundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H0" + "'", str15, "H0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O094010303080830603083060905301608" + "'", str20, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A0" + "'", str22, "A0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H");
        int int10 = refinedSoundex0.difference("1111111111", "A000");
        java.lang.String str12 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("a1");
        int int11 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        java.lang.String str14 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean17 = metaphone0.isMetaphoneEqual("O0940103030808306030830609053016080", "AKP");
        boolean boolean20 = metaphone0.isMetaphoneEqual("A0313", "A03");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str9 = soundex7.encode("1");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = soundex7.difference("A621", "O621");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "A0931", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.encode("A310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A000" + "'", str5, "A000");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ORKPXKMNSKTKNKTRKSSPXN", "AA11111111H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("", false);
        int int12 = doubleMetaphone8.getMaxCodeLen();
        int int13 = doubleMetaphone8.maxCodeLen;
        doubleMetaphone8.setMaxCodeLen(1);
        doubleMetaphone8.maxCodeLen = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = metaphone0.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 'A';
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("AA11111111a a");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "AKPK111111", "org.apache.commons.codec.EncoderException: H000");
        java.lang.String str16 = doubleMetaphone0.encode("A111111111");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKKMNSKT", "org.apache.commons.codec.EncoderException: hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone19.doubleMetaphone("", false);
        int int23 = doubleMetaphone19.maxCodeLen;
        doubleMetaphone19.setMaxCodeLen(0);
        java.lang.String str28 = doubleMetaphone19.doubleMetaphone("", true);
        doubleMetaphone19.maxCodeLen = '\000';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone19.new DoubleMetaphoneResult((int) (byte) 0);
        char char35 = doubleMetaphone19.charAt("A03", 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.metaphone("1111111111");
        java.lang.String str16 = metaphone0.encode("1");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str19 = caverphone17.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex();
        char char22 = refinedSoundex20.getMappingCode('a');
        java.lang.String str24 = refinedSoundex20.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj25 = caverphone17.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str27 = caverphone17.caverphone("ORKP");
        boolean boolean30 = caverphone17.isCaverphoneEqual("", "AKPK");
        java.lang.String str32 = caverphone17.encode("A111111111");
        boolean boolean35 = caverphone17.isCaverphoneEqual("HI3", "A0931");
        java.lang.Object obj36 = metaphone0.encode((java.lang.Object) "A0931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKMNSKTS" + "'", str19, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '0' + "'", char22 == '0');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O094010303080830603083060905301608" + "'", str24, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AKPKKMNSKT" + "'", obj25, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AKP1111111" + "'", str27, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A111111111" + "'", str32, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        int int12 = refinedSoundex0.difference("AKPK", "1111111111");
        java.lang.String str14 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = refinedSoundex0.encode(" ");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str14, "O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        java.lang.String str22 = doubleMetaphone10.encode("hi!");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str25 = metaphone0.metaphone("AKP1111111");
        java.lang.String str27 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AKP" + "'", str25, "AKP");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult11.append('1');
        java.lang.String str14 = doubleMetaphoneResult11.getPrimary();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.encode("ORKP");
        java.lang.String str20 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int21 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("01230120022455012623010202");
        int int26 = soundex1.difference("AKPKKMNSKT", "O941");
        java.lang.String str28 = soundex1.encode("A000AKP1111111\000A");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A310" + "'", str28, "A310");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("AKPK", "org.apache.commons.codec.EncoderException: HIA212");
        int int9 = soundex0.difference("AK", "A212");
        java.lang.String str11 = soundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str14 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(1);
        java.lang.String str13 = soundex1.soundex("AKP1111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A310" + "'", str13, "A310");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        java.lang.String str13 = doubleMetaphone0.encode("");
        char char16 = doubleMetaphone0.charAt("AAAA", (int) (byte) 100);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ORKP", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKP" + "'", str19, "ARKPXKMNSKTKNKTRKSPXNRKP");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        int int13 = refinedSoundex0.difference("1111111111", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        char char15 = refinedSoundex0.getMappingCode('A');
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex();
        char char18 = refinedSoundex16.getMappingCode('a');
        int int21 = refinedSoundex16.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str23 = refinedSoundex16.encode("AKPKMNSKTS");
        int int26 = refinedSoundex16.difference("org.apache.commons.codec.EncoderException: \000", "01230120022455012623010202\000");
        java.lang.Object obj27 = refinedSoundex0.encode((java.lang.Object) "01230120022455012623010202\000");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '0' + "'", char15 == '0');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '0' + "'", char18 == '0');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A03138363" + "'", str23, "A03138363");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "hi!", "");
        doubleMetaphone6.maxCodeLen = '4';
        java.lang.String str13 = doubleMetaphone6.doubleMetaphone("");
        int int14 = doubleMetaphone6.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone6.doubleMetaphone("hi!");
        java.lang.Object obj17 = soundex1.encode((java.lang.Object) "hi!");
        java.lang.String str19 = soundex1.encode("");
        java.lang.String str21 = soundex1.encode("");
        java.lang.String str23 = soundex1.encode("O");
        int int24 = soundex1.getMaxLength();
        java.lang.String str26 = soundex1.encode("A0");
        soundex1.setMaxLength((int) (short) 1);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H000" + "'", obj17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A000" + "'", str26, "A000");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = refinedSoundex0.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str13 = soundex11.encode("A0313836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex11.soundex("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: R");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        java.lang.String str14 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean17 = metaphone0.isMetaphoneEqual("K", "");
        metaphone0.setMaxCodeLen((int) '0');
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        org.apache.commons.codec.EncoderException encoderException23 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("");
        encoderException23.addSuppressed((java.lang.Throwable) encoderException25);
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("");
        encoderException28.addSuppressed((java.lang.Throwable) encoderException30);
        encoderException23.addSuppressed((java.lang.Throwable) encoderException30);
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray37 = encoderException36.getSuppressed();
        encoderException34.addSuppressed((java.lang.Throwable) encoderException36);
        encoderException23.addSuppressed((java.lang.Throwable) encoderException34);
        encoderException21.addSuppressed((java.lang.Throwable) encoderException34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = metaphone0.encode((java.lang.Object) encoderException34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "ARKPXKMNSKTKNKTRKSPXN", "A212");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("a", "AKP1111111");
        metaphone0.setMaxCodeLen((int) 'X');
        java.lang.Class<?> wildcardClass16 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("AKP", "ARKPXKMNSKTKNKTRKSPXN", true);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        int int12 = refinedSoundex0.difference("AKPK", "1111111111");
        java.lang.String str14 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = refinedSoundex0.encode("03");
        java.lang.String str18 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.Metaphone metaphone19 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str21 = metaphone19.metaphone("H0");
        boolean boolean24 = metaphone19.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str26 = metaphone19.encode("hi!");
        boolean boolean29 = metaphone19.isMetaphoneEqual("H0", "HI");
        int int30 = metaphone19.getMaxCodeLen();
        metaphone19.setMaxCodeLen((int) (byte) 1);
        java.lang.String str34 = metaphone19.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        metaphone19.setMaxCodeLen(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = refinedSoundex0.encode((java.lang.Object) metaphone19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str14, "O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "O" + "'", str34, "O");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str18 = metaphone0.encode("a1");
        boolean boolean21 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str23 = metaphone0.metaphone("");
        java.lang.String str25 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = caverphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("HI");
        java.lang.String str14 = soundex10.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.Object obj26 = soundex10.encode((java.lang.Object) "hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char30 = doubleMetaphone0.charAt("AKP1111111", 1);
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: AKPKMNSKTS", false);
        java.lang.String str35 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'K' + "'", char30 == 'K');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS" + "'", str33, "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A0313836", "A0310");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = refinedSoundex11.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", "H");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        char[] charArray1 = new char[] { 'S' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = refinedSoundex2.encode("ARKPKSKMNSK");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "S");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[S]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = soundex1.difference("ARKPXKMNSKTSNKTRKSPXN", "01230120022455012623010202\000");
        int int15 = soundex1.difference("", "0");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 'A';
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("AA11111111a a");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "AKPK111111", "org.apache.commons.codec.EncoderException: H000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!", "");
        doubleMetaphone10.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone10.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult17.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = soundex9.encode((java.lang.Object) doubleMetaphoneResult17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen(75);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "", false);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual("AKP", "A212");
        char[] charArray15 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        java.lang.String str18 = soundex16.encode("HI");
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex16, "01230120022455012623010202", "HI");
        int int22 = soundex16.getMaxLength();
        java.lang.String str24 = soundex16.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str26 = soundex16.encode("A000");
        soundex16.setMaxLength(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = metaphone0.encode((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O941" + "'", str24, "O941");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A000" + "'", str26, "A000");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "O09401030308083060308306090530160803138363");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        soundex1.setMaxLength(0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!", "");
        doubleMetaphone10.maxCodeLen = '4';
        java.lang.String str17 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean24 = doubleMetaphone10.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str29 = doubleMetaphone10.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone10.new DoubleMetaphoneResult((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = soundex1.encode((java.lang.Object) doubleMetaphoneResult31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AK", "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone(" ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone7.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone7.maxCodeLen = 100;
        java.lang.String str13 = doubleMetaphone7.encode("HI");
        java.lang.String str15 = doubleMetaphone7.encode("O094010303080830603083060905301608");
        int int16 = doubleMetaphone7.getMaxCodeLen();
        java.lang.Class<?> wildcardClass17 = doubleMetaphone7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = caverphone0.encode((java.lang.Object) doubleMetaphone7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        java.lang.String str12 = soundex10.encode("HI");
        java.lang.String str14 = soundex10.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone15.doubleMetaphone("hi!");
        java.lang.Object obj26 = soundex10.encode((java.lang.Object) "hi!");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("A0");
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("AKPa");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H000" + "'", obj26, "H000");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AKP" + "'", str33, "AKP");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        soundex1.setMaxLength(3);
        int int15 = soundex1.difference("O", "A931");
        int int18 = soundex1.difference("AKPK", "A0313");
        java.lang.String str20 = soundex1.encode("A03138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A000" + "'", str20, "A000");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        boolean boolean14 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "AR");
        int int18 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A000AKP1111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAKP" + "'", str1, "AAKP");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str6 = soundex4.encode("AR");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A900" + "'", str6, "A900");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str12 = soundex10.soundex("A0931538363836931583138363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = soundex10.soundex("org.apache.commons.codec.EncoderException: \000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A000" + "'", str12, "A000");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str10 = soundex8.encode("A0");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex8.difference("A000AKP1111111\000A", "A09");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: K");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str10 = doubleMetaphone0.encode("HI");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        char char11 = refinedSoundex0.getMappingCode('a');
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int2 = soundex1.getMaxLength();
        java.lang.String str4 = soundex1.encode("");
        java.lang.String str6 = soundex1.soundex("A03");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HI", "AA11111111");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "org.apache.commons.codec.EncoderException: HIA212");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("HI", "hi!");
        java.lang.String str8 = refinedSoundex0.soundex("");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "HI3");
        java.lang.String str13 = refinedSoundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str13, "O094010303080830603083060905301608094010303080830603083060905301608");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) '1');
        java.lang.String str6 = soundex2.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKPKMNSKTS" + "'", str1, "AKPKMNSKTS");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("a1", "AA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        boolean boolean13 = metaphone0.isMetaphoneEqual("01230120022455012623010202", "");
        java.lang.String str15 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }
}
