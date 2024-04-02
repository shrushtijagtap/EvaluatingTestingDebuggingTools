package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        char char9 = refinedSoundex0.getMappingCode('4');
        java.lang.String str11 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: \000");
        char char13 = refinedSoundex0.getMappingCode('K');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O094010303080830603083060905301608" + "'", str11, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '3' + "'", char13 == '3');
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        char char15 = doubleMetaphone0.charAt("", (int) '0');
        doubleMetaphone0.maxCodeLen = '.';
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "0");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.caverphone("A09315383");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        java.lang.String str7 = soundex2.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        soundex2.setMaxLength(0);
        int int12 = soundex2.difference("", " ");
        int int13 = soundex2.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O941" + "'", str7, "O941");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.caverphone("AKP1111111");
        java.lang.String str19 = caverphone0.encode("A000");
        java.lang.String str21 = caverphone0.encode("hi!");
        java.lang.String str23 = caverphone0.encode("A000AKP1111111\000A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKP1111111" + "'", str17, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AKPA111111" + "'", str23, "AKPA111111");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        java.lang.String str12 = metaphone0.encode("RKPKSKMNSKTKNKTRKSPKSNRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RKPK" + "'", str12, "RKPK");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("A0313836");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = caverphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.caverphone("H000");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "O000", "org.apache.commons.codec.EncoderException: A931");
        java.lang.String str11 = caverphone0.encode(" ");
        java.lang.String str13 = caverphone0.encode("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AKPKMNSKTS" + "'", str13, "AKPKMNSKTS");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("AKPK", "org.apache.commons.codec.EncoderException: HIA212");
        int int9 = soundex0.difference("", "A4");
        java.lang.String str11 = soundex0.encode("ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A621" + "'", str11, "A621");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = soundex1.encode("A000");
        soundex1.setMaxLength(0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("A0313836");
        java.lang.String str8 = metaphone0.encode("org.apache.commons.codec.EncoderException: 0123012002245501262301020211111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORKP" + "'", str8, "ORKP");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("A0313836");
        java.lang.String str9 = soundex0.encode("org.apache.commons.codec.EncoderException: \000");
        java.lang.String str11 = soundex0.soundex("A000AKP1111111AKP1111111O000org.apache.commons.codec.EncoderException: A09313836383693138");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A000" + "'", str7, "A000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A212" + "'", str11, "A212");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = caverphone0.isCaverphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ARKP");
        char[] charArray8 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray8);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray8);
        java.lang.String str12 = soundex10.encode("A0931");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str15 = refinedSoundex13.encode("01230120022455012623010202");
        java.lang.String str17 = refinedSoundex13.soundex("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone19.doubleMetaphone("", false);
        int int23 = doubleMetaphone19.maxCodeLen;
        int int24 = doubleMetaphone19.maxCodeLen;
        boolean boolean27 = doubleMetaphone19.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj28 = doubleMetaphone18.encode((java.lang.Object) "HI");
        java.lang.String str30 = doubleMetaphone18.encode("hi!");
        java.lang.Object obj31 = refinedSoundex13.encode((java.lang.Object) str30);
        java.lang.Object obj32 = soundex10.encode(obj31);
        java.lang.String str34 = soundex10.soundex("org.apache.commons.codec.EncoderException: A931");
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: A931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone36 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str39 = doubleMetaphone36.doubleMetaphone("", false);
        int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone36, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str44 = doubleMetaphone36.encode("hi!");
        java.lang.String str46 = doubleMetaphone36.doubleMetaphone("H000");
        doubleMetaphone36.maxCodeLen = 10;
        doubleMetaphone36.setMaxCodeLen(2);
        doubleMetaphone36.maxCodeLen = 4;
        int int53 = doubleMetaphone36.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = caverphone0.encode((java.lang.Object) doubleMetaphone36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A000" + "'", str12, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A0" + "'", str17, "A0");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H" + "'", obj28, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H0" + "'", obj31, "H0");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "O941" + "'", str34, "O941");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "AKPKKMNSKT" + "'", obj35, "AKPKKMNSKT");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H" + "'", str44, "H");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        char char9 = refinedSoundex7.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex7.difference("aHIA212 ", "ARKPKKMNSKTKNKTRKSPXN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("O0");
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("AA11111111", "");
        java.lang.String str7 = metaphone0.encode("O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O" + "'", str7, "O");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202\000");
        java.lang.String str12 = doubleMetaphone0.encode("#HIK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        doubleMetaphoneResult14.appendPrimary("A09");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "K" + "'", str12, "K");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
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
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj26 = caverphone24.encode((java.lang.Object) "HI");
        java.lang.String str28 = caverphone24.caverphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean31 = caverphone24.isCaverphoneEqual("AKPK", "O0940103030808306030830609053016080940103030808306030830609053016080");
        java.lang.String str33 = caverphone24.caverphone("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        java.lang.Object obj34 = soundex1.encode((java.lang.Object) "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
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
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AA11111111" + "'", obj26, "AA11111111");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKPKMNSKTS" + "'", str28, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AKPKMNSKTK" + "'", str33, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "A931" + "'", obj34, "A931");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHIA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        java.lang.String str10 = refinedSoundex8.encode("A09");
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = refinedSoundex8.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A4" + "'", str10, "A4");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.metaphone("1111111111");
        boolean boolean19 = metaphone0.isMetaphoneEqual("A03138363", "ARKPKSKMNSKTSNKTRKSPKSN");
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
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
        int int24 = metaphone0.getMaxCodeLen();
        java.lang.String str26 = metaphone0.encode("A0");
        int int27 = metaphone0.getMaxCodeLen();
        java.lang.String str29 = metaphone0.encode("A093138363836931389313836383693138");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        boolean boolean7 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTSNKTRKSPXN", "AKP1111111");
        metaphone0.setMaxCodeLen((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = refinedSoundex13.difference("AAAA", "ARKPXKMNSKTKNKTRKSPXN");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        char[] charArray0 = null;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = refinedSoundex1.encode("ARKPKSKMNSK");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.soundex("A621");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A000" + "'", str8, "A000");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = refinedSoundex13.difference("AKPKMNSKTS", "RKPXKMNSKT");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "ORKP");
        int int16 = metaphone0.getMaxCodeLen();
        int int17 = metaphone0.getMaxCodeLen();
        java.lang.String str19 = metaphone0.metaphone("01230120022455012623010202");
        metaphone0.setMaxCodeLen(75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ORKP" + "'", obj15, "ORKP");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen(75);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "", false);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKKPKKMN", "A03131");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("A212");
        java.lang.String str10 = caverphone0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str12 = caverphone0.encode("A09");
        boolean boolean15 = caverphone0.isCaverphoneEqual("", "A111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONH" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONH");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1533");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.encode("O");
        int int18 = refinedSoundex0.difference("", "");
        java.lang.String str20 = refinedSoundex0.soundex("AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A03138363" + "'", str20, "A03138363");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str13 = caverphone11.encode("01230120022455012623010202");
        java.lang.String str15 = caverphone11.caverphone("H000");
        java.lang.String str17 = caverphone11.caverphone("1111111111");
        java.lang.String str19 = caverphone11.caverphone("O000");
        java.lang.String str21 = caverphone11.caverphone("org.apache.commons.codec.EncoderException: A0");
        boolean boolean24 = caverphone11.isCaverphoneEqual("HI1A093153836383693158", "O094010303080830603083060905301608094010303080830603083060905301608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = metaphone0.encode((java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AKPKKMNSKT" + "'", str21, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
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
        int int24 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex();
        char char27 = refinedSoundex25.getMappingCode('a');
        int int30 = refinedSoundex25.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str32 = refinedSoundex25.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str35 = refinedSoundex33.encode("01230120022455012623010202");
        java.lang.Object obj36 = refinedSoundex25.encode((java.lang.Object) str35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = metaphone0.encode(obj36);
        java.lang.String str40 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str42 = metaphone0.encode("AKPKP");
        java.lang.Object obj43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = metaphone0.encode(obj43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '0' + "'", char27 == '0');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H0" + "'", str32, "H0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORKP" + "'", str40, "ORKP");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AKPK" + "'", str42, "AKPK");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        java.lang.String str9 = caverphone0.caverphone("A111111111");
        java.lang.String str11 = caverphone0.caverphone("AKPa");
        java.lang.String str13 = caverphone0.encode("X");
        java.lang.String str15 = caverphone0.caverphone("HI1A093153836383693158");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKKMNSKT" + "'", str7, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPA111111" + "'", str11, "AKPA111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "K111111111" + "'", str13, "K111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("");
        java.lang.String str6 = caverphone0.encode("H000");
        java.lang.String str8 = caverphone0.caverphone("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str10 = caverphone0.caverphone("AH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char3 = refinedSoundex1.getMappingCode('.');
        java.lang.String str5 = refinedSoundex1.encode("A0313836");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A0" + "'", str5, "A0");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH;
        java.lang.String str2 = refinedSoundex0.encode("\0000");
        org.apache.commons.codec.language.Caverphone caverphone3 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str5 = caverphone3.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex();
        char char8 = refinedSoundex6.getMappingCode('a');
        java.lang.String str10 = refinedSoundex6.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj11 = caverphone3.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str13 = caverphone3.caverphone("ORKP");
        boolean boolean16 = caverphone3.isCaverphoneEqual("", "AKPK");
        java.lang.String str18 = caverphone3.encode("A111111111");
        java.lang.String str20 = caverphone3.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str22 = caverphone3.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean25 = caverphone3.isCaverphoneEqual("ORKPXKMNSKTKNKTRKSSPXNR", "3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = refinedSoundex0.encode((java.lang.Object) caverphone3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(refinedSoundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AKPKMNSKTS" + "'", str5, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O094010303080830603083060905301608" + "'", str10, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AKP1111111" + "'", str13, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A111111111" + "'", str18, "A111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKKMNSKT" + "'", str20, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AKPKKMNSKT" + "'", str22, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1540");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        java.lang.String str7 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: O000");
        char char11 = refinedSoundex0.getMappingCode('8');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0940103030808306030830609053016080" + "'", str9, "O0940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("ARKPXKMNSKTKNKTRKSPXNR");
        java.lang.String str4 = refinedSoundex0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str6 = refinedSoundex0.soundex("0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0931538363836931589" + "'", str2, "A0931538363836931589");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A09313836383693138" + "'", str4, "A09313836383693138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = '3';
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("AKPK111111", true);
        doubleMetaphone0.setMaxCodeLen((int) 'o');
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        int int23 = doubleMetaphone0.maxCodeLen;
        int int24 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPK" + "'", str18, "AKPK");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str22, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 111 + "'", int23 == 111);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 111 + "'", int24 == 111);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
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
        int int25 = soundex2.getMaxLength();
        int int26 = soundex2.getMaxLength();
        java.lang.String str28 = soundex2.encode("hi!");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str4 = refinedSoundex2.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        boolean boolean8 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append("O0");
        doubleMetaphoneResult7.appendPrimary('r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.metaphone("1111111111");
        java.lang.String str16 = metaphone0.encode("1");
        boolean boolean19 = metaphone0.isMetaphoneEqual("\000", "AKPKMNSKTS");
        metaphone0.setMaxCodeLen((int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("K301230120022455012623010202\000");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("AR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex0.encode((java.lang.Object) encoderException14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "K3" + "'", str12, "K3");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        char char4 = refinedSoundex0.getMappingCode('9');
        java.lang.Object obj6 = refinedSoundex0.encode((java.lang.Object) "AKPKMNSKTK");
        java.lang.String str8 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: A0");
        int int11 = refinedSoundex0.difference("ORKPXKMNSKTSNKTRKSSPXNRKP", "A03");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A03138363" + "'", obj6, "A03138363");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0940103030808306030830609053016080" + "'", str8, "O0940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
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
        int int24 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex();
        char char27 = refinedSoundex25.getMappingCode('a');
        int int30 = refinedSoundex25.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str32 = refinedSoundex25.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str35 = refinedSoundex33.encode("01230120022455012623010202");
        java.lang.Object obj36 = refinedSoundex25.encode((java.lang.Object) str35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = metaphone0.encode(obj36);
        metaphone0.setMaxCodeLen((int) 'K');
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex41 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str43 = refinedSoundex41.encode("01230120022455012623010202");
        java.lang.Class<?> wildcardClass44 = refinedSoundex41.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = metaphone0.encode((java.lang.Object) wildcardClass44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '0' + "'", char27 == '0');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H0" + "'", str32, "H0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        soundex1.setMaxLength((int) ' ');
        soundex1.setMaxLength((int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        int int16 = doubleMetaphone11.maxCodeLen;
        boolean boolean19 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj20 = doubleMetaphone10.encode((java.lang.Object) "HI");
        doubleMetaphone10.maxCodeLen = '#';
        boolean boolean26 = doubleMetaphone10.isDoubleMetaphoneEqual("H0", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", true);
        doubleMetaphone10.maxCodeLen = (short) 10;
        java.lang.String str30 = doubleMetaphone10.doubleMetaphone("1org.apache.commons.codec.EncoderException: A931");
        java.lang.Object obj31 = soundex1.encode((java.lang.Object) "1org.apache.commons.codec.EncoderException: A931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "RKPXKMNSKT" + "'", str30, "RKPXKMNSKT");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "O941" + "'", obj31, "O941");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        char char13 = doubleMetaphone0.charAt("A931", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'K');
        java.lang.String str17 = doubleMetaphone0.encode("A03138363");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA", "SR");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1552");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("A0", "1111111111");
        boolean boolean23 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        soundex1.setMaxLength(1);
        char[] charArray12 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("HI");
        int int16 = soundex13.getMaxLength();
        org.apache.commons.codec.language.Metaphone metaphone17 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str19 = metaphone17.metaphone("H0");
        boolean boolean22 = metaphone17.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str24 = metaphone17.encode("hi!");
        boolean boolean27 = metaphone17.isMetaphoneEqual("H0", "HI");
        java.lang.Object obj28 = soundex13.encode((java.lang.Object) "H0");
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex13, "ORKP", "");
        int int34 = soundex13.difference("", "A");
        int int37 = soundex13.difference("O0940103030808306030830609053016080940103030808306030830609053016080", "O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.Object obj38 = soundex1.encode((java.lang.Object) "O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = soundex1.encode(obj39);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "O000" + "'", obj38, "O000");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AKPKKMNSKT");
        boolean boolean11 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: A931");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        int int13 = doubleMetaphone0.maxCodeLen;
        int int14 = doubleMetaphone0.maxCodeLen;
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202");
        doubleMetaphone0.maxCodeLen = (short) 100;
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("HIA212aX", "A0212", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("A0313836");
        java.lang.String str9 = soundex0.soundex("A031");
        int int12 = soundex0.difference("org.apache.commons.codec.EncoderException: H000", "A09313836383693138");
        java.lang.String str14 = soundex0.encode("org.apache.commons.codec.EncoderException: AA11111111");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex();
        char char17 = refinedSoundex15.getMappingCode('a');
        java.lang.String str19 = refinedSoundex15.soundex("org.apache.commons.codec.EncoderException: ");
        char char21 = refinedSoundex15.getMappingCode('#');
        int int24 = refinedSoundex15.difference("H000", "hi!");
        java.lang.String str26 = refinedSoundex15.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex15, "O0940103030808306030830609053016080", "HIA212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) int29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A000" + "'", str7, "A000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O621" + "'", str14, "O621");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '0' + "'", char17 == '0');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O094010303080830603083060905301608" + "'", str19, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O094010303080830603083060905301608" + "'", str26, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        int int10 = refinedSoundex0.difference("A000", "A313");
        org.apache.commons.codec.language.Caverphone caverphone11 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str13 = caverphone11.encode("01230120022455012623010202");
        java.lang.String str15 = caverphone11.caverphone("H000");
        java.lang.String str17 = caverphone11.caverphone("1111111111");
        java.lang.String str19 = caverphone11.encode("O094010303080830603083060905301608");
        java.lang.Object obj20 = refinedSoundex0.encode((java.lang.Object) str19);
        java.lang.String str22 = refinedSoundex0.soundex("H03");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "A0" + "'", obj20, "A0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H0" + "'", str22, "H0");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone0.setMaxCodeLen(0);
        char char19 = doubleMetaphone0.charAt("O", (int) (byte) -1);
        int int20 = doubleMetaphone0.maxCodeLen;
        char char23 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: ", 100);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("A09313836383693138", false);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.maxCodeLen = '3';
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "HI3", true);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        char char28 = doubleMetaphone0.charAt("ARKPKSKMNSKTSNKTRKSPKSN", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS" + "'", str25, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("A212");
        boolean boolean11 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A0");
        boolean boolean14 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: O000");
        java.lang.String str16 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        char char13 = doubleMetaphone0.charAt("A000", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen(3);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "hi!", "");
        doubleMetaphone16.maxCodeLen = '4';
        java.lang.String str23 = doubleMetaphone16.doubleMetaphone("");
        int int24 = doubleMetaphone16.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone16.doubleMetaphone("hi!");
        java.lang.Object obj28 = doubleMetaphone16.encode((java.lang.Object) "HI");
        java.lang.Object obj29 = doubleMetaphone0.encode(obj28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex();
        int int33 = soundex30.difference("AKP", "AKPK111111");
        int int34 = soundex30.getMaxLength();
        java.lang.String str36 = soundex30.encode("ARKPKKMNSKTKNKTRKSPXN");
        java.lang.String str38 = soundex30.soundex("ORKPXKMNSK");
        java.lang.Object obj39 = doubleMetaphone0.encode((java.lang.Object) "ORKPXKMNSK");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H" + "'", obj28, "H");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "A621" + "'", str36, "A621");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "O621" + "'", str38, "O621");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "ARK" + "'", obj39, "ARK");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.soundex("AAKP");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A031" + "'", str15, "A031");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O", "O0");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.encode("01230120022455012623010202");
        java.lang.String str10 = caverphone6.caverphone("H000");
        java.lang.String str12 = caverphone6.caverphone("01230120022455012623010202");
        java.lang.String str14 = caverphone6.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode((java.lang.Object) caverphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AKPKKMNSKT" + "'", str14, "AKPKKMNSKT");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) '.');
        int int4 = soundex1.getMaxLength();
        int int7 = soundex1.difference("ARKPKSKMNSKTKNKTRKSPKSN", "O094010303080830603083060905301608");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
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
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202");
        java.lang.String str34 = doubleMetaphone0.encode("A212");
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("HIA212aX", "03H", true);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A" + "'", str34, "A");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        java.lang.String str12 = metaphone0.metaphone("A03131");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        java.lang.String str11 = refinedSoundex0.soundex("");
        org.apache.commons.codec.language.Metaphone metaphone12 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str14 = metaphone12.metaphone("H0");
        boolean boolean17 = metaphone12.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str19 = metaphone12.encode("hi!");
        boolean boolean22 = metaphone12.isMetaphoneEqual("H0", "HI");
        boolean boolean25 = metaphone12.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean28 = metaphone12.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str30 = metaphone12.encode("a1");
        boolean boolean33 = metaphone12.isMetaphoneEqual("ORKP", "#HIK");
        java.lang.Object obj34 = refinedSoundex0.encode((java.lang.Object) "#HIK");
        char char36 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0940103030808306030830609053016080940103030808306030830609053016080" + "'", str9, "O0940103030808306030830609053016080940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A" + "'", str30, "A");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H03" + "'", obj34, "H03");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '0' + "'", char36 == '0');
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = caverphone0.caverphone("A0313");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone8, "hi!", "");
        doubleMetaphone8.maxCodeLen = '4';
        java.lang.String str15 = doubleMetaphone8.doubleMetaphone("");
        boolean boolean18 = doubleMetaphone8.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        int int19 = doubleMetaphone8.getMaxCodeLen();
        int int20 = doubleMetaphone8.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = caverphone0.encode((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str11 = caverphone9.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex();
        char char14 = refinedSoundex12.getMappingCode('a');
        java.lang.String str16 = refinedSoundex12.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj17 = caverphone9.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str19 = caverphone9.caverphone("ORKP");
        boolean boolean22 = caverphone9.isCaverphoneEqual("", "AKPK");
        java.lang.Object obj23 = caverphone0.encode((java.lang.Object) "AKPK");
        boolean boolean26 = caverphone0.isCaverphoneEqual("A03131", "K000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKMNSKTS" + "'", str11, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '0' + "'", char14 == '0');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O094010303080830603083060905301608" + "'", str16, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "AKPKKMNSKT" + "'", obj17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKP1111111" + "'", str19, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "AKPK111111" + "'", obj23, "AKPK111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1571");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = refinedSoundex0.encode((java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1572");
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
        java.lang.String str21 = caverphone0.encode(" ");
        char[] charArray22 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str25 = soundex23.encode("HI");
        int int28 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex23, "01230120022455012623010202", "HI");
        int int29 = soundex23.getMaxLength();
        java.lang.String str31 = soundex23.soundex("1111111111");
        java.lang.String str33 = soundex23.soundex("AKPKKMNSKT#");
        java.lang.String str35 = soundex23.soundex("AKPKMNSK");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "A313" + "'", str33, "A313");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "A313" + "'", str35, "A313");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1573");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "AA11111111", "ARKP");
        java.lang.String str10 = caverphone0.encode("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.String str12 = caverphone0.caverphone("H200");
        java.lang.Object obj14 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "AKPKKMNSKT" + "'", obj14, "AKPKKMNSKT");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("a1", true);
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A031");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("0123012002245501262301020211111111111");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1575");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.maxCodeLen = '3';
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone20, "hi!", "");
        java.lang.String str25 = doubleMetaphone20.encode("ORKP");
        int int26 = doubleMetaphone20.getMaxCodeLen();
        int int27 = doubleMetaphone20.maxCodeLen;
        char char30 = doubleMetaphone20.charAt("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) char30);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1576");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        java.lang.String str7 = caverphone0.caverphone("AA11111111a a");
        java.lang.String str9 = caverphone0.caverphone("ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKPKKMNSKT" + "'", str9, "AKPKKMNSKT");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1577");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        int int7 = refinedSoundex4.difference("A03138363", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1578");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str11 = metaphone0.encode("0");
        java.lang.String str13 = metaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        int int14 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1579");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("A0313836");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A09313836383693138", "H");
        java.lang.String str11 = caverphone0.caverphone("H000");
        java.lang.String str13 = caverphone0.caverphone("A031309401030308083060308306090530160803138363");
        java.lang.String str15 = caverphone0.encode("1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1580");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0123012002245501262301020211111111111");
        int int20 = metaphone0.getMaxCodeLen();
        java.lang.Object obj22 = metaphone0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
        java.lang.String str24 = metaphone0.encode("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "ORKPXKMNSKTSNKTRKSSPXNRKP" + "'", obj22, "ORKPXKMNSKTSNKTRKSSPXNRKP");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AKPKMNSKTS" + "'", str24, "AKPKMNSKTS");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1581");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("01230120022455012623010202\000", "a1");
        boolean boolean18 = caverphone0.isCaverphoneEqual("A09313836383693138", "A0313836");
        java.lang.String str20 = caverphone0.caverphone("");
        java.lang.String str22 = caverphone0.caverphone("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AKPKKMNSKT" + "'", str22, "AKPKKMNSKT");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1582");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "0");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", "O093153836383693158", true);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("O09401030308083060308306090530160803138363", "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        int int25 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1583");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("HI3");
        boolean boolean15 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: A313", "org.apache.commons.codec.EncoderException: A0");
        boolean boolean18 = caverphone0.isCaverphoneEqual("AHH", "AKP");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "ARKPKKMNSKTKNKTRKSPXN");
        boolean boolean24 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: AKPKMNSK11", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1584");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.String str6 = refinedSoundex0.soundex("A093153836383693158");
        java.lang.String str8 = refinedSoundex0.encode("A031309401030308083060308306090530160803138363");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0" + "'", str8, "A0");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1585");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        metaphone0.setMaxCodeLen((int) '#');
        metaphone0.setMaxCodeLen(3);
        metaphone0.setMaxCodeLen((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str8 = doubleMetaphoneResult7.getPrimary();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('3');
        java.lang.String str12 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('0');
        boolean boolean15 = doubleMetaphoneResult7.isComplete();
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "30" + "'", str16, "30");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1587");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1588");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("ARKPXKMNSKTKNKTRKSPXNR");
        java.lang.String str4 = refinedSoundex0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        char[] charArray5 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray5);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) charArray5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0931538363836931589" + "'", str2, "A0931538363836931589");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A09313836383693138" + "'", str4, "A09313836383693138");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1589");
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
        boolean boolean27 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "ARKPXKMNSKTSNKTRKSPXN");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1590");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        char char13 = doubleMetaphone0.charAt("A000", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        doubleMetaphone0.maxCodeLen = 'E';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1592");
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
        int int24 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex();
        char char27 = refinedSoundex25.getMappingCode('a');
        int int30 = refinedSoundex25.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str32 = refinedSoundex25.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str35 = refinedSoundex33.encode("01230120022455012623010202");
        java.lang.Object obj36 = refinedSoundex25.encode((java.lang.Object) str35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = metaphone0.encode(obj36);
        java.lang.String str40 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: HIA212");
        boolean boolean43 = metaphone0.isMetaphoneEqual("AKP1111111 041", "AKPR");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '0' + "'", char27 == '0');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H0" + "'", str32, "H0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORKP" + "'", str40, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1593");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        soundex0.setMaxLength((int) '0');
        int int7 = soundex0.difference("", "A0931538363836931583138363");
        java.lang.String str9 = soundex0.encode("AKPKMNSKTK");
        soundex0.setMaxLength(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A212" + "'", str9, "A212");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1594");
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
        java.lang.String str21 = caverphone0.encode(" ");
        boolean boolean24 = caverphone0.isCaverphoneEqual("A000H0H000", "ARKP");
        boolean boolean27 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str29 = caverphone0.caverphone("RKPK");
        java.lang.String str31 = caverphone0.encode("SR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "KPK1111111" + "'", str29, "KPK1111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "SA11111111" + "'", str31, "SA11111111");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1595");
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
        java.lang.String str21 = caverphone0.encode("HIA212");
        boolean boolean24 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A093153836383693158");
        java.lang.String str26 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: HIA212");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AKPKKMNSKT" + "'", str26, "AKPKKMNSKT");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1596");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        int int12 = refinedSoundex0.difference("AKPK", "1111111111");
        java.lang.String str14 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str16 = refinedSoundex0.encode("03");
        java.lang.String str18 = refinedSoundex0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str22 = doubleMetaphone19.doubleMetaphone("", false);
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone19, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str27 = doubleMetaphone19.encode("hi!");
        java.lang.String str29 = doubleMetaphone19.doubleMetaphone("H000");
        doubleMetaphone19.maxCodeLen = 10;
        int int32 = doubleMetaphone19.getMaxCodeLen();
        boolean boolean36 = doubleMetaphone19.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = refinedSoundex0.encode((java.lang.Object) boolean36);
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1597");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("HI");
        java.lang.Class<?> wildcardClass12 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1598");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str15 = metaphone0.encode("SA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1599");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1600");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        int int12 = refinedSoundex3.difference("A212", "ARKPXKMNSK");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1601");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("HI", "hi!");
        java.lang.String str8 = refinedSoundex0.soundex("A931");
        int int11 = refinedSoundex0.difference("AKPKKPKKMN", "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0" + "'", str8, "A0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1602");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "H200");
        boolean boolean11 = metaphone0.isMetaphoneEqual("O0940103030808306030830609053016080940103030808306030830609053016080", "O0");
        boolean boolean14 = metaphone0.isMetaphoneEqual("\000H200", "ARKPXKMNSKTSNKTRKSPXNaA");
        org.apache.commons.codec.language.Metaphone metaphone15 = new org.apache.commons.codec.language.Metaphone();
        org.apache.commons.codec.language.Metaphone metaphone16 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str18 = metaphone16.metaphone("H0");
        boolean boolean21 = metaphone16.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str23 = metaphone16.encode("hi!");
        boolean boolean26 = metaphone16.isMetaphoneEqual("H0", "HI");
        int int27 = metaphone16.getMaxCodeLen();
        java.lang.String str29 = metaphone16.encode("HI");
        metaphone16.setMaxCodeLen((int) (short) 100);
        boolean boolean34 = metaphone16.isMetaphoneEqual("\000", "");
        java.lang.String str36 = metaphone16.encode("hi!");
        java.lang.String str38 = metaphone16.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        java.lang.Object obj39 = metaphone15.encode((java.lang.Object) "ARKPKSKMNSKTKNKTRKSPKSN");
        java.lang.Object obj40 = metaphone0.encode(obj39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str38, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "ARKP" + "'", obj39, "ARKP");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "ARKP" + "'", obj40, "ARKP");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1603");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: A0");
        metaphone0.setMaxCodeLen(0);
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORKP" + "'", str8, "ORKP");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1604");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("HIA212", false);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("04", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1605");
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
        int int30 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1606");
        char[] charArray4 = new char[] { 'S', '#', '4', 'O' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.encode("01230120022455012623010202");
        java.lang.String str10 = caverphone6.caverphone("H000");
        java.lang.String str12 = caverphone6.encode("A");
        java.lang.String str14 = caverphone6.caverphone("A212");
        boolean boolean17 = caverphone6.isCaverphoneEqual("01230120022455012623010202", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = refinedSoundex5.encode((java.lang.Object) caverphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "S#4O");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "S#4O");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[S, #, 4, O]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1607");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1111111111", "H0");
        java.lang.String str17 = metaphone0.encode("AKP001230120022455012623010202");
        java.lang.String str19 = metaphone0.encode("ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKP" + "'", str17, "AKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKP" + "'", str19, "ARKP");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1608");
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
        int int24 = soundex1.getMaxLength();
        soundex1.setMaxLength(8);
        java.lang.String str28 = soundex1.soundex("A000\000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone29 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone29, "hi!", "");
        doubleMetaphone29.maxCodeLen = '4';
        boolean boolean38 = doubleMetaphone29.isDoubleMetaphoneEqual("O0940103030808306030830609053016080", "", false);
        org.apache.commons.codec.language.Caverphone caverphone39 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str41 = caverphone39.encode("01230120022455012623010202");
        boolean boolean44 = caverphone39.isCaverphoneEqual("O941", "a1");
        java.lang.Object obj45 = doubleMetaphone29.encode((java.lang.Object) "O941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = soundex1.encode((java.lang.Object) doubleMetaphone29);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A000" + "'", str28, "A000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1111111111" + "'", str41, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "A" + "'", obj45, "A");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1609");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        doubleMetaphoneResult8.append("O", "O093153836383693158");
        doubleMetaphoneResult8.append('4', '\000');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) "A093153836383693158");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A313", "O094010303080830603083060905301608", true);
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("HI");
        int int19 = soundex14.difference("A", "HIA212");
        soundex14.setMaxLength((int) '3');
        java.lang.String str23 = soundex14.soundex("A0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) soundex14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "A" + "'", obj8, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A000" + "'", str23, "A000");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1611");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("A0310", "01230120022455012623010202HI3", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1612");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.Object obj10 = caverphone0.encode((java.lang.Object) "AKPKMNSKTS");
        java.lang.String str12 = caverphone0.caverphone("03");
        java.lang.String str14 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "AKPKMNSKTS" + "'", obj10, "AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1613");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        java.lang.String str15 = metaphone0.metaphone("A0313836");
        java.lang.String str17 = metaphone0.encode("01230120022455012623010202");
        java.lang.String str19 = metaphone0.encode("K");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "K" + "'", str19, "K");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1614");
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
        java.lang.String str31 = soundex1.soundex("org.apache.commons.codec.EncoderException: hi!");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "O941" + "'", str31, "O941");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1615");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        int int14 = refinedSoundex3.difference("0123012002245501262301020211111111111", "");
        int int17 = refinedSoundex3.difference("ARK", "org.apache.commons.codec.EncoderException: HI");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1616");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        java.lang.String str9 = metaphone0.metaphone("AR");
        boolean boolean12 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AR" + "'", str9, "AR");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1617");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = soundex1.difference("A", "HIA212");
        soundex1.setMaxLength((int) '3');
        java.lang.String str10 = soundex1.encode("A0313");
        int int11 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1618");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str4 = refinedSoundex2.soundex("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        char char6 = refinedSoundex2.getMappingCode('R');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A093153836383693158931538363836931583138363" + "'", str4, "A093153836383693158931538363836931583138363");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '9' + "'", char6 == '9');
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1619");
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
        char[] charArray29 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray29);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex32 = new org.apache.commons.codec.language.RefinedSoundex(charArray29);
        char char34 = refinedSoundex32.getMappingCode('1');
        java.lang.String str36 = refinedSoundex32.encode("");
        java.lang.String str38 = refinedSoundex32.encode("");
        char char40 = refinedSoundex32.getMappingCode('1');
        int int43 = refinedSoundex32.difference("", "A09315383638369315893153836383693158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = refinedSoundex0.encode((java.lang.Object) int43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\000' + "'", char40 == '\000');
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1620");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        boolean boolean10 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "H0");
        java.lang.String str12 = metaphone0.metaphone("O941");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1111111111", "H0");
        java.lang.String str17 = metaphone0.encode("AKP001230120022455012623010202");
        org.apache.commons.codec.language.Metaphone metaphone18 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean21 = metaphone18.isMetaphoneEqual("AKPa", "");
        int int22 = metaphone18.getMaxCodeLen();
        boolean boolean25 = metaphone18.isMetaphoneEqual("", "");
        java.lang.Object obj26 = metaphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O" + "'", str12, "O");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKP" + "'", str17, "AKP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1621");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HI3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1622");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        java.lang.String str6 = metaphone0.metaphone("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str8 = metaphone0.encode("ARKPXKMNSK");
        boolean boolean11 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "ORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AR" + "'", str6, "AR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AR" + "'", str8, "AR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1623");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("A0931538363836931583138363", "A0931538363836931583138363");
        java.lang.String str13 = soundex1.encode("AAAA");
        java.lang.String str15 = soundex1.encode("AKPKMNSK11");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A313" + "'", str15, "A313");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1624");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(111);
        java.lang.String str14 = metaphone0.encode("ARKPXKMNSK");
        java.lang.String str16 = metaphone0.encode("org.apache.commons.codec.EncoderException: AR");
        java.lang.String str18 = metaphone0.encode("0");
        metaphone0.setMaxCodeLen(35);
        metaphone0.setMaxCodeLen((int) 'X');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKSKMNSK" + "'", str14, "ARKPKSKMNSK");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXNR" + "'", str16, "ORKPXKMNSKTKNKTRKSSPXNR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1625");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str18 = metaphone0.encode("a1");
        boolean boolean21 = metaphone0.isMetaphoneEqual("ORKP", "#HIK");
        java.lang.String str23 = metaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONHIA");
        java.lang.String str25 = metaphone0.encode("03");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORKP" + "'", str23, "ORKP");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1626");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        java.lang.String str11 = soundex0.soundex("O000");
        soundex0.setMaxLength(0);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1627");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.maxCodeLen = 43;
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) "A0313");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "A" + "'", obj15, "A");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKKMNSKT", "org.apache.commons.codec.EncoderException: ", false);
        int int12 = doubleMetaphone0.getMaxCodeLen();
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1629");
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
        int int22 = soundex1.getMaxLength();
        int int23 = soundex1.getMaxLength();
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex1.encode(obj24);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1630");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("AKPKMNSKTS", "");
        java.lang.String str22 = metaphone0.metaphone("O621");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "O" + "'", str22, "O");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1631");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "ARKPKSKMNSKTSNKTRKSPKSN", "A0313");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("HIA212", "", false);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("#HIK", "#HIA093153836383693158");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1632");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("AKPK111111", "ARKPXKMNSKTSNKTRKSPXN");
        int int19 = metaphone0.getMaxCodeLen();
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "01230120022455012623010202\000");
        int int23 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1633");
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
        int int24 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex25 = new org.apache.commons.codec.language.RefinedSoundex();
        char char27 = refinedSoundex25.getMappingCode('a');
        int int30 = refinedSoundex25.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str32 = refinedSoundex25.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex33 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str35 = refinedSoundex33.encode("01230120022455012623010202");
        java.lang.Object obj36 = refinedSoundex25.encode((java.lang.Object) str35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = metaphone0.encode(obj36);
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str42 = metaphone0.encode("A313");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '0' + "'", char27 == '0');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H0" + "'", str32, "H0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "A" + "'", str42, "A");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1634");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("A212");
        boolean boolean11 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A0");
        java.lang.String str13 = caverphone0.encode("3");
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1635");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.soundex("A0931538363836931583138363");
        char char6 = refinedSoundex0.getMappingCode('O');
        org.apache.commons.codec.EncoderException encoderException8 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray9 = encoderException8.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        encoderException11.addSuppressed((java.lang.Throwable) encoderException13);
        encoderException8.addSuppressed((java.lang.Throwable) encoderException11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex0.encode((java.lang.Object) encoderException11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0" + "'", str4, "A0");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1636");
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
        int int29 = soundex1.difference("AKPKKMNSKT", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int30 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1637");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.encode("H000");
        boolean boolean13 = caverphone0.isCaverphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "");
        java.lang.String str15 = caverphone0.encode("A0931");
        org.apache.commons.codec.language.Metaphone metaphone16 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str18 = metaphone16.metaphone("H0");
        boolean boolean21 = metaphone16.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str23 = metaphone16.encode("hi!");
        boolean boolean26 = metaphone16.isMetaphoneEqual("H0", "HI");
        int int27 = metaphone16.getMaxCodeLen();
        java.lang.String str29 = metaphone16.encode("HI");
        int int30 = metaphone16.getMaxCodeLen();
        java.lang.String str32 = metaphone16.encode("hi!");
        java.lang.String str34 = metaphone16.encode("ORKP");
        java.lang.String str36 = metaphone16.metaphone("A212");
        java.lang.String str38 = metaphone16.encode("A111111111");
        metaphone16.setMaxCodeLen((int) (byte) 10);
        java.lang.String str42 = metaphone16.metaphone("A0313836");
        java.lang.Object obj43 = caverphone0.encode((java.lang.Object) "A0313836");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORKP" + "'", str34, "ORKP");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "A" + "'", str36, "A");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A" + "'", str38, "A");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "A" + "'", str42, "A");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "A111111111" + "'", obj43, "A111111111");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1638");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        java.lang.String str8 = caverphone0.encode("AKPK");
        java.lang.String str10 = caverphone0.encode("ARKPXKMNSK");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str16 = refinedSoundex14.encode("01230120022455012623010202");
        java.lang.String str18 = refinedSoundex14.encode("AKPKKMNSKT");
        java.lang.String str20 = refinedSoundex14.soundex("");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPK111111" + "'", str8, "AKPK111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSK11" + "'", str10, "AKPKMNSK11");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A0313836" + "'", str18, "A0313836");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "1111111111" + "'", obj21, "1111111111");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1639");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        java.lang.String str11 = refinedSoundex0.encode("A09");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1640");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("AKPKMNSKTS", "O094010303080830603083060905301608");
        int int12 = soundex1.getMaxLength();
        int int15 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0#");
        org.apache.commons.codec.language.SoundexUtils soundexUtils16 = new org.apache.commons.codec.language.SoundexUtils();
        java.lang.Class<?> wildcardClass17 = soundexUtils16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex1.encode((java.lang.Object) soundexUtils16);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1641");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(3);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: AR", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARK" + "'", str15, "ARK");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1642");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean7 = caverphone0.isCaverphoneEqual("K3", "AK");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str10 = caverphone8.encode("01230120022455012623010202");
        java.lang.String str12 = caverphone8.caverphone("H000");
        java.lang.String str14 = caverphone8.caverphone("1111111111");
        java.lang.String str16 = caverphone8.caverphone("O000");
        java.lang.String str18 = caverphone8.caverphone("org.apache.commons.codec.EncoderException: A0");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) str18);
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj22 = caverphone20.encode((java.lang.Object) "HI");
        java.lang.String str24 = caverphone20.caverphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean27 = caverphone20.isCaverphoneEqual("O0", "org.apache.commons.codec.EncoderException: A931");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = caverphone0.encode((java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKMNSKTS" + "'", str4, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A111111111" + "'", str16, "A111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPKKMNSKT" + "'", str18, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "AKPKMNSKT1" + "'", obj19, "AKPKMNSKT1");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "AA11111111" + "'", obj22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AKPKMNSKTS" + "'", str24, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1643");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        int int10 = refinedSoundex0.difference("#HIK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        int int13 = refinedSoundex0.difference("A0931538363836931583138363", "A0931");
        int int16 = refinedSoundex0.difference("ARKPXKMNSKTKNKTRKSPXNRKP", "AKPA111111");
        java.lang.String str18 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1644");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1645");
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
        java.lang.String str22 = metaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        java.lang.String str24 = metaphone0.encode("O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str22, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O" + "'", str24, "O");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1646");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str7 = refinedSoundex5.encode("1");
        java.lang.String str9 = refinedSoundex5.soundex("AKPKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A03131" + "'", str9, "A03131");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1647");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("03", "O094010303080830603083060905301608");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str19 = caverphone17.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex();
        char char22 = refinedSoundex20.getMappingCode('a');
        java.lang.String str24 = refinedSoundex20.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj25 = caverphone17.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str27 = caverphone17.caverphone("ORKP");
        boolean boolean30 = caverphone17.isCaverphoneEqual("", "AKPK");
        java.lang.String str32 = caverphone17.encode("A111111111");
        java.lang.String str34 = caverphone17.caverphone("AKP1111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = caverphone0.encode((java.lang.Object) caverphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKMNSKTS" + "'", str19, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '0' + "'", char22 == '0');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O094010303080830603083060905301608" + "'", str24, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "AKPKKMNSKT" + "'", obj25, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AKP1111111" + "'", str27, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A111111111" + "'", str32, "A111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AKP1111111" + "'", str34, "AKP1111111");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1648");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex();
        char char11 = refinedSoundex9.getMappingCode('a');
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex9, "", "hi!");
        java.lang.String str16 = refinedSoundex9.soundex("01230120022455012623010202");
        int int19 = refinedSoundex9.difference("H", "H0");
        int int22 = refinedSoundex9.difference("", "01230120022455012623010202");
        int int25 = refinedSoundex9.difference("A0", "A0");
        int int28 = refinedSoundex9.difference("org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str30 = refinedSoundex9.encode("");
        java.lang.Object obj31 = soundex1.encode((java.lang.Object) "");
        int int32 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1649");
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
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: AKPKMNSKTS", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("O0");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "O094010303080830603083060905301608", "ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("A210");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1650");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 100;
        java.lang.String str6 = doubleMetaphone0.encode("HI");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone9.doubleMetaphone("", false);
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone9, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str17 = doubleMetaphone9.encode("hi!");
        java.lang.String str19 = doubleMetaphone9.doubleMetaphone("H000");
        int int20 = doubleMetaphone9.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone9.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int23 = doubleMetaphone9.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str8, "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKP" + "'", str22, "ARKP");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1651");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int6 = soundex5.getMaxLength();
        java.lang.String str8 = soundex5.encode("A000H0AKP1111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A310" + "'", str8, "A310");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1652");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        char[] charArray12 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        java.lang.String str15 = soundex13.encode("HI");
        java.lang.String str17 = soundex13.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone18, "hi!", "");
        doubleMetaphone18.maxCodeLen = '4';
        java.lang.String str25 = doubleMetaphone18.doubleMetaphone("");
        int int26 = doubleMetaphone18.getMaxCodeLen();
        java.lang.String str28 = doubleMetaphone18.doubleMetaphone("hi!");
        java.lang.Object obj29 = soundex13.encode((java.lang.Object) "hi!");
        java.lang.String str31 = soundex13.encode("");
        java.lang.String str33 = soundex13.encode("");
        java.lang.String str35 = soundex13.encode("O");
        int int36 = soundex13.getMaxLength();
        java.lang.String str38 = soundex13.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str40 = soundex13.soundex("H0");
        java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) "H0");
        int int42 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult44 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'o');
        doubleMetaphoneResult44.appendPrimary('a');
        doubleMetaphoneResult44.append('O');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSKTSNKTRKSPXN" + "'", str11, "ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "O000" + "'", str35, "O000");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A931" + "'", str38, "A931");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H000" + "'", str40, "H000");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1653");
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
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1654");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        java.lang.String str4 = metaphone0.encode("AR");
        java.lang.String str6 = metaphone0.encode("");
        boolean boolean9 = metaphone0.isMetaphoneEqual("", "ARKPXKMNSKTKNKTRKSPXNR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AR" + "'", str4, "AR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1655");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "H200", "A09315383");
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("HI");
        java.lang.String str15 = soundex11.soundex("HI");
        soundex11.setMaxLength((int) '4');
        int int20 = soundex11.difference(" ", "AK");
        soundex11.setMaxLength((int) 'A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = refinedSoundex0.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1656");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex0.encode("ORKP");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("01230120022455012623010202");
        boolean boolean15 = caverphone10.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str17 = caverphone10.encode("AA11111111");
        java.lang.String str19 = caverphone10.encode("A111111111");
        java.lang.Object obj20 = refinedSoundex0.encode((java.lang.Object) "A111111111");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "ARKPXKMNSKTSNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0931" + "'", str9, "O0931");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "A0" + "'", obj20, "A0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1657");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        java.lang.String str7 = soundex1.encode("");
        int int10 = soundex1.difference("", "");
        java.lang.String str12 = soundex1.encode("ARKP");
        int int13 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) '3');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A931" + "'", str12, "A931");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1658");
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
        boolean boolean23 = caverphone0.isCaverphoneEqual("H200", "HIA212");
        boolean boolean26 = caverphone0.isCaverphoneEqual("03", "ARKPXKMNSK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H000", true);
        java.lang.String str9 = doubleMetaphone0.encode("AKP");
        org.apache.commons.codec.language.Metaphone metaphone10 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str12 = metaphone10.metaphone("H0");
        boolean boolean15 = metaphone10.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str17 = metaphone10.encode("hi!");
        boolean boolean20 = metaphone10.isMetaphoneEqual("H0", "HI");
        boolean boolean23 = metaphone10.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean26 = metaphone10.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'E');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP" + "'", str9, "AKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "ARKP" + "'", obj27, "ARKP");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1660");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex2.soundex("AKPKMNSKTS");
        java.lang.String str8 = soundex2.encode("ARKPKSKMNSKTKNKTRKSPKSN");
        java.lang.String str10 = soundex2.encode("A0931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O941" + "'", str4, "O941");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A313" + "'", str6, "A313");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A931" + "'", str8, "A931");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1661");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        int int5 = refinedSoundex0.difference("A931", "H000");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: HIA212", "A09315383");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1662");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str16 = metaphone0.metaphone("HIA212");
        java.lang.String str18 = metaphone0.encode("org.apache.commons.codec.EncoderException: A0");
        boolean boolean21 = metaphone0.isMetaphoneEqual("AKPKKMNSKT", "");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean26 = metaphone0.isMetaphoneEqual("ORKPXKMNSKTKNKTRKSSPXNR", "");
        boolean boolean29 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "O941");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str14, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXN" + "'", str18, "ORKPXKMNSKTKNKTRKSSPXN");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1663");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "ORKP");
        java.lang.String str17 = metaphone0.encode("RKPX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ORKP" + "'", obj15, "ORKP");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RKPK" + "'", str17, "RKPK");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = 'K';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult20.appendPrimary("org.apache.commons.codec.EncoderException: A313");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1665");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        int int6 = refinedSoundex0.difference("hi!", "org.apache.commons.codec.EncoderException: A0");
        int int9 = refinedSoundex0.difference("", "A000A212");
        int int12 = refinedSoundex0.difference("30", "AKPa 1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1666");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKPKMNSKT1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKPKMNSKT" + "'", str1, "AKPKMNSKT");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        java.lang.String str13 = doubleMetaphone0.encode("");
        char char16 = doubleMetaphone0.charAt("AR", (int) 'O');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1668");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str1, "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1669");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen(75);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "", false);
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 75 + "'", int16 == 75);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1670");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone1.doubleMetaphone("", false);
        int int5 = doubleMetaphone1.maxCodeLen;
        int int6 = doubleMetaphone1.maxCodeLen;
        boolean boolean9 = doubleMetaphone1.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "HI");
        java.lang.String str12 = doubleMetaphone0.encode("H000");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("", false);
        int int18 = doubleMetaphone14.maxCodeLen;
        doubleMetaphone14.setMaxCodeLen(0);
        java.lang.String str23 = doubleMetaphone14.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str27 = doubleMetaphone24.doubleMetaphone("", false);
        int int28 = doubleMetaphone24.maxCodeLen;
        doubleMetaphone24.setMaxCodeLen(0);
        java.lang.String str33 = doubleMetaphone24.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone34 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone34.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone34.maxCodeLen = 100;
        java.lang.String str40 = doubleMetaphone34.encode("HI");
        java.lang.String str42 = doubleMetaphone34.encode("O094010303080830603083060905301608");
        java.lang.Object obj43 = doubleMetaphone24.encode((java.lang.Object) "O094010303080830603083060905301608");
        java.lang.String str45 = doubleMetaphone24.doubleMetaphone("H000");
        java.lang.Object obj46 = doubleMetaphone14.encode((java.lang.Object) str45);
        java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) str45);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult49 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        org.apache.commons.codec.language.Soundex soundex50 = new org.apache.commons.codec.language.Soundex();
        soundex50.setMaxLength(0);
        org.apache.commons.codec.language.Metaphone metaphone53 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str55 = metaphone53.metaphone("H0");
        boolean boolean58 = metaphone53.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str60 = metaphone53.metaphone("");
        java.lang.String str62 = metaphone53.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str64 = metaphone53.encode("O000");
        boolean boolean67 = metaphone53.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        java.lang.Object obj68 = soundex50.encode((java.lang.Object) "A931");
        soundex50.setMaxLength((int) '\000');
        java.lang.String str72 = soundex50.encode("org.apache.commons.codec.EncoderException: \000");
        java.lang.Object obj73 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: \000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult75 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean79 = doubleMetaphone0.isDoubleMetaphoneEqual("K301230120022455012623010202\000", "AKPa 1", true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H" + "'", obj10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "A" + "'", str42, "A");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ARKP" + "'", str62, "ARKP");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "O" + "'", str64, "O");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "A000" + "'", obj68, "A000");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "O621" + "'", str72, "O621");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "ARKP" + "'", obj73, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1671");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = soundex10.encode("ARKPXKMNSKTSNKTRKSPXNO093153836383693158");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: R");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1672");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORKP" + "'", str16, "ORKP");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1673");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        doubleMetaphone0.maxCodeLen = 10;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "HI3", false);
        doubleMetaphone0.setMaxCodeLen(3);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int24 = doubleMetaphone0.maxCodeLen;
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode(obj25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1674");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000H200", "A900");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1675");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex0.soundex("A000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone10.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone10.maxCodeLen = 100;
        java.lang.String str16 = doubleMetaphone10.encode("HI");
        java.lang.String str18 = doubleMetaphone10.encode("O094010303080830603083060905301608");
        int int19 = doubleMetaphone10.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1676");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        org.apache.commons.codec.language.Metaphone metaphone10 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str12 = metaphone10.metaphone("H0");
        metaphone10.setMaxCodeLen(2);
        boolean boolean17 = metaphone10.isMetaphoneEqual("ARKPXKMNSKTSNKTRKSPXN", "AKP1111111");
        int int18 = metaphone10.getMaxCodeLen();
        java.lang.String str20 = metaphone10.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AR" + "'", str20, "AR");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AKPKMNSKTK" + "'", obj21, "AKPKMNSKTK");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("O0940103030808306030830609053016080");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1678");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("a1", false);
        java.lang.String str17 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKP" + "'", str17, "ARKP");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1679");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        int int4 = soundex1.getMaxLength();
        java.lang.String str6 = soundex1.soundex("a1");
        soundex1.setMaxLength((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone9, "hi!", "");
        doubleMetaphone9.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone9.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str17 = doubleMetaphoneResult16.getPrimary();
        boolean boolean18 = doubleMetaphoneResult16.isComplete();
        doubleMetaphoneResult16.append('3');
        java.lang.String str21 = doubleMetaphoneResult16.getPrimary();
        doubleMetaphoneResult16.appendPrimary('0');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex1.encode((java.lang.Object) '0');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3" + "'", str21, "3");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1680");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        java.lang.String str13 = metaphone0.metaphone("");
        boolean boolean16 = metaphone0.isMetaphoneEqual("A", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1681");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "1org.apache.commons.codec.EncoderException: A931", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1682");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str15 = metaphone0.encode("");
        boolean boolean18 = metaphone0.isMetaphoneEqual("AKPaX", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1683");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("AA11111111a a");
        java.lang.String str13 = caverphone0.encode("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS \000o");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AKPKKPKKMN" + "'", str13, "AKPKKPKKMN");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1684");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        java.lang.String str13 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str15 = refinedSoundex0.soundex("A000");
        java.lang.String str17 = refinedSoundex0.encode("A03");
        java.lang.String str19 = refinedSoundex0.soundex("AKPK111111");
        char[] charArray20 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        int int24 = soundex21.difference("", "H000");
        int int27 = soundex21.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str29 = soundex21.soundex("1111111111");
        java.lang.Object obj30 = refinedSoundex0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O0940103030808306030830609053016080" + "'", str13, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A0" + "'", str15, "A0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A0" + "'", str17, "A0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A0313" + "'", str19, "A0313");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("a1", false);
        java.lang.String str17 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult19.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKP" + "'", str17, "ARKP");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1686");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone0.encode("");
        java.lang.String str23 = metaphone0.encode("A031383");
        java.lang.String str25 = metaphone0.encode("org.apache.commons.codec.EncoderException: AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORKP" + "'", str25, "ORKP");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1687");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("O0931");
        int int3 = soundex0.getMaxLength();
        java.lang.String str5 = soundex0.soundex("A0");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O000" + "'", str2, "O000");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A000" + "'", str5, "A000");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1688");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = caverphone0.caverphone("01230120022455012623010202\000");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "AKPKRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        java.lang.String str20 = caverphone0.encode("AKPKMNSK11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKMNSK11" + "'", str20, "AKPKMNSK11");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1689");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        boolean boolean17 = doubleMetaphoneResult16.isComplete();
        doubleMetaphoneResult16.append('X');
        doubleMetaphoneResult16.appendAlternate("ARKP");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1690");
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
        java.lang.String str20 = metaphone0.metaphone("A212");
        java.lang.String str22 = metaphone0.encode("A111111111");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str26 = metaphone0.metaphone("A0313836");
        boolean boolean29 = metaphone0.isMetaphoneEqual("ARKPKMNSKTKNKTRKSPKSN", "AKP1111111 041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1691");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        java.lang.String str9 = metaphone0.encode("HIA212");
        java.lang.String str11 = metaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        java.lang.String str13 = metaphone0.encode("AKPKMNSKTS\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKP" + "'", str11, "ARKP");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AKPK" + "'", str13, "AKPK");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1692");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        char char15 = doubleMetaphone0.charAt("", (int) (short) 100);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str21 = doubleMetaphone18.doubleMetaphone("", false);
        doubleMetaphone18.maxCodeLen = 4;
        java.lang.String str25 = doubleMetaphone18.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone26 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str28 = metaphone26.metaphone("H0");
        java.lang.String str30 = metaphone26.metaphone("");
        java.lang.String str32 = metaphone26.encode("H000");
        java.lang.Object obj33 = doubleMetaphone18.encode((java.lang.Object) str32);
        char char36 = doubleMetaphone18.charAt("H0", 75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) 75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1693");
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
        boolean boolean21 = metaphone0.isMetaphoneEqual("ARKP", "");
        metaphone0.setMaxCodeLen((int) 'S');
        boolean boolean26 = metaphone0.isMetaphoneEqual("", "A310");
        java.lang.String str28 = metaphone0.encode("org.apache.commons.codec.EncoderException: AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXN" + "'", str28, "ORKPXKMNSKTKNKTRKSSPXN");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1694");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = soundex8.difference("org.apache.commons.codec.EncoderException: O09401030308083060308306090530160803138363", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONAR");
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1695");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.soundex("AKPK");
        java.lang.String str8 = soundex0.encode("0");
        java.lang.String str10 = soundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int13 = soundex0.difference("O094010303080830603083060905301608", "H0");
        java.lang.String str15 = soundex0.soundex("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A212" + "'", str6, "A212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A621" + "'", str10, "A621");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A212" + "'", str15, "A212");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1696");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.metaphone("1111111111");
        boolean boolean19 = metaphone0.isMetaphoneEqual("A03138363", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str21 = metaphone0.metaphone("A093153836383693158");
        boolean boolean24 = metaphone0.isMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "O094010303080830603083060905301608094010303080830603083060905301608");
        int int25 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1697");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int11 = soundex8.difference("A093138363836931389313836383693138", "0#");
        java.lang.String str13 = soundex8.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O941" + "'", str13, "O941");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1698");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("");
        java.lang.String str6 = caverphone0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str8 = caverphone0.encode("RKPXKMNSKT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKPKKMNSKT" + "'", str6, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KPKMNSKT11" + "'", str8, "KPKMNSKT11");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1699");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(46);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1700");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        int int6 = refinedSoundex0.difference("hi!", "org.apache.commons.codec.EncoderException: A0");
        java.lang.String str8 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone9.doubleMetaphone("", false);
        int int13 = doubleMetaphone9.maxCodeLen;
        java.lang.String str16 = doubleMetaphone9.doubleMetaphone("O094010303080830603083060905301608", false);
        java.lang.String str18 = doubleMetaphone9.doubleMetaphone("O093153836383693158");
        java.lang.Object obj19 = refinedSoundex0.encode((java.lang.Object) "O093153836383693158");
        int int22 = refinedSoundex0.difference("0oorg.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMON", "AKPKMNSK");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A03138363" + "'", str8, "A03138363");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "O0" + "'", obj19, "O0");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1701");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O", "O0");
        java.lang.String str7 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKP" + "'", str18, "ARKP");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1703");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        java.lang.String str12 = soundex1.encode("O0931");
        int int15 = soundex1.difference("RKPKSKMNSKTKNKTRKSPKSNRKP", "\0001");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O000" + "'", str12, "O000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1704");
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
        int int24 = soundex1.difference("", "O0931");
        int int27 = soundex1.difference("org.apache.commons.codec.EncoderException: AR", "H");
        int int30 = soundex1.difference("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "A000AKP1111111ARKP");
        int int31 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1705");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (short) 0);
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str17 = metaphone0.encode("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        metaphone0.setMaxCodeLen(97);
        java.lang.Object obj21 = metaphone0.encode((java.lang.Object) "AK11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str17, "ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AK" + "'", obj21, "AK");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1706");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H000");
        char char9 = refinedSoundex0.getMappingCode('#');
        java.lang.String str11 = refinedSoundex0.soundex("O0");
        int int14 = refinedSoundex0.difference("AKPKKMNSKT", "A000\000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone11, "hi!", "");
        char char17 = doubleMetaphone11.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str20 = doubleMetaphone11.doubleMetaphone("1111111111", true);
        boolean boolean23 = doubleMetaphone11.isDoubleMetaphoneEqual("1111111111", "H000");
        char char26 = doubleMetaphone11.charAt("H0", 2);
        char char29 = doubleMetaphone11.charAt("hi!", (int) (short) 10);
        boolean boolean33 = doubleMetaphone11.isDoubleMetaphoneEqual("HI3", "H000", false);
        java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) "H000");
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("O621", "H300", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '0' + "'", char17 == '0');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1708");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        int int10 = refinedSoundex0.difference("", "O941");
        java.lang.Class<?> wildcardClass11 = refinedSoundex0.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1709");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean18 = metaphone0.isMetaphoneEqual("AKPK111111", "ARKPXKMNSKTSNKTRKSPXN");
        int int19 = metaphone0.getMaxCodeLen();
        int int20 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1710");
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
        int int33 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1711");
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
        int int26 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "#HI");
        int int27 = soundex1.getMaxLength();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone28 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str31 = doubleMetaphone28.doubleMetaphone("", false);
        boolean boolean34 = doubleMetaphone28.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        doubleMetaphone28.setMaxCodeLen(0);
        java.lang.String str38 = doubleMetaphone28.doubleMetaphone("");
        boolean boolean41 = doubleMetaphone28.isDoubleMetaphoneEqual("A03138363AKPKKMNSKT ", "O931");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = soundex1.encode((java.lang.Object) boolean41);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1712");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(111);
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("");
        encoderException20.addSuppressed((java.lang.Throwable) encoderException22);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("");
        encoderException25.addSuppressed((java.lang.Throwable) encoderException27);
        encoderException20.addSuppressed((java.lang.Throwable) encoderException27);
        java.lang.Throwable[] throwableArray30 = encoderException20.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode((java.lang.Object) throwableArray30);
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
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1713");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("a1");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("", false);
        int int15 = doubleMetaphone11.maxCodeLen;
        doubleMetaphone11.setMaxCodeLen((int) 'a');
        int int18 = doubleMetaphone11.getMaxCodeLen();
        doubleMetaphone11.maxCodeLen = 'A';
        java.lang.String str22 = doubleMetaphone11.doubleMetaphone("AA11111111a a");
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone11, "AKPK111111", "org.apache.commons.codec.EncoderException: H000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = metaphone0.encode((java.lang.Object) int25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1714");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.encode("A212");
        int int14 = metaphone0.getMaxCodeLen();
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.metaphone("A0310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1715");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        java.lang.String str11 = soundex1.soundex("01230120022455012623010202HI3");
        soundex1.setMaxLength((int) 'O');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H000" + "'", str11, "H000");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1716");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone0.setMaxCodeLen(0);
        char char19 = doubleMetaphone0.charAt("O", (int) (byte) -1);
        int int20 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphone0.setMaxCodeLen((int) '0');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1717");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.encode("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKPKKMNSKT" + "'", str6, "AKPKKMNSKT");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1718");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        int int14 = refinedSoundex3.difference("0123012002245501262301020211111111111", "");
        java.lang.String str16 = refinedSoundex3.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str18 = refinedSoundex3.soundex("ORKPXKMNSKTKNKTRKSSPXN");
        char char20 = refinedSoundex3.getMappingCode('\000');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A093153836383693158" + "'", str16, "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O093153836383693158" + "'", str18, "O093153836383693158");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1719");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual("AKP", "A212");
        boolean boolean17 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "O941");
        boolean boolean20 = metaphone0.isMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN", "H200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1720");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("", "01230120022455012623010202");
        int int16 = refinedSoundex0.difference("A0", "A0");
        int int19 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str21 = refinedSoundex0.encode("");
        java.lang.String str23 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str25 = refinedSoundex0.soundex("A000AKP1111111AKP1111111O000");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str23, "O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A0310310" + "'", str25, "A0310310");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1721");
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
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex();
        char char23 = refinedSoundex21.getMappingCode('a');
        java.lang.String str25 = refinedSoundex21.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj26 = caverphone18.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str28 = caverphone18.caverphone("ORKP");
        boolean boolean31 = caverphone18.isCaverphoneEqual("", "AKPK");
        java.lang.Object obj32 = caverphone0.encode((java.lang.Object) "");
        boolean boolean35 = caverphone0.isCaverphoneEqual("", "O0");
        java.lang.Class<?> wildcardClass36 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKMNSKTS" + "'", str20, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '0' + "'", char23 == '0');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O094010303080830603083060905301608" + "'", str25, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AKPKKMNSKT" + "'", obj26, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKP1111111" + "'", str28, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "1111111111" + "'", obj32, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1722");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("A");
        java.lang.String str14 = caverphone0.encode("30");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1723");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.Class<?> wildcardClass10 = caverphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1724");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "AKPK111111", false);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("1111111111", false);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("A000A212");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1725");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        doubleMetaphone3.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone3.new DoubleMetaphoneResult((int) 'a');
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append("HI", "A931");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "A931");
        int int16 = metaphone0.getMaxCodeLen();
        int int17 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "A" + "'", obj15, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1727");
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
        java.lang.String str21 = caverphone0.encode("A000AKP1111111ARKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AKPKP11111" + "'", str21, "AKPKP11111");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1728");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("0#O004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1729");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        int int9 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1730");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        char[] charArray9 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray9);
        int int13 = soundex10.difference("", "H000");
        int int16 = soundex10.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str18 = soundex10.soundex("1111111111");
        int int21 = soundex10.difference("ARKPXKMNSKTSNKTRKSPXN", "01230120022455012623010202\000");
        int int24 = soundex10.difference("org.apache.commons.codec.EncoderException: ", "A");
        java.lang.Object obj25 = metaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str27 = metaphone0.encode("A621");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "ORKP" + "'", obj25, "ORKP");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A" + "'", str27, "A");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1731");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        metaphone0.setMaxCodeLen((int) 'K');
        boolean boolean16 = metaphone0.isMetaphoneEqual("H0", "A931");
        java.lang.String str18 = metaphone0.encode("AKPa");
        java.lang.String str20 = metaphone0.encode("o");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "H300", "org.apache.commons.codec.EncoderException: O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKP" + "'", str18, "AKP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O" + "'", str20, "O");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1732");
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
        java.lang.String str26 = soundex2.encode("org.apache.commons.codec.EncoderException: ORKP");
        java.lang.String str28 = soundex2.encode("#HI");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "O941" + "'", str26, "O941");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H000" + "'", str28, "H000");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1733");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("03");
        boolean boolean9 = caverphone0.isCaverphoneEqual("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA", "org.apache.commons.codec.EncoderException: HI");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "1O", "");
        java.lang.String str14 = doubleMetaphone0.encode("ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("AKP1111111");
        java.lang.Throwable[] throwableArray17 = encoderException16.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) encoderException16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str14, "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str8 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1736");
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
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "K", "A310");
        java.lang.String str22 = doubleMetaphone0.encode("AKPKKMNSKT#");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1737");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("HI", "hi!");
        java.lang.String str8 = refinedSoundex0.encode("O000");
        java.lang.String str10 = refinedSoundex0.soundex("AKP");
        int int13 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "ORKP");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A031" + "'", str10, "A031");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1738");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("1111111111", "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("A0313836");
        java.lang.String str13 = soundex0.encode("A03138363");
        java.lang.String str15 = soundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O621" + "'", str15, "O621");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1739");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("0");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1740");
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
        char char22 = doubleMetaphone0.charAt("HI3", (int) (byte) 1);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKKMNSKT", "a");
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("A931");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "O0940103030808306030830609053016080940103030808306030830609053016080", "AKPKSS");
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("A000AKP1111111ARKP", "A310", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'I' + "'", char22 == 'I');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1741");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        metaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str14 = metaphone0.metaphone("A621");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1742");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        char char11 = refinedSoundex0.getMappingCode('\000');
        java.lang.String str13 = refinedSoundex0.soundex("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.metaphone("H0");
        boolean boolean19 = metaphone14.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int20 = metaphone14.getMaxCodeLen();
        java.lang.String str22 = metaphone14.encode("hi!");
        java.lang.Object obj23 = refinedSoundex0.encode((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0931538363836931583138363" + "'", str13, "A0931538363836931583138363");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H0" + "'", obj23, "H0");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1743");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = soundex13.soundex("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
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
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1744");
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
        java.lang.String str22 = metaphone0.metaphone("");
        java.lang.String str24 = metaphone0.metaphone("K3");
        metaphone0.setMaxCodeLen((int) 'o');
        int int27 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "K" + "'", str24, "K");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 111 + "'", int27 == 111);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1745");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = soundex1.difference("A", "HIA212");
        soundex1.setMaxLength((int) (short) 100);
        org.apache.commons.codec.language.Metaphone metaphone9 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str11 = metaphone9.metaphone("H0");
        java.lang.String str13 = metaphone9.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean16 = metaphone9.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int17 = metaphone9.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = soundex1.encode((java.lang.Object) metaphone9);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORKP" + "'", str13, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1746");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Soundex soundex5 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str7 = soundex5.soundex("H");
        java.lang.String str9 = soundex5.soundex("H");
        java.lang.String str11 = soundex5.encode("O094010303080830603083060905301608");
        java.lang.Object obj12 = caverphone0.encode((java.lang.Object) "O094010303080830603083060905301608");
        java.lang.String str14 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        java.lang.Throwable[] throwableArray17 = encoderException16.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray22 = encoderException21.getSuppressed();
        encoderException19.addSuppressed((java.lang.Throwable) encoderException21);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("A931");
        org.apache.commons.codec.EncoderException encoderException28 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        java.lang.Throwable[] throwableArray29 = encoderException28.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray34 = encoderException33.getSuppressed();
        encoderException31.addSuppressed((java.lang.Throwable) encoderException33);
        encoderException28.addSuppressed((java.lang.Throwable) encoderException33);
        encoderException26.addSuppressed((java.lang.Throwable) encoderException33);
        encoderException16.addSuppressed((java.lang.Throwable) encoderException26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = caverphone0.encode((java.lang.Object) encoderException26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertNotNull(soundex5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H000" + "'", str7, "H000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A111111111" + "'", obj12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AKPKMNSKTS" + "'", str14, "AKPKMNSKTS");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1747");
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
        int int19 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(0);
        java.lang.String str23 = metaphone0.metaphone("01230120022455012623010202");
        boolean boolean26 = metaphone0.isMetaphoneEqual("O0940103030808306030830609053016080940103030808306030830609053016080", "A0931");
        java.lang.String str28 = metaphone0.encode("00OAKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1748");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.soundex("AKPK");
        java.lang.String str8 = soundex0.encode("0");
        java.lang.String str10 = soundex0.soundex("AA");
        soundex0.setMaxLength((int) 'A');
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A212" + "'", str6, "A212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('r', '4');
        doubleMetaphoneResult8.append('r', ' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1750");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "0123012002245501262301020211111111111", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("ARKPKKMNSKTKNKTRKSPXN", false);
        char[] charArray20 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex21 = new org.apache.commons.codec.language.Soundex(charArray20);
        java.lang.String str23 = soundex21.encode("HI");
        java.lang.String str25 = soundex21.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone26 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone26, "hi!", "");
        doubleMetaphone26.maxCodeLen = '4';
        java.lang.String str33 = doubleMetaphone26.doubleMetaphone("");
        int int34 = doubleMetaphone26.getMaxCodeLen();
        java.lang.String str36 = doubleMetaphone26.doubleMetaphone("hi!");
        java.lang.Object obj37 = soundex21.encode((java.lang.Object) "hi!");
        java.lang.String str39 = soundex21.encode("");
        java.lang.String str41 = soundex21.encode("");
        java.lang.String str43 = soundex21.encode("O");
        int int44 = soundex21.getMaxLength();
        java.lang.String str46 = soundex21.encode("A0");
        java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) "A0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPKMNSKTKNKTRKSPKSN" + "'", str19, "ARKPKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H000" + "'", str23, "H000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "H000" + "'", obj37, "H000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "O000" + "'", str43, "O000");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "A000" + "'", str46, "A000");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "A" + "'", obj47, "A");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1751");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("AKP1111111", "01230120022455012623010202");
        boolean boolean16 = metaphone0.isMetaphoneEqual("O0931", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        int int17 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1752");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A0313");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1753");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str13 = soundex11.soundex("a");
        java.lang.String str15 = soundex11.soundex("A931");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A000" + "'", str15, "A000");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1754");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        int int5 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex();
        char char8 = refinedSoundex6.getMappingCode('a');
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "", "hi!");
        java.lang.String str13 = refinedSoundex6.soundex("01230120022455012623010202");
        java.lang.Object obj14 = metaphone0.encode((java.lang.Object) "01230120022455012623010202");
        java.lang.String str16 = metaphone0.metaphone("AKPKMNSK11");
        boolean boolean19 = metaphone0.isMetaphoneEqual("ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS", "ORKPXKMNSK");
        int int20 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKPK" + "'", str16, "AKPK");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1755");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("O09315383638369315893138363836931383138363");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1756");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("O0931538363836931583138363");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O" + "'", str1, "O");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1757");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AA11111111a a", "AKP001230120022455012623010202");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1758");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone0.encode("");
        java.lang.String str23 = metaphone0.encode("A031383");
        java.lang.String str25 = metaphone0.metaphone("A000H0H000a#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1759");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("1111111111", "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("A0313836");
        int int14 = soundex0.difference("01230120022455012623010202HI3ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H0");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        char char13 = doubleMetaphone0.charAt("A000", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPa", "O094010303080830603083060905301608");
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1762");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("A0931");
        int int12 = soundex1.difference("ORKPO0940103030808306030830609053016080931", "AAKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str15 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("O0940103030808306030830609053016080", "03ARKPXKMNSKTKNKTRKSPXNRKP");
        doubleMetaphoneResult8.appendPrimary("A09313836383693138");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "K" + "'", str14, "K");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "K" + "'", str15, "K");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1764");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.String str11 = refinedSoundex0.soundex("A031");
        char char13 = refinedSoundex0.getMappingCode('I');
        int int16 = refinedSoundex0.difference("A031383", "ARKPXKMNSK");
        char[] charArray17 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray17);
        java.lang.String str20 = soundex18.encode("HI");
        java.lang.String str22 = soundex18.encode("H");
        soundex18.setMaxLength((int) (byte) 10);
        soundex18.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = refinedSoundex0.encode((java.lang.Object) soundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H000" + "'", str22, "H000");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1765");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (short) -1);
        java.lang.String str15 = metaphone0.encode("A0313");
        java.lang.String str17 = metaphone0.encode("HI1Oa");
        metaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1766");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.caverphone("AKP1111111");
        java.lang.String str19 = caverphone0.caverphone("AKPKMNSKT1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKP1111111" + "'", str17, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKMNSKT1" + "'", str19, "AKPKMNSKT1");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1767");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "A0", "A000\000");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1768");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str9 = soundex7.encode("1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = soundex7.encode("AKP1111111 041");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: K");
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
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1769");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O0940103030808306030830609053016080");
        doubleMetaphone0.maxCodeLen = 83;
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 83 + "'", int13 == 83);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1770");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str19 = caverphone0.encode("A031");
        java.lang.String str21 = caverphone0.caverphone("\000H200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKMNSKTK" + "'", str17, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A111111111" + "'", str21, "A111111111");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1771");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        java.lang.String str11 = soundex0.soundex("O000");
        int int14 = soundex0.difference("HIA212aX", "A000AKP1111111\000A");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1772");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("AKPKMNSKTS", "");
        metaphone0.setMaxCodeLen(0);
        metaphone0.setMaxCodeLen(34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1773");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        char char8 = refinedSoundex0.getMappingCode('o');
        java.lang.String str10 = refinedSoundex0.encode("AR");
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("HI");
        java.lang.String str16 = soundex12.soundex("HI");
        java.lang.String str18 = soundex12.encode("AAAA");
        java.lang.Object obj19 = refinedSoundex0.encode((java.lang.Object) "AAAA");
        java.lang.String str21 = refinedSoundex0.soundex("ARKPXKMNSKTSNKTRKSPXNaA");
        java.lang.String str23 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A09" + "'", str10, "A09");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A000" + "'", str18, "A000");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "A0" + "'", obj19, "A0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A0931538363836931580" + "'", str21, "A0931538363836931580");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1774");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A093153836383693158");
        java.lang.String str16 = metaphone0.encode("A313");
        int int17 = metaphone0.getMaxCodeLen();
        int int18 = metaphone0.getMaxCodeLen();
        int int19 = metaphone0.getMaxCodeLen();
        int int20 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1775");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.metaphone("H0");
        boolean boolean8 = metaphone3.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = metaphone3.metaphone("");
        java.lang.String str12 = metaphone3.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str14 = metaphone3.encode("O000");
        boolean boolean17 = metaphone3.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "A931");
        int int19 = soundex0.getMaxLength();
        int int22 = soundex0.difference("AKPK", "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O" + "'", str14, "O");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1776");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.encode("hi!");
        java.lang.String str13 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1777");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        int int8 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 65 + "'", int5 == 65);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1778");
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
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "A0313836");
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("AAAA");
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS", "AKPK111111");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1779");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA11111111a ao");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAO" + "'", str1, "AAAAO");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1780");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKPKORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS" + "'", str1, "AKPKORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1781");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        soundex0.setMaxLength((int) '0');
        int int7 = soundex0.difference("", "A0931538363836931583138363");
        java.lang.String str9 = soundex0.encode("AKPKMNSKTK");
        soundex0.setMaxLength((int) 'E');
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        java.lang.Throwable[] throwableArray17 = encoderException13.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray20 = encoderException19.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("");
        encoderException22.addSuppressed((java.lang.Throwable) encoderException24);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException22);
        java.lang.Throwable[] throwableArray27 = encoderException22.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        java.lang.Throwable[] throwableArray30 = encoderException29.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException34 = new org.apache.commons.codec.EncoderException("");
        encoderException32.addSuppressed((java.lang.Throwable) encoderException34);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException39 = new org.apache.commons.codec.EncoderException("");
        encoderException37.addSuppressed((java.lang.Throwable) encoderException39);
        encoderException32.addSuppressed((java.lang.Throwable) encoderException39);
        org.apache.commons.codec.EncoderException encoderException43 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException45 = new org.apache.commons.codec.EncoderException("");
        encoderException43.addSuppressed((java.lang.Throwable) encoderException45);
        org.apache.commons.codec.EncoderException encoderException48 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException50 = new org.apache.commons.codec.EncoderException("");
        encoderException48.addSuppressed((java.lang.Throwable) encoderException50);
        encoderException43.addSuppressed((java.lang.Throwable) encoderException50);
        org.apache.commons.codec.EncoderException encoderException54 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException56 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray57 = encoderException56.getSuppressed();
        encoderException54.addSuppressed((java.lang.Throwable) encoderException56);
        encoderException43.addSuppressed((java.lang.Throwable) encoderException54);
        encoderException32.addSuppressed((java.lang.Throwable) encoderException54);
        encoderException29.addSuppressed((java.lang.Throwable) encoderException54);
        encoderException22.addSuppressed((java.lang.Throwable) encoderException29);
        encoderException13.addSuppressed((java.lang.Throwable) encoderException29);
        org.apache.commons.codec.EncoderException encoderException65 = new org.apache.commons.codec.EncoderException("0123012002245501262301020211111111111");
        java.lang.Throwable[] throwableArray66 = encoderException65.getSuppressed();
        encoderException29.addSuppressed((java.lang.Throwable) encoderException65);
        java.lang.Throwable[] throwableArray68 = encoderException29.getSuppressed();
        java.lang.Throwable[] throwableArray69 = encoderException29.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = soundex0.encode((java.lang.Object) encoderException29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A212" + "'", str9, "A212");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1782");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = caverphone0.isCaverphoneEqual("A0", "AKPKMNSKTS");
        java.lang.String str10 = caverphone0.caverphone("A0313836");
        java.lang.String str12 = caverphone0.encode("org.apache.commons.codec.EncoderException: A09313836383693138");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPKKMNSKT" + "'", str12, "AKPKKMNSKT");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1783");
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
        java.lang.String str31 = soundex1.encode("A");
        int int34 = soundex1.difference("HIA212", "AKP1111111");
        int int37 = soundex1.difference("01230120022455012623010202\000\000", "org.apache.commons.codec.EncoderException: 0123012002245501262301020211111111111");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1784");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("Xr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XR" + "'", str1, "XR");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1785");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        soundex1.setMaxLength((int) (short) -1);
        java.lang.String str13 = soundex1.soundex("KRKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "K931" + "'", str13, "K931");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "H000", "O094010303080830603083060905301608", "org.apache.commons.codec.EncoderException: " };
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) (short) 100, strArray38);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("ORKP", (int) '#', (int) 'O', strArray38);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("AKP1111111", (int) (byte) -1, (int) 'a', strArray38);
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 0, 0, strArray38);
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("ARKPKSKMNSKTSNKTRKSPKSN", (int) (short) 100, 0, strArray38);
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) '.', 0, strArray38);
        boolean boolean45 = org.apache.commons.codec.language.DoubleMetaphone.contains("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS \000o", 3, (int) '3', strArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = doubleMetaphone0.encode((java.lang.Object) '3');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1787");
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
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "", "Xr");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1788");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('4');
        java.lang.String str6 = refinedSoundex0.soundex("ARKP");
        java.lang.String str8 = refinedSoundex0.encode("");
        java.lang.String str10 = refinedSoundex0.encode("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0931" + "'", str6, "A0931");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A093138363836931389313836383693138" + "'", str10, "A093138363836931389313836383693138");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1789");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        org.apache.commons.codec.language.Metaphone metaphone5 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str7 = metaphone5.metaphone("H0");
        boolean boolean10 = metaphone5.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str12 = metaphone5.metaphone("");
        metaphone5.setMaxCodeLen((int) (byte) 0);
        boolean boolean17 = metaphone5.isMetaphoneEqual("ARKP", "");
        java.lang.String str19 = metaphone5.encode("H200");
        java.lang.Object obj20 = caverphone0.encode((java.lang.Object) str19);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str24 = doubleMetaphone21.doubleMetaphone("", false);
        int int25 = doubleMetaphone21.maxCodeLen;
        int int26 = doubleMetaphone21.maxCodeLen;
        boolean boolean29 = doubleMetaphone21.isDoubleMetaphoneEqual("H", "HI");
        boolean boolean32 = doubleMetaphone21.isDoubleMetaphoneEqual("H000", "HI");
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone21, "K000", "ARKPXKMNSKTKNKTRKSPXNR");
        java.lang.Object obj36 = caverphone0.encode((java.lang.Object) "K000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "1111111111" + "'", obj20, "1111111111");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "K111111111" + "'", obj36, "K111111111");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1790");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "K313");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1791");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str21 = metaphone0.metaphone("K");
        java.lang.String str23 = metaphone0.metaphone("");
        java.lang.String str25 = metaphone0.encode("O0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "K" + "'", str21, "K");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O" + "'", str25, "O");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1792");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone1.doubleMetaphone("", false);
        int int5 = doubleMetaphone1.maxCodeLen;
        int int6 = doubleMetaphone1.maxCodeLen;
        boolean boolean9 = doubleMetaphone1.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "HI");
        doubleMetaphone0.maxCodeLen = '#';
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("1111111111");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H" + "'", obj10, "H");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1793");
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
        soundex1.setMaxLength((int) 'S');
        int int26 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1794");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        char char13 = refinedSoundex0.getMappingCode('O');
        char char15 = refinedSoundex0.getMappingCode('r');
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex();
        char char18 = refinedSoundex16.getMappingCode('a');
        int int21 = refinedSoundex16.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str23 = refinedSoundex16.encode("hi!");
        int int26 = refinedSoundex16.difference("#HIK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str28 = refinedSoundex16.encode("AKP1111111");
        java.lang.Object obj29 = refinedSoundex0.encode((java.lang.Object) str28);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '9' + "'", char15 == '9');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '0' + "'", char18 == '0');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H0" + "'", str23, "H0");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A031" + "'", str28, "A031");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A0" + "'", obj29, "A0");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1795");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(111);
        java.lang.String str14 = metaphone0.encode("ARKPXKMNSK");
        java.lang.String str16 = metaphone0.metaphone("I0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKPKSKMNSK" + "'", str14, "ARKPKSKMNSK");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "I" + "'", str16, "I");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1796");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("", "hi!");
        java.lang.String str18 = metaphone0.encode("org.apache.commons.codec.EncoderException: \000");
        java.lang.String str20 = metaphone0.encode("A0931538363836931580");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXN" + "'", str18, "ORKPXKMNSKTKNKTRKSSPXN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1797");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        int int5 = soundex0.difference("org.apache.commons.codec.EncoderException: hi!", "O0940103030808306030830609053016080");
        soundex0.setMaxLength(46);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1798");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        java.lang.String str12 = metaphone0.metaphone("");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!", "01230120022455012623010202\000");
        java.lang.String str17 = metaphone0.encode("H0");
        boolean boolean20 = metaphone0.isMetaphoneEqual("a1", "A000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1799");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        boolean boolean13 = metaphone0.isMetaphoneEqual("01230120022455012623010202", "");
        java.lang.String str15 = metaphone0.encode("0");
        java.lang.String str17 = metaphone0.encode("I0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "I" + "'", str17, "I");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A931");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("04", "A000AKP1111111\000A", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1801");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("012301200224550126230102021");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1802");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ORKPO0940103030808306030830609053016080931", "AA11111111a3AO000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A931");
        org.apache.commons.codec.language.Metaphone metaphone17 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str19 = metaphone17.metaphone("H0");
        boolean boolean22 = metaphone17.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str24 = metaphone17.metaphone("");
        java.lang.String str26 = metaphone17.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int27 = metaphone17.getMaxCodeLen();
        java.lang.String str29 = metaphone17.metaphone("AKPKMNSKTS");
        java.lang.String str31 = metaphone17.metaphone("A931");
        boolean boolean34 = metaphone17.isMetaphoneEqual("01230120022455012623010202HI3", "O000");
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) "O000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'R');
        boolean boolean40 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKP", "\000H200");
        int int41 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ARKP" + "'", str26, "ARKP");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AKPK" + "'", str29, "AKPK");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "A" + "'", obj35, "A");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1804");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: A0");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HI1A093153836383693158", "O094010303080830603083060905301608094010303080830603083060905301608");
        boolean boolean16 = caverphone0.isCaverphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNRKP", "AKPK111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1805");
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
        int int24 = soundex1.getMaxLength();
        int int25 = soundex1.getMaxLength();
        java.lang.String str27 = soundex1.encode("ARKPXKMNSKTKNKTRKSPXNRKP");
        soundex1.setMaxLength((int) 'r');
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A931" + "'", str27, "A931");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1806");
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
        java.lang.String str32 = doubleMetaphone0.encode("AKPA111111");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AKP" + "'", str32, "AKP");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1807");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        java.lang.String str11 = metaphone0.encode("HI3");
        boolean boolean14 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: AKPKMNSK11", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1808");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("", "01230120022455012623010202");
        java.lang.String str15 = refinedSoundex0.encode("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str17 = refinedSoundex0.encode("a");
        int int20 = refinedSoundex0.difference("A031", "KPK1111111");
        char char22 = refinedSoundex0.getMappingCode('3');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A0" + "'", str17, "A0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1809");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        int int16 = doubleMetaphone0.maxCodeLen;
        char char19 = doubleMetaphone0.charAt("AKPKSKMNSK", 3);
        char char22 = doubleMetaphone0.charAt("ARKPXKMNSKTSNKTRKSPXN", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'K' + "'", char19 == 'K');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1810");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.metaphone("HIA212aX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HKS" + "'", str11, "HKS");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1811");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        int int6 = refinedSoundex0.difference("hi!", "org.apache.commons.codec.EncoderException: A0");
        char char8 = refinedSoundex0.getMappingCode('\000');
        char char10 = refinedSoundex0.getMappingCode('1');
        java.lang.String str12 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: HIA212");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1812");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str6 = refinedSoundex4.encode("a");
        int int9 = refinedSoundex4.difference("AK11111111", "O621");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex();
        char char12 = refinedSoundex10.getMappingCode('a');
        int int15 = refinedSoundex10.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str17 = refinedSoundex10.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str20 = refinedSoundex18.encode("01230120022455012623010202");
        java.lang.Object obj21 = refinedSoundex10.encode((java.lang.Object) str20);
        java.lang.String str23 = refinedSoundex10.encode("org.apache.commons.codec.EncoderException: HIA212");
        java.lang.Object obj24 = refinedSoundex4.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: HIA212");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '0' + "'", char12 == '0');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H0" + "'", str17, "H0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O0940103030808306030830609053016080" + "'", str23, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "O0940103030808306030830609053016080" + "'", obj24, "O0940103030808306030830609053016080");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1813");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone1.doubleMetaphone("", false);
        int int5 = doubleMetaphone1.maxCodeLen;
        int int6 = doubleMetaphone1.maxCodeLen;
        boolean boolean9 = doubleMetaphone1.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "HI");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: HIA212");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        org.apache.commons.codec.language.Soundex soundex15 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str17 = soundex15.soundex("H");
        java.lang.String str19 = soundex15.soundex("H");
        int int20 = soundex15.getMaxLength();
        java.lang.String str22 = soundex15.soundex("A0313836");
        java.lang.String str24 = soundex15.soundex("A031");
        java.lang.String str26 = soundex15.soundex("1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) soundex15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H" + "'", obj10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertNotNull(soundex15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H000" + "'", str17, "H000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A000" + "'", str22, "A000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A000" + "'", str24, "A000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1814");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKPKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKPKP" + "'", str1, "AKPKP");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1815");
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
        int int24 = metaphone0.getMaxCodeLen();
        java.lang.String str26 = metaphone0.encode("A0");
        java.lang.String str28 = metaphone0.metaphone("AKPK");
        metaphone0.setMaxCodeLen((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKPK" + "'", str28, "AKPK");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1816");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AAAAO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAO" + "'", str1, "AAAAO");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1817");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        char char4 = refinedSoundex0.getMappingCode('9');
        java.lang.Object obj6 = refinedSoundex0.encode((java.lang.Object) "AKPKMNSKTK");
        java.lang.String str8 = refinedSoundex0.encode("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A03138363" + "'", obj6, "A03138363");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0931383638369313893138363836931383138363" + "'", str8, "A0931383638369313893138363836931383138363");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1818");
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
        java.lang.String str29 = metaphone0.encode("HIA212");
        int int30 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1819");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex();
        char char11 = refinedSoundex9.getMappingCode('a');
        java.lang.String str13 = refinedSoundex9.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj14 = caverphone6.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str16 = caverphone6.caverphone("ORKP");
        boolean boolean19 = caverphone6.isCaverphoneEqual("", "AKPK");
        java.lang.String str21 = caverphone6.encode("A111111111");
        java.lang.String str23 = caverphone6.caverphone("AKP1111111");
        java.lang.String str25 = caverphone6.encode("A000");
        java.lang.Object obj26 = metaphone0.encode((java.lang.Object) "A000");
        java.lang.String str28 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: AR");
        metaphone0.setMaxCodeLen((int) (short) -1);
        java.lang.String str32 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: 0");
        boolean boolean35 = metaphone0.isMetaphoneEqual("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPKMNSKTS" + "'", str8, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O094010303080830603083060905301608" + "'", str13, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "AKPKKMNSKT" + "'", obj14, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKP1111111" + "'", str16, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A111111111" + "'", str21, "A111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AKP1111111" + "'", str23, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A111111111" + "'", str25, "A111111111");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "A" + "'", obj26, "A");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORKP" + "'", str28, "ORKP");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1820");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'K');
        java.lang.String str14 = metaphone0.metaphone("AKPKMNSKTS");
        boolean boolean17 = metaphone0.isMetaphoneEqual("\000H200", "org.apache.commons.codec.EncoderException: H200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AKPKMNSKTS" + "'", str14, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1821");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray11);
        int int16 = soundex13.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        int int19 = soundex13.difference("A0", "HI3");
        java.lang.Object obj20 = refinedSoundex10.encode((java.lang.Object) "A0");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "A0" + "'", obj20, "A0");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1822");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.encode("A4");
        int int8 = refinedSoundex0.difference("AK11111111", "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        int int11 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA", "AKPa");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A0" + "'", str5, "A0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1823");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AKPKSKMNSK", "O0931538363836931589");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        char char15 = doubleMetaphone0.charAt("", (int) '0');
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1825");
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
        java.lang.String str30 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: AR");
        int int33 = refinedSoundex0.difference("ARKPXKMNSKTKNKTRKSPXNRKP", "A900");
        char char35 = refinedSoundex0.getMappingCode('3');
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "O09401030308083060308306090530160809" + "'", str30, "O09401030308083060308306090530160809");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1826");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: H");
        java.lang.String str8 = refinedSoundex0.soundex("H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0940103030808306030830609053016080" + "'", str6, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H0" + "'", str8, "H0");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1827");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.caverphone("AKPK111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("H03", "4ARKPXKMNSKTKNKTRKSPXNRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPK111111" + "'", str11, "AKPK111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1828");
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
        java.lang.String str25 = soundex1.encode("hi!");
        soundex1.setMaxLength((int) '#');
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1829");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIA212", "org.apache.commons.codec.EncoderException: H200");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1830");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        int int10 = soundex1.difference("ARKP", "1111111111");
        int int13 = soundex1.difference("a1", "ARKPKSKMNSKTSNKTRKSPKSN");
        int int14 = soundex1.getMaxLength();
        int int17 = soundex1.difference("org.apache.commons.codec.EncoderException: AAAA", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONAR");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1831");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        soundex0.setMaxLength((int) '0');
        java.lang.String str6 = soundex0.encode("A0310");
        java.lang.String str8 = soundex0.encode("#HIA093153836383693158");
        soundex0.setMaxLength((int) 'K');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1832");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        java.lang.String str8 = caverphone0.caverphone("KPK1111111");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KPK1111111" + "'", str8, "KPK1111111");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1833");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("");
        java.lang.String str6 = caverphone0.encode("H000");
        java.lang.String str8 = caverphone0.encode("ORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKP1111111" + "'", str8, "AKP1111111");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1834");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        java.lang.String str9 = refinedSoundex0.encode("A031");
        java.lang.String str11 = refinedSoundex0.soundex("");
        int int14 = refinedSoundex0.difference("AKP1111111", "");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1835");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        char char4 = refinedSoundex0.getMappingCode('8');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O09401030308083060308306090530160803138363" + "'", str2, "O09401030308083060308306090530160803138363");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone1.doubleMetaphone("", false);
        int int5 = doubleMetaphone1.maxCodeLen;
        int int6 = doubleMetaphone1.maxCodeLen;
        boolean boolean9 = doubleMetaphone1.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "HI");
        doubleMetaphone0.maxCodeLen = '#';
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.metaphone("H0");
        boolean boolean18 = metaphone13.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str20 = metaphone13.metaphone("");
        java.lang.String str22 = metaphone13.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str27 = doubleMetaphone24.doubleMetaphone("", false);
        int int28 = doubleMetaphone24.maxCodeLen;
        int int29 = doubleMetaphone24.maxCodeLen;
        boolean boolean32 = doubleMetaphone24.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj33 = doubleMetaphone23.encode((java.lang.Object) "HI");
        java.lang.String str35 = doubleMetaphone23.encode("hi!");
        java.lang.Object obj36 = metaphone13.encode((java.lang.Object) "hi!");
        boolean boolean39 = metaphone13.isMetaphoneEqual("ARKPXKMNSKTSNKTRKSPXNaA", "");
        java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H" + "'", obj10, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKP" + "'", str22, "ARKP");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H" + "'", obj36, "H");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1837");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char9 = refinedSoundex7.getMappingCode('3');
        java.lang.String str11 = refinedSoundex7.encode("A0212");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1838");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("AKPKMNSKTS", "O094010303080830603083060905301608");
        soundex1.setMaxLength((int) (short) 0);
        int int16 = soundex1.difference("A093153836383693158", "AKPKP11111");
        int int17 = soundex1.getMaxLength();
        java.lang.String str19 = soundex1.soundex("1O");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O000" + "'", str19, "O000");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1839");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        java.lang.String str12 = soundex1.encode("O0931");
        soundex1.setMaxLength((int) 'o');
        java.lang.Class<?> wildcardClass15 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O000" + "'", str12, "O000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1840");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "ARKPKSKMNSK", "");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1841");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1842");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        char char8 = doubleMetaphone0.charAt("1111111111", (int) (short) 1);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex();
        char char11 = refinedSoundex9.getMappingCode('a');
        int int14 = refinedSoundex9.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str16 = refinedSoundex9.soundex("");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("H200", "");
        char char25 = doubleMetaphone0.charAt("AKP", 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'A' + "'", char25 == 'A');
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1843");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        java.lang.String str8 = caverphone0.encode("AKPK");
        java.lang.String str10 = caverphone0.encode("ARKPXKMNSK");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ORKPXKMNSKTKNKTRKSSPXNR", "");
        java.lang.String str15 = caverphone0.caverphone("A093153836383693158");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPK111111" + "'", str8, "AKPK111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSK11" + "'", str10, "AKPKMNSK11");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1844");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        char char7 = refinedSoundex0.getMappingCode('\000');
        char char9 = refinedSoundex0.getMappingCode('o');
        int int12 = refinedSoundex0.difference("\000", "A0931538363836931583138363");
        java.lang.String str14 = refinedSoundex0.encode("A000");
        java.lang.String str16 = refinedSoundex0.soundex("012301200224550126230102021");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A0" + "'", str14, "A0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1845");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "1111111111");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("ARKPXKMNSKTKNKTRKSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPKSKMNS" + "'", str22, "ARKPKSKMNS");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1846");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str4 = refinedSoundex0.encode("HIA212");
        java.lang.String str6 = refinedSoundex0.soundex("A000H0H000");
        int int9 = refinedSoundex0.difference("SR", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A09313836383693138");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O09401030308083060308306090530160803138363" + "'", str2, "O09401030308083060308306090530160803138363");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1847");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: A0");
        java.lang.String str10 = metaphone0.encode("A621");
        java.lang.String str12 = metaphone0.encode("org.apache.commons.codec.EncoderException: AR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORKP" + "'", str8, "ORKP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORKP" + "'", str12, "ORKP");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        doubleMetaphone0.maxCodeLen = 'I';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1849");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", "AKP0KS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1850");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = caverphone0.caverphone("01230120022455012623010202\000");
        java.lang.String str17 = caverphone0.encode("HI");
        java.lang.String str19 = caverphone0.caverphone("HIA212aX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AK11111111" + "'", str19, "AK11111111");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1851");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("A212");
        boolean boolean11 = caverphone0.isCaverphoneEqual("01230120022455012623010202", "");
        java.lang.String str13 = caverphone0.caverphone("4ARKPXKMNSKTKNKTRKSPXNRKP");
        java.lang.String str15 = caverphone0.encode("H000");
        char[] charArray16 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex18 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) refinedSoundex21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AKPKMNSKTK" + "'", str13, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1852");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        doubleMetaphone0.setMaxCodeLen(0);
        char char19 = doubleMetaphone0.charAt("O", (int) (byte) -1);
        int int20 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("0#", "AKPKKMNSKT", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1853");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        java.lang.String str4 = metaphone0.encode("org.apache.commons.codec.EncoderException: A931");
        java.lang.String str6 = metaphone0.metaphone("A000AKP1111111");
        java.lang.String str8 = metaphone0.metaphone("AKPa 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP" + "'", str6, "AKP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKP" + "'", str8, "AKP");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1854");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("", false);
        int int14 = doubleMetaphone10.maxCodeLen;
        doubleMetaphone10.setMaxCodeLen(0);
        java.lang.String str19 = doubleMetaphone10.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone20.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone20.maxCodeLen = 100;
        java.lang.String str26 = doubleMetaphone20.encode("HI");
        java.lang.String str28 = doubleMetaphone20.encode("O094010303080830603083060905301608");
        java.lang.Object obj29 = doubleMetaphone10.encode((java.lang.Object) "O094010303080830603083060905301608");
        char char32 = doubleMetaphone10.charAt("HI3", (int) (byte) 1);
        boolean boolean35 = doubleMetaphone10.isDoubleMetaphoneEqual("AKPKKMNSKT", "a");
        java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) "a");
        char char39 = doubleMetaphone0.charAt("ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + 'I' + "'", char32 == 'I');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        char char15 = doubleMetaphone0.charAt("AKPKMNSKTS", (-1));
        char char18 = doubleMetaphone0.charAt("ARKPKSKMNSK", 0);
        char char21 = doubleMetaphone0.charAt("RKPXKMNSKT", (int) 'O');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'A' + "'", char18 == 'A');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1856");
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
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex();
        char char20 = refinedSoundex18.getMappingCode('a');
        char char22 = refinedSoundex18.getMappingCode(' ');
        java.lang.String str24 = refinedSoundex18.encode("O094010303080830603083060905301608");
        java.lang.String str26 = refinedSoundex18.encode("AKP");
        java.lang.String str28 = refinedSoundex18.encode("a0a1");
        java.lang.Object obj29 = caverphone0.encode((java.lang.Object) str28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '0' + "'", char20 == '0');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "O0" + "'", str24, "O0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A031" + "'", str26, "A031");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A0" + "'", str28, "A0");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A111111111" + "'", obj29, "A111111111");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1857");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        java.lang.String str13 = refinedSoundex3.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex3.encode(obj14);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O09401030308083060308306090530160809401030308083060308306090530160809401030308083060308306090530160803138363" + "'", str13, "O09401030308083060308306090530160809401030308083060308306090530160809401030308083060308306090530160803138363");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1858");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("H0", true);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("AKP1111111", false);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("AKPKSKMNSK", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("aa", "O09401030308083060308306090530160803138363", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKP" + "'", str16, "AKP");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKSKMNSK" + "'", str19, "AKPKSKMNSK");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1859");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        int int15 = refinedSoundex0.difference("AR", "");
        java.lang.String str17 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1860");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.encode("");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1", "AKP");
        java.lang.String str18 = caverphone0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        java.lang.String str20 = caverphone0.encode("A031");
        boolean boolean23 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: O0940103030808306030830609053016080", "O09401030308083060308306090530160809401030308083060308306090530160809401030308083060308306090530160803138363");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPKKMNSKT" + "'", str18, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1861");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        java.lang.String str11 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "O0940103030808306030830609053016080", "HIA212");
        java.lang.String str16 = refinedSoundex0.soundex("");
        java.lang.String str18 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONH");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O094010303080830603083060905301608" + "'", str11, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O0940103030808306030830609053016080" + "'", str18, "O0940103030808306030830609053016080");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1862");
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
        int int22 = soundex1.getMaxLength();
        soundex1.setMaxLength(3);
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", "");
        int int30 = soundex1.difference("#K", "");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1863");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        boolean boolean8 = caverphone0.isCaverphoneEqual("A0", "AKPKMNSKTS");
        java.lang.String str10 = caverphone0.caverphone("A0313836");
        java.lang.String str12 = caverphone0.caverphone("ARKPKMNSKTKNKTRKSPKSN");
        java.lang.String str14 = caverphone0.caverphone("KA09");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPKMNSKTK" + "'", str12, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "KA11111111" + "'", str14, "KA11111111");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1864");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("01230120022455012623010202\000", "a1");
        java.lang.String str17 = caverphone0.encode("ARKPXKMNSKTKNKTRKSPXNR");
        boolean boolean20 = caverphone0.isCaverphoneEqual("A900", "ORKPXKMNSKTKNKTRKSSPXN");
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode(obj21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKMNSKTK" + "'", str17, "AKPKMNSKTK");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1865");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'K');
        java.lang.String str12 = doubleMetaphone0.encode("O093153836383693158");
        char char15 = doubleMetaphone0.charAt("A09", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1866");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        int int5 = soundex0.difference("org.apache.commons.codec.EncoderException: hi!", "O0940103030808306030830609053016080");
        java.lang.String str7 = soundex0.soundex("AKPK");
        int int8 = soundex0.getMaxLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A212" + "'", str7, "A212");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1867");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.encode("");
        java.lang.String str15 = caverphone0.encode("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode(obj16);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AKPKKMNSKT" + "'", str15, "AKPKKMNSKT");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1868");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.encode("");
        soundex1.setMaxLength((-1));
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: A313");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex();
        char char12 = refinedSoundex10.getMappingCode('a');
        java.lang.String str14 = refinedSoundex10.soundex("org.apache.commons.codec.EncoderException: ");
        char char16 = refinedSoundex10.getMappingCode('#');
        int int19 = refinedSoundex10.difference("ARKP", "H000");
        char char21 = refinedSoundex10.getMappingCode('#');
        char char23 = refinedSoundex10.getMappingCode('I');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = soundex1.encode((java.lang.Object) char23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O621" + "'", str9, "O621");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '0' + "'", char12 == '0');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O094010303080830603083060905301608" + "'", str14, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '0' + "'", char23 == '0');
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1869");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("HIA212");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H0" + "'", str16, "H0");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1870");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("AR");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        encoderException11.addSuppressed((java.lang.Throwable) encoderException13);
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("");
        encoderException18.addSuppressed((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray22 = encoderException18.getSuppressed();
        encoderException16.addSuppressed((java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray24 = encoderException18.getSuppressed();
        encoderException13.addSuppressed((java.lang.Throwable) encoderException18);
        java.lang.Throwable[] throwableArray26 = encoderException18.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = refinedSoundex0.encode((java.lang.Object) throwableArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608" + "'", str9, "O094010303080830603083060905301608");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1871");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        char char18 = doubleMetaphone0.charAt("H0", 75);
        java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) "ARKP");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "ARKP" + "'", obj20, "ARKP");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1872");
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
        boolean boolean21 = metaphone0.isMetaphoneEqual("ARKP", "");
        boolean boolean24 = metaphone0.isMetaphoneEqual("1", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        metaphone0.setMaxCodeLen((int) 'X');
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "ORKPO0940103030808306030830609053016080931");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1873");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "ARKPKSKMNSKTSNKTRKSPKSN", "A0313");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("HIA212", "", false);
        char[] charArray15 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex16 = new org.apache.commons.codec.language.Soundex(charArray15);
        java.lang.String str18 = soundex16.encode("HI");
        java.lang.String str20 = soundex16.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone21, "hi!", "");
        doubleMetaphone21.maxCodeLen = '4';
        java.lang.String str28 = doubleMetaphone21.doubleMetaphone("");
        int int29 = doubleMetaphone21.getMaxCodeLen();
        java.lang.String str31 = doubleMetaphone21.doubleMetaphone("hi!");
        java.lang.Object obj32 = soundex16.encode((java.lang.Object) "hi!");
        java.lang.String str34 = soundex16.encode("");
        java.lang.String str36 = soundex16.encode("");
        java.lang.String str38 = soundex16.encode("01230120022455012623010202");
        int int41 = soundex16.difference("AKPKKMNSKT", "O941");
        int int44 = soundex16.difference("AKPKKMNSKT", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex16.setMaxLength(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) soundex16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H000" + "'", str18, "H000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H000" + "'", str20, "H000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H000" + "'", obj32, "H000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1874");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "A212");
        int int9 = refinedSoundex0.difference("01230120022455012623010202\000\000", "ORKPXKMNSK");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1875");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.encode("ARKPKSKMNS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1876");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        java.lang.String str4 = metaphone0.encode("AR");
        java.lang.String str6 = metaphone0.encode("O000");
        java.lang.String str8 = metaphone0.metaphone("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AR" + "'", str4, "AR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O" + "'", str6, "O");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1877");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A621", "a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1878");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        int int10 = refinedSoundex0.difference("A09315383638369315893153836383693158", "AKPKKPKKMN");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1879");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        soundex0.setMaxLength((int) '0');
        int int5 = soundex0.getMaxLength();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1880");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("AKP1111111", "01230120022455012623010202");
        java.lang.String str15 = metaphone0.encode("H03");
        java.lang.String str17 = metaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONAR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORKPXKMNSKTSNKTRKSSPXNR" + "'", str17, "ORKPXKMNSKTSNKTRKSSPXNR");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1881");
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
        int int17 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1882");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) (short) 1);
        java.lang.String str5 = soundex1.encode("04");
        int int6 = soundex1.getMaxLength();
        java.lang.String str8 = soundex1.soundex("O0931538363836931589");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O000" + "'", str8, "O000");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNSKTSNKTRKSPKSN");
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1884");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str15 = caverphone0.encode("A111111111");
        java.lang.String str17 = caverphone0.caverphone("AKP1111111");
        java.lang.String str19 = caverphone0.encode("A000");
        java.lang.String str21 = caverphone0.encode("hi!");
        boolean boolean24 = caverphone0.isCaverphoneEqual("A000H0H000a#", "org.apache.commons.codec.EncoderException: 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKP1111111" + "'", str17, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1885");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A000aKa1a", "Xr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1886");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: A0");
        int int9 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORKP" + "'", str8, "ORKP");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1887");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        boolean boolean13 = metaphone0.isMetaphoneEqual("01230120022455012623010202", "");
        java.lang.String str15 = metaphone0.encode("0");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        int int18 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1888");
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
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: AKPKMNSKTS", false);
        int int20 = doubleMetaphone0.maxCodeLen;
        int int21 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone22, "hi!", "");
        doubleMetaphone22.maxCodeLen = '4';
        java.lang.String str29 = doubleMetaphone22.doubleMetaphone("");
        java.lang.String str31 = doubleMetaphone22.doubleMetaphone("hi!");
        doubleMetaphone22.setMaxCodeLen(75);
        boolean boolean37 = doubleMetaphone22.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "", false);
        doubleMetaphone22.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1889");
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
        int int24 = metaphone0.getMaxCodeLen();
        java.lang.String str26 = metaphone0.encode("A0");
        int int27 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1890");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char7 = refinedSoundex5.getMappingCode('S');
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        boolean boolean13 = metaphone8.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str15 = metaphone8.encode("hi!");
        boolean boolean18 = metaphone8.isMetaphoneEqual("H0", "HI");
        int int19 = metaphone8.getMaxCodeLen();
        metaphone8.setMaxCodeLen((int) (byte) 1);
        int int22 = metaphone8.getMaxCodeLen();
        java.lang.Class<?> wildcardClass23 = metaphone8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex5.encode((java.lang.Object) metaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H0", "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str9, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS" + "'", str11, "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1892");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = soundex1.difference("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN", "ORKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1893");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendPrimary("A0931538363836931583138363");
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate('o');
        doubleMetaphoneResult8.appendPrimary("012301200224550126230102021");
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1894");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: A313");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONA" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONA");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1895");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "A212");
        int int9 = refinedSoundex0.difference("A000AKP1111111AKP1111111O000", "#HI");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1896");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        int int10 = refinedSoundex0.difference("#HIK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str12 = refinedSoundex0.encode("AKP1111111");
        int int15 = refinedSoundex0.difference("A", "O09401030308083060308306090530160809");
        int int18 = refinedSoundex0.difference("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA", "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN");
        java.lang.String str20 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: AA11111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A031" + "'", str12, "A031");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O0940103030808306030830609053016080" + "'", str20, "O0940103030808306030830609053016080");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1897");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A931");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "a#HIK", "O09401030308083060308306090530160809");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1898");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        char char9 = refinedSoundex0.getMappingCode('4');
        java.lang.String str11 = refinedSoundex0.encode("H000");
        java.lang.String str13 = refinedSoundex0.soundex("A313");
        int int16 = refinedSoundex0.difference("O094010303080830603083060905301608", "AK11111111");
        java.lang.String str18 = refinedSoundex0.encode("K3");
        java.lang.String str20 = refinedSoundex0.soundex("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H0" + "'", str11, "H0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "K3" + "'", str18, "K3");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O0940103030808306030830609053016080931" + "'", str20, "O0940103030808306030830609053016080931");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1899");
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
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex();
        char char23 = refinedSoundex21.getMappingCode('a');
        java.lang.String str25 = refinedSoundex21.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj26 = caverphone18.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str28 = caverphone18.caverphone("ORKP");
        boolean boolean31 = caverphone18.isCaverphoneEqual("", "AKPK");
        java.lang.Object obj32 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str34 = caverphone0.encode("");
        int int37 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "H0", "ARKPKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKMNSKTS" + "'", str20, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '0' + "'", char23 == '0');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O094010303080830603083060905301608" + "'", str25, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AKPKKMNSKT" + "'", obj26, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKP1111111" + "'", str28, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "1111111111" + "'", obj32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1900");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone4 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str7 = doubleMetaphone4.doubleMetaphone("", false);
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone4, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = doubleMetaphone4.encode("hi!");
        java.lang.String str14 = doubleMetaphone4.doubleMetaphone("H000");
        doubleMetaphone4.maxCodeLen = 10;
        doubleMetaphone4.setMaxCodeLen(2);
        doubleMetaphone4.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone4.maxCodeLen = 'K';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone4.new DoubleMetaphoneResult(0);
        java.lang.String str25 = doubleMetaphoneResult24.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1901");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aa", "03");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1902");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int4 = soundex1.getMaxLength();
        int int7 = soundex1.difference("ARKPXKMNSKTSNKTRKSPXN", "ORKP");
        int int10 = soundex1.difference("", "H000");
        java.lang.String str12 = soundex1.soundex("ARKPXKMNSKTSNKTRKSPXNO093153836383693158");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A931" + "'", str12, "A931");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1903");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength((int) (byte) 1);
        java.lang.String str9 = soundex0.soundex("A03138363");
        java.lang.String str11 = soundex0.soundex("AA11111111#11111111111111111111");
        java.lang.String str13 = soundex0.encode("");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "ARKPKSKMNSKTKNKTRKSPKSNRKP", "AAAA");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 75 + "'", int5 == 75);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1904");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.metaphone("H0");
        boolean boolean8 = metaphone3.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = metaphone3.metaphone("");
        java.lang.String str12 = metaphone3.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str14 = metaphone3.encode("O000");
        boolean boolean17 = metaphone3.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "A931");
        int int19 = soundex0.getMaxLength();
        soundex0.setMaxLength(10);
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "A0", "ARKPXKMNSKTSNKTRKSPXNO093153836383693158");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O" + "'", str14, "O");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1905");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str6 = refinedSoundex4.encode("a");
        int int9 = refinedSoundex4.difference("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "X");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1906");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("A0313836");
        boolean boolean9 = caverphone0.isCaverphoneEqual("K", "H");
        boolean boolean12 = caverphone0.isCaverphoneEqual("AKP001230120022455012623010202", "O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str14 = caverphone0.encode("A0931383638369313893138363836931383138363");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1907");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("H0");
        int int12 = metaphone0.getMaxCodeLen();
        java.lang.String str14 = metaphone0.encode("1");
        int int15 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1908");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("ORKPXKMNSKTKNKTRKSSPXN");
        char char18 = doubleMetaphone0.charAt("01230120022455012623010202\000", 83);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: AAAA");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 75 + "'", int13 == 75);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str15, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str20, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1909");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str8 = soundex6.encode("#HI");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone9, "hi!", "");
        doubleMetaphone9.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone9.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult16.append(' ');
        doubleMetaphoneResult16.appendAlternate("O000");
        java.lang.String str21 = doubleMetaphoneResult16.getPrimary();
        doubleMetaphoneResult16.append('E', 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = soundex6.encode((java.lang.Object) 'E');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1910");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.soundex("HK");
        int int14 = refinedSoundex3.difference("ARKPKSKMNSK", "AKPK");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H03" + "'", str11, "H03");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1911");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("AKP1111111", "01230120022455012623010202");
        boolean boolean16 = metaphone0.isMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = metaphone0.encode("O941");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O" + "'", str18, "O");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1912");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('H');
        java.lang.String str7 = refinedSoundex3.soundex("Oa\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O0" + "'", str7, "O0");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1913");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "H000", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str26 = doubleMetaphone23.doubleMetaphone("", false);
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone23, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone23.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult31.appendPrimary('K');
        doubleMetaphoneResult31.append("");
        java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) "");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1914");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.metaphone("AKPKMNSKTS");
        java.lang.String str14 = metaphone0.metaphone("A931");
        metaphone0.setMaxCodeLen(0);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = metaphone0.encode(obj17);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1915");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "A0");
        boolean boolean6 = caverphone0.isCaverphoneEqual("ARKPKSKMNS", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1916");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        int int10 = refinedSoundex0.difference("#HIK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        int int13 = refinedSoundex0.difference("A0931538363836931583138363", "A0931");
        int int16 = refinedSoundex0.difference("ARKPXKMNSKTKNKTRKSPXNRKP", "AKPA111111");
        int int19 = refinedSoundex0.difference("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa", "I");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1917");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O941", "a1");
        java.lang.String str7 = caverphone0.encode("HI3");
        java.lang.String str9 = caverphone0.caverphone("A212");
        java.lang.String str11 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.String str13 = caverphone0.caverphone("ORGAPACHECOMMONSCODECENCODEREXCEPTIONAR");
        java.lang.String str15 = caverphone0.encode("org.apache.commons.codec.EncoderException: AA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKKMNSKT" + "'", str11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AKPKKMNSKT" + "'", str13, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AKPKKMNSKT" + "'", str15, "AKPKKMNSKT");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1918");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        java.lang.String str8 = soundex1.soundex("");
        java.lang.String str10 = soundex1.encode("A319");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1919");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.String str9 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = refinedSoundex0.encode("AA");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608" + "'", str9, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1920");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        soundex1.setMaxLength(100);
        java.lang.String str15 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A09313836383693138");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O941" + "'", str15, "O941");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1921");
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
        int int32 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1922");
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
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str20 = caverphone18.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex();
        char char23 = refinedSoundex21.getMappingCode('a');
        java.lang.String str25 = refinedSoundex21.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj26 = caverphone18.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str28 = caverphone18.caverphone("ORKP");
        boolean boolean31 = caverphone18.isCaverphoneEqual("", "AKPK");
        java.lang.Object obj32 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str34 = caverphone0.encode("");
        boolean boolean37 = caverphone0.isCaverphoneEqual("A09315383", "K301230120022455012623010202\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKMNSKTS" + "'", str20, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '0' + "'", char23 == '0');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O094010303080830603083060905301608" + "'", str25, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "AKPKKMNSKT" + "'", obj26, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKP1111111" + "'", str28, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "1111111111" + "'", obj32, "1111111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1111111111" + "'", str34, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1923");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        java.lang.String str9 = metaphone0.metaphone("O621");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O" + "'", str9, "O");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1924");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.encode("A09313836383693138");
        soundex1.setMaxLength((int) (byte) -1);
        java.lang.String str17 = soundex1.encode("K");
        java.lang.String str19 = soundex1.soundex("O0940103030808306030830609053016080931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "K000" + "'", str17, "K000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O000" + "'", str19, "O000");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1925");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        java.lang.String str7 = soundex2.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        soundex2.setMaxLength(0);
        int int12 = soundex2.difference("", " ");
        java.lang.Object obj14 = soundex2.encode((java.lang.Object) "H");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O941" + "'", str7, "O941");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H000" + "'", obj14, "H000");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1926");
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
        int int22 = soundex1.getMaxLength();
        soundex1.setMaxLength(3);
        soundex1.setMaxLength(97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1927");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        int int8 = soundex1.difference("AKPK", "a1");
        java.lang.String str10 = soundex1.encode("AKPK111111");
        int int13 = soundex1.difference("AKPKMNSK", "A000H0H000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A313" + "'", str10, "A313");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1928");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("", "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1929");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str5 = refinedSoundex3.soundex("AKPK");
        java.lang.String str7 = refinedSoundex3.encode("HI");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A0212" + "'", str5, "A0212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1930");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str4 = caverphone0.encode("H000");
        java.lang.String str6 = caverphone0.caverphone("A000H0H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1931");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        boolean boolean12 = metaphone0.isMetaphoneEqual("", "\0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1932");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        java.lang.String str13 = soundex1.soundex("AA11111111");
        java.lang.String str15 = soundex1.encode("A212");
        soundex1.setMaxLength((int) (byte) 0);
        int int20 = soundex1.difference("KPK1111111", "#HIKHIA212");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A000" + "'", str13, "A000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A000" + "'", str15, "A000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1933");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("A0313836");
        java.lang.String str9 = soundex0.soundex("A031");
        java.lang.String str11 = soundex0.soundex("1");
        int int12 = soundex0.getMaxLength();
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("HI");
        int int17 = soundex14.getMaxLength();
        org.apache.commons.codec.language.Metaphone metaphone18 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str20 = metaphone18.metaphone("H0");
        boolean boolean23 = metaphone18.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str25 = metaphone18.encode("hi!");
        boolean boolean28 = metaphone18.isMetaphoneEqual("H0", "HI");
        java.lang.Object obj29 = soundex14.encode((java.lang.Object) "H0");
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex14, "ORKP", "");
        java.lang.Object obj33 = soundex0.encode((java.lang.Object) "ORKP");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A000" + "'", str7, "A000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H000" + "'", obj29, "H000");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "O621" + "'", obj33, "O621");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("", false);
        int int14 = doubleMetaphone10.maxCodeLen;
        doubleMetaphone10.setMaxCodeLen(0);
        java.lang.String str19 = doubleMetaphone10.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone20.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone20.maxCodeLen = 100;
        java.lang.String str26 = doubleMetaphone20.encode("HI");
        java.lang.String str28 = doubleMetaphone20.encode("O094010303080830603083060905301608");
        java.lang.Object obj29 = doubleMetaphone10.encode((java.lang.Object) "O094010303080830603083060905301608");
        java.lang.String str31 = doubleMetaphone10.doubleMetaphone("H000");
        java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) str31);
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "A", "O000");
        java.lang.Class<?> wildcardClass36 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1935");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("");
        int int10 = refinedSoundex0.difference("H0", "O000");
        char char12 = refinedSoundex0.getMappingCode('0');
        java.lang.String str14 = refinedSoundex0.soundex("1111111111");
        char char16 = refinedSoundex0.getMappingCode('\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1936");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKP1111111 041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKP" + "'", str1, "AKP");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1937");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("01230120022455012623010202");
        java.lang.String str8 = caverphone0.caverphone("AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPKMNSKTS" + "'", str8, "AKPKMNSKTS");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1938");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        char char15 = doubleMetaphone0.charAt("", (int) (short) 100);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(49);
        doubleMetaphoneResult19.appendAlternate('3');
        java.lang.String str22 = doubleMetaphoneResult19.getAlternate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "3" + "'", str22, "3");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1939");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('1');
        doubleMetaphoneResult8.appendAlternate('1');
        doubleMetaphoneResult8.appendAlternate('3');
        doubleMetaphoneResult8.append("A0313836", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1940");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        org.apache.commons.codec.language.Metaphone metaphone3 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str5 = metaphone3.metaphone("H0");
        boolean boolean8 = metaphone3.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = metaphone3.metaphone("");
        java.lang.String str12 = metaphone3.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str14 = metaphone3.encode("O000");
        boolean boolean17 = metaphone3.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) "A931");
        soundex0.setMaxLength((int) '\000');
        java.lang.String str22 = soundex0.encode("org.apache.commons.codec.EncoderException: \000");
        java.lang.String str24 = soundex0.encode("\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O" + "'", str14, "O");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "O621" + "'", str22, "O621");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1941");
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
        int int25 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1942");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A0931383638369313893138363836931383138363", "K301230120022455012623010202\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1943");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("A");
        boolean boolean15 = caverphone0.isCaverphoneEqual("AKPKMNSK", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1944");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.encode("H000");
        boolean boolean13 = caverphone0.isCaverphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "");
        java.lang.String str15 = caverphone0.encode("A0931");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode(obj16);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1945");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!");
        boolean boolean13 = metaphone0.isMetaphoneEqual("01230120022455012623010202", "");
        java.lang.String str15 = metaphone0.encode("0");
        java.lang.String str17 = metaphone0.metaphone("A900");
        java.lang.String str19 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXNaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKP" + "'", str19, "ARKP");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('K');
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1947");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        boolean boolean14 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A931");
        boolean boolean17 = metaphone0.isMetaphoneEqual("", "O094010303080830603083060905301608094010303080830603083060905301608");
        boolean boolean20 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "ARKPXKMNSK");
        java.lang.String str22 = metaphone0.encode("A900");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1948");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.encode("01230120022455012623010202");
        boolean boolean11 = caverphone6.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str13 = caverphone6.encode("AA11111111");
        java.lang.String str15 = caverphone6.caverphone("A931");
        java.lang.String str17 = caverphone6.encode("HI");
        java.lang.Object obj18 = soundex0.encode((java.lang.Object) str17);
        java.lang.Object obj20 = soundex0.encode((java.lang.Object) "AA11111111");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex21 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str23 = refinedSoundex21.encode("01230120022455012623010202");
        java.lang.String str25 = refinedSoundex21.encode("AKPKKMNSKT");
        java.lang.String str27 = refinedSoundex21.soundex("");
        char char29 = refinedSoundex21.getMappingCode('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = soundex0.encode((java.lang.Object) char29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "A000" + "'", obj20, "A000");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A0313836" + "'", str25, "A0313836");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1949");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.caverphone("AKP");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str14 = caverphone12.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex();
        char char17 = refinedSoundex15.getMappingCode('a');
        java.lang.String str19 = refinedSoundex15.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj20 = caverphone12.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str22 = caverphone12.caverphone("ORKP");
        boolean boolean25 = caverphone12.isCaverphoneEqual("", "AKPK");
        java.lang.String str27 = caverphone12.encode("A111111111");
        java.lang.String str29 = caverphone12.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.Object obj30 = caverphone0.encode((java.lang.Object) "ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str32 = caverphone0.encode("org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str34 = caverphone0.encode("AKPa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKP1111111" + "'", str11, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AKPKMNSKTS" + "'", str14, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '0' + "'", char17 == '0');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O094010303080830603083060905301608" + "'", str19, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "AKPKKMNSKT" + "'", obj20, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AKP1111111" + "'", str22, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A111111111" + "'", str27, "A111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AKPKMNSKTK" + "'", str29, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "AKPKMNSKTK" + "'", obj30, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AKPKKMNSKT" + "'", str32, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AKPA111111" + "'", str34, "AKPA111111");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1950");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        java.lang.String str7 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: O000");
        java.lang.String str11 = refinedSoundex0.encode("a0a1");
        char char13 = refinedSoundex0.getMappingCode('p');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0940103030808306030830609053016080" + "'", str9, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '1' + "'", char13 == '1');
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1951");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("A0", "1111111111");
        boolean boolean23 = metaphone0.isMetaphoneEqual("AKPKMNSKTS", "AKPKKMNSKT");
        int int24 = metaphone0.getMaxCodeLen();
        java.lang.String str26 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1952");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.soundex("HI");
        java.lang.String str7 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: \000");
        char char9 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1953");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        java.lang.String str18 = metaphone0.metaphone("HI");
        java.lang.String str20 = metaphone0.metaphone("AA11111111");
        metaphone0.setMaxCodeLen(5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1954");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        int int17 = metaphone0.getMaxCodeLen();
        boolean boolean20 = metaphone0.isMetaphoneEqual("A0", "1111111111");
        boolean boolean23 = metaphone0.isMetaphoneEqual("AKPKMNSKTS", "AKPKKMNSKT");
        java.lang.String str25 = metaphone0.encode("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AKPK" + "'", str25, "AKPK");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1955");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.encode("");
        java.lang.String str9 = refinedSoundex0.soundex("");
        int int12 = refinedSoundex0.difference("ARKP", "\0000");
        org.apache.commons.codec.language.Caverphone caverphone13 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj15 = caverphone13.encode((java.lang.Object) "HI");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone13, "HI", "AA11111111");
        java.lang.Object obj19 = refinedSoundex0.encode((java.lang.Object) "HI");
        char char21 = refinedSoundex0.getMappingCode('3');
        char char23 = refinedSoundex0.getMappingCode('#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H0" + "'", obj19, "H0");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str19 = doubleMetaphone0.encode("A");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1957");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: H");
        java.lang.String str10 = caverphone0.caverphone("ARKPKKMNSKTKNKTRKSPXN");
        org.apache.commons.codec.EncoderException encoderException12 = new org.apache.commons.codec.EncoderException("0");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "0");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "");
        doubleMetaphone14.maxCodeLen = '4';
        java.lang.String str21 = doubleMetaphone14.doubleMetaphone("");
        java.lang.String str24 = doubleMetaphone14.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean28 = doubleMetaphone14.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str33 = doubleMetaphone14.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone14.new DoubleMetaphoneResult((int) (byte) 100);
        int int36 = doubleMetaphone14.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = caverphone0.encode((java.lang.Object) int36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPKKMNSKT" + "'", str8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSKTK" + "'", str10, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "A" + "'", str33, "A");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1958");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = caverphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKMNSKTS" + "'", str4, "AKPKMNSKTS");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1959");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        metaphone0.setMaxCodeLen(2);
        int int5 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Metaphone metaphone6 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str8 = metaphone6.metaphone("H0");
        boolean boolean11 = metaphone6.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str13 = metaphone6.metaphone("");
        java.lang.String str15 = metaphone6.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str20 = doubleMetaphone17.doubleMetaphone("", false);
        int int21 = doubleMetaphone17.maxCodeLen;
        int int22 = doubleMetaphone17.maxCodeLen;
        boolean boolean25 = doubleMetaphone17.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj26 = doubleMetaphone16.encode((java.lang.Object) "HI");
        java.lang.String str28 = doubleMetaphone16.encode("hi!");
        java.lang.Object obj29 = metaphone6.encode((java.lang.Object) "hi!");
        int int30 = metaphone6.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode((java.lang.Object) metaphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ARKP" + "'", str15, "ARKP");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H" + "'", obj29, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1960");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(1);
        int int12 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1961");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("HI");
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str21 = metaphone0.metaphone("K");
        java.lang.String str23 = metaphone0.metaphone("");
        java.lang.String str25 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "K" + "'", str21, "K");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1962");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        int int10 = refinedSoundex7.difference("AKPKMNSKTK", "AR");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1963");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.Object obj12 = refinedSoundex0.encode((java.lang.Object) "A310");
        org.apache.commons.codec.EncoderException encoderException14 = new org.apache.commons.codec.EncoderException("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.apache.commons.codec.EncoderException encoderException16 = new org.apache.commons.codec.EncoderException("HI");
        org.apache.commons.codec.EncoderException encoderException18 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException20 = new org.apache.commons.codec.EncoderException("");
        encoderException18.addSuppressed((java.lang.Throwable) encoderException20);
        java.lang.Throwable[] throwableArray22 = encoderException18.getSuppressed();
        encoderException16.addSuppressed((java.lang.Throwable) encoderException18);
        org.apache.commons.codec.EncoderException encoderException25 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException27 = new org.apache.commons.codec.EncoderException("");
        encoderException25.addSuppressed((java.lang.Throwable) encoderException27);
        java.lang.Throwable[] throwableArray29 = encoderException25.getSuppressed();
        java.lang.Throwable[] throwableArray30 = encoderException25.getSuppressed();
        encoderException16.addSuppressed((java.lang.Throwable) encoderException25);
        encoderException14.addSuppressed((java.lang.Throwable) encoderException16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = refinedSoundex0.encode((java.lang.Object) encoderException16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A0" + "'", obj12, "A0");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1964");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        java.lang.String str9 = refinedSoundex7.encode("A310");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = refinedSoundex7.difference("org.apache.commons.codec.EncoderException: 01230120022455012623010202\000", "ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A4" + "'", str9, "A4");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1965");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1966");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "O09401030308083060308306090530160809");
        metaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1967");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AAAA", "I0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1968");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.metaphone("");
        boolean boolean12 = metaphone0.isMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP", "A03131");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1969");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int4 = soundex1.getMaxLength();
        soundex1.setMaxLength(4);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1970");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("O621", false);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1971");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("AKPa", "");
        int int4 = metaphone0.getMaxCodeLen();
        boolean boolean7 = metaphone0.isMetaphoneEqual("", "");
        boolean boolean10 = metaphone0.isMetaphoneEqual("3", "\000H200");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1972");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str18 = doubleMetaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        int int19 = doubleMetaphone0.maxCodeLen;
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "AKPKP11111", "org.apache.commons.codec.EncoderException: H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ARKP" + "'", str18, "ARKP");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1973");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        java.lang.String str4 = soundex0.encode("A000");
        soundex0.setMaxLength(3);
        soundex0.setMaxLength(0);
        int int11 = soundex0.difference("ARKP", "A000AKP1111111\000A");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1974");
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
        doubleMetaphone0.maxCodeLen = 75;
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("AKP1111111");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AKP" + "'", str33, "AKP");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1975");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        char char9 = refinedSoundex0.getMappingCode('4');
        java.lang.String str11 = refinedSoundex0.encode("H000");
        java.lang.String str13 = refinedSoundex0.soundex("A313");
        int int16 = refinedSoundex0.difference("O094010303080830603083060905301608", "AK11111111");
        char char18 = refinedSoundex0.getMappingCode('X');
        char char20 = refinedSoundex0.getMappingCode('1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H0" + "'", str11, "H0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '5' + "'", char18 == '5');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1976");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HI");
        boolean boolean19 = metaphone0.isMetaphoneEqual("", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone0.encode("");
        java.lang.String str23 = metaphone0.encode("A931");
        boolean boolean26 = metaphone0.isMetaphoneEqual("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1977");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "H000", false);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSKT1", "AAKP", false);
        java.lang.String str28 = doubleMetaphone0.encode("AKA1111111");
        doubleMetaphone0.maxCodeLen = 43;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AK" + "'", str28, "AK");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1978");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
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
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray27 = encoderException26.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException29 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException31 = new org.apache.commons.codec.EncoderException("");
        encoderException29.addSuppressed((java.lang.Throwable) encoderException31);
        encoderException26.addSuppressed((java.lang.Throwable) encoderException29);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException36 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray37 = encoderException36.getSuppressed();
        encoderException19.addSuppressed((java.lang.Throwable) encoderException36);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("AKPKMNSKTS");
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException44 = new org.apache.commons.codec.EncoderException("");
        encoderException42.addSuppressed((java.lang.Throwable) encoderException44);
        org.apache.commons.codec.EncoderException encoderException47 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException49 = new org.apache.commons.codec.EncoderException("");
        encoderException47.addSuppressed((java.lang.Throwable) encoderException49);
        encoderException42.addSuppressed((java.lang.Throwable) encoderException49);
        org.apache.commons.codec.EncoderException encoderException53 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException55 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray56 = encoderException55.getSuppressed();
        encoderException53.addSuppressed((java.lang.Throwable) encoderException55);
        encoderException42.addSuppressed((java.lang.Throwable) encoderException53);
        encoderException40.addSuppressed((java.lang.Throwable) encoderException53);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException53);
        org.apache.commons.codec.EncoderException encoderException62 = new org.apache.commons.codec.EncoderException("01230120022455012623010202\000");
        encoderException53.addSuppressed((java.lang.Throwable) encoderException62);
        org.apache.commons.codec.EncoderException encoderException65 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException67 = new org.apache.commons.codec.EncoderException("");
        encoderException65.addSuppressed((java.lang.Throwable) encoderException67);
        org.apache.commons.codec.EncoderException encoderException70 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException72 = new org.apache.commons.codec.EncoderException("");
        encoderException70.addSuppressed((java.lang.Throwable) encoderException72);
        encoderException65.addSuppressed((java.lang.Throwable) encoderException72);
        org.apache.commons.codec.EncoderException encoderException76 = new org.apache.commons.codec.EncoderException("O000");
        java.lang.Throwable[] throwableArray77 = encoderException76.getSuppressed();
        encoderException65.addSuppressed((java.lang.Throwable) encoderException76);
        org.apache.commons.codec.EncoderException encoderException80 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException82 = new org.apache.commons.codec.EncoderException("");
        encoderException80.addSuppressed((java.lang.Throwable) encoderException82);
        org.apache.commons.codec.EncoderException encoderException85 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException87 = new org.apache.commons.codec.EncoderException("");
        encoderException85.addSuppressed((java.lang.Throwable) encoderException87);
        encoderException80.addSuppressed((java.lang.Throwable) encoderException87);
        org.apache.commons.codec.EncoderException encoderException91 = new org.apache.commons.codec.EncoderException("O000");
        java.lang.Throwable[] throwableArray92 = encoderException91.getSuppressed();
        encoderException80.addSuppressed((java.lang.Throwable) encoderException91);
        encoderException65.addSuppressed((java.lang.Throwable) encoderException91);
        encoderException53.addSuppressed((java.lang.Throwable) encoderException65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = soundex0.encode((java.lang.Object) encoderException65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1979");
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
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: AKPKMNSKTS", false);
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("O0");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "O094010303080830603083060905301608", "ARKPXKMNSKTKNKTRKSPXN");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str28 = doubleMetaphone0.encode("");
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("H");
        java.lang.Throwable[] throwableArray31 = encoderException30.getSuppressed();
        org.apache.commons.codec.EncoderException encoderException33 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray34 = encoderException33.getSuppressed();
        encoderException30.addSuppressed((java.lang.Throwable) encoderException33);
        org.apache.commons.codec.EncoderException encoderException37 = new org.apache.commons.codec.EncoderException("01230120022455012623010202");
        encoderException33.addSuppressed((java.lang.Throwable) encoderException37);
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException42 = new org.apache.commons.codec.EncoderException("");
        encoderException40.addSuppressed((java.lang.Throwable) encoderException42);
        org.apache.commons.codec.EncoderException encoderException45 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException47 = new org.apache.commons.codec.EncoderException("");
        encoderException45.addSuppressed((java.lang.Throwable) encoderException47);
        encoderException40.addSuppressed((java.lang.Throwable) encoderException47);
        java.lang.Throwable[] throwableArray50 = encoderException47.getSuppressed();
        encoderException37.addSuppressed((java.lang.Throwable) encoderException47);
        java.lang.Throwable[] throwableArray52 = encoderException37.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = doubleMetaphone0.encode((java.lang.Object) throwableArray52);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1980");
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
        int int19 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(0);
        java.lang.String str23 = metaphone0.encode("AKPKMNSKTS\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKP" + "'", str18, "ORKP");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1981");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = metaphone0.metaphone("aa");
        boolean boolean12 = metaphone0.isMetaphoneEqual("ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1982");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        char char9 = refinedSoundex0.getMappingCode('4');
        java.lang.String str11 = refinedSoundex0.encode("H000");
        java.lang.String str13 = refinedSoundex0.soundex("A313");
        char char15 = refinedSoundex0.getMappingCode('a');
        java.lang.String str17 = refinedSoundex0.encode("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.String str19 = refinedSoundex0.soundex("HI3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H0" + "'", str11, "H0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '0' + "'", char15 == '0');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A0931538363836931583138363" + "'", str17, "A0931538363836931583138363");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H0" + "'", str19, "H0");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        char char13 = doubleMetaphone0.charAt("A000", (int) (short) 1);
        doubleMetaphone0.maxCodeLen = '4';
        int int16 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 73;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1984");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        char char8 = doubleMetaphone0.charAt("1111111111", (int) (short) 1);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex();
        char char11 = refinedSoundex9.getMappingCode('a');
        int int14 = refinedSoundex9.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str16 = refinedSoundex9.soundex("");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("H200", "");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult24.appendAlternate('#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1985");
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
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex();
        char char25 = refinedSoundex23.getMappingCode('a');
        java.lang.String str27 = refinedSoundex23.soundex("org.apache.commons.codec.EncoderException: ");
        char char29 = refinedSoundex23.getMappingCode('#');
        int int32 = refinedSoundex23.difference("ARKP", "H000");
        char char34 = refinedSoundex23.getMappingCode('K');
        java.lang.String str36 = refinedSoundex23.soundex("org.apache.commons.codec.EncoderException: A0");
        java.lang.Class<?> wildcardClass37 = refinedSoundex23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = refinedSoundex0.encode((java.lang.Object) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '0' + "'", char25 == '0');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "O094010303080830603083060905301608" + "'", str27, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '3' + "'", char34 == '3');
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "O0940103030808306030830609053016080" + "'", str36, "O0940103030808306030830609053016080");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1986");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("HI13");
        doubleMetaphone0.setMaxCodeLen((int) '8');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1987");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("HI");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex();
        char char12 = refinedSoundex10.getMappingCode('a');
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex10, "", "hi!");
        java.lang.String str17 = refinedSoundex10.soundex("01230120022455012623010202");
        int int20 = refinedSoundex10.difference("H", "H0");
        int int23 = refinedSoundex10.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str25 = refinedSoundex10.encode("O");
        int int28 = refinedSoundex10.difference("", "");
        int int31 = refinedSoundex10.difference("ARKPXKMNSKTKNKTRKSPXN", "0123012002245501262301020211111111111");
        java.lang.String str33 = refinedSoundex10.encode("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.Object obj35 = refinedSoundex10.encode((java.lang.Object) "1111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) refinedSoundex10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '0' + "'", char12 == '0');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O0" + "'", str25, "O0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "O0" + "'", str33, "O0");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "" + "'", obj35, "");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1988");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str11 = refinedSoundex9.encode(" KH1");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K30" + "'", str11, "K30");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('1');
        doubleMetaphoneResult8.append('A', '1');
        doubleMetaphoneResult8.append("ARKP", "ARKP");
        doubleMetaphoneResult8.append("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1990");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AKPKKMNSKT");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str13 = caverphone0.encode("A313");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("", false);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone14, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone14.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult22.appendPrimary('K');
        doubleMetaphoneResult22.appendPrimary("A0931538363836931583138363");
        boolean boolean27 = doubleMetaphoneResult22.isComplete();
        doubleMetaphoneResult22.append("AAAA");
        java.lang.String str30 = doubleMetaphoneResult22.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "KA09" + "'", str30, "KA09");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = 'S';
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("aHIA212 ", false);
        java.lang.String str16 = doubleMetaphone0.encode("ARKPXKMNSKTKNKTRKSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AH" + "'", str14, "AH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str16, "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1992");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("HI3");
        boolean boolean15 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: A313", "org.apache.commons.codec.EncoderException: A0");
        boolean boolean18 = caverphone0.isCaverphoneEqual("AHH", "AKP");
        boolean boolean21 = caverphone0.isCaverphoneEqual("", "ARKPKKMNSKTKNKTRKSPXN");
        org.apache.commons.codec.language.Metaphone metaphone22 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str24 = metaphone22.metaphone("H0");
        boolean boolean27 = metaphone22.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str29 = metaphone22.encode("hi!");
        boolean boolean32 = metaphone22.isMetaphoneEqual("H0", "HI");
        int int33 = metaphone22.getMaxCodeLen();
        java.lang.String str35 = metaphone22.encode("HI");
        int int36 = metaphone22.getMaxCodeLen();
        java.lang.String str38 = metaphone22.encode("hi!");
        metaphone22.setMaxCodeLen(111);
        java.lang.String str42 = metaphone22.metaphone("AKPKKMNSKT#");
        java.lang.Object obj43 = caverphone0.encode((java.lang.Object) "AKPKKMNSKT#");
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = caverphone0.encode(obj44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H" + "'", str38, "H");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AKPKMNSKT" + "'", str42, "AKPKMNSKT");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "AKPKMNSKT1" + "'", obj43, "AKPKMNSKT1");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1993");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("HI", "hi!");
        java.lang.String str8 = refinedSoundex0.encode("O000");
        java.lang.String str10 = refinedSoundex0.soundex("AKP");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone11, "hi!", "");
        doubleMetaphone11.maxCodeLen = '4';
        java.lang.String str18 = doubleMetaphone11.doubleMetaphone("");
        int int19 = doubleMetaphone11.getMaxCodeLen();
        java.lang.String str21 = doubleMetaphone11.doubleMetaphone("hi!");
        java.lang.Object obj23 = doubleMetaphone11.encode((java.lang.Object) "HI");
        java.lang.Object obj24 = refinedSoundex0.encode(obj23);
        char char26 = refinedSoundex0.getMappingCode('R');
        java.lang.String str28 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A031" + "'", str10, "A031");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H0" + "'", obj24, "H0");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '9' + "'", char26 == '9');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608094010303080830603083060905301608" + "'", str28, "O094010303080830603083060905301608094010303080830603083060905301608094010303080830603083060905301608");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1994");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str6 = soundex2.soundex("AKPKMNSKTS");
        java.lang.String str8 = soundex2.encode("HI");
        java.lang.String str10 = soundex2.encode("");
        java.lang.String str12 = soundex2.soundex("org.apache.commons.codec.EncoderException: \000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O941" + "'", str4, "O941");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A313" + "'", str6, "A313");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H000" + "'", str8, "H000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O941" + "'", str12, "O941");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1995");
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
        java.lang.String str33 = soundex1.encode("org.apache.commons.codec.EncoderException: A931");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex34 = new org.apache.commons.codec.language.RefinedSoundex();
        char char36 = refinedSoundex34.getMappingCode('a');
        java.lang.String str38 = refinedSoundex34.soundex("H000");
        int int41 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex34, "ORKP", "H");
        char char43 = refinedSoundex34.getMappingCode('K');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex1.encode((java.lang.Object) 'K');
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A000" + "'", str31, "A000");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "O941" + "'", str33, "O941");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '0' + "'", char36 == '0');
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H0" + "'", str38, "H0");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '3' + "'", char43 == '3');
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1996");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.Object obj10 = caverphone0.encode((java.lang.Object) "AKPKMNSKTS");
        java.lang.String str12 = caverphone0.caverphone("03");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "hi!", "");
        doubleMetaphone13.maxCodeLen = '4';
        java.lang.String str20 = doubleMetaphone13.doubleMetaphone("");
        int int21 = doubleMetaphone13.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) doubleMetaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "AKPKMNSKTS" + "'", obj10, "AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1997");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O941", "a1");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "K");
        boolean boolean11 = caverphone0.isCaverphoneEqual("AA11111111a a", "org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex();
        char char14 = refinedSoundex12.getMappingCode('a');
        java.lang.String str16 = refinedSoundex12.soundex("org.apache.commons.codec.EncoderException: ");
        char char18 = refinedSoundex12.getMappingCode('#');
        int int21 = refinedSoundex12.difference("H000", "hi!");
        char char23 = refinedSoundex12.getMappingCode('a');
        java.lang.String str25 = refinedSoundex12.soundex("0AKPORKP");
        java.lang.Object obj26 = caverphone0.encode((java.lang.Object) str25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '0' + "'", char14 == '0');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O094010303080830603083060905301608" + "'", str16, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '0' + "'", char23 == '0');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A0310931" + "'", str25, "A0310931");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "A111111111" + "'", obj26, "A111111111");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1998");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "0");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931", "O093153836383693158", true);
        char[] charArray22 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str25 = soundex23.encode("HI");
        int int28 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex23, "01230120022455012623010202", "HI");
        soundex23.setMaxLength(10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex();
        char char33 = refinedSoundex31.getMappingCode('a');
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex31, "", "hi!");
        java.lang.String str38 = refinedSoundex31.soundex("01230120022455012623010202");
        int int41 = refinedSoundex31.difference("H", "H0");
        int int44 = refinedSoundex31.difference("", "01230120022455012623010202");
        int int47 = refinedSoundex31.difference("A0", "A0");
        int int50 = refinedSoundex31.difference("org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str52 = refinedSoundex31.encode("");
        java.lang.Object obj53 = soundex23.encode((java.lang.Object) "");
        java.lang.Object obj54 = doubleMetaphone0.encode((java.lang.Object) "");
        int int55 = doubleMetaphone0.getMaxCodeLen();
        int int56 = doubleMetaphone0.getMaxCodeLen();
        char char59 = doubleMetaphone0.charAt("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", (int) '\000');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '0' + "'", char33 == '0');
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + char59 + "' != '" + 'A' + "'", char59 == 'A');
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1999");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "AKPKKMNSKT");
        boolean boolean11 = caverphone0.isCaverphoneEqual("", "AKPK");
        java.lang.String str13 = caverphone0.encode("A313");
        java.lang.String str15 = caverphone0.encode("HI3");
        java.lang.String str17 = caverphone0.encode("");
        boolean boolean20 = caverphone0.isCaverphoneEqual("H300", "A0310");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test2000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendPrimary("A0931538363836931583138363");
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate('o');
        doubleMetaphoneResult8.appendAlternate("a");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}
