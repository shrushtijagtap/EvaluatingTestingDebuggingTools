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
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.encode("A");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("AKP");
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKP" + "'", str12, "AKP");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A000\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        org.apache.commons.codec.language.Caverphone caverphone34 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str36 = caverphone34.encode("01230120022455012623010202");
        boolean boolean39 = caverphone34.isCaverphoneEqual("O941", "a1");
        java.lang.String str41 = caverphone34.encode("HI3");
        java.lang.String str43 = caverphone34.caverphone("A212");
        java.lang.String str45 = caverphone34.caverphone("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.Object obj46 = doubleMetaphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1111111111" + "'", str36, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AA11111111" + "'", str41, "AA11111111");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "A111111111" + "'", str43, "A111111111");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "AKPKKMNSKT" + "'", str45, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", obj46, "ARKPXKMNSKTKNKTRKSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("H0");
        soundex2.setMaxLength(0);
        int int7 = soundex2.getMaxLength();
        java.lang.String str9 = soundex2.soundex("RKPKS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "R313" + "'", str9, "R313");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O941", "a1");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "K");
        boolean boolean11 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: hi!", "a#00");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = caverphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        char char18 = refinedSoundex3.getMappingCode('8');
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
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        java.lang.String str26 = soundex1.soundex("HI13");
        java.lang.String str28 = soundex1.encode("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H000" + "'", str26, "H000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A931" + "'", str28, "A931");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        char char11 = refinedSoundex0.getMappingCode('#');
        java.lang.String str13 = refinedSoundex0.encode("A0212");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O941", "a1");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "K");
        boolean boolean11 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ORKP", "A313");
        java.lang.String str13 = caverphone0.caverphone("AK");
        boolean boolean16 = caverphone0.isCaverphoneEqual("\0000", "K3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AK11111111" + "'", str13, "AK11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.String str9 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = refinedSoundex0.soundex("K111111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608" + "'", str9, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K3" + "'", str11, "K3");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int14 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex();
        int int18 = refinedSoundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        int int21 = refinedSoundex15.difference("A031383", "AKPKMNSKTS");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("AKPKMNSKTS");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        int int11 = refinedSoundex8.difference("H000", "H0");
        java.lang.String str13 = refinedSoundex8.soundex("HI");
        java.lang.Object obj14 = refinedSoundex0.encode((java.lang.Object) str13);
        java.lang.String str16 = refinedSoundex0.encode("A");
        int int19 = refinedSoundex0.difference("O000", "A0931538363836931583138363");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "A0931", "org.apache.commons.codec.EncoderException: \000");
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = refinedSoundex0.encode(obj23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A03138363" + "'", str7, "A03138363");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "H0" + "'", obj14, "H0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A0" + "'", str16, "A0");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        boolean boolean24 = caverphone0.isCaverphoneEqual("AKPA111111", "ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
        java.lang.String str26 = caverphone0.caverphone("o");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A111111111" + "'", str26, "A111111111");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        java.lang.String str7 = soundex1.encode("");
        java.lang.String str9 = soundex1.encode("0123012002245501262301020211111111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        int int10 = refinedSoundex0.difference("", "O941");
        int int13 = refinedSoundex0.difference("O941", "ORKP");
        java.lang.String str15 = refinedSoundex0.encode("O094010303080830603083060905301608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str19 = doubleMetaphone16.doubleMetaphone("", false);
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str24 = doubleMetaphone16.encode("hi!");
        java.lang.String str26 = doubleMetaphone16.doubleMetaphone("H000");
        doubleMetaphone16.setMaxCodeLen((int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone16.new DoubleMetaphoneResult((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = refinedSoundex0.encode((java.lang.Object) doubleMetaphoneResult30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = 'I';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA", "R313", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = soundex1.encode("A000");
        soundex1.setMaxLength(4);
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "A03138363AKPKKMNSKT ", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        java.lang.String str23 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: 0123012002245501262301020211111111111");
        int int24 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'S');
        doubleMetaphoneResult38.appendAlternate("K130");
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
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("H000", "hi!");
        java.lang.String str7 = caverphone0.encode("AKPa");
        java.lang.String str9 = caverphone0.caverphone("ARKPXKMNSKTKNKTRKSPXNRKP");
        java.lang.String str11 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPA111111" + "'", str7, "AKPA111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKPKMNSKTK" + "'", str9, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        boolean boolean8 = caverphone0.isCaverphoneEqual("AA11111111", "O0931");
        java.lang.String str10 = caverphone0.caverphone("A03131");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AKPKRKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "1111111111");
        java.lang.String str15 = caverphone0.caverphone("HIA212aX");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AK11111111" + "'", str15, "AK11111111");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        soundex1.setMaxLength(4);
        int int24 = soundex1.difference("AKPaXS", "K3");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        java.lang.String str29 = caverphone0.caverphone("AAKP");
        java.lang.String str31 = caverphone0.caverphone("0oorg.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMON");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AKP1111111" + "'", str29, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AKPKKMNSKT" + "'", str31, "AKPKKMNSKT");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str10 = refinedSoundex8.soundex("KA11111111");
        java.lang.String str12 = refinedSoundex8.soundex("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "K30" + "'", str10, "K30");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A093153836383693158931538363836931583138363" + "'", str12, "A093153836383693158931538363836931583138363");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        int int6 = refinedSoundex0.difference("HIA", "org.apache.commons.codec.EncoderException: A0");
        int int9 = refinedSoundex0.difference("ARKPKSKMNSKTKNKTRKSPKSNRKP", "O0931538363836931589");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORKP" + "'", str13, "ORKP");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        char char6 = refinedSoundex0.getMappingCode('a');
        java.lang.String str8 = refinedSoundex0.soundex("H");
        java.lang.String str10 = refinedSoundex0.soundex("A4");
        int int13 = refinedSoundex0.difference(" o", "0H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H0" + "'", str8, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A0" + "'", str10, "A0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        int int22 = soundex1.difference("", "A");
        int int25 = soundex1.difference("O0940103030808306030830609053016080940103030808306030830609053016080", "O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str27 = soundex1.encode("hi!");
        soundex1.setMaxLength(3);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("K301230120022455012623010202\000");
        java.lang.String str14 = refinedSoundex0.soundex("AKPKMNSKTK");
        char char16 = refinedSoundex0.getMappingCode('H');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "K3" + "'", str12, "K3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A03138363" + "'", str14, "A03138363");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '0' + "'", char16 == '0');
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'K');
        java.lang.String str12 = doubleMetaphone0.encode("O093153836383693158");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: AAAA", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPKKMNSKTKNKTRKSPXN" + "'", str16, "ARKPKKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("H0");
        int int7 = soundex2.difference("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS", "ORKPXKMNSKTKNKTRKSSPXNR");
        java.lang.String str9 = soundex2.soundex("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.String str11 = soundex2.soundex("aa");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A931" + "'", str9, "A931");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        int int14 = metaphone0.getMaxCodeLen();
        boolean boolean17 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "AK11111111");
        int int18 = metaphone0.getMaxCodeLen();
        java.lang.String str20 = metaphone0.encode("A000AKP1111111\000A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKP" + "'", str20, "AKP");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("#HIA093153836383693158");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIA" + "'", str1, "HIA");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        int int13 = doubleMetaphone0.maxCodeLen;
        int int14 = doubleMetaphone0.maxCodeLen;
        int int15 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 'r';
        char char20 = doubleMetaphone0.charAt("A931", (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("AA11111111", "");
        boolean boolean8 = metaphone0.isMetaphoneEqual("I000", "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("HI");
        java.lang.String str13 = caverphone0.caverphone("01230120022455012623010202");
        java.lang.String str15 = caverphone0.encode("01230120022455012623010202");
        boolean boolean18 = caverphone0.isCaverphoneEqual("", "A03105");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        java.lang.String str13 = metaphone0.metaphone("0123012002245501262301020211111111111");
        java.lang.String str15 = metaphone0.encode("K30");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "K" + "'", str15, "K");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str11 = soundex9.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O941" + "'", str11, "O941");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str11 = soundex9.soundex("A031393138363836931383138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        int int10 = refinedSoundex0.difference("", "O941");
        int int13 = refinedSoundex0.difference("O941", "ORKP");
        char char15 = refinedSoundex0.getMappingCode('\000');
        java.lang.String str17 = refinedSoundex0.soundex("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str19 = refinedSoundex0.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.String str21 = refinedSoundex0.encode("O0940103030808306030830609053016080940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A09313836383693138" + "'", str17, "A09313836383693138");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A093153836383693158" + "'", str19, "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "O0" + "'", str21, "O0");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str8 = doubleMetaphoneResult7.getPrimary();
        boolean boolean9 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('3');
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        int int22 = soundex1.difference("", "A");
        int int23 = soundex1.getMaxLength();
        int int26 = soundex1.difference("", "H000");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "O0940103030808306030830609053016080", "HI3");
        java.lang.String str27 = metaphone0.metaphone("1111111111");
        java.lang.String str29 = metaphone0.encode("#HIKHIA212A4ORKP1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSN" + "'", str22, "ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HKHRKP" + "'", str29, "HKHRKP");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("01230120022455012623010202\000", "a1");
        java.lang.String str17 = caverphone0.encode("ARKPXKMNSKTKNKTRKSPXNR");
        boolean boolean20 = caverphone0.isCaverphoneEqual("A900", "ORKPXKMNSKTKNKTRKSSPXN");
        java.lang.String str22 = caverphone0.caverphone("I000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKMNSKTK" + "'", str17, "AKPKMNSKTK");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A111111111" + "'", str22, "A111111111");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendPrimary("A0931538363836931583138363");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('2');
        doubleMetaphoneResult8.append('9', 'a');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A000A212", "A0313836");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        java.lang.String str5 = doubleMetaphone0.encode("ORKP");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSK", "AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa", true);
        char char13 = doubleMetaphone0.charAt("A000", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ARKP" + "'", str5, "ARKP");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str10 = doubleMetaphone7.doubleMetaphone("", false);
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone7, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone7.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult15.appendPrimary('K');
        doubleMetaphoneResult15.append("");
        java.lang.String str20 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("A03138363");
        java.lang.Object obj23 = soundex6.encode((java.lang.Object) "A03138363");
        int int24 = soundex6.getMaxLength();
        soundex6.setMaxLength(52);
        soundex6.setMaxLength((int) 'O');
        int int31 = soundex6.difference("A03131", "03");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "A000" + "'", obj23, "A000");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = refinedSoundex12.encode("AKPKMNSK");
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex();
        char char12 = refinedSoundex10.getMappingCode('a');
        java.lang.String str14 = refinedSoundex10.soundex("org.apache.commons.codec.EncoderException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = soundex9.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: O");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '0' + "'", char12 == '0');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O094010303080830603083060905301608" + "'", str14, "O094010303080830603083060905301608");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("1111111111", "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("A0313836");
        java.lang.String str13 = soundex0.encode("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        java.lang.String str15 = soundex0.soundex("");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O621" + "'", str13, "O621");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        int int5 = refinedSoundex0.difference("A931", "H000");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ARKPKSKMNS", "AKPKKMNSKT#ORGAPACHECOMMONSCODECENCODEREXCEPTION#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ");
        java.lang.String str6 = caverphone0.caverphone("0#O004");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKPKKMNSKT");
        java.lang.String str7 = caverphone0.caverphone("04");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = caverphone0.encode((java.lang.Object) metaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111" + "'", str7, "1111111111");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.String str26 = refinedSoundex0.encode("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex();
        char char29 = refinedSoundex27.getMappingCode('a');
        int int32 = refinedSoundex27.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str34 = refinedSoundex27.encode("hi!");
        int int37 = refinedSoundex27.difference("#HIK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str39 = refinedSoundex27.encode("AKP1111111");
        java.lang.Object obj40 = refinedSoundex0.encode((java.lang.Object) "AKP1111111");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A093138363836931389313836383693138" + "'", str26, "A093138363836931389313836383693138");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '0' + "'", char29 == '0');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H0" + "'", str34, "H0");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A031" + "'", str39, "A031");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "A031" + "'", obj40, "A031");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        boolean boolean10 = metaphone0.isMetaphoneEqual("HIA212", "O094010303080830603083060905301608");
        int int11 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "A0310", true);
        int int39 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str41 = doubleMetaphone0.doubleMetaphone("A09313836383693158");
        java.lang.String str43 = doubleMetaphone0.encode("aorg.apache.commons.codec.EncoderException: 01230120022455012623010202");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "A" + "'", str41, "A");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str43, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.caverphone("H000");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "O000", "org.apache.commons.codec.EncoderException: A931");
        java.lang.String str11 = caverphone0.caverphone("");
        java.lang.String str13 = caverphone0.encode("HI1A093153836383693158");
        boolean boolean16 = caverphone0.isCaverphoneEqual("0123012002245501262301020211111111111", "\0000");
        java.lang.String str18 = caverphone0.caverphone("ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj21 = caverphone19.encode((java.lang.Object) "HI");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone19, "A000", "AKPKKMNSKT");
        java.lang.String str26 = caverphone19.caverphone("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.Object obj27 = caverphone0.encode((java.lang.Object) "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPKMNSKTK" + "'", str18, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AKPKMNSKTK" + "'", str26, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "AKPKMNSKTK" + "'", obj27, "AKPKMNSKTK");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        java.lang.String str11 = refinedSoundex0.encode("");
        char char13 = refinedSoundex0.getMappingCode('A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.String str10 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: A0");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS", "#HIKHIA212");
        java.lang.String str15 = caverphone0.caverphone("KRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KKP1111111" + "'", str15, "KKP1111111");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSK", "A0310", true);
        int int39 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str41 = doubleMetaphone0.doubleMetaphone("A09313836383693158");
        java.lang.Class<?> wildcardClass42 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "A" + "'", str41, "A");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        doubleMetaphone0.setMaxCodeLen(8);
        char char10 = doubleMetaphone0.charAt("R9315", (int) '3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "A212");
        int int9 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: H000");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("HI");
        org.apache.commons.codec.EncoderException encoderException15 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("");
        encoderException15.addSuppressed((java.lang.Throwable) encoderException17);
        java.lang.Throwable[] throwableArray19 = encoderException15.getSuppressed();
        encoderException13.addSuppressed((java.lang.Throwable) encoderException15);
        org.apache.commons.codec.EncoderException encoderException22 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("");
        encoderException22.addSuppressed((java.lang.Throwable) encoderException24);
        java.lang.Throwable[] throwableArray26 = encoderException22.getSuppressed();
        java.lang.Throwable[] throwableArray27 = encoderException22.getSuppressed();
        encoderException13.addSuppressed((java.lang.Throwable) encoderException22);
        encoderException11.addSuppressed((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray30 = encoderException13.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = refinedSoundex0.encode((java.lang.Object) encoderException13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("X");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPK111111", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", true);
        java.lang.String str13 = doubleMetaphone0.encode("RKPK");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSKTS", "HIA", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RKPK" + "'", str13, "RKPK");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        java.lang.String str20 = caverphone0.encode("0AKPORKP");
        boolean boolean23 = caverphone0.isCaverphoneEqual("0AKPORKP", "A0310310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKP11111" + "'", str20, "AKPKP11111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        java.lang.String str8 = refinedSoundex0.encode("O0");
        java.lang.String str10 = refinedSoundex0.encode("AKPK111111");
        java.lang.String str12 = refinedSoundex0.soundex("AKPKSKMNSK");
        int int15 = refinedSoundex0.difference("ARKPXKMNSKTKNKTRKSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "X5");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O0" + "'", str8, "O0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A0313" + "'", str10, "A0313");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A031383" + "'", str12, "A031383");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex();
        char char15 = refinedSoundex13.getMappingCode('a');
        int int18 = refinedSoundex13.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char20 = refinedSoundex13.getMappingCode('K');
        int int23 = refinedSoundex13.difference("", "O941");
        int int26 = refinedSoundex13.difference("O941", "ORKP");
        java.lang.String str28 = refinedSoundex13.encode("O094010303080830603083060905301608");
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex13, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "a1");
        java.lang.Object obj32 = refinedSoundex0.encode((java.lang.Object) "a1");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '0' + "'", char15 == '0');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '3' + "'", char20 == '3');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "O0" + "'", str28, "O0");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "A0" + "'", obj32, "A0");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        java.lang.String str9 = refinedSoundex0.encode("03ARKPXKMNSKTKNKTRKSPXNRKP");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A093153836383693158931" + "'", str9, "A093153836383693158931");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH;
        java.lang.String str2 = refinedSoundex0.encode("\0000");
        java.lang.String str4 = refinedSoundex0.soundex("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a");
        org.junit.Assert.assertNotNull(refinedSoundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0940103030808306030830609053016080" + "'", str4, "A0940103030808306030830609053016080");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str4 = doubleMetaphone1.doubleMetaphone("", false);
        int int5 = doubleMetaphone1.maxCodeLen;
        int int6 = doubleMetaphone1.maxCodeLen;
        boolean boolean9 = doubleMetaphone1.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "HI");
        doubleMetaphone0.maxCodeLen = '#';
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("", true);
        doubleMetaphone0.maxCodeLen = 'A';
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSKTK", "O0940103030808306030830609053016080");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone21, "hi!", "");
        doubleMetaphone21.maxCodeLen = '4';
        java.lang.String str28 = doubleMetaphone21.doubleMetaphone("");
        int int29 = doubleMetaphone21.getMaxCodeLen();
        char[] charArray30 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex31 = new org.apache.commons.codec.language.Soundex(charArray30);
        java.lang.String str33 = soundex31.encode("HI");
        java.lang.String str35 = soundex31.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone36 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int39 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone36, "hi!", "");
        doubleMetaphone36.maxCodeLen = '4';
        java.lang.String str43 = doubleMetaphone36.doubleMetaphone("");
        int int44 = doubleMetaphone36.getMaxCodeLen();
        java.lang.String str46 = doubleMetaphone36.doubleMetaphone("hi!");
        java.lang.Object obj47 = soundex31.encode((java.lang.Object) "hi!");
        java.lang.Object obj48 = doubleMetaphone21.encode((java.lang.Object) "hi!");
        java.lang.String str50 = doubleMetaphone21.doubleMetaphone("A0");
        java.lang.String str52 = doubleMetaphone21.doubleMetaphone("hi!");
        java.lang.String str54 = doubleMetaphone21.doubleMetaphone("01230120022455012623010202");
        java.lang.Object obj55 = doubleMetaphone0.encode((java.lang.Object) "01230120022455012623010202");
        int int56 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H" + "'", obj10, "H");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H000" + "'", str33, "H000");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H000" + "'", str35, "H000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H" + "'", str46, "H");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "H000" + "'", obj47, "H000");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "H" + "'", obj48, "H");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "A" + "'", str50, "A");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "H" + "'", str52, "H");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "" + "'", obj55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 65 + "'", int56 == 65);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("O621", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        char char12 = doubleMetaphone0.charAt("A212", (int) '1');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        char char17 = doubleMetaphone0.charAt("O0940103030808306030830609053016080931", (int) '5');
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex();
        int int21 = refinedSoundex18.difference("H000", "H0");
        java.lang.String str23 = refinedSoundex18.soundex("HI");
        java.lang.String str25 = refinedSoundex18.encode("org.apache.commons.codec.EncoderException: \000");
        java.lang.String str27 = refinedSoundex18.encode("A000A212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) refinedSoundex18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H0" + "'", str23, "H0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "O094010303080830603083060905301608" + "'", str25, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A0" + "'", str27, "A0");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("1111111111");
        java.lang.String str11 = soundex1.soundex("AKPKKMNSKT#");
        java.lang.String str13 = soundex1.soundex("AKPKMNSK");
        soundex1.setMaxLength((int) '1');
        java.lang.String str17 = soundex1.encode("O0940103030808306030830609053016080931");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A313" + "'", str11, "A313");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A313" + "'", str13, "A313");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O000" + "'", str17, "O000");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        char char10 = refinedSoundex8.getMappingCode('a');
        int int13 = refinedSoundex8.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str15 = refinedSoundex8.encode("");
        int int18 = refinedSoundex8.difference("H0", "O000");
        java.lang.Object obj19 = metaphone0.encode((java.lang.Object) "H0");
        java.lang.Object obj21 = metaphone0.encode((java.lang.Object) "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        int int22 = metaphone0.getMaxCodeLen();
        int int23 = metaphone0.getMaxCodeLen();
        java.lang.String str25 = metaphone0.encode("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '0' + "'", char10 == '0');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "ARKP" + "'", obj21, "ARKP");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        boolean boolean27 = doubleMetaphoneResult26.isComplete();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("");
        java.lang.String str6 = caverphone0.encode("H000");
        java.lang.String str8 = caverphone0.caverphone("AKP");
        java.lang.String str10 = caverphone0.encode("org.apache.commons.codec.EncoderException: ");
        boolean boolean13 = caverphone0.isCaverphoneEqual("I900", "AKPK111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKP1111111" + "'", str8, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = soundex15.soundex("A03138363AKPKKMNSKT ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: K");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("H", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = soundex1.encode("A000");
        java.lang.String str13 = soundex1.encode("AKPK");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("", false);
        int int18 = doubleMetaphone14.maxCodeLen;
        doubleMetaphone14.setMaxCodeLen(0);
        boolean boolean24 = doubleMetaphone14.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        char char27 = doubleMetaphone14.charAt("A931", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone14.new DoubleMetaphoneResult((int) 'K');
        java.lang.String str31 = doubleMetaphone14.encode("A03138363");
        java.lang.Object obj32 = soundex1.encode((java.lang.Object) str31);
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", "A062125232523621256212523252362125");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O941" + "'", str9, "O941");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A313" + "'", str13, "A313");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("org.apache.commons.codec.EncoderException: AKPKMNSK11", "A000AKP1111111\000A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual("AKP", "A212");
        metaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str19 = caverphone17.encode("01230120022455012623010202");
        java.lang.String str21 = caverphone17.caverphone("H000");
        java.lang.String str23 = caverphone17.encode("A");
        java.lang.String str25 = caverphone17.caverphone("A212");
        boolean boolean28 = caverphone17.isCaverphoneEqual("01230120022455012623010202", "");
        java.lang.Object obj29 = metaphone0.encode((java.lang.Object) "01230120022455012623010202");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A111111111" + "'", str21, "A111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A111111111" + "'", str23, "A111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A111111111" + "'", str25, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("O0931", "A310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        java.lang.String str6 = caverphone0.caverphone("A000\000");
        java.lang.String str8 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AKPKKMNSKT" + "'", str4, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("HI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("A0310", "A000A212");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!", "");
        doubleMetaphone15.maxCodeLen = '4';
        java.lang.String str22 = doubleMetaphone15.doubleMetaphone("");
        int int23 = doubleMetaphone15.getMaxCodeLen();
        char[] charArray24 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray24);
        java.lang.String str27 = soundex25.encode("HI");
        java.lang.String str29 = soundex25.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone30 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone30, "hi!", "");
        doubleMetaphone30.maxCodeLen = '4';
        java.lang.String str37 = doubleMetaphone30.doubleMetaphone("");
        int int38 = doubleMetaphone30.getMaxCodeLen();
        java.lang.String str40 = doubleMetaphone30.doubleMetaphone("hi!");
        java.lang.Object obj41 = soundex25.encode((java.lang.Object) "hi!");
        java.lang.Object obj42 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        java.lang.String str44 = doubleMetaphone15.encode("ORKP");
        java.lang.Object obj45 = caverphone0.encode((java.lang.Object) "ORKP");
        java.lang.String str47 = caverphone0.caverphone("");
        java.lang.String str49 = caverphone0.caverphone("ORGAPACHECOMMONSCODECENCODEREXCEPTIONo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H000" + "'", str29, "H000");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H000" + "'", obj41, "H000");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H" + "'", obj42, "H");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ARKP" + "'", str44, "ARKP");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "AKP1111111" + "'", obj45, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1111111111" + "'", str47, "1111111111");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "AKPKKMNSKT" + "'", str49, "AKPKKMNSKT");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        boolean boolean23 = metaphone0.isMetaphoneEqual("0#O004", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A0");
        metaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "hi!");
        int int15 = soundex1.difference("HKS", "org.apache.commons.codec.EncoderException: AAAA");
        java.lang.String str17 = soundex1.encode("ORKPXKMNSKTSNKTRKSSPXNRKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O931" + "'", str17, "O931");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        java.lang.String str4 = refinedSoundex0.encode("AKPKKMNSKT");
        java.lang.String str6 = refinedSoundex0.soundex("");
        java.lang.String str8 = refinedSoundex0.soundex("HIA212O0940103030808306030830609053016080940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A0313836" + "'", str4, "A0313836");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H0" + "'", str8, "H0");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("HI");
        java.lang.String str15 = soundex11.soundex("HI");
        soundex11.setMaxLength((int) '4');
        int int20 = soundex11.difference(" ", "AK");
        soundex11.setMaxLength((int) 'A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = refinedSoundex9.encode((java.lang.Object) 'A');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("A03138363", "H000");
        java.lang.String str12 = caverphone0.encode("HI13");
        java.lang.String str14 = caverphone0.encode("003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        java.lang.String str25 = metaphone0.metaphone("a0a1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORKP" + "'", str23, "ORKP");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        int int7 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 'A';
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "1O", "");
        doubleMetaphone0.setMaxCodeLen(0);
        java.lang.String str16 = doubleMetaphone0.encode("AH");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        int int18 = doubleMetaphone0.maxCodeLen;
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("03Xa#00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("H000", "hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("ARKPXKMNSKTSNKTRKSPXNO093153836383693158", "org.apache.commons.codec.EncoderException: A09313836383693138");
        java.lang.String str10 = caverphone0.encode("A");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str9 = doubleMetaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("#HIKHIA212", "AKP1111111");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str9, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS" + "'", str11, "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.encode("O");
        int int18 = refinedSoundex0.difference("", "");
        org.apache.commons.codec.language.Caverphone caverphone19 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str21 = caverphone19.encode("01230120022455012623010202");
        boolean boolean24 = caverphone19.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str26 = caverphone19.caverphone("01230120022455012623010202");
        java.lang.Object obj27 = refinedSoundex0.encode((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1111111111" + "'", str21, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1111111111" + "'", str26, "1111111111");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A000" + "'", str25, "A000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ", "");
        char char10 = refinedSoundex0.getMappingCode('A');
        int int13 = refinedSoundex0.difference("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a", "AA11111111a IX");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '0' + "'", char10 == '0');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        int int5 = refinedSoundex0.difference("A931", "H000");
        int int8 = refinedSoundex0.difference("A000AKP1111111AKP1111111O000org.apache.commons.codec.EncoderException: A09313836383693138", "A03138363");
        char char10 = refinedSoundex0.getMappingCode('\000');
        java.lang.String str12 = refinedSoundex0.encode("ORKPXKMNSKTKNKTRKSSPXNR");
        java.lang.String str14 = refinedSoundex0.encode("AKPKRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        int int17 = refinedSoundex0.difference("ORKPXKMNSKTKNKTRKSSPXNR", "ARKPXKMNSKTKNKTRKSPXNRKP");
        java.lang.String str19 = refinedSoundex0.soundex("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0931538363836931589" + "'", str12, "O0931538363836931589");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A031393138363836931383138363" + "'", str14, "A031393138363836931383138363");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.encode("hi!");
        boolean boolean14 = caverphone0.isCaverphoneEqual("A0931538363836931580", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(52);
        doubleMetaphoneResult19.append("AR", "ARKP");
        doubleMetaphoneResult19.append("", "3301230120022455012623010202\000");
        doubleMetaphoneResult19.appendPrimary("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str14 = refinedSoundex0.encode("1");
        char char16 = refinedSoundex0.getMappingCode('H');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '0' + "'", char16 == '0');
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        boolean boolean37 = caverphone0.isCaverphoneEqual("O0", "");
        boolean boolean40 = caverphone0.isCaverphoneEqual("HIA212", "AKPKORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS");
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("AKPK");
        boolean boolean12 = caverphone0.isCaverphoneEqual("", "org.apache.commons.codec.EncoderException: AR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKPK111111" + "'", str9, "AKPK111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        soundex0.setMaxLength(0);
        java.lang.String str9 = soundex0.soundex("ARKPKSKMNS");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 72 + "'", int5 == 72);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A621" + "'", str9, "A621");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "AKPKSKMNSK");
        boolean boolean11 = metaphone0.isMetaphoneEqual("AKP1111111", "A0310310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPK" + "'", obj8, "AKPK");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex2.soundex("a1");
        int int7 = soundex2.getMaxLength();
        java.lang.String str9 = soundex2.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str3 = refinedSoundex1.soundex("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN");
        java.lang.String str5 = refinedSoundex1.encode("O09315383638369315893138363836931383138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A062125232523621256212523252362125" + "'", str3, "A062125232523621256212523252362125");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O0" + "'", str5, "O0");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = soundex10.difference("A09313836383693138", "03Xa#00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: X");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str18 = metaphone0.encode("a1");
        metaphone0.setMaxCodeLen(7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = refinedSoundex0.difference("A031383", "AKPKMNSKTS");
        char[] charArray7 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex(charArray7);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray7);
        java.lang.String str11 = soundex9.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str13 = soundex9.soundex("AKPKMNSKTS");
        int int14 = soundex9.getMaxLength();
        int int15 = soundex9.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex0.encode((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O941" + "'", str11, "O941");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A313" + "'", str13, "A313");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "H000");
        char char15 = doubleMetaphone0.charAt("H0", 2);
        char char18 = doubleMetaphone0.charAt("hi!", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        int int23 = doubleMetaphone0.maxCodeLen;
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("ORKP", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str11 = refinedSoundex0.encode("K");
        int int14 = refinedSoundex0.difference("01230120022455012623010202HI3ORGAPACHECOMMONSCODECENCODEREXCEPTION", "A319");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O09401030308083060308306090530160803138363" + "'", str9, "O09401030308083060308306090530160803138363");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K3" + "'", str11, "K3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char3 = refinedSoundex1.getMappingCode('.');
        int int6 = refinedSoundex1.difference("AKPa 1", "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, " AKPKMNSKTS", "AKPa 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        java.lang.String str18 = metaphone0.encode("O");
        boolean boolean21 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str23 = metaphone0.metaphone("AH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O" + "'", str18, "O");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.String str11 = refinedSoundex0.soundex("A031");
        java.lang.String str13 = refinedSoundex0.soundex("AA11111111");
        char char15 = refinedSoundex0.getMappingCode('1');
        java.lang.String str17 = refinedSoundex0.encode("O0");
        java.lang.String[] strArray23 = new java.lang.String[] { "HI3", "AKPKMNSKTS" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 8, (int) (byte) 1, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = refinedSoundex0.encode((java.lang.Object) 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O0" + "'", str17, "O0");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "H200");
        boolean boolean11 = metaphone0.isMetaphoneEqual("O0940103030808306030830609053016080940103030808306030830609053016080", "O0");
        boolean boolean14 = metaphone0.isMetaphoneEqual("\000H200", "ARKPXKMNSKTSNKTRKSPXNaA");
        metaphone0.setMaxCodeLen((int) '\000');
        java.lang.Class<?> wildcardClass17 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        boolean boolean23 = metaphone0.isMetaphoneEqual("0#O004", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A0");
        char[] charArray28 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex29 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex30 = new org.apache.commons.codec.language.Soundex(charArray28);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex31 = new org.apache.commons.codec.language.RefinedSoundex(charArray28);
        org.apache.commons.codec.language.Soundex soundex32 = new org.apache.commons.codec.language.Soundex(charArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = metaphone0.encode((java.lang.Object) soundex32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4,  , \000, a]");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("1111111111", true);
        char char12 = doubleMetaphone0.charAt("A212", (int) '1');
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("X900", "AKPKORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        int int9 = refinedSoundex6.difference("012301200224550126230102021", "AKPKRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        metaphone0.setMaxCodeLen((int) '#');
        metaphone0.setMaxCodeLen((int) '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str10 = soundex8.encode("0oorg.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMON");
        int int13 = soundex8.difference("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "3301230120022455012623010202\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O941" + "'", str10, "O941");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str13 = doubleMetaphone0.encode("org.apache.commons.codec.EncoderException: hi!");
        doubleMetaphone0.maxCodeLen = '3';
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: hi!", "A0931538363836931583138363");
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ARKP" + "'", str13, "ARKP");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A0313836");
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: A931");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("ORKP", "", false);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str16, "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        char char9 = refinedSoundex0.getMappingCode('4');
        java.lang.String str11 = refinedSoundex0.encode("H000");
        char char13 = refinedSoundex0.getMappingCode('R');
        char char15 = refinedSoundex0.getMappingCode('A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H0" + "'", str11, "H0");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '9' + "'", char13 == '9');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '0' + "'", char15 == '0');
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('0');
        java.lang.String str6 = refinedSoundex0.soundex(" ");
        java.lang.String str8 = refinedSoundex0.soundex("ARKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A09313836383693138" + "'", str8, "A09313836383693138");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = 'K';
        doubleMetaphone0.setMaxCodeLen(49);
        int int21 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        boolean boolean29 = metaphone0.isMetaphoneEqual("AKPKMNSKT", "a1");
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode(obj30);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) '.');
        java.lang.String str5 = soundex1.encode("AKPKKPKMNS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A313" + "'", str5, "A313");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.soundex("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str9 = refinedSoundex0.soundex("KA09");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O0" + "'", str7, "O0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "K30" + "'", str9, "K30");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.String str22 = metaphone0.encode("\000H200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex9 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str12 = soundex10.soundex("A0931538363836931583138363");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = soundex10.encode(obj13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A000" + "'", str12, "A000");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        boolean boolean28 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608094010303080830603083060905301608094010303080830603083060905301608", "ARKPXKMNSKTSNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        java.lang.String str30 = metaphone0.metaphone("ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORKP" + "'", str30, "ORKP");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.encode("");
        soundex1.setMaxLength((-1));
        java.lang.String str9 = soundex1.encode("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        java.lang.String str11 = soundex1.encode("#HIKARKPKKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A621" + "'", str9, "A621");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H262" + "'", str11, "H262");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("01230120022455012623010202");
        boolean boolean9 = caverphone0.isCaverphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "HK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        java.lang.String str2 = soundex0.soundex("A000");
        int int3 = soundex0.getMaxLength();
        int int6 = soundex0.difference("AKPK", "org.apache.commons.codec.EncoderException: HIA212");
        int int9 = soundex0.difference("", "A4");
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex0.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000" + "'", str2, "A000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        char char37 = doubleMetaphone0.charAt("HIA212", (int) (byte) 0);
        boolean boolean41 = doubleMetaphone0.isDoubleMetaphoneEqual("AKP1111111", "O0940103030808306030830609053016080940103030808306030830609053016080", true);
        doubleMetaphone0.maxCodeLen = 51;
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
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + 'H' + "'", char37 == 'H');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str11 = metaphone0.encode("0");
        java.lang.String str13 = metaphone0.encode("ARKPXKMNSKTKNKTRKSPXN");
        metaphone0.setMaxCodeLen(0);
        java.lang.String str17 = metaphone0.encode("O941");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int9 = soundex1.getMaxLength();
        java.lang.String str11 = soundex1.encode("01230120022455012623010202");
        int int14 = soundex1.difference("A0310", "003");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        java.lang.String str18 = metaphone0.encode("HI13");
        boolean boolean21 = metaphone0.isMetaphoneEqual("A03131", "org.apache.commons.codec.EncoderException: H200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "A" + "'", obj15, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        int int21 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(0);
        java.lang.String str25 = metaphone0.encode("A09315383638369315893153836383693158");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        char[] charArray1 = new char[] { 'S' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray1);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = refinedSoundex3.soundex("01230120022455012623010202HI3");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "S");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[S]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.caverphone("ARKPXKMNSKTSNKTRKSPXNRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKMNSKTS" + "'", str7, "AKPKMNSKTS");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        java.lang.String str12 = soundex1.encode("\000");
        java.lang.String str14 = soundex1.encode("ARKPXKMNSKTKNKTRKSPXN");
        int int17 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex1.setMaxLength(0);
        java.lang.String str21 = soundex1.soundex("AKPKMNSKTS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A931" + "'", str14, "A931");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A313" + "'", str21, "A313");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        soundex1.setMaxLength(4);
        soundex1.setMaxLength(0);
        int int26 = soundex1.difference("#HI", "KS");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("AAAA");
        metaphone0.setMaxCodeLen(75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("", "hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("1", "K");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        java.lang.String str11 = soundex1.encode("");
        int int14 = soundex1.difference("ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "");
        int int17 = soundex1.difference("a0", "ORKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Metaphone metaphone7 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str9 = metaphone7.metaphone("H0");
        boolean boolean12 = metaphone7.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        metaphone7.setMaxCodeLen((int) '9');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = refinedSoundex6.encode((java.lang.Object) '9');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.lang.String str19 = caverphone0.caverphone("AKP");
        boolean boolean22 = caverphone0.isCaverphoneEqual("01230120022455012623010202", "H000");
        java.lang.String str24 = caverphone0.encode("AKPKMNSKTS");
        boolean boolean27 = caverphone0.isCaverphoneEqual("", "ORKPXKMNSKTKNKTRKSSPXNR");
        boolean boolean30 = caverphone0.isCaverphoneEqual("004", "A0931538363836931583138363");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKP1111111" + "'", str19, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AKPKMNSKTS" + "'", str24, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = soundex1.difference("A", "HIA212");
        soundex1.setMaxLength((int) (short) 100);
        soundex1.setMaxLength((int) 'I');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.soundex("\000");
        soundex1.setMaxLength(4);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.encode("A");
        java.lang.String str8 = caverphone0.caverphone("#HIK");
        java.lang.String str10 = caverphone0.encode("ORKPXKMNSKTSNKTRKSSPXNR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AK11111111" + "'", str8, "AK11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSKTS" + "'", str10, "AKPKMNSKTS");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        int int20 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        char[] charArray0 = new char[] {};
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.soundex("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("RKPK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RKPK" + "'", str1, "RKPK");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        char char10 = refinedSoundex8.getMappingCode('a');
        int int13 = refinedSoundex8.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str15 = refinedSoundex8.encode("");
        int int18 = refinedSoundex8.difference("H0", "O000");
        java.lang.Object obj19 = metaphone0.encode((java.lang.Object) "H0");
        java.lang.Object obj21 = metaphone0.encode((java.lang.Object) "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        int int22 = metaphone0.getMaxCodeLen();
        int int23 = metaphone0.getMaxCodeLen();
        java.lang.String str25 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int26 = metaphone0.getMaxCodeLen();
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AAAA", "01230120022455012623010202\000\000");
        java.lang.String str31 = metaphone0.encode("AA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '0' + "'", char10 == '0');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "ARKP" + "'", obj21, "ARKP");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("A111111111");
        java.lang.Object obj11 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: hi!");
        java.lang.String str13 = caverphone0.caverphone("a1");
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.metaphone("H0");
        boolean boolean19 = metaphone14.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone14.encode("hi!");
        boolean boolean24 = metaphone14.isMetaphoneEqual("H0", "HI");
        int int25 = metaphone14.getMaxCodeLen();
        java.lang.String str27 = metaphone14.encode("HI");
        int int28 = metaphone14.getMaxCodeLen();
        java.lang.String str30 = metaphone14.metaphone("1111111111");
        boolean boolean33 = metaphone14.isMetaphoneEqual("A03138363", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str35 = metaphone14.metaphone("A093153836383693158");
        boolean boolean38 = metaphone14.isMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.Object obj39 = caverphone0.encode((java.lang.Object) "ARKPKSKMNSKTSNKTRKSPKSN");
        boolean boolean42 = caverphone0.isCaverphoneEqual("ARKPXKMNSKTKNKTRKSPXN", "ARKPKKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "A" + "'", str35, "A");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "AKPKSKMNSK" + "'", obj39, "AKPKSKMNSK");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "ARKPXKMNSKTKNKTRKSPXNKPKMNSK");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        java.lang.String str18 = metaphone0.encode("O");
        boolean boolean21 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str23 = metaphone0.encode("K");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O" + "'", str18, "O");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "K" + "'", str23, "K");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        java.lang.String str34 = soundex1.soundex("ORKPXKMNSKTKNKTRKSSPXN");
        soundex1.setMaxLength(0);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "O931" + "'", str34, "O931");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex10 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = soundex12.difference("A000aKI", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character is not mapped: K");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("AKPKMNSKTS", "O094010303080830603083060905301608");
        int int12 = soundex1.getMaxLength();
        int int15 = soundex1.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0#");
        int int16 = soundex1.getMaxLength();
        java.lang.String str18 = soundex1.soundex("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa");
        java.lang.String str20 = soundex1.soundex("org.apache.commons.codec.EncoderException: 01230120022455012623010202\000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A313" + "'", str18, "A313");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O941" + "'", str20, "O941");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        char char15 = doubleMetaphone0.charAt("", (int) '0');
        doubleMetaphone0.maxCodeLen = '.';
        java.lang.String str19 = doubleMetaphone0.encode("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        int int6 = refinedSoundex3.difference("", "A093153836383693158");
        int int9 = refinedSoundex3.difference("A093153836383693158931", "ARKPXKMNSKTSNKTRKSPXNO093153836383693158");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("A0313836");
        boolean boolean7 = caverphone0.isCaverphoneEqual("AKPKORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS", "org.apache.commons.codec.EncoderException: 012301200224550126230102021");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        soundex2.setMaxLength((int) 'R');
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
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("", "01230120022455012623010202");
        int int16 = refinedSoundex0.difference("A0", "A0");
        int int19 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: A931", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.Object obj21 = refinedSoundex0.encode((java.lang.Object) "AA11111111");
        java.lang.String str23 = refinedSoundex0.encode("AA11111111a");
        java.lang.Class<?> wildcardClass24 = refinedSoundex0.getClass();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "A0" + "'", obj21, "A0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A0" + "'", str23, "A0");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        soundex0.setMaxLength(49);
        int int21 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("A0313836");
        boolean boolean9 = caverphone0.isCaverphoneEqual("K", "H");
        char[] charArray14 = new char[] { 'S', '#', '4', 'O' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = caverphone0.encode((java.lang.Object) refinedSoundex17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "S#4O");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "S#4O");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[S, #, 4, O]");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 100);
        char char19 = doubleMetaphone0.charAt("01230120022455012623010202\000", 46);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        java.lang.String str12 = metaphone0.metaphone("");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!", "01230120022455012623010202\000");
        java.lang.String str17 = metaphone0.encode("H0");
        java.lang.String str19 = metaphone0.encode("O0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O" + "'", str19, "O");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("H0");
        int int5 = soundex2.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        char char13 = doubleMetaphone0.charAt("A000", (int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) '#');
        char[] charArray16 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        java.lang.String str19 = soundex17.encode("HI");
        java.lang.String str21 = soundex17.soundex("HI");
        soundex17.setMaxLength((int) '4');
        int int26 = soundex17.difference("A0", "ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
        java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) "ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H000" + "'", str19, "H000");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H000" + "'", str21, "H000");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", obj27, "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.metaphone("H0");
        boolean boolean19 = metaphone14.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone14.encode("hi!");
        boolean boolean24 = metaphone14.isMetaphoneEqual("H0", "HI");
        int int25 = metaphone14.getMaxCodeLen();
        java.lang.String str27 = metaphone14.encode("HI");
        int int28 = metaphone14.getMaxCodeLen();
        java.lang.String str30 = metaphone14.encode("hi!");
        java.lang.String str32 = metaphone14.encode("ORKP");
        java.lang.String str34 = metaphone14.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.Object obj35 = metaphone0.encode((java.lang.Object) str34);
        java.lang.Object obj37 = metaphone0.encode((java.lang.Object) "O094010303080830603083060905301608");
        metaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str41 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: 0AKPORKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORKP" + "'", str32, "ORKP");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ARKP" + "'", str34, "ARKP");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "ARKP" + "'", obj35, "ARKP");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "O" + "'", obj37, "O");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "O" + "'", str41, "O");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        java.lang.String str28 = metaphone0.encode("hi!");
        java.lang.String str30 = metaphone0.metaphone("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str30, "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        metaphone0.setMaxCodeLen(32);
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
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("", "A03138363AKPKKMNSKT ");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = caverphone0.caverphone("A931");
        java.lang.String str9 = caverphone0.encode("");
        java.lang.String str11 = caverphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        java.lang.String str13 = caverphone0.caverphone("");
        java.lang.String str15 = caverphone0.encode("AKPKSSKS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKSKMNSK" + "'", str11, "AKPKSKMNSK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AKPKSKS111" + "'", str15, "AKPKSKS111");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("K3", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        java.lang.String str11 = soundex0.soundex("O000");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex0, "A03138363", "");
        soundex0.setMaxLength((int) ' ');
        int int19 = soundex0.difference("AK11111111", "HI13");
        soundex0.setMaxLength((int) 'H');
        soundex0.setMaxLength(51);
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O000" + "'", str11, "O000");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        boolean boolean25 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: O000", "A931");
        java.lang.String str27 = caverphone0.encode("A0212");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A111111111" + "'", str27, "A111111111");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex9 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex10 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        char char13 = refinedSoundex11.getMappingCode('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = refinedSoundex11.encode("org.apache.commons.codec.EncoderException: A0");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "AKPKSKMNSK");
        metaphone0.setMaxCodeLen(72);
        metaphone0.setMaxCodeLen(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPK" + "'", obj8, "AKPK");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        soundex1.setMaxLength((int) ' ');
        int int8 = soundex1.getMaxLength();
        int int9 = soundex1.getMaxLength();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex1.encode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.maxCodeLen = 4;
        int int17 = doubleMetaphone0.maxCodeLen;
        char char20 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException: O000", 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'h' + "'", char20 == 'h');
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        java.lang.String str12 = soundex1.encode("O0931");
        int int13 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O000" + "'", str12, "O000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("HI3");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONHIA", "AA11111111a a");
        java.lang.String str17 = caverphone0.encode("H03");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AKPR", "K111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: H");
        boolean boolean11 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: AKP1111111", "ARKPKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPKKMNSKT" + "'", str8, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ARKPXKMNSKTKNKTRKSPXNRKP", " o");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str17 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str17, "ARKPKSKMNSKTSNKTRKSPKSN");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult26.appendAlternate('R');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        soundex0.setMaxLength((int) 'K');
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = soundex0.encode(obj21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        java.lang.String str27 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        int int28 = soundex1.getMaxLength();
        java.lang.String str30 = soundex1.soundex("ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
        java.lang.String str32 = soundex1.soundex("a1aorg.apache.commons.codec.EncoderException: hi!");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "O941" + "'", str27, "O941");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 83 + "'", int28 == 83);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "O931" + "'", str30, "O931");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A941" + "'", str32, "A941");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPKSKMNSKTSNKTRKSPKSN", "A931");
        int int17 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.maxCodeLen = (byte) 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = soundex1.difference("A", "HIA212");
        soundex1.setMaxLength((int) '3');
        java.lang.String str10 = soundex1.soundex("A03138363a");
        int int13 = soundex1.difference("org.apache.commons.codec.EncoderException: ORKP", "AKA1111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex3, "", "hi!");
        java.lang.String str10 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.Object obj11 = metaphone0.encode((java.lang.Object) str10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("H", "HIA212");
        int int15 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) '.');
        metaphone0.setMaxCodeLen((int) '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O941", "a1");
        java.lang.String str7 = caverphone0.encode("HI3");
        java.lang.String str9 = caverphone0.caverphone("A212");
        java.lang.String str11 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.String str13 = caverphone0.encode("A0212");
        java.lang.String str15 = caverphone0.caverphone("#HIK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKKMNSKT" + "'", str11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AK11111111" + "'", str15, "AK11111111");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("AR", "AHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        int int28 = soundex1.difference("A09313836383693138", "01230120022455012623010202\000");
        java.lang.String str30 = soundex1.encode("AAAAO");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "O000" + "'", str23, "O000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A000" + "'", str25, "A000");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A000" + "'", str30, "A000");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        metaphone0.setMaxCodeLen((int) '1');
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
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean19 = metaphone0.isMetaphoneEqual("A0313836", "O094010303080830603083060905301608");
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = metaphone0.encode(obj20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.encode("HI");
        java.lang.String str11 = caverphone0.caverphone("");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "A0931538363836931583138363");
        java.lang.String str16 = caverphone0.caverphone("O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A111111111" + "'", str16, "A111111111");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        doubleMetaphone0.maxCodeLen = 'S';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "O");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("O0");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("AKP0KS", "", false);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "AKP1111111 041", "A000H0H000");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: HI", true);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("A0931538363836931583138363", "org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        int int12 = refinedSoundex0.difference("0#", "A09315383");
        char char14 = refinedSoundex0.getMappingCode('I');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608" + "'", str9, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '0' + "'", char14 == '0');
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        char[] charArray6 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray6);
        java.lang.String str9 = soundex7.encode("HI");
        java.lang.Object obj10 = refinedSoundex0.encode((java.lang.Object) str9);
        java.lang.String str12 = refinedSoundex0.encode("");
        java.lang.String str14 = refinedSoundex0.encode("AKPa");
        char char16 = refinedSoundex0.getMappingCode('X');
        org.apache.commons.codec.language.Metaphone metaphone17 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str19 = metaphone17.metaphone("H0");
        boolean boolean22 = metaphone17.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str24 = metaphone17.encode("hi!");
        boolean boolean27 = metaphone17.isMetaphoneEqual("H0", "HI");
        int int28 = metaphone17.getMaxCodeLen();
        java.lang.String str30 = metaphone17.encode("HI");
        int int31 = metaphone17.getMaxCodeLen();
        java.lang.String str33 = metaphone17.encode("hi!");
        boolean boolean36 = metaphone17.isMetaphoneEqual("", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str38 = metaphone17.metaphone("0");
        boolean boolean41 = metaphone17.isMetaphoneEqual("A03138363", "1111111111");
        int int42 = metaphone17.getMaxCodeLen();
        boolean boolean45 = metaphone17.isMetaphoneEqual("ORKPXKMNSKTKNKTRKSSPXNR", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone46 = new org.apache.commons.codec.language.DoubleMetaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone47 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str50 = doubleMetaphone47.doubleMetaphone("", false);
        int int51 = doubleMetaphone47.maxCodeLen;
        int int52 = doubleMetaphone47.maxCodeLen;
        boolean boolean55 = doubleMetaphone47.isDoubleMetaphoneEqual("H", "HI");
        java.lang.Object obj56 = doubleMetaphone46.encode((java.lang.Object) "HI");
        doubleMetaphone46.maxCodeLen = '#';
        java.lang.String str61 = doubleMetaphone46.doubleMetaphone("", true);
        java.lang.String str63 = doubleMetaphone46.doubleMetaphone("1111111111");
        boolean boolean67 = doubleMetaphone46.isDoubleMetaphoneEqual("O0931", "A0", false);
        java.lang.Object obj68 = metaphone17.encode((java.lang.Object) "A0");
        java.lang.Object obj69 = refinedSoundex0.encode(obj68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "H0" + "'", obj10, "H0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A0310" + "'", str14, "A0310");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '5' + "'", char16 == '5');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "H" + "'", obj56, "H");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "A" + "'", obj68, "A");
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + "A0" + "'", obj69, "A0");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "org.apache.commons.codec.EncoderException: H000", "");
        java.lang.String str8 = refinedSoundex0.soundex("A941");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0" + "'", str8, "A0");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        java.lang.String str11 = refinedSoundex0.soundex("");
        char char13 = refinedSoundex0.getMappingCode('3');
        char char15 = refinedSoundex0.getMappingCode('S');
        char char17 = refinedSoundex0.getMappingCode('C');
        java.lang.String str19 = refinedSoundex0.soundex("A000AKP1111111");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0940103030808306030830609053016080940103030808306030830609053016080" + "'", str9, "O0940103030808306030830609053016080940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '3' + "'", char15 == '3');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '3' + "'", char17 == '3');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A031" + "'", str19, "A031");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(52);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSKT1", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("a0", true);
        int int28 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "Xr", "AKPKMNSKTK");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("");
        java.lang.String str6 = caverphone0.caverphone("A0313836");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A09313836383693138", "H");
        java.lang.String str11 = caverphone0.caverphone("H000");
        java.lang.String str13 = caverphone0.caverphone("A031309401030308083060308306090530160803138363");
        java.lang.String str15 = caverphone0.encode("A000A212ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS#2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111" + "'", str4, "1111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A111111111" + "'", str6, "A111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AKPKMNSKTK" + "'", str15, "AKPKMNSKTK");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        doubleMetaphone0.maxCodeLen = (byte) 0;
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
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex();
        char char4 = refinedSoundex2.getMappingCode('a');
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex2, "", "hi!");
        java.lang.String str9 = refinedSoundex2.soundex("H");
        int int12 = refinedSoundex2.difference("1111111111", "A000");
        java.lang.Object obj13 = refinedSoundex1.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = refinedSoundex1.encode("AKPKRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H0" + "'", str9, "H0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A031393138363836931383138363" + "'", str15, "A031393138363836931383138363");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        boolean boolean26 = metaphone0.isMetaphoneEqual("I000", "A000H0O094010303080830603083060905301608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone27 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str30 = doubleMetaphone27.doubleMetaphone("", false);
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone27, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone27.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult35.append('1');
        doubleMetaphoneResult35.appendAlternate('1');
        doubleMetaphoneResult35.appendAlternate('3');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = metaphone0.encode((java.lang.Object) '3');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("0123012002245501262301020211111111111", "04");
        soundex2.setMaxLength(0);
        java.lang.String str9 = soundex2.soundex("KA03");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "K000" + "'", str9, "K000");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        boolean boolean35 = doubleMetaphone0.isDoubleMetaphoneEqual("A000H0AKP1111111", "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", false);
        char char38 = doubleMetaphone0.charAt("", (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\000' + "'", char38 == '\000');
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen(100);
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("AKP1111111", "01230120022455012623010202");
        boolean boolean16 = metaphone0.isMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "org.apache.commons.codec.EncoderException: ");
        metaphone0.setMaxCodeLen((int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        char char30 = refinedSoundex0.getMappingCode('C');
        java.lang.String str32 = refinedSoundex0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
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
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '3' + "'", char30 == '3');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A093138363836931383138363" + "'", str32, "A093138363836931383138363");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.setMaxCodeLen(75);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        char char9 = refinedSoundex0.getMappingCode('4');
        java.lang.String str11 = refinedSoundex0.encode("H000");
        java.lang.String str13 = refinedSoundex0.soundex("A313");
        char char15 = refinedSoundex0.getMappingCode('a');
        java.lang.String str17 = refinedSoundex0.encode("AKPa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H0" + "'", str11, "H0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0" + "'", str13, "A0");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '0' + "'", char15 == '0');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A0310" + "'", str17, "A0310");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        doubleMetaphone0.maxCodeLen = (short) 1;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSKTK", "AKPKKMNSKT");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("HI3");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202\000", "A03138363", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HI3", "1111111111");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("H03", "A09", false);
        doubleMetaphone0.maxCodeLen = '#';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int27 = metaphone0.getMaxCodeLen();
        boolean boolean30 = metaphone0.isMetaphoneEqual("A03138363", "O941");
        boolean boolean33 = metaphone0.isMetaphoneEqual("X", "AKPKP");
        int int34 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        java.lang.String str9 = refinedSoundex0.encode("");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 100;
        java.lang.String str6 = doubleMetaphone0.encode("HI");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A0", "O093153836383693158", false);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex();
        char char16 = refinedSoundex14.getMappingCode('a');
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex14, "", "hi!");
        java.lang.String str21 = refinedSoundex14.encode("");
        java.lang.String str23 = refinedSoundex14.soundex("");
        java.lang.String str25 = refinedSoundex14.soundex("a0");
        java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) str25);
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual(" KH1", "A0310");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '0' + "'", char16 == '0');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A0" + "'", str25, "A0");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "A" + "'", obj26, "A");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!", "A111111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("H000", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean19 = metaphone0.isMetaphoneEqual("HIA212", "AKPKKMNSKT");
        java.lang.String str21 = metaphone0.encode("AR");
        java.lang.String str23 = metaphone0.metaphone("K111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AR" + "'", str21, "AR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "K" + "'", str23, "K");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "O094010303080830603083060905301608");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "#HIK", false);
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "AKPK111111", "AKPKMNSKT1");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        java.lang.String str21 = refinedSoundex0.soundex("A09313836383693138");
        char char23 = refinedSoundex0.getMappingCode('r');
        int int26 = refinedSoundex0.difference("A000H0H000", "ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A0" + "'", str21, "A0");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '9' + "'", char23 == '9');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        soundex1.setMaxLength(0);
        int int10 = soundex1.getMaxLength();
        soundex1.setMaxLength((int) (byte) 10);
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.metaphone("H0");
        boolean boolean18 = metaphone13.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str20 = metaphone13.metaphone("");
        int int21 = metaphone13.getMaxCodeLen();
        boolean boolean24 = metaphone13.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str26 = metaphone13.metaphone("AA");
        int int27 = metaphone13.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = soundex1.encode((java.lang.Object) int27);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("A0313836");
        java.lang.String str9 = soundex0.soundex("A031");
        int int12 = soundex0.difference("org.apache.commons.codec.EncoderException: H000", "A09313836383693138");
        int int13 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 75 + "'", int5 == 75);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A000" + "'", str7, "A000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 75 + "'", int13 == 75);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AKPhi!0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AKPHI" + "'", str1, "AKPHI");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "hi!");
        int int15 = soundex1.difference("HKS", "org.apache.commons.codec.EncoderException: AAAA");
        java.lang.String[] strArray24 = new java.lang.String[] { "HI3", "AKPKMNSKTS" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 8, (int) (byte) 1, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("A621", 5, (int) 'r', strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = soundex1.encode((java.lang.Object) 'r');
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.metaphone("H0");
        java.lang.String str12 = metaphone8.metaphone("");
        java.lang.String str14 = metaphone8.encode("H000");
        java.lang.Object obj15 = doubleMetaphone0.encode((java.lang.Object) str14);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: O000", true);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("a0a1");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ARKP" + "'", str25, "ARKP");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        int int10 = refinedSoundex3.difference("AKPK", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str12 = refinedSoundex3.encode("");
        char char14 = refinedSoundex3.getMappingCode(' ');
        java.lang.String str16 = refinedSoundex3.encode("ARKPKSKM");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A093138" + "'", str16, "A093138");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str10 = soundex8.soundex("A09315383");
        soundex8.setMaxLength(88);
        soundex8.setMaxLength(6);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) (byte) 0);
        java.lang.String str6 = soundex2.soundex("a1");
        java.lang.String str8 = soundex2.soundex("org.apache.commons.codec.EncoderException: AR");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "O621" + "'", str8, "O621");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode('4');
        java.lang.String str6 = refinedSoundex0.soundex("ARKP");
        java.lang.String str8 = refinedSoundex0.encode("");
        char char10 = refinedSoundex0.getMappingCode('5');
        char char12 = refinedSoundex0.getMappingCode('X');
        java.lang.String str14 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0931" + "'", str6, "A0931");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '5' + "'", char12 == '5');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O09401030308083060308306090530160809401030308083060308306090530160809401030308083060308306090530160803138363" + "'", str14, "O09401030308083060308306090530160809401030308083060308306090530160809401030308083060308306090530160803138363");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        java.lang.String str12 = metaphone0.metaphone("");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!", "01230120022455012623010202\000");
        java.lang.String str17 = metaphone0.encode("H0");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1", "A000\000");
        int int21 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.Object obj8 = metaphone0.encode((java.lang.Object) "H200");
        java.lang.String str10 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        java.lang.String str12 = metaphone0.encode("\0001");
        metaphone0.setMaxCodeLen((int) 'X');
        java.lang.String str16 = metaphone0.encode("AAKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORKP" + "'", str10, "ORKP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKP" + "'", str16, "AKP");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("", "hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("1", "K");
        boolean boolean22 = metaphone0.isMetaphoneEqual("A03", "org.apache.commons.codec.EncoderException: O000");
        int int23 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        int int21 = metaphone0.getMaxCodeLen();
        java.lang.String str23 = metaphone0.metaphone("A319");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.maxCodeLen = 43;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H0");
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(52);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("AKPKMNSKT1", "org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        int int6 = soundex1.difference("O093153836383693158", "HI1Oa");
        soundex1.setMaxLength((int) 'O');
        java.lang.String str10 = soundex1.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("A", true);
        doubleMetaphone0.maxCodeLen = 10;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("01230120022455012623010202", "AKPA111111");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: O000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKPXKMNSK" + "'", str20, "ARKPXKMNSK");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('K');
        doubleMetaphoneResult8.appendPrimary("A0931538363836931583138363");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('2');
        boolean boolean17 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        java.lang.String str27 = soundex1.encode("org.apache.commons.codec.EncoderException: hi!");
        soundex1.setMaxLength(53);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "O941" + "'", str27, "O941");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.encode("");
        soundex1.setMaxLength((-1));
        int int8 = soundex1.getMaxLength();
        java.lang.String str10 = soundex1.encode("\000");
        soundex1.setMaxLength(0);
        soundex1.setMaxLength(43);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex15 = new org.apache.commons.codec.language.RefinedSoundex();
        int int18 = refinedSoundex15.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str20 = refinedSoundex15.encode("hi!");
        java.lang.String str22 = refinedSoundex15.soundex("H000");
        java.lang.Object obj23 = soundex1.encode((java.lang.Object) "H000");
        char[] charArray24 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex25 = new org.apache.commons.codec.language.Soundex(charArray24);
        java.lang.String str27 = soundex25.encode("HI");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex25, "01230120022455012623010202", "HI");
        soundex25.setMaxLength(10);
        int int35 = soundex25.difference("AKPKMNSKTS", "O094010303080830603083060905301608");
        int int36 = soundex25.getMaxLength();
        int int39 = soundex25.difference("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0#");
        int int40 = soundex25.getMaxLength();
        int int43 = soundex25.difference("ARKPKSKMNSKTKNKTRKSPKSNRKP", "HI1A093153836383693158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex1.encode((java.lang.Object) int43);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H0" + "'", str20, "H0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H0" + "'", str22, "H0");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H000" + "'", obj23, "H000");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        soundex1.setMaxLength(100);
        int int16 = soundex1.difference("#HIA093153836383693158", "AR");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        int int18 = metaphone0.getMaxCodeLen();
        java.lang.String str20 = metaphone0.encode("A0931538363836931580");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ORKP" + "'", obj15, "ORKP");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        java.lang.String str8 = metaphone0.metaphone("AKPKMNSKTK");
        metaphone0.setMaxCodeLen(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPK" + "'", str8, "AKPK");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "");
        java.lang.String str19 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("A000AKP1111111AKP1111111O000org.apache.commons.codec.EncoderException: A09313836383693138", "", false);
        char char30 = doubleMetaphone0.charAt("A093138363836931383138363", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS" + "'", str23, "ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.String str26 = metaphone0.encode("org.apache.commons.codec.EncoderException: ");
        boolean boolean29 = metaphone0.isMetaphoneEqual("012301200224550126230102021", "HI");
        java.lang.String str31 = metaphone0.metaphone("");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORKP" + "'", str26, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.encode("A111111111");
        java.lang.String str15 = metaphone0.encode("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        boolean boolean18 = metaphone0.isMetaphoneEqual("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN", "A0931");
        int int19 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORKP" + "'", str15, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.encode("A0313836");
        boolean boolean7 = caverphone0.isCaverphoneEqual("A000AKP1111111AKP1111111O000", "HI3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str6 = soundex4.soundex("A000AKP1111111");
        int int7 = soundex4.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A210" + "'", str6, "A210");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str7 = caverphone0.caverphone("A931");
        java.lang.String str9 = caverphone0.encode("");
        java.lang.String str11 = caverphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        java.lang.String str13 = caverphone0.encode("AHH");
        java.lang.String str15 = caverphone0.caverphone("S3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPKSKMNSK" + "'", str11, "AKPKSKMNSK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "S111111111" + "'", str15, "S111111111");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(3);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("IR", true);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AR" + "'", str15, "AR");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        int int8 = refinedSoundex0.difference("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a", "A0931");
        java.lang.String str10 = refinedSoundex0.soundex("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.metaphone("H0");
        boolean boolean19 = metaphone14.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str21 = metaphone14.encode("hi!");
        boolean boolean24 = metaphone14.isMetaphoneEqual("H0", "HI");
        int int25 = metaphone14.getMaxCodeLen();
        java.lang.String str27 = metaphone14.encode("HI");
        int int28 = metaphone14.getMaxCodeLen();
        java.lang.String str30 = metaphone14.encode("hi!");
        java.lang.String str32 = metaphone14.encode("ORKP");
        java.lang.String str34 = metaphone14.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.Object obj35 = metaphone0.encode((java.lang.Object) str34);
        java.lang.Object obj37 = metaphone0.encode((java.lang.Object) "O094010303080830603083060905301608");
        metaphone0.setMaxCodeLen((int) (short) 1);
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) 'r');
        boolean boolean46 = metaphone0.isMetaphoneEqual("X", "AKA1111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORKP" + "'", str32, "ORKP");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ARKP" + "'", str34, "ARKP");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "ARKP" + "'", obj35, "ARKP");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "O" + "'", obj37, "O");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str10 = caverphone8.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex();
        char char13 = refinedSoundex11.getMappingCode('a');
        java.lang.String str15 = refinedSoundex11.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj16 = caverphone8.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str18 = caverphone8.caverphone("ORKP");
        boolean boolean21 = caverphone8.isCaverphoneEqual("", "AKPK");
        java.lang.String str23 = caverphone8.encode("A111111111");
        java.lang.String str25 = caverphone8.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str27 = caverphone8.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str29 = caverphone8.encode("HIA212");
        boolean boolean32 = caverphone8.isCaverphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "A093153836383693158");
        java.lang.String str34 = caverphone8.caverphone("O0931");
        java.lang.Object obj35 = metaphone0.encode((java.lang.Object) "O0931");
        metaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSKTS" + "'", str10, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O094010303080830603083060905301608" + "'", str15, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "AKPKKMNSKT" + "'", obj16, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKP1111111" + "'", str18, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A111111111" + "'", str23, "A111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AKPKKMNSKT" + "'", str25, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AKPKKMNSKT" + "'", str27, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A111111111" + "'", str34, "A111111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "O" + "'", obj35, "O");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0123012002245501262301020211111111111");
        java.lang.String str21 = metaphone0.encode("K301230120022455012623010202\000");
        java.lang.String str23 = metaphone0.metaphone("ORKPXKMNSKTKNKTRKSSPXN");
        java.lang.String str25 = metaphone0.metaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone26 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str29 = doubleMetaphone26.doubleMetaphone("", false);
        int int30 = doubleMetaphone26.maxCodeLen;
        doubleMetaphone26.setMaxCodeLen(0);
        java.lang.String str35 = doubleMetaphone26.doubleMetaphone("", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone36 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone36.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone36.maxCodeLen = 100;
        java.lang.String str42 = doubleMetaphone36.encode("HI");
        java.lang.String str44 = doubleMetaphone36.encode("O094010303080830603083060905301608");
        java.lang.Object obj45 = doubleMetaphone26.encode((java.lang.Object) "O094010303080830603083060905301608");
        char char48 = doubleMetaphone26.charAt("HI3", (int) (byte) 1);
        boolean boolean52 = doubleMetaphone26.isDoubleMetaphoneEqual("AAAA", "AKPKMNSKTK", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = metaphone0.encode((java.lang.Object) boolean52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "K" + "'", str21, "K");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORKPKSKMNSKTKNKTRKSPKSN" + "'", str23, "ORKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "H" + "'", str42, "H");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "A" + "'", str44, "A");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + 'I' + "'", char48 == 'I');
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        java.lang.String str19 = caverphone0.caverphone("AKP");
        boolean boolean22 = caverphone0.isCaverphoneEqual("01230120022455012623010202", "H000");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex23 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str25 = refinedSoundex23.encode("01230120022455012623010202");
        char char27 = refinedSoundex23.getMappingCode('a');
        int int30 = refinedSoundex23.difference("A093153836383693158", "ORKP");
        char char32 = refinedSoundex23.getMappingCode('4');
        java.lang.String str34 = refinedSoundex23.encode("H000");
        java.lang.String str36 = refinedSoundex23.soundex("A313");
        char char38 = refinedSoundex23.getMappingCode('a');
        java.lang.String str40 = refinedSoundex23.encode("A03");
        java.lang.Object obj41 = caverphone0.encode((java.lang.Object) "A03");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKP1111111" + "'", str19, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '0' + "'", char27 == '0');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H0" + "'", str34, "H0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "A0" + "'", str36, "A0");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '0' + "'", char38 == '0');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "A0" + "'", str40, "A0");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "A111111111" + "'", obj41, "A111111111");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex7 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str10 = soundex8.encode("0oorg.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMON");
        int int11 = soundex8.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "O941" + "'", str10, "O941");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        int int21 = metaphone0.getMaxCodeLen();
        int int22 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        int int20 = soundex1.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("A0931538363836931589");
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("KPRK", "AAAAO", false);
        boolean boolean36 = doubleMetaphone0.isDoubleMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "A931");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HKH", "A093153836383693158931538363836931583138363");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        int int3 = soundex0.difference("AKPR", "");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        boolean boolean7 = caverphone0.isCaverphoneEqual("", "HI");
        java.lang.String str9 = caverphone0.encode("AA");
        java.lang.String str11 = caverphone0.caverphone("hi!");
        org.apache.commons.codec.language.Soundex soundex12 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str14 = soundex12.soundex("H");
        java.lang.String str16 = soundex12.soundex("H");
        java.lang.String str18 = soundex12.soundex("AKPK");
        java.lang.String str20 = soundex12.encode("0");
        java.lang.String str22 = soundex12.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int25 = soundex12.difference("O094010303080830603083060905301608", "H0");
        java.lang.String str27 = soundex12.soundex("org.apache.commons.codec.EncoderException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = caverphone0.encode((java.lang.Object) soundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(soundex12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A212" + "'", str18, "A212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A621" + "'", str22, "A621");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "O621" + "'", str27, "O621");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.metaphone("AA");
        int int14 = metaphone0.getMaxCodeLen();
        boolean boolean17 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "AK11111111");
        java.lang.String str19 = metaphone0.encode("HK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "K" + "'", str19, "K");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        metaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str17, "ORKPXKMNSKTKNKTRKSSPXNRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "A212");
        char char8 = refinedSoundex0.getMappingCode('#');
        char char10 = refinedSoundex0.getMappingCode('S');
        java.lang.String str12 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXNaA");
        char char14 = refinedSoundex0.getMappingCode('1');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '3' + "'", char10 == '3');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A0931538363836931580" + "'", str12, "A0931538363836931580");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("H000");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ORKP", "H");
        java.lang.String str9 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str11 = refinedSoundex0.soundex("A000");
        java.lang.String str13 = refinedSoundex0.encode("HIA212");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608" + "'", str9, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A0" + "'", str11, "A0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        int int8 = soundex1.difference("AKPK", "a1");
        java.lang.String str10 = soundex1.encode("");
        java.lang.String str12 = soundex1.soundex("a");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H000" + "'", str5, "H000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A000" + "'", str12, "A000");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H262");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("AKPKP11111");
        java.lang.String str6 = soundex2.soundex("A0212");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A313" + "'", str4, "A313");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.setMaxCodeLen(2);
        doubleMetaphone0.maxCodeLen = 4;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj20 = caverphone18.encode((java.lang.Object) "HI");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone18, "A000", "AKPKKMNSKT");
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) "A000");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "AA11111111" + "'", obj20, "AA11111111");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "A" + "'", obj24, "A");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.soundex("HI");
        char char7 = refinedSoundex0.getMappingCode(' ');
        char char9 = refinedSoundex0.getMappingCode('K');
        char char11 = refinedSoundex0.getMappingCode('A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = refinedSoundex0.encode((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '3' + "'", char9 == '3');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int27 = metaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("hi!");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H000");
        doubleMetaphone0.maxCodeLen = 10;
        int int13 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str15 = doubleMetaphone0.encode("");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: a1");
        char char22 = doubleMetaphone0.charAt(" ", 9);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("AAAA", "org.apache.commons.codec.EncoderException: AKPKMNSK11");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKPXKMNSK" + "'", str19, "ARKPXKMNSK");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        boolean boolean5 = caverphone0.isCaverphoneEqual("H000", "hi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("ARKPXKMNSKTSNKTRKSPXNO093153836383693158", "org.apache.commons.codec.EncoderException: A09313836383693138");
        java.lang.String str10 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        char char6 = doubleMetaphone0.charAt("O094010303080830603083060905301608", (int) ' ');
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202\000");
        java.lang.String str12 = doubleMetaphone0.encode("#HIK");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION", true);
        doubleMetaphone0.setMaxCodeLen(97);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("A031309401030308083060308306090530160803138363", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "K" + "'", str12, "K");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKP" + "'", str17, "ARKP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("01230120022455012623010202");
        char char4 = refinedSoundex0.getMappingCode('a');
        int int7 = refinedSoundex0.difference("A093153836383693158", "ORKP");
        java.lang.String str9 = refinedSoundex0.encode("O000");
        java.lang.String str11 = refinedSoundex0.soundex("AK");
        int int14 = refinedSoundex0.difference("HIA212aX", "A031309401030308083060308306090530160803138363");
        java.lang.String str16 = refinedSoundex0.encode("01230120022455012623010202\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0" + "'", str9, "O0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A03" + "'", str11, "A03");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        java.lang.String str22 = caverphone0.caverphone("HI1A093153836383693158");
        java.lang.String str24 = caverphone0.encode("AKPKMNSKTS\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "AKPKKMNSKT" + "'", obj11, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPKKMNSKT" + "'", str18, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AKPKMNSKTS" + "'", str24, "AKPKMNSKTS");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "", true);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.maxCodeLen = 97;
        java.lang.String str18 = doubleMetaphone0.encode("AKPK111111");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: 01230120022455012623010202", "O09401030308083060308306090530160809");
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj24 = caverphone22.encode((java.lang.Object) "HI");
        java.lang.String str26 = caverphone22.caverphone("org.apache.commons.codec.EncoderException: ");
        java.lang.String str28 = caverphone22.caverphone("org.apache.commons.codec.EncoderException: O000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) caverphone22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AKPK" + "'", str18, "AKPK");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "AA11111111" + "'", obj24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AKPKKMNSKT" + "'", str26, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AKPKKMNSKT" + "'", str28, "AKPKKMNSKT");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        java.lang.String str11 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "O0940103030808306030830609053016080", "HIA212");
        java.lang.String str16 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ORKP");
        char char18 = refinedSoundex0.getMappingCode('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O094010303080830603083060905301608" + "'", str11, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O0940103030808306030830609053016080931" + "'", str16, "O0940103030808306030830609053016080931");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '0' + "'", char18 == '0');
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str8 = doubleMetaphone5.doubleMetaphone("", false);
        boolean boolean11 = doubleMetaphone5.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        doubleMetaphone5.setMaxCodeLen(0);
        boolean boolean17 = doubleMetaphone5.isDoubleMetaphoneEqual("AA11111111", "O0940103030808306030830609053016080940103030808306030830609053016080", false);
        doubleMetaphone5.maxCodeLen = 0;
        java.lang.String str22 = doubleMetaphone5.doubleMetaphone("A093153836383693158", false);
        java.lang.Object obj23 = soundex4.encode((java.lang.Object) str22);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex8 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str10 = refinedSoundex8.encode("01230120022455012623010202");
        java.lang.Object obj11 = refinedSoundex0.encode((java.lang.Object) str10);
        char char13 = refinedSoundex0.getMappingCode('O');
        int int16 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: ORKP", "H");
        java.lang.String str18 = refinedSoundex0.soundex("A4");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '0' + "'", char13 == '0');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A0" + "'", str18, "A0");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("A093153836383693158", "AA11111111");
        java.lang.String str12 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: hi!");
        int int15 = refinedSoundex0.difference("O0931", "01230120022455012623010202");
        int int18 = refinedSoundex0.difference("A03138363", "0");
        int int21 = refinedSoundex0.difference("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN", "A315");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0940103030808306030830609053016080" + "'", str12, "O0940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        boolean boolean27 = metaphone0.isMetaphoneEqual("a0H", "AA11111111a");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.maxCodeLen;
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("O000");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "hi!", "");
        char char19 = doubleMetaphone13.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str22 = doubleMetaphone13.doubleMetaphone("1111111111", true);
        char char25 = doubleMetaphone13.charAt("A212", (int) '1');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone13.new DoubleMetaphoneResult((int) '1');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '0' + "'", char19 == '0');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.encode("A212");
        boolean boolean16 = metaphone0.isMetaphoneEqual("A03138363", "O621");
        boolean boolean19 = metaphone0.isMetaphoneEqual("ORGAPACHECOMMONSCODECENCODEREXCEPTIONH", "A0931538363836931583138363");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        java.lang.String str38 = doubleMetaphone0.doubleMetaphone("A0310931", true);
        int int39 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Metaphone metaphone40 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str42 = metaphone40.metaphone("H0");
        boolean boolean45 = metaphone40.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int46 = metaphone40.getMaxCodeLen();
        java.lang.String str48 = metaphone40.encode("AA11111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) metaphone40);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A" + "'", str38, "A");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "A" + "'", str48, "A");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        java.lang.String str18 = metaphone0.encode("O");
        org.apache.commons.codec.language.Metaphone metaphone19 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str21 = metaphone19.metaphone("H0");
        java.lang.String str23 = metaphone19.metaphone("");
        java.lang.String str25 = metaphone19.encode("H000");
        int int26 = metaphone19.getMaxCodeLen();
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone19, "A0", " ");
        java.lang.String str31 = metaphone19.encode("");
        java.lang.Object obj32 = metaphone0.encode((java.lang.Object) "");
        java.lang.String str34 = metaphone0.encode("A000H0O094010303080830603083060905301608ARKPXKMNSKTKNKTRKSPXNKPKMNSKTSA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O" + "'", str18, "O");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS" + "'", str34, "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        soundex0.setMaxLength(0);
        java.lang.String str26 = soundex0.encode("A000H0O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKP" + "'", str12, "ARKP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O" + "'", str14, "O");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A000" + "'", obj18, "A000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "O621" + "'", str22, "O621");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A000" + "'", str26, "A000");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        int int39 = metaphone0.getMaxCodeLen();
        boolean boolean42 = metaphone0.isMetaphoneEqual("A09315383638369315893153836383693158", "AKPKSKMNSK");
        int int43 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(52);
        boolean boolean48 = metaphone0.isMetaphoneEqual("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a", "A0310310");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("a\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        doubleMetaphone3.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone3.new DoubleMetaphoneResult((int) 'a');
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append("HI", "A931");
        java.lang.Object obj15 = metaphone0.encode((java.lang.Object) "A931");
        metaphone0.setMaxCodeLen((int) '1');
        metaphone0.setMaxCodeLen((int) 'E');
        boolean boolean22 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608094010303080830603083060905301608094010303080830603083060905301608", " AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "A" + "'", obj15, "A");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("0AKPORKP", true);
        doubleMetaphone0.setMaxCodeLen((int) 'p');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '0' + "'", char6 == '0');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AK" + "'", str28, "AK");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "KPRK" + "'", str31, "KPRK");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int4 = soundex1.difference("", "H000");
        int int7 = soundex1.difference("1111111111", "ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = soundex1.soundex("1111111111");
        int int12 = soundex1.difference("ARKPXKMNSKTSNKTRKSPXN", "01230120022455012623010202\000");
        int int15 = soundex1.difference("org.apache.commons.codec.EncoderException: ", "A");
        int int16 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        metaphone0.setMaxCodeLen(8);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AKPK", "A");
        boolean boolean17 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS", "ARKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        int int18 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        org.apache.commons.codec.language.Caverphone caverphone24 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str26 = caverphone24.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex27 = new org.apache.commons.codec.language.RefinedSoundex();
        char char29 = refinedSoundex27.getMappingCode('a');
        java.lang.String str31 = refinedSoundex27.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj32 = caverphone24.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str34 = caverphone24.caverphone("ORKP");
        boolean boolean37 = caverphone24.isCaverphoneEqual("", "AKPK");
        java.lang.String str39 = caverphone24.encode("A111111111");
        java.lang.String str41 = caverphone24.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        boolean boolean44 = caverphone24.isCaverphoneEqual("O", "org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str46 = caverphone24.encode("01230120022455012623010202");
        java.lang.Object obj47 = soundex1.encode((java.lang.Object) "01230120022455012623010202");
        int int50 = soundex1.difference("a", "3301230120022455012623010202\000");
        java.lang.String str52 = soundex1.soundex("O094010303080830603083060905301608031383");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AKPKMNSKTS" + "'", str26, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '0' + "'", char29 == '0');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "O094010303080830603083060905301608" + "'", str31, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "AKPKKMNSKT" + "'", obj32, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AKP1111111" + "'", str34, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A111111111" + "'", str39, "A111111111");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AKPKKMNSKT" + "'", str41, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1111111111" + "'", str46, "1111111111");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "" + "'", obj47, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "O000" + "'", str52, "O000");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        org.apache.commons.codec.language.Caverphone caverphone8 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj10 = caverphone8.encode((java.lang.Object) "HI");
        java.lang.String str12 = caverphone8.caverphone("ARKPXKMNSKTSNKTRKSPXN");
        boolean boolean15 = caverphone8.isCaverphoneEqual("K3", "AK");
        java.lang.Object obj16 = refinedSoundex3.encode((java.lang.Object) "K3");
        int int19 = refinedSoundex3.difference("A093153836383693158", "H300");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "AA11111111" + "'", obj10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPKMNSKTS" + "'", str12, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "K3" + "'", obj16, "K3");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        java.lang.String str18 = metaphone0.encode("org.apache.commons.codec.EncoderException: A931");
        java.lang.String str20 = metaphone0.encode("A000AKP1111111AKP1111111O000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORKPXKMNSKTKNKTRKSSPXN" + "'", str18, "ORKPXKMNSKTKNKTRKSSPXN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AKPKP" + "'", str20, "AKPKP");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str14 = metaphone0.encode("");
        int int15 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.EncoderException encoderException17 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException19 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException21 = new org.apache.commons.codec.EncoderException("");
        encoderException19.addSuppressed((java.lang.Throwable) encoderException21);
        org.apache.commons.codec.EncoderException encoderException24 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException26 = new org.apache.commons.codec.EncoderException("");
        encoderException24.addSuppressed((java.lang.Throwable) encoderException26);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException26);
        org.apache.commons.codec.EncoderException encoderException30 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException32 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray33 = encoderException32.getSuppressed();
        encoderException30.addSuppressed((java.lang.Throwable) encoderException32);
        encoderException19.addSuppressed((java.lang.Throwable) encoderException30);
        encoderException17.addSuppressed((java.lang.Throwable) encoderException19);
        org.apache.commons.codec.EncoderException encoderException38 = new org.apache.commons.codec.EncoderException("hi!");
        org.apache.commons.codec.EncoderException encoderException40 = new org.apache.commons.codec.EncoderException("");
        java.lang.Throwable[] throwableArray41 = encoderException40.getSuppressed();
        encoderException38.addSuppressed((java.lang.Throwable) encoderException40);
        java.lang.Throwable[] throwableArray43 = encoderException40.getSuppressed();
        encoderException17.addSuppressed((java.lang.Throwable) encoderException40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = metaphone0.encode((java.lang.Object) encoderException40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("O0");
        int int7 = soundex2.difference("03", "AA11111111a a");
        soundex2.setMaxLength((int) (byte) 0);
        java.lang.String str11 = soundex2.encode("");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O000" + "'", str4, "O000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        char[] charArray4 = new char[] { 'S', '#', '4', 'O' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = refinedSoundex5.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTIONo", "A000H0H000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "S#4O");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "S#4O");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[S, #, 4, O]");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        java.lang.String str12 = soundex1.encode("\000");
        java.lang.String str14 = soundex1.encode("ARKPXKMNSKTKNKTRKSPXN");
        int int17 = soundex1.difference("A000", "");
        int int18 = soundex1.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A931" + "'", str14, "A931");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        java.lang.String str11 = caverphone0.caverphone("AKPK111111");
        boolean boolean14 = caverphone0.isCaverphoneEqual("AKPKMNSKTK", "ORKP");
        java.lang.String str16 = caverphone0.encode("org.apache.commons.codec.EncoderException: A0");
        java.lang.String str18 = caverphone0.encode("HKH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AKPK111111" + "'", str11, "AKPK111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKPKKMNSKT" + "'", str16, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AK11111111" + "'", str18, "AK11111111");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str12 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        doubleMetaphone0.maxCodeLen = 'S';
        char char17 = doubleMetaphone0.charAt("ARKPXKMNSKTKNKTRKSPXNR", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("1111111111", "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("A0313836");
        java.lang.String str13 = soundex0.soundex("AKPKP11111");
        soundex0.setMaxLength(52);
        int int18 = soundex0.difference("org.apache.commons.codec.EncoderException: A313", "org.apache.commons.codec.EncoderException: hi!");
        int int21 = soundex0.difference("HI1Oa", "a0");
        java.lang.String str23 = soundex0.soundex("AKPKSSKS");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A212" + "'", str13, "A212");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A212" + "'", str23, "A212");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        java.lang.String str34 = caverphone0.caverphone(" KH1");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "K111111111" + "'", str34, "K111111111");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        java.lang.String str4 = soundex0.encode("A000");
        soundex0.setMaxLength(3);
        int int9 = soundex0.difference("org.apache.commons.codec.EncoderException: ORKP", "");
        java.lang.String str11 = soundex0.encode("#HIKHIA212A4ORKP1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A000" + "'", str4, "A000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H262" + "'", str11, "H262");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        soundex1.setMaxLength(10);
        soundex1.setMaxLength((int) ' ');
        soundex1.setMaxLength((int) (byte) 1);
        java.lang.String str11 = soundex1.encode("04");
        int int12 = soundex1.getMaxLength();
        java.lang.Class<?> wildcardClass13 = soundex1.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        java.lang.String str12 = metaphone0.metaphone("");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!", "01230120022455012623010202\000");
        metaphone0.setMaxCodeLen((int) '0');
        char[] charArray18 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray18);
        int int22 = soundex19.difference("", "H000");
        int int23 = soundex19.getMaxLength();
        java.lang.String str25 = soundex19.encode("1111111111");
        java.lang.Object obj26 = metaphone0.encode((java.lang.Object) "1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.Object obj6 = refinedSoundex4.encode((java.lang.Object) "01230120022455012623010202HI3");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "H0" + "'", obj6, "H0");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = refinedSoundex0.difference("", "ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str12 = refinedSoundex0.encode("AKPKMNSKTS");
        java.lang.String str14 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: 0AKPORKP");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A093153836383693158" + "'", str7, "A093153836383693158");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A03138363" + "'", str12, "A03138363");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O0940103030808306030830609053016080310931" + "'", str14, "O0940103030808306030830609053016080310931");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone3 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone3, "hi!", "");
        char char9 = doubleMetaphone3.charAt("O094010303080830603083060905301608", (int) ' ');
        java.lang.String str12 = doubleMetaphone3.doubleMetaphone("1111111111", true);
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = caverphone0.caverphone("A000aKa1a");
        java.lang.String str17 = caverphone0.caverphone("O094010303080830603083060905301608031383");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "1111111111" + "'", obj13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AKA1111111" + "'", str15, "AKA1111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.encode("A031");
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str9 = metaphone0.metaphone("aa");
        int int10 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ARKP" + "'", str7, "ARKP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str9 = doubleMetaphone0.encode("AKP");
        int int10 = doubleMetaphone0.maxCodeLen;
        int int11 = doubleMetaphone0.maxCodeLen;
        int int12 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) 'p');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP" + "'", str9, "AKP");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        int int6 = refinedSoundex0.difference("hi!", "org.apache.commons.codec.EncoderException: A0");
        int int9 = refinedSoundex0.difference("X900", "#HIKHIA212");
        int int12 = refinedSoundex0.difference("", "R9315");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) (short) 10);
        int int6 = soundex1.difference("AKPKP11111", "A000AKP1111111\000A");
        int int7 = soundex1.getMaxLength();
        java.lang.String str9 = soundex1.soundex("#HIA093153836383693158");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H000" + "'", str9, "H000");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        java.lang.String str21 = metaphone0.encode("A0313");
        char[] charArray22 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex23 = new org.apache.commons.codec.language.Soundex(charArray22);
        java.lang.String str25 = soundex23.encode("HI");
        java.lang.String str27 = soundex23.encode("H");
        java.lang.String str29 = soundex23.encode("");
        int int32 = soundex23.difference("", "");
        java.lang.String str34 = soundex23.encode("ARKP");
        int int35 = soundex23.getMaxLength();
        soundex23.setMaxLength(6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = metaphone0.encode((java.lang.Object) soundex23);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H000" + "'", str25, "H000");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H000" + "'", str27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A931" + "'", str34, "A931");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("a1", true);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: A313");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ARKPXKMNSKTKNKTRKSPXN" + "'", str12, "ARKPXKMNSKTKNKTRKSPXN");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("HI", "O094010303080830603083060905301608");
        char[] charArray10 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("HI");
        java.lang.String str15 = soundex11.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "hi!", "");
        doubleMetaphone16.maxCodeLen = '4';
        java.lang.String str23 = doubleMetaphone16.doubleMetaphone("");
        int int24 = doubleMetaphone16.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone16.doubleMetaphone("hi!");
        java.lang.Object obj27 = soundex11.encode((java.lang.Object) "hi!");
        java.lang.String str29 = soundex11.soundex("");
        java.lang.Object obj30 = soundex0.encode((java.lang.Object) str29);
        java.lang.String str32 = soundex0.soundex("");
        java.lang.String str34 = soundex0.encode("a0A000H0H000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H000" + "'", str13, "H000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H000" + "'", str15, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H000" + "'", obj27, "H000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "" + "'", obj30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A000" + "'", str34, "A000");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str11 = metaphone0.encode("03");
        metaphone0.setMaxCodeLen(0);
        java.lang.String str15 = metaphone0.encode("AKPKMNSKTS\000");
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str11 = doubleMetaphone0.encode("O094010303080830603083060905301608");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str15 = doubleMetaphone0.encode("AKPKMNSKTS");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("Oa\000", "O09401030308083060308306090530160803138363", false);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("A4", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONA093153836383693158org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AKPKMNSKTS" + "'", str15, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        java.lang.String str21 = refinedSoundex0.encode("O");
        java.lang.String str23 = refinedSoundex0.soundex("A0931383638369313893138363836931383138363");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "O0" + "'", str21, "O0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A0" + "'", str23, "A0");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        int int4 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 1;
        doubleMetaphone0.maxCodeLen = 'K';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("A310", "", false);
        char char15 = doubleMetaphone0.charAt("AKPKMNSKTS", (-1));
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 75 + "'", int16 == 75);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A09313836383693138");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONA" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONA");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        char char8 = refinedSoundex0.getMappingCode('o');
        java.lang.String str10 = refinedSoundex0.encode("AR");
        java.lang.String str12 = refinedSoundex0.soundex("0#");
        int int15 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: O0940103030808306030830609053016080", "org.apache.commons.codec.EncoderException: H");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A09" + "'", str10, "A09");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "KRKP", "A000H0H000a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.soundex("\000");
        soundex1.setMaxLength((int) 'S');
        int int10 = soundex1.difference("ARKP", "org.apache.commons.codec.EncoderException: A931");
        soundex1.setMaxLength((int) 'o');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        java.lang.String str5 = soundex1.encode("H");
        soundex1.setMaxLength((int) (byte) 10);
        org.apache.commons.codec.EncoderException encoderException9 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException11 = new org.apache.commons.codec.EncoderException("");
        org.apache.commons.codec.EncoderException encoderException13 = new org.apache.commons.codec.EncoderException("");
        encoderException11.addSuppressed((java.lang.Throwable) encoderException13);
        java.lang.Throwable[] throwableArray15 = encoderException11.getSuppressed();
        encoderException9.addSuppressed((java.lang.Throwable) encoderException11);
        java.lang.Throwable[] throwableArray17 = encoderException11.getSuppressed();
        java.lang.Throwable[] throwableArray18 = encoderException11.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex1.encode((java.lang.Object) encoderException11);
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
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.encode("O094010303080830603083060905301608");
        java.lang.String str8 = refinedSoundex0.encode("AKP");
        java.lang.String str10 = refinedSoundex0.encode("a0a1");
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("HI");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex12, "01230120022455012623010202", "HI");
        soundex12.setMaxLength(10);
        java.lang.String str21 = soundex12.soundex("A0");
        java.lang.Object obj22 = refinedSoundex0.encode((java.lang.Object) str21);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O0" + "'", str6, "O0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A031" + "'", str8, "A031");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A0" + "'", str10, "A0");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A000" + "'", str21, "A000");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "A0" + "'", obj22, "A0");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("A031", "");
        org.apache.commons.codec.language.Caverphone caverphone6 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str8 = caverphone6.encode("01230120022455012623010202");
        boolean boolean11 = caverphone6.isCaverphoneEqual("O941", "a1");
        boolean boolean14 = caverphone6.isCaverphoneEqual("", "K");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode((java.lang.Object) caverphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111" + "'", str8, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H000");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ARKP", "");
        char char12 = refinedSoundex0.getMappingCode('3');
        java.lang.String str14 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: H");
        java.lang.String str16 = refinedSoundex0.encode("O0931538363836931589");
        java.lang.String str18 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: A310");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O0940103030808306030830609053016080" + "'", str14, "O0940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O0" + "'", str16, "O0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O0940103030808306030830609053016080" + "'", str18, "O0940103030808306030830609053016080");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        java.lang.String str21 = soundex1.encode("ORKP");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "O931" + "'", str21, "O931");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex2 = new org.apache.commons.codec.language.RefinedSoundex();
        char char4 = refinedSoundex2.getMappingCode('a');
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex2, "", "hi!");
        java.lang.String str9 = refinedSoundex2.soundex("H");
        int int12 = refinedSoundex2.difference("1111111111", "A000");
        java.lang.Object obj13 = refinedSoundex1.encode((java.lang.Object) "1111111111");
        java.lang.String str15 = refinedSoundex1.encode("org.apache.commons.codec.EncoderException: ");
        java.lang.String str17 = refinedSoundex1.soundex("A000H0AKP1111111");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex1, "AKPKMNSK11", "ARKPXKMNSKTKNKTRKSPXN");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str24 = doubleMetaphone21.doubleMetaphone("", false);
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone21, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str29 = doubleMetaphone21.encode("hi!");
        java.lang.String str31 = doubleMetaphone21.doubleMetaphone("H000");
        char char34 = doubleMetaphone21.charAt("A000", (int) (short) 1);
        doubleMetaphone21.setMaxCodeLen((int) '#');
        java.lang.String str38 = doubleMetaphone21.doubleMetaphone("");
        char char41 = doubleMetaphone21.charAt("org.apache.commons.codec.EncoderException: \000", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = refinedSoundex1.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H0" + "'", str9, "H0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O094010303080830603083060905301608" + "'", str15, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A031" + "'", str17, "A031");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '0' + "'", char34 == '0');
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + 'o' + "'", char41 == 'o');
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        char char38 = doubleMetaphone0.charAt(" 9AKPK111111", 0);
        java.lang.String str40 = doubleMetaphone0.encode("A210");
        char char43 = doubleMetaphone0.charAt("XR", 82);
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
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + ' ' + "'", char38 == ' ');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "A" + "'", str40, "A");
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\000' + "'", char43 == '\000');
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        boolean boolean29 = metaphone0.isMetaphoneEqual("AKPR", "A0");
        boolean boolean32 = metaphone0.isMetaphoneEqual("A000AKP1111111", "aorg.apache.commons.codec.EncoderException: 01230120022455012623010202");
        char[] charArray33 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex34 = new org.apache.commons.codec.language.Soundex(charArray33);
        java.lang.String str36 = soundex34.encode("HI");
        int int39 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex34, "01230120022455012623010202", "HI");
        soundex34.setMaxLength((int) '#');
        soundex34.setMaxLength(0);
        soundex34.setMaxLength(3);
        int int48 = soundex34.difference("O", "A931");
        java.lang.String str50 = soundex34.encode("a1");
        int int51 = soundex34.getMaxLength();
        char[] charArray52 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex53 = new org.apache.commons.codec.language.Soundex(charArray52);
        java.lang.String str55 = soundex53.encode("HI");
        int int58 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex53, "01230120022455012623010202", "HI");
        soundex53.setMaxLength((int) '#');
        soundex53.setMaxLength(0);
        java.lang.String str64 = soundex53.encode("\000");
        java.lang.Object obj65 = soundex34.encode((java.lang.Object) str64);
        java.lang.Object obj66 = metaphone0.encode(obj65);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H000" + "'", str36, "H000");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "A000" + "'", str50, "A000");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "H000" + "'", str55, "H000");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "" + "'", obj65, "");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "" + "'", obj66, "");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        java.lang.String str7 = refinedSoundex5.encode("1");
        java.lang.String str9 = refinedSoundex5.soundex("A000H0H000");
        java.lang.String str11 = refinedSoundex5.encode("KPK1111111");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K313" + "'", str11, "K313");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = metaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int16 = metaphone0.getMaxCodeLen();
        int int17 = metaphone0.getMaxCodeLen();
        int int18 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O" + "'", str15, "O");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        metaphone0.setMaxCodeLen((int) ' ');
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
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        int int32 = soundex1.difference("", "I");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual("AKP", "A212");
        metaphone0.setMaxCodeLen((int) 'a');
        metaphone0.setMaxCodeLen(0);
        java.lang.String str20 = metaphone0.metaphone("ORGAPACHECOMMONSCODECENCODEREXCEPTIONAR");
        int int21 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        int int10 = refinedSoundex0.difference("H", "H0");
        int int13 = refinedSoundex0.difference("ORKP", "AKPKKMNSKT");
        java.lang.String str15 = refinedSoundex0.encode("O");
        int int18 = refinedSoundex0.difference("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA", "012301200224550126230102021");
        int int21 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: AAAA", "RKPKSKMNSKTKNKTRKSPKSNRKP");
        java.lang.String str23 = refinedSoundex0.soundex("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A09315383638369315893153836383693158" + "'", str23, "A09315383638369315893153836383693158");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("O0931");
        soundex0.setMaxLength(35);
        int int7 = soundex0.difference("ARKPXKMNSKTSNKTRKSPXN", "org.apache.commons.codec.EncoderException: A09313836383693138");
        soundex0.setMaxLength((int) '5');
        java.lang.String str11 = soundex0.soundex("ORKPXKMNSKTSNKTRKSSPXNR");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O000" + "'", str2, "O000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: HIA212");
        java.lang.String str13 = metaphone0.encode("A212");
        int int14 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'o');
        java.lang.String str18 = metaphone0.metaphone("#K");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "K" + "'", str18, "K");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str4 = soundex2.encode("H0");
        int int7 = soundex2.difference("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS", "ORKPXKMNSKTKNKTRKSSPXNR");
        java.lang.String str9 = soundex2.soundex("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        int int12 = soundex2.difference("ARKPKKMNSKTKNKTRKSPXN", "org.apache.commons.codec.EncoderException: \000");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A931" + "'", str9, "A931");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("KPKR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KPKR" + "'", str1, "KPKR");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "A0");
        java.lang.String str5 = caverphone0.encode("0#");
        java.lang.String str7 = caverphone0.caverphone("AKPaXS");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AKPKS11111" + "'", str7, "AKPKS11111");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("A0313836");
        int int5 = refinedSoundex0.difference("A931", "H000");
        int int8 = refinedSoundex0.difference("A000AKP1111111AKP1111111O000org.apache.commons.codec.EncoderException: A09313836383693138", "A03138363");
        char char10 = refinedSoundex0.getMappingCode('\000');
        java.lang.String str12 = refinedSoundex0.encode("ORKPXKMNSKTKNKTRKSSPXNR");
        java.lang.String str14 = refinedSoundex0.soundex("AKPKKPKMNS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0" + "'", str2, "A0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O0931538363836931589" + "'", str12, "O0931538363836931589");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A03131383" + "'", str14, "A03131383");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        java.lang.String str2 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        java.lang.String str4 = refinedSoundex0.encode("HIA212");
        java.lang.Class<?> wildcardClass5 = refinedSoundex0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O09401030308083060308306090530160803138363" + "'", str2, "O09401030308083060308306090530160803138363");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H0" + "'", str4, "H0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        int int4 = soundex1.getMaxLength();
        java.lang.String str6 = soundex1.soundex("a1");
        java.lang.String str8 = soundex1.encode("03ARKPXKMNSKTKNKTRKSPXNRKP");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A621" + "'", str8, "A621");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        char char11 = refinedSoundex3.getMappingCode('1');
        java.lang.String str13 = refinedSoundex3.encode("#HI");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H0" + "'", str13, "H0");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        boolean boolean22 = caverphone0.isCaverphoneEqual("ORKPXKMNSKTKNKTRKSSPXNR", "3");
        boolean boolean25 = caverphone0.isCaverphoneEqual("A0313094010303080830603083060905301608031383630", "AKPKSSKS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AKPKKMNSKT" + "'", str17, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKKMNSKT" + "'", str19, "AKPKKMNSKT");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength((int) '#');
        soundex1.setMaxLength(0);
        soundex1.setMaxLength(3);
        int int15 = soundex1.difference("O", "A931");
        java.lang.String str17 = soundex1.encode("O0940103030808306030830609053016080");
        soundex1.setMaxLength((int) 'R');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O000" + "'", str17, "O000");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.encode("O094010303080830603083060905301608");
        int int9 = soundex0.difference("1111111111", "01230120022455012623010202");
        java.lang.String str11 = soundex0.soundex("org.apache.commons.codec.EncoderException: A0");
        int int12 = soundex0.getMaxLength();
        java.lang.String str14 = soundex0.soundex("A000\000");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "O000" + "'", str6, "O000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O621" + "'", str11, "O621");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A000" + "'", str14, "A000");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        int int10 = refinedSoundex0.difference("", "O941");
        int int13 = refinedSoundex0.difference("O941", "ORKP");
        java.lang.String str15 = refinedSoundex0.encode("O094010303080830603083060905301608");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "org.apache.commons.codec.EncoderException: 01230120022455012623010202", "a1");
        char char20 = refinedSoundex0.getMappingCode('4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = 'I';
        doubleMetaphone0.maxCodeLen = 97;
        char char10 = doubleMetaphone0.charAt("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTKNKTRKSPXN", (int) (byte) 1);
        java.lang.String str12 = doubleMetaphone0.encode("H000");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'R' + "'", char10 == 'R');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("");
        java.lang.String str6 = metaphone0.encode("H000");
        int int7 = metaphone0.getMaxCodeLen();
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A0", " ");
        java.lang.String str12 = metaphone0.encode("");
        java.lang.String str14 = metaphone0.encode("org.apache.commons.codec.EncoderException: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORKP" + "'", str14, "ORKP");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        char char4 = refinedSoundex0.getMappingCode(' ');
        java.lang.String str6 = refinedSoundex0.soundex("A0313");
        java.lang.String str8 = refinedSoundex0.encode("ARKPXKMNSKTSNKTRKSPXNO093153836383693158");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0" + "'", str6, "A0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A0931538363836931580" + "'", str8, "A0931538363836931580");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("O094010303080830603083060905301608", "01230120022455012623010202", true);
        int int15 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("A000", "A000");
        doubleMetaphone0.maxCodeLen = 1;
        int int21 = doubleMetaphone0.maxCodeLen;
        char char24 = doubleMetaphone0.charAt("A093153836383693158", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '0' + "'", char24 == '0');
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int4 = soundex1.getMaxLength();
        int int7 = soundex1.difference("ARKPXKMNSKTSNKTRKSPXN", "ORKP");
        int int10 = soundex1.difference("", "H000");
        java.lang.String str12 = soundex1.encode("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "O941" + "'", str12, "O941");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(3);
        doubleMetaphone0.setMaxCodeLen((int) 'K');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        boolean boolean12 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "");
        metaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORKP" + "'", str9, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        char[] charArray4 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex7 = new org.apache.commons.codec.language.Soundex(charArray4);
        org.apache.commons.codec.language.Soundex soundex8 = new org.apache.commons.codec.language.Soundex(charArray4);
        java.lang.String str10 = soundex8.encode("A0");
        char[] charArray11 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex12 = new org.apache.commons.codec.language.Soundex(charArray11);
        java.lang.String str14 = soundex12.encode("HI");
        java.lang.String str16 = soundex12.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone17, "hi!", "");
        doubleMetaphone17.maxCodeLen = '4';
        java.lang.String str24 = doubleMetaphone17.doubleMetaphone("");
        int int25 = doubleMetaphone17.getMaxCodeLen();
        java.lang.String str27 = doubleMetaphone17.doubleMetaphone("hi!");
        java.lang.Object obj28 = soundex12.encode((java.lang.Object) "hi!");
        java.lang.String str30 = soundex12.encode("");
        java.lang.String str32 = soundex12.encode("");
        java.lang.String str34 = soundex12.encode("01230120022455012623010202");
        int int37 = soundex12.difference("AKPKKMNSKT", "O941");
        int int40 = soundex12.difference("AKPKKMNSKT", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex12.setMaxLength(0);
        java.lang.Class<?> wildcardClass43 = soundex12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = soundex8.encode((java.lang.Object) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H000" + "'", str14, "H000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("O000");
        java.lang.Object obj10 = caverphone0.encode((java.lang.Object) "AKPKMNSKTS");
        java.lang.String str12 = caverphone0.caverphone("03");
        char[] charArray13 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("HI");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex14, "01230120022455012623010202", "HI");
        soundex14.setMaxLength((int) '#');
        soundex14.setMaxLength(0);
        java.lang.String str25 = soundex14.encode("\000");
        java.lang.String str27 = soundex14.encode("ARKPXKMNSKTKNKTRKSPXN");
        java.lang.Object obj28 = caverphone0.encode((java.lang.Object) "ARKPXKMNSKTKNKTRKSPXN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "AKPKMNSKTS" + "'", obj10, "AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H000" + "'", str16, "H000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A931" + "'", str27, "A931");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "AKPKMNSKTK" + "'", obj28, "AKPKMNSKTK");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.metaphone("");
        boolean boolean12 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: AKP1111111", "A093153836383693158");
        java.lang.String str14 = metaphone0.encode("AAKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        char char11 = refinedSoundex0.getMappingCode('K');
        java.lang.String str13 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: O941");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '3' + "'", char11 == '3');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O0940103030808306030830609053016080" + "'", str13, "O0940103030808306030830609053016080");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A0313836");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "A000", "AKP1111111");
        java.lang.String str14 = caverphone0.caverphone("03");
        java.lang.String str16 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "ARKPKSKMNSKTKNKTRKSPKSNRKP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKPKKMNSKT" + "'", str16, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "AKPKSKMNSK" + "'", obj18, "AKPKSKMNSK");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        boolean boolean12 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "");
        java.lang.String str14 = metaphone0.encode("ORKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORKP" + "'", str9, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORKP" + "'", str14, "ORKP");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str8 = doubleMetaphone0.encode("ARKPKSKMNSKTSNKTRKSPKSN");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException: A093153836383693158");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A000H0H000", false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ARKP" + "'", str8, "ARKP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ARKP" + "'", str10, "ARKP");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("01230120022455012623010202", "01230120022455012623010202");
        java.lang.String str5 = refinedSoundex0.encode("hi!");
        java.lang.String str7 = refinedSoundex0.soundex("H000");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "ARKP", "");
        char char12 = refinedSoundex0.getMappingCode('3');
        java.lang.String str14 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONA093153836383693158org.apache.commons.codec.EncoderException");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "O094010303080830603083060905301608094010303080830603083060905301608" + "'", str14, "O094010303080830603083060905301608094010303080830603083060905301608");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        soundex1.setMaxLength(1);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "H000", "O094010303080830603083060905301608", "org.apache.commons.codec.EncoderException: " };
        boolean boolean45 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 0, (int) (short) 100, strArray44);
        boolean boolean46 = org.apache.commons.codec.language.DoubleMetaphone.contains("ORKP", (int) '#', (int) 'O', strArray44);
        boolean boolean47 = org.apache.commons.codec.language.DoubleMetaphone.contains("AKP1111111", (int) (byte) -1, (int) 'a', strArray44);
        boolean boolean48 = org.apache.commons.codec.language.DoubleMetaphone.contains("HI", (int) ' ', (int) '0', strArray44);
        boolean boolean49 = org.apache.commons.codec.language.DoubleMetaphone.contains("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa", (int) 'S', 6, strArray44);
        java.lang.Object obj50 = soundex1.encode((java.lang.Object) "AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa");
        int int53 = soundex1.difference("ARKPKSKMNSK", "org.apache.commons.codec.EncoderException: A000H0H000");
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
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "A313" + "'", obj50, "A313");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        java.lang.String str4 = metaphone0.metaphone("org.apache.commons.codec.EncoderException: ");
        boolean boolean7 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "HI");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        metaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean15 = metaphone0.isMetaphoneEqual("A319", "HI1Oa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ORKP" + "'", str4, "ORKP");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        java.lang.String str13 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        java.lang.String str15 = refinedSoundex3.encode("A0310");
        java.lang.String str17 = refinedSoundex3.soundex("01230120022455012623010202");
        java.lang.String str19 = refinedSoundex3.soundex("AKPa 1");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O094010303080830603083060905301608" + "'", str13, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A0" + "'", str15, "A0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A0310" + "'", str19, "A0310");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION" + "'", str1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        int int5 = soundex2.difference("0123012002245501262301020211111111111", "04");
        java.lang.String str7 = soundex2.encode("0");
        java.lang.Object obj9 = soundex2.encode((java.lang.Object) "AKPA111111");
        soundex2.setMaxLength(5);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "A310" + "'", obj9, "A310");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("AKP");
        org.apache.commons.codec.language.Metaphone metaphone10 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str12 = metaphone10.metaphone("H0");
        boolean boolean15 = metaphone10.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str17 = metaphone10.metaphone("");
        java.lang.String str19 = metaphone10.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        int int20 = metaphone10.getMaxCodeLen();
        metaphone10.setMaxCodeLen(111);
        java.lang.String str24 = metaphone10.metaphone("RKPX");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) "RKPX");
        java.lang.String str27 = caverphone0.encode("H000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AKP1111111" + "'", str9, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ARKP" + "'", str19, "ARKP");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RKPKS" + "'", str24, "RKPKS");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "KPK1111111" + "'", obj25, "KPK1111111");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A111111111" + "'", str27, "A111111111");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.codec.language.Soundex soundex0 = new org.apache.commons.codec.language.Soundex();
        soundex0.setMaxLength(0);
        int int5 = soundex0.difference("O", "ARKPXKMNSKTSNKTRKSPXN");
        int int8 = soundex0.difference("", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        soundex0.setMaxLength(10);
        java.lang.String str12 = soundex0.encode("H0");
        int int13 = soundex0.getMaxLength();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone14.setMaxCodeLen((int) (byte) -1);
        doubleMetaphone14.maxCodeLen = 100;
        java.lang.String str20 = doubleMetaphone14.doubleMetaphone("A03138363");
        boolean boolean24 = doubleMetaphone14.isDoubleMetaphoneEqual("3301230120022455012623010202\000", "", false);
        int int25 = doubleMetaphone14.maxCodeLen;
        java.lang.String str27 = doubleMetaphone14.doubleMetaphone("HIA212O0940103030808306030830609053016080940103030808306030830609053016080");
        java.lang.Object obj28 = soundex0.encode((java.lang.Object) "HIA212O0940103030808306030830609053016080940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H000" + "'", str12, "H000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H000" + "'", obj28, "H000");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202", false);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("H0", true);
        char char16 = doubleMetaphone0.charAt("ARKPKMNSKTKNKTRKSPKSN", (int) 'I');
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("A03", false);
        doubleMetaphone0.setMaxCodeLen(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        char char7 = refinedSoundex0.getMappingCode('K');
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: A931");
        java.lang.String str11 = refinedSoundex0.soundex("");
        char char13 = refinedSoundex0.getMappingCode('3');
        char char15 = refinedSoundex0.getMappingCode('S');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "hi!", "");
        doubleMetaphone16.maxCodeLen = '4';
        java.lang.String str23 = doubleMetaphone16.doubleMetaphone("");
        java.lang.String str26 = doubleMetaphone16.doubleMetaphone("01230120022455012623010202", false);
        doubleMetaphone16.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = refinedSoundex0.encode((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '3' + "'", char7 == '3');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0940103030808306030830609053016080940103030808306030830609053016080" + "'", str9, "O0940103030808306030830609053016080940103030808306030830609053016080");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '3' + "'", char15 == '3');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        java.lang.String str6 = caverphone0.encode("ARKP");
        java.lang.String str8 = caverphone0.caverphone("ARKPXKMNSKTKNKTRKSPXNRKPXKMNSKTSNKTRKSPXN");
        java.lang.String str10 = caverphone0.caverphone("R9315");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AKP1111111" + "'", str6, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPKMNSKTK" + "'", str8, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        java.lang.String str19 = metaphone0.metaphone("A09");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.encode("O0931");
        int int5 = soundex0.difference("org.apache.commons.codec.EncoderException: ORGAPACHECOMMONSCODECENCODEREXCEPTION", "");
        int int8 = soundex0.difference("", "ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str12 = doubleMetaphone9.doubleMetaphone("", false);
        int int13 = doubleMetaphone9.getMaxCodeLen();
        int int14 = doubleMetaphone9.maxCodeLen;
        boolean boolean17 = doubleMetaphone9.isDoubleMetaphoneEqual("org.apache.commons.codec.EncoderException: HIA212", "A0931");
        doubleMetaphone9.maxCodeLen = 'X';
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj22 = caverphone20.encode((java.lang.Object) "HI");
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone20, "A000", "AKPKKMNSKT");
        java.lang.String str27 = caverphone20.caverphone("04");
        java.lang.Object obj28 = doubleMetaphone9.encode((java.lang.Object) str27);
        java.lang.Object obj29 = soundex0.encode(obj28);
        int int32 = soundex0.difference("A000aKI", "O931");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O000" + "'", str2, "O000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "AA11111111" + "'", obj22, "AA11111111");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1111111111" + "'", str27, "1111111111");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "" + "'", obj28, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("");
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
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        int int5 = soundex0.getMaxLength();
        java.lang.String str7 = soundex0.soundex("A0313836");
        java.lang.String str9 = soundex0.soundex("A031");
        java.lang.String str11 = soundex0.soundex("1");
        int int12 = soundex0.getMaxLength();
        int int15 = soundex0.difference("A093153836383693158931538363836931583138363", "A0212");
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A000" + "'", str7, "A000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A000" + "'", str9, "A000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0123012002245501262301020211111111111");
        java.lang.String str21 = metaphone0.encode("K301230120022455012623010202\000");
        java.lang.String str23 = metaphone0.metaphone("ORKPXKMNSKTKNKTRKSSPXN");
        metaphone0.setMaxCodeLen(52);
        java.lang.String str27 = metaphone0.metaphone("O094010303080830603083060905301608031383");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "K" + "'", str21, "K");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORKPKSKMNSKTKNKTRKSPKSN" + "'", str23, "ORKPKSKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "O" + "'", str27, "O");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("1111111111");
        java.lang.String str8 = caverphone0.caverphone("org.apache.commons.codec.EncoderException: H");
        java.lang.String str10 = caverphone0.caverphone("ARKPKKMNSKTKNKTRKSPXN");
        java.lang.String str12 = caverphone0.encode("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AKPKKMNSKT" + "'", str8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKMNSKTK" + "'", str10, "AKPKMNSKTK");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AKPKKMNSKT" + "'", str12, "AKPKKMNSKT");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.caverphone("ORKP");
        java.lang.String str12 = caverphone0.encode("O094010303080830603083060905301608");
        java.lang.String str14 = caverphone0.caverphone("AA");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "O0940103030808306030830609053016080");
        java.lang.String str19 = caverphone0.encode("ARKPKMNSKTKNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKP1111111" + "'", str10, "AKP1111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AKPKMNSKTK" + "'", str19, "AKPKMNSKTK");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("01230120022455012623010202");
        int int34 = doubleMetaphone0.getMaxCodeLen();
        char char37 = doubleMetaphone0.charAt("A0310310", (int) '4');
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("O941", "a1");
        boolean boolean8 = caverphone0.isCaverphoneEqual("", "K");
        java.lang.String str10 = caverphone0.caverphone("O094010303080830603083060905301608031");
        boolean boolean13 = caverphone0.isCaverphoneEqual("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTS \000o", "AKPHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        boolean boolean25 = metaphone0.isMetaphoneEqual("", "ORKPXKMNSKTKNKTRKSSPXNKPKMNSKTS");
        java.lang.String str27 = metaphone0.encode("\0001");
        int int28 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ARKPKSKMNSKTSNKTRKSPKSN" + "'", str22, "ARKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        doubleMetaphone0.maxCodeLen = ' ';
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "ARKPKSKMNSKTKNKTRKSPKSN", "O0940103030808306030830609053016080");
        java.lang.String str34 = doubleMetaphone0.encode("AAKPARKP");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'I' + "'", char22 == 'I');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AKPRKP" + "'", str34, "AKPRKP");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A0212");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        java.lang.String str18 = metaphone0.encode("O");
        boolean boolean21 = metaphone0.isMetaphoneEqual("A111111111", "");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "H262", "org.apache.commons.codec.EncoderException: A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "O" + "'", str18, "O");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        int int6 = metaphone0.getMaxCodeLen();
        boolean boolean9 = metaphone0.isMetaphoneEqual("A000AKP1111111\000A", "HI1A093153836383693158");
        java.lang.String str11 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "hi!");
        java.lang.String str11 = refinedSoundex0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTION");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "O0940103030808306030830609053016080", "HIA212");
        java.lang.String str16 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ORKP");
        char char18 = refinedSoundex0.getMappingCode('8');
        int int21 = refinedSoundex0.difference("A000\000", "org.apache.commons.codec.EncoderException: 0");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O094010303080830603083060905301608" + "'", str11, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "O0940103030808306030830609053016080931" + "'", str16, "O0940103030808306030830609053016080931");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.encode("hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("H0", "HI");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("O094010303080830603083060905301608", "hi!");
        boolean boolean19 = metaphone0.isMetaphoneEqual("org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS", "0123012002245501262301020211111111111");
        java.lang.String str21 = metaphone0.encode("K301230120022455012623010202\000");
        java.lang.String str23 = metaphone0.encode("A310");
        metaphone0.setMaxCodeLen((int) 'A');
        int int26 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "K" + "'", str21, "K");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 65 + "'", int26 == 65);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex1 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex2.setMaxLength((int) '1');
        java.lang.String str6 = soundex2.soundex("A0313836");
        int int9 = soundex2.difference("ARKP", "AKPKMNSKTS");
        java.lang.String str11 = soundex2.soundex("A0931383");
        int int12 = soundex2.getMaxLength();
        int int13 = soundex2.getMaxLength();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000" + "'", str6, "A000");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A000" + "'", str11, "A000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("H000", "");
        char char11 = refinedSoundex0.getMappingCode('\000');
        java.lang.String str13 = refinedSoundex0.soundex("ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        java.lang.String str15 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ARKPXKMNSKTKNKTRKSPXNKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "O094010303080830603083060905301608" + "'", str4, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A0931538363836931583138363" + "'", str13, "A0931538363836931583138363");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0940103030808306030830609053016080931538363836931583138363" + "'", str15, "O0940103030808306030830609053016080931538363836931583138363");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        java.lang.String str9 = metaphone0.metaphone("ARKPXKMNSKTSNKTRKSPXN");
        java.lang.String str11 = metaphone0.encode("O000");
        metaphone0.setMaxCodeLen((int) 'K');
        boolean boolean16 = metaphone0.isMetaphoneEqual("H0", "A931");
        boolean boolean19 = metaphone0.isMetaphoneEqual("aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA", "AKPKMNSKTS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ARKP" + "'", str9, "ARKP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("", false);
        int int4 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("");
        char[] charArray15 = new char[] { '4', ' ', '\000', 'a' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex16 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex18 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        org.apache.commons.codec.language.Soundex soundex19 = new org.apache.commons.codec.language.Soundex(charArray15);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex20 = new org.apache.commons.codec.language.RefinedSoundex(charArray15);
        java.lang.String str22 = refinedSoundex20.encode("0123012002245501262301020211111111111");
        java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) "0123012002245501262301020211111111111");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 \000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 \000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  , \000, a]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        java.lang.String str4 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: ");
        char char6 = refinedSoundex0.getMappingCode('#');
        int int9 = refinedSoundex0.difference("ARKP", "H000");
        java.lang.String str11 = refinedSoundex0.soundex("A031");
        char char13 = refinedSoundex0.getMappingCode('I');
        java.lang.String str15 = refinedSoundex0.soundex("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTSNKTRKSPKSN");
        char[] charArray16 = null;
        org.apache.commons.codec.language.Soundex soundex17 = new org.apache.commons.codec.language.Soundex(charArray16);
        soundex17.setMaxLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex0.encode((java.lang.Object) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A093138363836931389313836383693138" + "'", str15, "A093138363836931389313836383693138");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("hi!");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(3);
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(111);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'p');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        doubleMetaphone0.maxCodeLen = '4';
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "HI");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A0313836");
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.String str17 = doubleMetaphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONH");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ARKPXKMNSKTSNKTRKSPXN" + "'", str17, "ARKPXKMNSKTSNKTRKSPXN");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.Object obj5 = refinedSoundex0.encode((java.lang.Object) "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("O094010303080830603083060905301608094010303080830603083060905301608");
        java.lang.String str9 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException: AKP1111111");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "AAAA", "A03131");
        java.lang.String str14 = refinedSoundex0.encode("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "H0" + "'", obj5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O0" + "'", str7, "O0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O094010303080830603083060905301608031" + "'", str9, "O094010303080830603083060905301608031");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex0, "", "hi!");
        java.lang.String str7 = refinedSoundex0.soundex("01230120022455012623010202");
        java.lang.String str9 = refinedSoundex0.soundex("A000");
        int int12 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: 01230120022455012623010202\000", "O09401030308083060308306090530160809401030308083060308306090530160809401030308083060308306090530160803138363");
        char char14 = refinedSoundex0.getMappingCode('0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.codec.language.Soundex soundex0 = org.apache.commons.codec.language.Soundex.US_ENGLISH;
        java.lang.String str2 = soundex0.soundex("H");
        java.lang.String str4 = soundex0.soundex("H");
        java.lang.String str6 = soundex0.soundex("AKPK");
        java.lang.String str8 = soundex0.encode("0");
        java.lang.String str10 = soundex0.soundex("AA");
        int int13 = soundex0.difference("04", "0123012002245501262301020211111111111");
        int int14 = soundex0.getMaxLength();
        org.junit.Assert.assertNotNull(soundex0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H000" + "'", str2, "H000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H000" + "'", str4, "H000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A212" + "'", str6, "A212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A000" + "'", str10, "A000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        char char2 = refinedSoundex0.getMappingCode('a');
        int int5 = refinedSoundex0.difference("ORGAPACHECOMMONSCODECENCODEREXCEPTION", "H");
        java.lang.String str7 = refinedSoundex0.encode("hi!");
        int int10 = refinedSoundex0.difference("#HIK", "org.apache.commons.codec.EncoderException: org.apache.commons.codec.EncoderException: AKPKMNSKTS");
        int int13 = refinedSoundex0.difference("A0931538363836931583138363", "A0931");
        java.lang.String str15 = refinedSoundex0.encode("O0");
        java.lang.String str17 = refinedSoundex0.encode("A621");
        int int20 = refinedSoundex0.difference("AKPKMNSKTK", "AKPKRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS");
        char char22 = refinedSoundex0.getMappingCode('R');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H0" + "'", str7, "H0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "O0" + "'", str15, "O0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A0" + "'", str17, "A0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '9' + "'", char22 == '9');
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.metaphone("H0");
        boolean boolean5 = metaphone0.isMetaphoneEqual("H000", "org.apache.commons.codec.EncoderException: ");
        java.lang.String str7 = metaphone0.metaphone("");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("a1");
        java.lang.String str12 = metaphone0.metaphone("Xr");
        java.lang.String str14 = metaphone0.encode("ARKPXKMNSKTSNKTRKSPXNRKP");
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.metaphone("HIA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SR" + "'", str12, "SR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ARKP" + "'", str14, "ARKP");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        boolean boolean26 = metaphone0.isMetaphoneEqual("ARKPXKMNSKTSNKTRKSPXNaA", "");
        java.lang.String str28 = metaphone0.encode("H000");
        java.lang.String str30 = metaphone0.encode("org.apache.commons.codec.EncoderException: AKPKKMNSKT");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORKP" + "'", str30, "ORKP");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.Object obj7 = refinedSoundex3.encode((java.lang.Object) "ARKPXKMNSK");
        java.lang.String str9 = refinedSoundex3.encode("org.apache.commons.codec.EncoderException: H");
        char char11 = refinedSoundex3.getMappingCode('a');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "A09315383" + "'", obj7, "A09315383");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O0940103030808306030830609053016080" + "'", str9, "O0940103030808306030830609053016080");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '0' + "'", char11 == '0');
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.soundex("A");
        java.lang.String str5 = soundex1.soundex("\000");
        java.lang.String str7 = soundex1.soundex("#HIK");
        java.lang.String str9 = soundex1.soundex("AKPKKPKKMN");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000" + "'", str3, "A000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H200" + "'", str7, "H200");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A212" + "'", str9, "A212");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        java.lang.String str18 = metaphone0.metaphone("A0931383638369313893138363836931383138363");
        java.lang.String str20 = metaphone0.encode("ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTSNKTRKSPKSN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "A" + "'", obj15, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ARKP" + "'", str20, "ARKP");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex0 = new org.apache.commons.codec.language.RefinedSoundex();
        int int3 = refinedSoundex0.difference("H000", "H0");
        java.lang.String str5 = refinedSoundex0.soundex("HI");
        java.lang.String str7 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException: \000");
        java.lang.String str9 = refinedSoundex0.encode("A000A212");
        java.lang.String str11 = refinedSoundex0.soundex("");
        int int14 = refinedSoundex0.difference("org.apache.commons.codec.EncoderException: \000", "ARKPKSKMNSKTKNKTRKSPKSNRKPKSKMNSKTKNKTRKSPKSN");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj17 = caverphone15.encode((java.lang.Object) "HI");
        java.lang.String str19 = caverphone15.encode("H");
        java.lang.String str21 = caverphone15.caverphone("H000");
        java.lang.String str23 = caverphone15.caverphone("A093153836383693158");
        java.lang.String str25 = caverphone15.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
        java.lang.Object obj26 = refinedSoundex0.encode((java.lang.Object) "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORKP");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H0" + "'", str5, "H0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A0" + "'", str9, "A0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "AA11111111" + "'", obj17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A111111111" + "'", str21, "A111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A111111111" + "'", str23, "A111111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "AKPKKMNSKT" + "'", str25, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "O0940103030808306030830609053016080931" + "'", obj26, "O0940103030808306030830609053016080931");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        boolean boolean5 = caverphone0.isCaverphoneEqual("ARKP", "H000");
        java.lang.String str7 = caverphone0.encode("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("A931");
        java.lang.String str11 = caverphone0.encode("HI");
        java.lang.String str13 = caverphone0.caverphone("01230120022455012623010202");
        boolean boolean16 = caverphone0.isCaverphoneEqual("AKPKRKPKSKMNSKTKNKTRKSPKSNKPKMNSKTS", "KPK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A111111111" + "'", str9, "A111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.Object obj2 = caverphone0.encode((java.lang.Object) "HI");
        java.lang.String str4 = caverphone0.encode("H");
        boolean boolean7 = caverphone0.isCaverphoneEqual("", "HI");
        java.lang.String str9 = caverphone0.encode("AA");
        java.lang.String str11 = caverphone0.caverphone("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "AA11111111" + "'", obj2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.Soundex soundex2 = new org.apache.commons.codec.language.Soundex(charArray0);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex(charArray0);
        char char5 = refinedSoundex3.getMappingCode('1');
        java.lang.String str7 = refinedSoundex3.encode("");
        java.lang.String str9 = refinedSoundex3.encode("");
        java.lang.String str11 = refinedSoundex3.encode("O");
        java.lang.String str13 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: 01230120022455012623010202");
        int int16 = refinedSoundex3.difference("A0931538363836931583138363", "O09315383638369315893138363836931383138363");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O0" + "'", str11, "O0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O094010303080830603083060905301608" + "'", str13, "O094010303080830603083060905301608");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        char[] charArray0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        java.lang.String str3 = soundex1.encode("HI");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "01230120022455012623010202", "HI");
        soundex1.setMaxLength(10);
        int int11 = soundex1.difference("ARKP", "01230120022455012623010202");
        int int14 = soundex1.difference("HI", "01230120022455012623010202");
        java.lang.String str16 = soundex1.encode("AA");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex1, "ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTIONAKPKMNSKTS", "aORGAPACHECOMMONSCODECENCODEREXCEPTIONAA5a");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01360240043788015936020505");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 3, 6, 0, 2, 4, 0, 0, 4, 3, 7, 8, 8, 0, 1, 5, 9, 3, 6, 0, 2, 0, 5, 0, 5]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H000" + "'", str3, "H000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A000" + "'", str16, "A000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("01230120022455012623010202");
        java.lang.String str4 = caverphone0.caverphone("H000");
        java.lang.String str6 = caverphone0.caverphone("01230120022455012623010202");
        int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "AA11111111", "A03138363a");
        java.lang.String str11 = caverphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111" + "'", str2, "1111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A111111111" + "'", str4, "A111111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111" + "'", str6, "1111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        char[] charArray0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
        org.apache.commons.codec.language.Soundex soundex1 = new org.apache.commons.codec.language.Soundex(charArray0);
        soundex1.setMaxLength((int) (short) 10);
        java.lang.String str5 = soundex1.soundex("AKP0Korg.apache.commons.codec.EncoderException: AKPKMNSKTSa");
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "01230120022455012623010202");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A212" + "'", str5, "A212");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "30");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("ARKPXKMNSKTSNKTRKSPXN");
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex3 = new org.apache.commons.codec.language.RefinedSoundex();
        char char5 = refinedSoundex3.getMappingCode('a');
        java.lang.String str7 = refinedSoundex3.soundex("org.apache.commons.codec.EncoderException: ");
        java.lang.Object obj8 = caverphone0.encode((java.lang.Object) "org.apache.commons.codec.EncoderException: ");
        java.lang.String str10 = caverphone0.encode("ORGAPACHECOMMONSCODECENCODEREXCEPTIONORGAPACHECOMMONSCODECENCODEREXCEPTION");
        java.lang.String str12 = caverphone0.caverphone("");
        java.lang.String str14 = caverphone0.encode("AKPK111111");
        java.lang.String str16 = caverphone0.encode("AKPa");
        boolean boolean19 = caverphone0.isCaverphoneEqual("", "ORGAPACHECOMMONSCODECENCODEREXCEPTIONAAAA");
        org.apache.commons.codec.language.Caverphone caverphone20 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str22 = caverphone20.encode("01230120022455012623010202");
        boolean boolean25 = caverphone20.isCaverphoneEqual("org.apache.commons.codec.EncoderException: ", "");
        java.lang.String str27 = caverphone20.encode("AAAA");
        java.lang.String str29 = caverphone20.caverphone("0#");
        java.lang.String str31 = caverphone20.caverphone("X");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = caverphone0.encode((java.lang.Object) caverphone20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AKPKMNSKTS" + "'", str2, "AKPKMNSKTS");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O094010303080830603083060905301608" + "'", str7, "O094010303080830603083060905301608");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "AKPKKMNSKT" + "'", obj8, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AKPKKMNSKT" + "'", str10, "AKPKKMNSKT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AKPK111111" + "'", str14, "AKPK111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AKPA111111" + "'", str16, "AKPA111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111" + "'", str22, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AA11111111" + "'", str27, "AA11111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1111111111" + "'", str29, "1111111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "K111111111" + "'", str31, "K111111111");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = refinedSoundex4.encode((java.lang.Object) "hi!");
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
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "", "hi!");
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
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = refinedSoundex4.encode((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = refinedSoundex4.encode((java.lang.Object) 100);
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
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = soundex4.soundex("hi!");
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
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = refinedSoundex4.difference("", "hi!");
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
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex3, "hi!", "");
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
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex4.encode("hi!");
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
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = soundex3.difference("hi!", "");
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
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        char[] charArray10 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex11 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex4.encode((java.lang.Object) refinedSoundex12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "");
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        char[] charArray5 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex6 = new org.apache.commons.codec.language.RefinedSoundex(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex6, "hi!", "hi!");
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
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = refinedSoundex4.difference("", "hi!");
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
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
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
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
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
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char char9 = refinedSoundex4.getMappingCode('a');
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = soundex4.encode((java.lang.Object) 100.0d);
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
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        java.lang.String str8 = refinedSoundex4.soundex("");
        char[] charArray12 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex13 = new org.apache.commons.codec.language.RefinedSoundex(charArray12);
        char char15 = refinedSoundex13.getMappingCode(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = refinedSoundex4.encode((java.lang.Object) ' ');
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
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        char[] charArray11 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex12 = new org.apache.commons.codec.language.RefinedSoundex(charArray11);
        int int15 = refinedSoundex12.difference("", "");
        java.lang.String str17 = refinedSoundex12.encode("");
        java.lang.String str19 = refinedSoundex12.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex4.encode((java.lang.Object) refinedSoundex12);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.encode("hi!");
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
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = soundex4.difference("hi!", "");
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
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = refinedSoundex5.soundex("hi!");
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
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        char[] charArray13 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray13);
        java.lang.String str16 = soundex14.encode("");
        java.lang.String str18 = soundex14.soundex("");
        int int19 = soundex14.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = refinedSoundex4.encode((java.lang.Object) soundex14);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = soundex4.difference("", "hi!");
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
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
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
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) soundex4, "hi!", "hi!");
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
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
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
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        char[] charArray2 = new char[] { '4', 'a' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = soundex3.encode("hi!");
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = soundex4.difference("hi!", "hi!");
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
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
        char[] charArray13 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex14 = new org.apache.commons.codec.language.RefinedSoundex(charArray13);
        java.lang.String str16 = refinedSoundex14.soundex("");
        int int19 = refinedSoundex14.difference("", "");
        java.lang.Class<?> wildcardClass20 = refinedSoundex14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = refinedSoundex4.encode((java.lang.Object) refinedSoundex14);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
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
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex4.encode("hi!");
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        java.lang.String str19 = refinedSoundex4.encode("");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int11 = soundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = soundex4.encode((java.lang.Object) 100L);
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
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        char[] charArray12 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex13 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex14 = new org.apache.commons.codec.language.Soundex(charArray12);
        org.apache.commons.codec.language.Soundex soundex15 = new org.apache.commons.codec.language.Soundex(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = soundex4.encode((java.lang.Object) charArray12);
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = refinedSoundex4.difference("", "hi!");
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
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        java.lang.String str10 = soundex4.soundex("");
        soundex4.setMaxLength((-1));
        char[] charArray16 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex17 = new org.apache.commons.codec.language.RefinedSoundex(charArray16);
        char char19 = refinedSoundex17.getMappingCode('#');
        java.lang.Class<?> wildcardClass20 = refinedSoundex17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = soundex4.encode((java.lang.Object) refinedSoundex17);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        java.lang.String str17 = refinedSoundex4.encode("");
        char[] charArray23 = new char[] { ' ', '#', 'a', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex24 = new org.apache.commons.codec.language.RefinedSoundex(charArray23);
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
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " #aa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " #aa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , #, a, a, #]");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str6 = soundex4.soundex("");
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = soundex4.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        java.lang.String str6 = refinedSoundex4.soundex("");
        int int9 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex4.encode((java.lang.Object) "hi!");
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
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = soundex5.encode("hi!");
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
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        java.lang.String str7 = soundex5.encode("");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex5 = new org.apache.commons.codec.language.RefinedSoundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = refinedSoundex5.encode((java.lang.Object) "hi!");
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
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = refinedSoundex4.encode((java.lang.Object) 0L);
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
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex5 = new org.apache.commons.codec.language.Soundex(charArray2);
        org.apache.commons.codec.language.Soundex soundex6 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = soundex6.encode("hi!");
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
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
        int int10 = soundex4.getMaxLength();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        int int7 = refinedSoundex4.difference("", "");
        java.lang.String str9 = refinedSoundex4.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) refinedSoundex4, "hi!", "hi!");
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
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        java.lang.String str8 = soundex4.soundex("");
        int int9 = soundex4.getMaxLength();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        char[] charArray2 = new char[] { ' ', '4' };
        org.apache.commons.codec.language.Soundex soundex3 = new org.apache.commons.codec.language.Soundex(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = soundex3.encode("hi!");
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        char[] charArray3 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex4 = new org.apache.commons.codec.language.RefinedSoundex(charArray3);
        char char6 = refinedSoundex4.getMappingCode(' ');
        char char8 = refinedSoundex4.getMappingCode(' ');
        java.lang.String str10 = refinedSoundex4.soundex("");
        java.lang.String str12 = refinedSoundex4.encode("");
        int int15 = refinedSoundex4.difference("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = refinedSoundex4.difference("hi!", "");
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
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        char[] charArray25 = new char[] { '4', 'a', '#' };
        org.apache.commons.codec.language.RefinedSoundex refinedSoundex26 = new org.apache.commons.codec.language.RefinedSoundex(charArray25);
        char char28 = refinedSoundex26.getMappingCode(' ');
        char char30 = refinedSoundex26.getMappingCode(' ');
        java.lang.String str32 = refinedSoundex26.soundex("");
        java.lang.String str34 = refinedSoundex26.encode("");
        int int37 = refinedSoundex26.difference("", "");
        java.lang.String str39 = refinedSoundex26.soundex("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = refinedSoundex4.encode((java.lang.Object) refinedSoundex26);
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
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '4' + "'", char21 == '4');
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, #]");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        char[] charArray3 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex4 = new org.apache.commons.codec.language.Soundex(charArray3);
        java.lang.String str6 = soundex4.encode("");
        char[] charArray10 = new char[] { '#', '4', ' ' };
        org.apache.commons.codec.language.Soundex soundex11 = new org.apache.commons.codec.language.Soundex(charArray10);
        java.lang.String str13 = soundex11.encode("");
        java.lang.String str15 = soundex11.soundex("");
        int int16 = soundex11.getMaxLength();
        int int17 = soundex11.getMaxLength();
        int int18 = soundex11.getMaxLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = soundex4.encode((java.lang.Object) soundex11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Soundex encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
            java.lang.Object obj23 = refinedSoundex4.encode((java.lang.Object) true);
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
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '4' + "'", char21 == '4');
    }
}
