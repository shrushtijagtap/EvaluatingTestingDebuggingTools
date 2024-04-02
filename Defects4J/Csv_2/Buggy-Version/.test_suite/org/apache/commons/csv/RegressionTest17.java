package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isMapped("");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "", 0L);
        java.lang.String str36 = cSVRecord35.toString();
        java.util.Spliterator<java.lang.String> strSpliterator37 = cSVRecord35.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNotNull(strSpliterator37);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String str6 = cSVRecord4.getComment();
        boolean boolean8 = cSVRecord4.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord4.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord4.spliterator();
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertNotNull(strSpliterator10);
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String str11 = cSVRecord5.getComment();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isMapped("hi!");
        java.lang.String str11 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord13.spliterator();
        long long16 = cSVRecord13.getRecordNumber();
        int int17 = cSVRecord13.size();
        boolean boolean19 = cSVRecord13.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        long long17 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord16.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", (long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "", (long) '4');
        boolean boolean28 = cSVRecord26.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        boolean boolean22 = cSVRecord5.isSet("hi!");
        boolean boolean23 = cSVRecord5.isConsistent();
        boolean boolean24 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord5.iterator();
        java.lang.String[] strArray26 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray26, strMap31, "hi!", (long) (byte) 10);
        java.lang.String str35 = cSVRecord34.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = cSVRecord34.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        int int16 = cSVRecord15.size();
        java.lang.String str17 = cSVRecord15.getComment();
        java.lang.String str18 = cSVRecord15.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 0);
        long long5 = cSVRecord4.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord4.iterator();
        java.lang.String str7 = cSVRecord4.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String[] strArray10 = cSVRecord5.values();
        int int11 = cSVRecord5.size();
        java.lang.String str12 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        java.lang.String str9 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "[hi!, , hi!]", (long) 100);
        int int9 = cSVRecord8.size();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.Class<?> wildcardClass11 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) (short) 1);
        java.util.Iterator<java.lang.String> strItor32 = cSVRecord31.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor32);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.get((int) (short) 0);
        java.lang.String str13 = cSVRecord5.getComment();
        boolean boolean15 = cSVRecord5.isSet("");
        int int16 = cSVRecord5.size();
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "[hi!, , hi!]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray17, strMap30, "hi!", (long) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        boolean boolean6 = cSVRecord4.isConsistent();
        boolean boolean8 = cSVRecord4.isSet("hi!");
        boolean boolean10 = cSVRecord4.isMapped("hi!");
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 1L);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        boolean boolean10 = cSVRecord9.isConsistent();
        boolean boolean11 = cSVRecord9.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        int int17 = cSVRecord5.size();
        int int18 = cSVRecord5.size();
        boolean boolean20 = cSVRecord5.isMapped("hi!");
        boolean boolean22 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "hi!", (long) (short) 10);
        java.lang.String[] strArray28 = cSVRecord27.values();
        boolean boolean29 = cSVRecord27.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        boolean boolean14 = cSVRecord9.isMapped("");
        java.lang.String[] strArray15 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "hi!", (long) '4');
        java.lang.String str24 = cSVRecord23.toString();
        long long25 = cSVRecord23.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.get((int) (short) 0);
        java.lang.String str17 = cSVRecord5.get(0);
        int int18 = cSVRecord5.size();
        boolean boolean20 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord5.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[hi!, , hi!]", (long) (byte) 0);
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", 0L);
        boolean boolean15 = cSVRecord14.isConsistent();
        int int16 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.lang.String str13 = cSVRecord9.toString();
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        boolean boolean17 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (short) 100);
        boolean boolean29 = cSVRecord27.isSet("");
        long long30 = cSVRecord27.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator31 = cSVRecord27.spliterator();
        java.lang.String[] strArray32 = cSVRecord27.values();
        java.lang.String[] strArray33 = cSVRecord27.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = cSVRecord27.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, , hi!]", (long) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "hi!", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean12 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) (short) 0);
        boolean boolean20 = cSVRecord19.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord19.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        boolean boolean19 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord5.iterator();
        java.lang.String str22 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String[] strArray6 = cSVRecord4.values();
        long long7 = cSVRecord4.getRecordNumber();
        boolean boolean9 = cSVRecord4.isMapped("");
        long long10 = cSVRecord4.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        int int15 = cSVRecord9.size();
        int int16 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.String[] strArray15 = cSVRecord9.values();
        boolean boolean17 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String str14 = cSVRecord5.get((int) (byte) 0);
        boolean boolean16 = cSVRecord5.isSet("");
        boolean boolean17 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        long long15 = cSVRecord5.getRecordNumber();
        int int16 = cSVRecord5.size();
        java.lang.String str17 = cSVRecord5.getComment();
        java.lang.Class<?> wildcardClass18 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) 10);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray23, strMap32, "", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "hi!", (long) 100);
        java.util.Iterator<java.lang.String> strItor36 = cSVRecord35.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor36);
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        int int13 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.getComment();
        boolean boolean13 = cSVRecord5.isMapped("");
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        java.lang.String[] strArray16 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isMapped("hi!");
        java.lang.String str11 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        boolean boolean14 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean17 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        boolean boolean13 = cSVRecord5.isSet("");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean15 = cSVRecord10.isMapped("");
        long long16 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.getComment();
        java.lang.String str15 = cSVRecord5.getComment();
        long long16 = cSVRecord5.getRecordNumber();
        long long17 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        int int5 = cSVRecord4.size();
        java.lang.String str6 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isConsistent();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean13 = cSVRecord9.isMapped("hi!");
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        boolean boolean22 = cSVRecord5.isSet("hi!");
        boolean boolean23 = cSVRecord5.isConsistent();
        boolean boolean24 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord5.iterator();
        java.lang.String[] strArray26 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27, "", (long) (short) 1);
        java.lang.String str31 = cSVRecord30.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) 'a');
        java.lang.String str28 = cSVRecord27.toString();
        long long29 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        boolean boolean25 = cSVRecord10.isMapped("");
        java.lang.Class<?> wildcardClass26 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray1, strMap14, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray1, strMap18, "hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord21.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String str15 = cSVRecord13.get(0);
        java.lang.String str16 = cSVRecord13.toString();
        java.lang.String str17 = cSVRecord13.toString();
        java.lang.Class<?> wildcardClass18 = cSVRecord13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        boolean boolean16 = cSVRecord9.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isConsistent();
        boolean boolean16 = cSVRecord9.isSet("hi!");
        long long17 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass19 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        java.lang.String[] strArray17 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        int int20 = cSVRecord15.size();
        boolean boolean22 = cSVRecord15.isSet("[hi!, , hi!]");
        java.lang.String str23 = cSVRecord15.getComment();
        boolean boolean25 = cSVRecord15.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray15 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String str10 = cSVRecord9.toString();
        boolean boolean12 = cSVRecord9.isSet("");
        java.lang.String str13 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        int int15 = cSVRecord9.size();
        int int16 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "", (long) (short) 100);
        java.lang.String str14 = cSVRecord13.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", (long) (short) 0);
        boolean boolean16 = cSVRecord14.isMapped("");
        java.lang.String[] strArray17 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", (long) (short) -1);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.lang.String str24 = cSVRecord22.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.get(0);
        boolean boolean23 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        int int12 = cSVRecord5.size();
        java.lang.String str14 = cSVRecord5.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        boolean boolean12 = cSVRecord11.isConsistent();
        long long13 = cSVRecord11.getRecordNumber();
        int int14 = cSVRecord11.size();
        boolean boolean16 = cSVRecord11.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.String[] strArray15 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (long) (short) 0);
        boolean boolean21 = cSVRecord19.isSet("");
        java.lang.String str22 = cSVRecord19.getComment();
        boolean boolean23 = cSVRecord19.isConsistent();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord19.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        long long15 = cSVRecord9.getRecordNumber();
        int int16 = cSVRecord9.size();
        boolean boolean18 = cSVRecord9.isMapped("");
        java.lang.String str19 = cSVRecord9.getComment();
        int int20 = cSVRecord9.size();
        boolean boolean22 = cSVRecord9.isMapped("");
        boolean boolean23 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "hi!", (long) (byte) 10);
        boolean boolean29 = cSVRecord27.isSet("");
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord27.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = cSVRecord27.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strItor30);
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        boolean boolean9 = cSVRecord5.isMapped("");
        boolean boolean10 = cSVRecord5.isConsistent();
        int int11 = cSVRecord5.size();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String str13 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.toString();
        int int17 = cSVRecord10.size();
        long long18 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean12 = cSVRecord5.isConsistent();
        int int13 = cSVRecord5.size();
        java.lang.String str14 = cSVRecord5.getComment();
        int int15 = cSVRecord5.size();
        boolean boolean17 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.String str16 = cSVRecord9.get(0);
        boolean boolean18 = cSVRecord9.isMapped("");
        java.lang.String str19 = cSVRecord9.toString();
        boolean boolean21 = cSVRecord9.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord9.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.String str17 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get(0);
        boolean boolean9 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        boolean boolean12 = cSVRecord10.isMapped("");
        boolean boolean14 = cSVRecord10.isSet("hi!");
        java.lang.Class<?> wildcardClass15 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) 1);
        long long15 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord13.spliterator();
        boolean boolean18 = cSVRecord13.isMapped("hi!");
        boolean boolean20 = cSVRecord13.isMapped("hi!");
        java.lang.String[] strArray21 = cSVRecord13.values();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord13.spliterator();
        java.lang.String str23 = cSVRecord13.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "hi!", 10L);
        java.lang.String[] strArray27 = cSVRecord26.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (short) 100);
        boolean boolean29 = cSVRecord27.isSet("");
        long long30 = cSVRecord27.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator31 = cSVRecord27.spliterator();
        java.lang.String[] strArray32 = cSVRecord27.values();
        java.lang.String[] strArray33 = cSVRecord27.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap34 = null;
        org.apache.commons.csv.CSVRecord cSVRecord37 = new org.apache.commons.csv.CSVRecord(strArray33, strMap34, "", 0L);
        java.lang.String str38 = cSVRecord37.toString();
        java.lang.String[] strArray39 = cSVRecord37.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        int int8 = cSVRecord4.size();
        boolean boolean10 = cSVRecord4.isSet("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord15.iterator();
        java.lang.String str19 = cSVRecord15.getComment();
        java.lang.String str20 = cSVRecord15.toString();
        boolean boolean22 = cSVRecord15.isMapped("hi!");
        int int23 = cSVRecord15.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8589");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        int int20 = cSVRecord15.size();
        boolean boolean22 = cSVRecord15.isSet("[hi!, , hi!]");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord15.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8590");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("");
        boolean boolean15 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8591");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        boolean boolean13 = cSVRecord9.isConsistent();
        long long14 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8592");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8593");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isConsistent();
        long long14 = cSVRecord5.getRecordNumber();
        boolean boolean16 = cSVRecord5.isSet("");
        long long17 = cSVRecord5.getRecordNumber();
        boolean boolean19 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8594");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.String str13 = cSVRecord5.toString();
        boolean boolean15 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8595");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "", (long) (byte) 10);
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8596");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "hi!", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray8, strMap17, "hi!", (long) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8597");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String str15 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        boolean boolean18 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8598");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[hi!, , hi!]", (long) '4');
        boolean boolean6 = cSVRecord4.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8599");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        long long15 = cSVRecord5.getRecordNumber();
        boolean boolean17 = cSVRecord5.isSet("");
        boolean boolean19 = cSVRecord5.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
        boolean boolean22 = cSVRecord5.isMapped("");
        boolean boolean24 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8600");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8601");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        long long8 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "hi!", 1L);
        int int14 = cSVRecord13.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8602");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8603");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8604");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.String str19 = cSVRecord5.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8605");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("hi!");
        int int14 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        java.lang.String str16 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8606");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.lang.String str17 = cSVRecord5.getComment();
        long long18 = cSVRecord5.getRecordNumber();
        int int19 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8607");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        int int6 = cSVRecord4.size();
        java.lang.String[] strArray7 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "", (long) '#');
        long long12 = cSVRecord11.getRecordNumber();
        long long13 = cSVRecord11.getRecordNumber();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8608");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) 10);
        java.lang.String[] strArray17 = cSVRecord16.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord25.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8609");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        java.lang.String[] strArray16 = cSVRecord9.values();
        long long17 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        java.lang.String[] strArray19 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, , hi!]", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8610");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8611");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "[hi!, , hi!]", (long) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8612");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        boolean boolean18 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8613");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord15.iterator();
        java.lang.String str19 = cSVRecord15.getComment();
        java.lang.String str20 = cSVRecord15.toString();
        boolean boolean22 = cSVRecord15.isMapped("hi!");
        boolean boolean24 = cSVRecord15.isSet("[hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord15.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8614");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (short) 100);
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord17.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8615");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.get((int) (short) 0);
        java.lang.String str13 = cSVRecord5.getComment();
        java.lang.String str14 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8616");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        long long15 = cSVRecord14.getRecordNumber();
        boolean boolean16 = cSVRecord14.isConsistent();
        java.lang.String str17 = cSVRecord14.getComment();
        java.lang.String[] strArray18 = cSVRecord14.values();
        java.lang.String str19 = cSVRecord14.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord14.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8617");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean13 = cSVRecord9.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8618");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (-1L));
        int int9 = cSVRecord8.size();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", 0L);
        int int15 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8619");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("");
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean15 = cSVRecord5.isMapped("");
        long long16 = cSVRecord5.getRecordNumber();
        long long17 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass19 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8620");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8621");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        long long17 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord16.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord16.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord16.spliterator();
        java.lang.String[] strArray21 = cSVRecord16.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) '4');
        java.lang.String str26 = cSVRecord25.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8622");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        int int12 = cSVRecord5.size();
        long long13 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8623");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        boolean boolean22 = cSVRecord5.isSet("hi!");
        boolean boolean23 = cSVRecord5.isConsistent();
        boolean boolean24 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord5.iterator();
        java.lang.String[] strArray26 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8624");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) 10);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord22.iterator();
        boolean boolean25 = cSVRecord22.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8625");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        long long11 = cSVRecord10.getRecordNumber();
        boolean boolean13 = cSVRecord10.isSet("[hi!, , hi!]");
        int int14 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8626");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.lang.String[] strArray15 = cSVRecord9.values();
        java.lang.String str16 = cSVRecord9.toString();
        boolean boolean18 = cSVRecord9.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord9.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8627");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        int int11 = cSVRecord9.size();
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        boolean boolean14 = cSVRecord9.isConsistent();
        int int15 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isMapped("");
        boolean boolean19 = cSVRecord9.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord9.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8628");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (short) 100);
        boolean boolean29 = cSVRecord27.isSet("");
        long long30 = cSVRecord27.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator31 = cSVRecord27.spliterator();
        java.lang.String[] strArray32 = cSVRecord27.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray32, strMap33, "hi!", (long) ' ');
        java.lang.String[] strArray37 = cSVRecord36.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8629");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isConsistent();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "hi!", (long) (short) -1);
        boolean boolean20 = cSVRecord18.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8630");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) (short) -1);
        boolean boolean6 = cSVRecord4.isSet("hi!");
        boolean boolean8 = cSVRecord4.isMapped("");
        java.lang.Class<?> wildcardClass9 = cSVRecord4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8631");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass17 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8632");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass18 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8633");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        long long14 = cSVRecord5.getRecordNumber();
        boolean boolean16 = cSVRecord5.isSet("");
        boolean boolean18 = cSVRecord5.isSet("");
        boolean boolean19 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8634");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String str18 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test8635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8635");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        int int15 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.String str19 = cSVRecord5.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8636");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "hi!", 10L);
        boolean boolean28 = cSVRecord26.isMapped("");
        long long29 = cSVRecord26.getRecordNumber();
        boolean boolean30 = cSVRecord26.isConsistent();
        boolean boolean31 = cSVRecord26.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test8637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8637");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray0, strMap9, "", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray0, strMap13, "", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test8638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8638");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        int int8 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test8639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8639");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.lang.String str12 = cSVRecord9.getComment();
        java.lang.String str13 = cSVRecord9.toString();
        java.lang.String str14 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        long long16 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray17 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8640");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test8641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8641");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "", (long) (short) 1);
        boolean boolean26 = cSVRecord24.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8642");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean13 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8643");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "hi!", (long) 0);
        boolean boolean27 = cSVRecord25.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord25.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test8644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8644");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        int int9 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        int int11 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test8645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8645");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord13.spliterator();
        boolean boolean18 = cSVRecord13.isMapped("hi!");
        java.lang.String str19 = cSVRecord13.toString();
        boolean boolean20 = cSVRecord13.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord13.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test8646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8646");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        java.lang.String str16 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test8647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8647");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("");
        int int14 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8648");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String str16 = cSVRecord9.toString();
        java.lang.String[] strArray17 = cSVRecord9.values();
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord9.iterator();
        long long20 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test8649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8649");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8650");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.lang.String str8 = cSVRecord5.toString();
        long long9 = cSVRecord5.getRecordNumber();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8651");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        int int15 = cSVRecord9.size();
        boolean boolean16 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord9.iterator();
        int int18 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8652");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "hi!", 0L);
        boolean boolean19 = cSVRecord18.isConsistent();
        long long20 = cSVRecord18.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test8653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8653");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        boolean boolean15 = cSVRecord10.isMapped("");
        boolean boolean17 = cSVRecord10.isSet("hi!");
        boolean boolean19 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test8654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8654");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isSet("");
        boolean boolean24 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8655");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean14 = cSVRecord9.isMapped("");
        java.lang.String str15 = cSVRecord9.toString();
        java.lang.String[] strArray16 = cSVRecord9.values();
        long long17 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        boolean boolean19 = cSVRecord9.isConsistent();
        boolean boolean21 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8656");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        long long17 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord16.values();
        boolean boolean20 = cSVRecord16.isMapped("hi!");
        java.lang.String str21 = cSVRecord16.getComment();
        boolean boolean23 = cSVRecord16.isMapped("");
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord16.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord16.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test8657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8657");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        long long17 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord16.values();
        boolean boolean20 = cSVRecord16.isSet("");
        int int21 = cSVRecord16.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord16.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test8658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8658");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "", (long) 100);
        java.lang.String str36 = cSVRecord35.getComment();
        boolean boolean38 = cSVRecord35.isMapped("");
        java.lang.String str40 = cSVRecord35.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test8659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8659");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isSet("");
        int int9 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test8660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8660");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean15 = cSVRecord5.isSet("");
        boolean boolean16 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8661");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        boolean boolean18 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
        boolean boolean20 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test8662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8662");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        boolean boolean13 = cSVRecord11.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord11.iterator();
        java.lang.String str15 = cSVRecord11.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8663");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String str22 = cSVRecord10.get((int) (short) 0);
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String str24 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test8664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8664");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        int int10 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test8665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8665");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isConsistent();
        boolean boolean16 = cSVRecord9.isSet("hi!");
        java.lang.String str17 = cSVRecord9.toString();
        boolean boolean18 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        long long20 = cSVRecord9.getRecordNumber();
        boolean boolean21 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test8666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8666");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.lang.String[] strArray11 = cSVRecord5.values();
        int int12 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        int int14 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8667");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (long) '4');
        java.lang.String str9 = cSVRecord8.toString();
        boolean boolean10 = cSVRecord8.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord8.iterator();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test8668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8668");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", 10L);
        java.lang.String str19 = cSVRecord18.getComment();
        java.lang.String[] strArray20 = cSVRecord18.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test8669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8669");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("");
        java.lang.String str14 = cSVRecord5.getComment();
        boolean boolean16 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8670");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) 10);
        java.lang.String str19 = cSVRecord17.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8671");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean14 = cSVRecord9.isMapped("");
        java.lang.String str15 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord9.iterator();
        boolean boolean17 = cSVRecord9.isConsistent();
        java.lang.String str18 = cSVRecord9.toString();
        boolean boolean20 = cSVRecord9.isMapped("[hi!, , hi!]");
        java.lang.String str21 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test8672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8672");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String str6 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isConsistent();
        long long8 = cSVRecord4.getRecordNumber();
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test8673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8673");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.lang.String str8 = cSVRecord5.getComment();
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String str10 = cSVRecord5.getComment();
        boolean boolean11 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test8674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8674");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", 1L);
        boolean boolean33 = cSVRecord31.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test8675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8675");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.toString();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8676");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String[] strArray9 = cSVRecord5.values();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.lang.String str12 = cSVRecord5.toString();
        long long13 = cSVRecord5.getRecordNumber();
        java.lang.String str14 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8677");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        long long21 = cSVRecord5.getRecordNumber();
        int int22 = cSVRecord5.size();
        boolean boolean23 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test8678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8678");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("");
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "hi!", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray14, strMap27, "", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test8679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8679");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "hi!", 0L);
        boolean boolean19 = cSVRecord18.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord18.spliterator();
        long long21 = cSVRecord18.getRecordNumber();
        int int22 = cSVRecord18.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8680");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isSet("[hi!, , hi!]");
        java.lang.Class<?> wildcardClass14 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8681");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        int int17 = cSVRecord5.size();
        int int18 = cSVRecord5.size();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord5.spliterator();
        int int21 = cSVRecord5.size();
        int int22 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8682");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.lang.String[] strArray9 = cSVRecord5.values();
        long long10 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test8683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8683");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        java.lang.String[] strArray21 = cSVRecord5.values();
        java.lang.String[] strArray22 = cSVRecord5.values();
        boolean boolean24 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8684");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) 'a');
        boolean boolean28 = cSVRecord27.isConsistent();
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord27.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strItor29);
    }

    @Test
    public void test8685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8685");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isSet("");
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String str10 = cSVRecord5.getComment();
        long long11 = cSVRecord5.getRecordNumber();
        int int12 = cSVRecord5.size();
        boolean boolean13 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test8686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8686");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        java.lang.String str11 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test8687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8687");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", 10L);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        java.lang.String str23 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8688");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean17 = cSVRecord5.isSet("");
        java.lang.String[] strArray18 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8689");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        int int13 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8690");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) 'a');
        boolean boolean13 = cSVRecord11.isSet("");
        java.lang.String str14 = cSVRecord11.toString();
        long long15 = cSVRecord11.getRecordNumber();
        boolean boolean16 = cSVRecord11.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8691");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String[] strArray13 = cSVRecord5.values();
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String str15 = cSVRecord5.toString();
        java.lang.String str17 = cSVRecord5.get(0);
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        int int19 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8692");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        boolean boolean12 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8693");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        java.lang.String[] strArray20 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "", 10L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test8694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8694");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) '#');
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord17.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord17.iterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord17.iterator();
        boolean boolean22 = cSVRecord17.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8695");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) '4');
        java.util.Spliterator<java.lang.String> strSpliterator32 = cSVRecord31.spliterator();
        java.lang.String str33 = cSVRecord31.toString();
        boolean boolean35 = cSVRecord31.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSpliterator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test8696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8696");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "[hi!, , hi!]", (long) (-1));
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord26.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator27);
    }

    @Test
    public void test8697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8697");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        long long14 = cSVRecord5.getRecordNumber();
        boolean boolean16 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8698");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) 1);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord14.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test8699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8699");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        long long12 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test8700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8700");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "[hi!, , hi!]", (long) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test8701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8701");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.toString();
        boolean boolean14 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8702");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.lang.String[] strArray18 = cSVRecord15.values();
        int int19 = cSVRecord15.size();
        long long20 = cSVRecord15.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord15.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test8703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8703");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        long long14 = cSVRecord5.getRecordNumber();
        boolean boolean16 = cSVRecord5.isSet("");
        java.lang.String str18 = cSVRecord5.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test8704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8704");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        long long7 = cSVRecord5.getRecordNumber();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test8705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8705");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        java.lang.String str13 = cSVRecord5.getComment();
        java.lang.String str14 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8706");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test8707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8707");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        int int13 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8708");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test8709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8709");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String str6 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isConsistent();
        boolean boolean9 = cSVRecord4.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test8710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8710");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        java.lang.String str8 = cSVRecord4.getComment();
        java.lang.String str9 = cSVRecord4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test8711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8711");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", 10L);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        java.lang.Class<?> wildcardClass20 = strItor19.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8712");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        long long15 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test8713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8713");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.get(0);
        java.lang.String str22 = cSVRecord10.toString();
        long long23 = cSVRecord10.getRecordNumber();
        java.lang.String str24 = cSVRecord10.toString();
        boolean boolean26 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8714");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.lang.String str14 = cSVRecord9.toString();
        java.lang.String str15 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord9.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord9.iterator();
        boolean boolean18 = cSVRecord9.isConsistent();
        boolean boolean19 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8715");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.lang.String[] strArray15 = cSVRecord14.values();
        boolean boolean17 = cSVRecord14.isSet("hi!");
        java.lang.String[] strArray18 = cSVRecord14.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord14.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test8716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8716");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.lang.String str12 = cSVRecord9.getComment();
        java.lang.String str13 = cSVRecord9.toString();
        java.lang.String str14 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        long long16 = cSVRecord9.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        boolean boolean19 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8717");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean15 = cSVRecord5.isMapped("");
        java.lang.String str16 = cSVRecord5.toString();
        java.lang.String str17 = cSVRecord5.getComment();
        java.lang.String str19 = cSVRecord5.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8718");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        int int15 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        boolean boolean18 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        boolean boolean20 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test8719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8719");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "", (long) (byte) 10);
        boolean boolean27 = cSVRecord25.isSet("");
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord25.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator29 = cSVRecord25.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strSpliterator29);
    }

    @Test
    public void test8720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8720");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", 0L);
        java.lang.String str17 = cSVRecord16.getComment();
        int int18 = cSVRecord16.size();
        java.lang.Class<?> wildcardClass19 = cSVRecord16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8721");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        int int11 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.lang.String str16 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test8722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8722");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        long long12 = cSVRecord9.getRecordNumber();
        long long13 = cSVRecord9.getRecordNumber();
        boolean boolean15 = cSVRecord9.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8723");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) 0);
        java.lang.String str19 = cSVRecord18.toString();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord18.spliterator();
        long long21 = cSVRecord18.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test8724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8724");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        boolean boolean15 = cSVRecord5.isConsistent();
        boolean boolean17 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8725");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.lang.String[] strArray15 = cSVRecord9.values();
        int int16 = cSVRecord9.size();
        boolean boolean18 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8726");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) 10);
        java.lang.String[] strArray17 = cSVRecord16.values();
        boolean boolean19 = cSVRecord16.isSet("");
        java.lang.String str20 = cSVRecord16.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8727");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) (byte) 100);
        int int22 = cSVRecord21.size();
        boolean boolean24 = cSVRecord21.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8728");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        int int11 = cSVRecord9.size();
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        boolean boolean14 = cSVRecord9.isConsistent();
        int int15 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord9.iterator();
        long long17 = cSVRecord9.getRecordNumber();
        boolean boolean19 = cSVRecord9.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8729");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "", (long) (short) 10);
        boolean boolean26 = cSVRecord25.isConsistent();
        java.lang.String[] strArray27 = cSVRecord25.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test8730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8730");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", 0L);
        java.lang.String str17 = cSVRecord16.getComment();
        java.lang.String str18 = cSVRecord16.getComment();
        int int19 = cSVRecord16.size();
        long long20 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord16.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test8731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8731");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test8732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8732");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        int int17 = cSVRecord5.size();
        java.lang.String[] strArray18 = cSVRecord5.values();
        long long19 = cSVRecord5.getRecordNumber();
        long long20 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test8733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8733");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        java.lang.String str9 = cSVRecord4.getComment();
        int int10 = cSVRecord4.size();
        long long11 = cSVRecord4.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test8734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8734");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) (byte) -1);
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord18.spliterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord18.iterator();
        int int21 = cSVRecord18.size();
        java.lang.String str22 = cSVRecord18.toString();
        int int23 = cSVRecord18.size();
        boolean boolean24 = cSVRecord18.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test8735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8735");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) (-1));
        java.lang.String str24 = cSVRecord23.toString();
        boolean boolean25 = cSVRecord23.isConsistent();
        java.lang.String str26 = cSVRecord23.getComment();
        int int27 = cSVRecord23.size();
        java.lang.String str28 = cSVRecord23.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
    }

    @Test
    public void test8736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8736");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        int int19 = cSVRecord9.size();
        long long20 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) (short) -1);
        int int26 = cSVRecord25.size();
        java.lang.String str27 = cSVRecord25.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test8737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8737");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "hi!", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray12, strMap25, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray12, strMap29, "[hi!, , hi!]", 0L);
        java.lang.Class<?> wildcardClass33 = cSVRecord32.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test8738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8738");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        boolean boolean19 = cSVRecord5.isSet("hi!");
        long long20 = cSVRecord5.getRecordNumber();
        java.lang.String str21 = cSVRecord5.toString();
        java.lang.String str22 = cSVRecord5.toString();
        java.lang.String[] strArray23 = cSVRecord5.values();
        java.lang.String str24 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord5.iterator();
        boolean boolean26 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test8739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8739");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        java.lang.String str15 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test8740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8740");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", 10L);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        java.lang.String str20 = cSVRecord18.getComment();
        java.lang.String[] strArray21 = cSVRecord18.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test8741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8741");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.lang.String str10 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test8742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8742");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        int int19 = cSVRecord9.size();
        long long20 = cSVRecord9.getRecordNumber();
        java.lang.String str21 = cSVRecord9.getComment();
        int int22 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord9.iterator();
        long long24 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test8743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8743");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        long long13 = cSVRecord5.getRecordNumber();
        int int14 = cSVRecord5.size();
        long long15 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.lang.String str17 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord5.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test8744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8744");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean11 = cSVRecord5.isConsistent();
        int int12 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass14 = strItor13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8745");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.get((int) (byte) 0);
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (byte) 100);
        java.lang.Class<?> wildcardClass18 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8746");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray10, strMap19, "", 0L);
        boolean boolean24 = cSVRecord22.isMapped("[hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord22.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8747");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        long long15 = cSVRecord5.getRecordNumber();
        java.lang.String str17 = cSVRecord5.get(0);
        int int18 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8748");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) 10);
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", (long) (short) 0);
        boolean boolean33 = cSVRecord31.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test8749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8749");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        long long17 = cSVRecord16.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord16.values();
        boolean boolean20 = cSVRecord16.isMapped("hi!");
        java.lang.String str21 = cSVRecord16.getComment();
        long long22 = cSVRecord16.getRecordNumber();
        java.lang.String str23 = cSVRecord16.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test8750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8750");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        boolean boolean18 = cSVRecord5.isConsistent();
        boolean boolean20 = cSVRecord5.isSet("hi!");
        int int21 = cSVRecord5.size();
        java.lang.String[] strArray22 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test8751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8751");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.get((int) (short) 0);
        java.lang.String str17 = cSVRecord5.get(0);
        int int18 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8752");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        int int12 = cSVRecord5.size();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (byte) -1);
        boolean boolean18 = cSVRecord17.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8753");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        long long15 = cSVRecord5.getRecordNumber();
        boolean boolean17 = cSVRecord5.isSet("");
        boolean boolean19 = cSVRecord5.isMapped("hi!");
        long long20 = cSVRecord5.getRecordNumber();
        boolean boolean22 = cSVRecord5.isSet("hi!");
        java.lang.String str23 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8754");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "hi!", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray12, strMap25, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray12, strMap29, "[hi!, , hi!]", 0L);
        java.lang.String str33 = cSVRecord32.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
    }

    @Test
    public void test8755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8755");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        boolean boolean6 = cSVRecord5.isConsistent();
        long long7 = cSVRecord5.getRecordNumber();
        java.lang.String str8 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test8756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8756");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean14 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8757");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isConsistent();
        boolean boolean17 = cSVRecord5.isConsistent();
        java.lang.String str19 = cSVRecord5.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord5.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8758");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass19 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8759");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        boolean boolean13 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test8760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8760");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        int int14 = cSVRecord5.size();
        boolean boolean16 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8761");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.get((int) (byte) 0);
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (byte) 100);
        int int18 = cSVRecord17.size();
        int int19 = cSVRecord17.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8762");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        int int12 = cSVRecord5.size();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (byte) -1);
        boolean boolean19 = cSVRecord17.isSet("hi!");
        java.lang.String str20 = cSVRecord17.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test8763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8763");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.toString();
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass18 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8764");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.getComment();
        java.lang.String str12 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8765");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord14.iterator();
        java.lang.String str16 = cSVRecord14.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test8766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8766");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.lang.String str18 = cSVRecord5.get((int) (byte) 0);
        boolean boolean19 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8767");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        int int11 = cSVRecord9.size();
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isSet("hi!");
        int int15 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isSet("");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        boolean boolean20 = cSVRecord9.isMapped("");
        boolean boolean22 = cSVRecord9.isSet("");
        java.lang.String[] strArray23 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test8768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8768");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        long long6 = cSVRecord5.getRecordNumber();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.get((int) (byte) 0);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test8769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8769");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        boolean boolean16 = cSVRecord13.isSet("hi!");
        int int17 = cSVRecord13.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test8770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8770");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "hi!", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "", (long) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test8771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8771");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8772");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) 10);
        java.lang.String[] strArray17 = cSVRecord16.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", 0L);
        boolean boolean23 = cSVRecord21.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8773");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        boolean boolean22 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord5.iterator();
        boolean boolean27 = cSVRecord5.isSet("hi!");
        boolean boolean29 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8774");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String str15 = cSVRecord5.getComment();
        java.lang.String[] strArray16 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8775");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.String str15 = cSVRecord9.getComment();
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.lang.String str17 = cSVRecord9.toString();
        boolean boolean19 = cSVRecord9.isMapped("");
        boolean boolean21 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8776");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.lang.String str16 = cSVRecord5.get(0);
        java.lang.String[] strArray17 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8777");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord4.iterator();
        long long10 = cSVRecord4.getRecordNumber();
        int int11 = cSVRecord4.size();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test8778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8778");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        int int19 = cSVRecord9.size();
        long long20 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray21 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) (short) -1);
        int int26 = cSVRecord25.size();
        boolean boolean28 = cSVRecord25.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8779");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.String[] strArray15 = cSVRecord9.values();
        java.lang.String str16 = cSVRecord9.toString();
        boolean boolean17 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test8780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8780");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        boolean boolean16 = cSVRecord9.isSet("");
        boolean boolean18 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8781");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        long long6 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator7 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator7);
    }

    @Test
    public void test8782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8782");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 'a');
        boolean boolean6 = cSVRecord4.isSet("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test8783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8783");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.toString();
        java.lang.String str13 = cSVRecord5.getComment();
        java.lang.String str14 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass16 = strItor15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8784");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        long long15 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test8785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8785");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.lang.String str14 = cSVRecord5.toString();
        long long15 = cSVRecord5.getRecordNumber();
        boolean boolean17 = cSVRecord5.isMapped("");
        java.lang.String str18 = cSVRecord5.toString();
        java.lang.String[] strArray19 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test8786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8786");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray0, strMap9, "hi!", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord12.spliterator();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test8787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8787");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.get((int) (short) 0);
        java.lang.String str13 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        long long15 = cSVRecord5.getRecordNumber();
        boolean boolean17 = cSVRecord5.isMapped("hi!");
        java.lang.String str19 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord5.spliterator();
        int int21 = cSVRecord5.size();
        java.lang.String str22 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test8788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8788");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        java.lang.String[] strArray20 = cSVRecord5.values();
        boolean boolean22 = cSVRecord5.isMapped("hi!");
        boolean boolean24 = cSVRecord5.isMapped("hi!");
        long long25 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test8789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8789");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String str15 = cSVRecord5.getComment();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        boolean boolean18 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8790");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord4.iterator();
        java.lang.String[] strArray10 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "hi!", 100L);
        boolean boolean20 = cSVRecord18.isSet("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8791");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        long long13 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.lang.String str15 = cSVRecord5.getComment();
        java.lang.String str16 = cSVRecord5.toString();
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test8792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8792");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) -1);
        boolean boolean18 = cSVRecord17.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord17.spliterator();
        boolean boolean21 = cSVRecord17.isSet("[hi!, , hi!]");
        java.lang.String str22 = cSVRecord17.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test8793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8793");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        long long10 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass12 = strSpliterator11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8794");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.toString();
        java.lang.String str13 = cSVRecord5.getComment();
        int int14 = cSVRecord5.size();
        java.lang.String str15 = cSVRecord5.getComment();
        boolean boolean17 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8795");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray23, strMap32, "", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray23, strMap36, "[hi!, , hi!]", 10L);
        java.lang.String str40 = cSVRecord39.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
    }

    @Test
    public void test8796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8796");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", 100L);
        java.lang.String str25 = cSVRecord23.get(0);
        java.lang.String str26 = cSVRecord23.getComment();
        long long27 = cSVRecord23.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord23.spliterator();
        int int29 = cSVRecord23.size();
        java.lang.Class<?> wildcardClass30 = cSVRecord23.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8797");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (long) '4');
        java.lang.String str9 = cSVRecord8.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord8.spliterator();
        java.lang.String[] strArray11 = cSVRecord8.values();
        java.lang.String[] strArray12 = cSVRecord8.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", 10L);
        java.lang.String str17 = cSVRecord16.toString();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test8798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8798");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.lang.String[] strArray24 = cSVRecord23.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord23.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test8799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8799");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord13.spliterator();
        java.lang.String str17 = cSVRecord13.getComment();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord13.iterator();
        long long19 = cSVRecord13.getRecordNumber();
        java.lang.String str21 = cSVRecord13.get(0);
        java.lang.Class<?> wildcardClass22 = cSVRecord13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8800");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        int int11 = cSVRecord5.size();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", (long) (short) 10);
        java.lang.String[] strArray17 = cSVRecord16.values();
        int int18 = cSVRecord16.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8801");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 100L);
        java.lang.String[] strArray5 = cSVRecord4.values();
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test8802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8802");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("");
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String[] strArray14 = cSVRecord5.values();
        boolean boolean16 = cSVRecord5.isSet("");
        long long17 = cSVRecord5.getRecordNumber();
        int int18 = cSVRecord5.size();
        boolean boolean19 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8803");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        boolean boolean16 = cSVRecord9.isMapped("");
        boolean boolean18 = cSVRecord9.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8804");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isMapped("");
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String[] strArray14 = cSVRecord5.values();
        int int15 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test8805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8805");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        long long13 = cSVRecord5.getRecordNumber();
        int int14 = cSVRecord5.size();
        long long15 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord5.values();
        boolean boolean17 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test8806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8806");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        long long17 = cSVRecord5.getRecordNumber();
        long long18 = cSVRecord5.getRecordNumber();
        int int19 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8807");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", 100L);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        java.lang.String[] strArray23 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[hi!, , hi!]", (long) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test8808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8808");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String str11 = cSVRecord5.getComment();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8809");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) ' ');
        long long28 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
    }

    @Test
    public void test8810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8810");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("");
        boolean boolean18 = cSVRecord5.isMapped("hi!");
        boolean boolean20 = cSVRecord5.isSet("");
        java.lang.String str21 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8811");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.lang.String[] strArray15 = cSVRecord14.values();
        boolean boolean17 = cSVRecord14.isSet("hi!");
        java.lang.String[] strArray18 = cSVRecord14.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord14.iterator();
        java.lang.String str20 = cSVRecord14.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test8812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8812");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        long long11 = cSVRecord5.getRecordNumber();
        int int12 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8813");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        boolean boolean9 = cSVRecord4.isMapped("hi!");
        boolean boolean11 = cSVRecord4.isSet("hi!");
        java.lang.String[] strArray12 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test8814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8814");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray10, strMap19, "hi!", 0L);
        java.lang.String str23 = cSVRecord22.toString();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test8815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8815");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String[] strArray15 = cSVRecord5.values();
        boolean boolean17 = cSVRecord5.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        long long19 = cSVRecord5.getRecordNumber();
        boolean boolean21 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8816");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isSet("");
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        boolean boolean15 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8817");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        java.lang.String str15 = cSVRecord5.get(0);
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.lang.String str17 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8818");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord17.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord17.spliterator();
        boolean boolean21 = cSVRecord17.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8819");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        boolean boolean11 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test8820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8820");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord10.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test8821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8821");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String[] strArray10 = cSVRecord5.values();
        int int11 = cSVRecord5.size();
        long long12 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        java.lang.String str14 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test8822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8822");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.get((int) (short) 0);
        java.lang.String str13 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        boolean boolean16 = cSVRecord5.isMapped("");
        boolean boolean18 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8823");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "[hi!, , hi!]", (long) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test8824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8824");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.get(0);
        boolean boolean16 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8825");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        int int15 = cSVRecord5.size();
        boolean boolean16 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        long long18 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test8826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8826");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "", (long) '4');
        long long19 = cSVRecord18.getRecordNumber();
        boolean boolean21 = cSVRecord18.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8827");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isSet("");
        long long13 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord5.values();
        long long15 = cSVRecord5.getRecordNumber();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        boolean boolean19 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8828");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8829");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        boolean boolean19 = cSVRecord5.isMapped("");
        java.lang.String str20 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8830");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        int int16 = cSVRecord9.size();
        java.lang.String str17 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8831");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        boolean boolean19 = cSVRecord5.isSet("hi!");
        java.lang.String str20 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test8832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8832");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test8833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8833");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "", (long) 100);
        boolean boolean37 = cSVRecord35.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test8834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8834");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        boolean boolean12 = cSVRecord10.isMapped("");
        java.lang.String[] strArray13 = cSVRecord10.values();
        long long14 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test8835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8835");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean14 = cSVRecord5.isMapped("");
        java.lang.String str15 = cSVRecord5.toString();
        long long16 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray17 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8836");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (short) 0);
        java.lang.String str12 = cSVRecord11.getComment();
        java.lang.String[] strArray13 = cSVRecord11.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8837");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) (-1));
        java.lang.String str25 = cSVRecord23.get(0);
        java.lang.String str26 = cSVRecord23.toString();
        java.lang.String[] strArray27 = cSVRecord23.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test8838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8838");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        int int12 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        boolean boolean15 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8839");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        long long18 = cSVRecord5.getRecordNumber();
        boolean boolean20 = cSVRecord5.isMapped("");
        boolean boolean22 = cSVRecord5.isSet("hi!");
        boolean boolean24 = cSVRecord5.isMapped("hi!");
        int int25 = cSVRecord5.size();
        java.lang.String str26 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test8840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8840");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String[] strArray13 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8841");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.get((int) (short) 0);
        boolean boolean17 = cSVRecord5.isMapped("");
        boolean boolean19 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray20 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord5.spliterator();
        boolean boolean23 = cSVRecord5.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8842");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        boolean boolean16 = cSVRecord5.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8843");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String str14 = cSVRecord5.get((int) (byte) 0);
        java.lang.String str15 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test8844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8844");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", (long) (byte) 100);
        boolean boolean17 = cSVRecord15.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8845");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.lang.String str24 = cSVRecord23.toString();
        java.lang.String str26 = cSVRecord23.get((int) (short) 0);
        java.lang.String[] strArray27 = cSVRecord23.values();
        boolean boolean29 = cSVRecord23.isSet("[hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord23.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8846");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", (long) 100);
        java.lang.String str28 = cSVRecord27.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8847");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.lang.String str17 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test8848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8848");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isSet("hi!");
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test8849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8849");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", (long) (short) -1);
        long long32 = cSVRecord31.getRecordNumber();
        boolean boolean34 = cSVRecord31.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = cSVRecord31.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test8850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8850");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord4.spliterator();
        long long7 = cSVRecord4.getRecordNumber();
        boolean boolean8 = cSVRecord4.isConsistent();
        java.lang.String[] strArray9 = cSVRecord4.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord4.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test8851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8851");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.getComment();
        java.lang.String str13 = cSVRecord5.toString();
        boolean boolean15 = cSVRecord5.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8852");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) (byte) 10);
        java.lang.String str20 = cSVRecord19.toString();
        int int21 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test8853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8853");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        boolean boolean20 = cSVRecord9.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8854");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        int int20 = cSVRecord10.size();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray21, strMap26, "[hi!, , hi!]", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray21, strMap30, "[hi!, , hi!]", (long) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test8855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8855");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isConsistent();
        boolean boolean17 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test8856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8856");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (-1L));
        int int9 = cSVRecord8.size();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test8857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8857");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) ' ');
        java.lang.String str28 = cSVRecord27.toString();
        boolean boolean30 = cSVRecord27.isSet("");
        java.lang.String str31 = cSVRecord27.toString();
        long long32 = cSVRecord27.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = cSVRecord27.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
    }

    @Test
    public void test8858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8858");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "hi!", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray11, strMap36, "hi!", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray11, strMap40, "", (long) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test8859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8859");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test8860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8860");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) 100);
        java.lang.String str5 = cSVRecord4.toString();
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord4.spliterator();
        java.lang.String str7 = cSVRecord4.toString();
        java.lang.String str8 = cSVRecord4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord4.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test8861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8861");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String str15 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test8862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8862");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.lang.String str14 = cSVRecord9.get(0);
        java.lang.String[] strArray15 = cSVRecord9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test8863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8863");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        long long13 = cSVRecord9.getRecordNumber();
        java.lang.String str14 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test8864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8864");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8865");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("");
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8866");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean11 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isSet("");
        java.lang.String str14 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.lang.String[] strArray16 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8867");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("");
        int int14 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8868");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) (short) 1);
        long long23 = cSVRecord22.getRecordNumber();
        int int24 = cSVRecord22.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test8869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8869");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord15.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord15.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test8870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8870");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        int int14 = cSVRecord9.size();
        java.lang.String str15 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test8871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8871");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean11 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isConsistent();
        long long17 = cSVRecord5.getRecordNumber();
        int int18 = cSVRecord5.size();
        long long19 = cSVRecord5.getRecordNumber();
        java.lang.String str20 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8872");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isConsistent();
        long long14 = cSVRecord5.getRecordNumber();
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test8873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8873");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isSet("");
        long long13 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test8874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8874");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) -1);
        long long18 = cSVRecord17.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord17.iterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord17.iterator();
        long long21 = cSVRecord17.getRecordNumber();
        java.lang.String[] strArray22 = cSVRecord17.values();
        java.lang.String[] strArray23 = cSVRecord17.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test8875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8875");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isMapped("hi!");
        java.lang.String str12 = cSVRecord9.getComment();
        java.lang.String[] strArray13 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8876");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", 100L);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        java.lang.String[] strArray23 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test8877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8877");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) (-1));
        java.lang.String str24 = cSVRecord23.toString();
        boolean boolean25 = cSVRecord23.isConsistent();
        boolean boolean27 = cSVRecord23.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test8878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8878");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.String[] strArray15 = cSVRecord5.values();
        boolean boolean17 = cSVRecord5.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        java.lang.String str19 = cSVRecord5.getComment();
        long long20 = cSVRecord5.getRecordNumber();
        boolean boolean21 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test8879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8879");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 1L);
        long long11 = cSVRecord10.getRecordNumber();
        int int12 = cSVRecord10.size();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.toString();
        int int15 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test8880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8880");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        int int13 = cSVRecord9.size();
        java.lang.String str14 = cSVRecord9.getComment();
        java.lang.String[] strArray15 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test8881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8881");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        int int12 = cSVRecord10.size();
        boolean boolean14 = cSVRecord10.isMapped("hi!");
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.Class<?> wildcardClass16 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8882");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.get((int) (short) 0);
        boolean boolean17 = cSVRecord5.isMapped("");
        boolean boolean19 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass21 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8883");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.lang.String str8 = cSVRecord5.getComment();
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String[] strArray11 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test8884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8884");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        boolean boolean6 = cSVRecord5.isConsistent();
        long long7 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator8);
    }

    @Test
    public void test8885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8885");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String[] strArray10 = cSVRecord5.values();
        int int11 = cSVRecord5.size();
        java.lang.String str12 = cSVRecord5.getComment();
        int int13 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8886");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String str16 = cSVRecord9.toString();
        java.lang.String str17 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord9.spliterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test8887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8887");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray10, strMap19, "hi!", 0L);
        int int23 = cSVRecord22.size();
        boolean boolean25 = cSVRecord22.isMapped("hi!");
        long long26 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test8888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8888");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        boolean boolean24 = cSVRecord10.isSet("");
        java.lang.String[] strArray25 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test8889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8889");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray12, strMap21, "hi!", (long) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test8890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8890");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        java.lang.String[] strArray16 = cSVRecord9.values();
        long long17 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        java.lang.String[] strArray19 = cSVRecord9.values();
        java.lang.String[] strArray20 = cSVRecord9.values();
        int int21 = cSVRecord9.size();
        java.lang.String str22 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test8891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8891");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        int int11 = cSVRecord9.size();
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        boolean boolean14 = cSVRecord9.isConsistent();
        int int15 = cSVRecord9.size();
        java.lang.String str16 = cSVRecord9.toString();
        boolean boolean17 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test8892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8892");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        boolean boolean14 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8893");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 0);
        long long5 = cSVRecord4.getRecordNumber();
        java.lang.String str6 = cSVRecord4.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test8894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8894");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String str13 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8895");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) (-1));
        int int10 = cSVRecord9.size();
        java.lang.String str11 = cSVRecord9.toString();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8896");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        boolean boolean14 = cSVRecord9.isMapped("");
        java.lang.String[] strArray15 = cSVRecord9.values();
        boolean boolean16 = cSVRecord9.isConsistent();
        int int17 = cSVRecord9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord9.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test8897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8897");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        boolean boolean16 = cSVRecord9.isSet("hi!");
        boolean boolean18 = cSVRecord9.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        java.lang.String str20 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord9.spliterator();
        java.lang.String[] strArray22 = cSVRecord9.values();
        java.lang.String str23 = cSVRecord9.getComment();
        int int24 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test8898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8898");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        boolean boolean12 = cSVRecord10.isMapped("");
        boolean boolean14 = cSVRecord10.isMapped("");
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        int int18 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8899");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        boolean boolean6 = cSVRecord4.isConsistent();
        boolean boolean7 = cSVRecord4.isConsistent();
        java.lang.String str8 = cSVRecord4.toString();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test8900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8900");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isSet("");
        boolean boolean14 = cSVRecord9.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        boolean boolean17 = cSVRecord9.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord9.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8901");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "", (long) (byte) -1);
        int int14 = cSVRecord13.size();
        boolean boolean16 = cSVRecord13.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8902");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        boolean boolean16 = cSVRecord9.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test8903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8903");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isSet("");
        boolean boolean14 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8904");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String[] strArray10 = cSVRecord5.values();
        int int11 = cSVRecord5.size();
        long long12 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test8905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8905");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.getComment();
        java.lang.String str12 = cSVRecord5.getComment();
        java.lang.String[] strArray13 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8906");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        int int12 = cSVRecord5.size();
        java.lang.String str13 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        int int15 = cSVRecord5.size();
        java.lang.String str16 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test8907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8907");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.getComment();
        boolean boolean12 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8908");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.lang.String[] strArray20 = cSVRecord19.values();
        boolean boolean21 = cSVRecord19.isConsistent();
        java.lang.String[] strArray22 = cSVRecord19.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test8909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8909");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        long long12 = cSVRecord9.getRecordNumber();
        boolean boolean14 = cSVRecord9.isMapped("");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        boolean boolean17 = cSVRecord9.isMapped("");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test8910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8910");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        boolean boolean15 = cSVRecord9.isSet("");
        long long16 = cSVRecord9.getRecordNumber();
        long long17 = cSVRecord9.getRecordNumber();
        boolean boolean19 = cSVRecord9.isMapped("");
        java.lang.Class<?> wildcardClass20 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8911");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        long long11 = cSVRecord5.getRecordNumber();
        boolean boolean13 = cSVRecord5.isSet("");
        long long14 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8912");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        boolean boolean15 = cSVRecord14.isConsistent();
        long long16 = cSVRecord14.getRecordNumber();
        java.lang.String str17 = cSVRecord14.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8913");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (byte) 10);
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord17.iterator();
        java.lang.String str19 = cSVRecord17.toString();
        long long20 = cSVRecord17.getRecordNumber();
        java.lang.String str21 = cSVRecord17.toString();
        java.lang.String str23 = cSVRecord17.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8914");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 0);
        boolean boolean5 = cSVRecord4.isConsistent();
        java.lang.String str6 = cSVRecord4.toString();
        int int7 = cSVRecord4.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test8915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8915");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray11, strMap36, "hi!", (long) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test8916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8916");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        java.lang.String[] strArray14 = cSVRecord5.values();
        java.lang.String str15 = cSVRecord5.getComment();
        java.lang.String str16 = cSVRecord5.getComment();
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        int int19 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8917");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        java.lang.Class<?> wildcardClass22 = strItor21.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8918");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isMapped("");
        java.lang.String str15 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord5.iterator();
        boolean boolean18 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8919");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.String str17 = cSVRecord5.getComment();
        java.lang.String str18 = cSVRecord5.toString();
        boolean boolean20 = cSVRecord5.isSet("");
        long long21 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test8920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8920");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "", (long) ' ');
        java.lang.Class<?> wildcardClass19 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8921");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        boolean boolean14 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8922");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        boolean boolean16 = cSVRecord9.isSet("hi!");
        boolean boolean18 = cSVRecord9.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        java.lang.String str20 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord9.spliterator();
        boolean boolean23 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8923");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) (short) 0);
        long long20 = cSVRecord19.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test8924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8924");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test8925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8925");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        int int17 = cSVRecord16.size();
        boolean boolean18 = cSVRecord16.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord16.spliterator();
        java.lang.String str21 = cSVRecord16.get((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8926");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        boolean boolean14 = cSVRecord9.isMapped("");
        boolean boolean15 = cSVRecord9.isConsistent();
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, , hi!]", 1L);
        long long21 = cSVRecord20.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test8927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8927");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.lang.String str15 = cSVRecord13.toString();
        java.lang.String str17 = cSVRecord13.get((int) (short) 0);
        java.lang.String str18 = cSVRecord13.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test8928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8928");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        int int11 = cSVRecord5.size();
        boolean boolean13 = cSVRecord5.isSet("");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isMapped("hi!");
        boolean boolean18 = cSVRecord5.isMapped("");
        java.lang.String str19 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test8929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8929");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        int int17 = cSVRecord5.size();
        java.lang.String[] strArray18 = cSVRecord5.values();
        java.lang.String str19 = cSVRecord5.getComment();
        java.lang.String[] strArray20 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test8930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8930");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isSet("[hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test8931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8931");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test8932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8932");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.toString();
        long long6 = cSVRecord4.getRecordNumber();
        long long7 = cSVRecord4.getRecordNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test8933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8933");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        java.lang.String str10 = cSVRecord5.get((int) (byte) 0);
        long long11 = cSVRecord5.getRecordNumber();
        int int12 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test8934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8934");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray11, strMap32, "", 0L);
        java.lang.String str36 = cSVRecord35.toString();
        long long37 = cSVRecord35.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator38 = cSVRecord35.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator38);
    }

    @Test
    public void test8935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8935");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8936");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        int int6 = cSVRecord4.size();
        java.lang.String str7 = cSVRecord4.toString();
        int int8 = cSVRecord4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord4.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test8937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8937");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean13 = cSVRecord9.isConsistent();
        long long14 = cSVRecord9.getRecordNumber();
        int int15 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test8938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8938");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        long long13 = cSVRecord9.getRecordNumber();
        java.lang.String str14 = cSVRecord9.getComment();
        int int15 = cSVRecord9.size();
        java.lang.String str16 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test8939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8939");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("hi!");
        java.lang.String str14 = cSVRecord9.getComment();
        boolean boolean16 = cSVRecord9.isMapped("");
        boolean boolean17 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord9.spliterator();
        java.lang.String str19 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test8940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8940");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", (long) (short) -1);
        java.lang.String[] strArray23 = cSVRecord22.values();
        boolean boolean24 = cSVRecord22.isConsistent();
        int int25 = cSVRecord22.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord22.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test8941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8941");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        boolean boolean18 = cSVRecord5.isConsistent();
        boolean boolean20 = cSVRecord5.isMapped("hi!");
        java.lang.String str21 = cSVRecord5.toString();
        int int22 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8942");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.getComment();
        boolean boolean13 = cSVRecord5.isSet("");
        boolean boolean15 = cSVRecord5.isSet("");
        boolean boolean17 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8943");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("hi!");
        int int14 = cSVRecord9.size();
        java.lang.String[] strArray15 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass16 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8944");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isSet("");
        int int15 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isMapped("");
        int int18 = cSVRecord9.size();
        java.lang.Class<?> wildcardClass19 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test8945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8945");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        boolean boolean17 = cSVRecord9.isMapped("");
        boolean boolean18 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test8946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8946");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.lang.String str18 = cSVRecord5.getComment();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) (-1));
        java.lang.String str24 = cSVRecord23.toString();
        boolean boolean26 = cSVRecord23.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8947");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        boolean boolean21 = cSVRecord15.isSet("");
        boolean boolean23 = cSVRecord15.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8948");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        boolean boolean17 = cSVRecord9.isMapped("");
        int int18 = cSVRecord9.size();
        long long19 = cSVRecord9.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test8949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8949");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.lang.String[] strArray13 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8950");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String str14 = cSVRecord5.get((int) (byte) 0);
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        long long16 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test8951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8951");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord5.spliterator();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray7, strMap12, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray7, strMap16, "[hi!, , hi!]", (long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray7, strMap20, "", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test8952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8952");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test8953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8953");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "", 10L);
        int int17 = cSVRecord16.size();
        boolean boolean18 = cSVRecord16.isConsistent();
        boolean boolean20 = cSVRecord16.isMapped("");
        boolean boolean22 = cSVRecord16.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord16.spliterator();
        java.lang.Class<?> wildcardClass24 = cSVRecord16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8954");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord5.spliterator();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test8955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8955");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "hi!", (long) '#');
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        boolean boolean21 = cSVRecord18.isMapped("hi!");
        boolean boolean22 = cSVRecord18.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test8956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8956");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "hi!", (long) 10);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.lang.Class<?> wildcardClass27 = strArray26.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test8957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8957");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        int int11 = cSVRecord9.size();
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String str13 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8958");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.get((int) (short) 0);
        java.lang.String str13 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        long long15 = cSVRecord5.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test8959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8959");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        long long15 = cSVRecord9.getRecordNumber();
        long long16 = cSVRecord9.getRecordNumber();
        long long17 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        java.lang.String[] strArray19 = cSVRecord9.values();
        boolean boolean21 = cSVRecord9.isMapped("");
        boolean boolean23 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8960");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord4.iterator();
        boolean boolean8 = cSVRecord4.isSet("");
        java.lang.String[] strArray9 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "hi!", (long) (-1));
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test8961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8961");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord10.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8962");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("");
        boolean boolean13 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        java.lang.String str15 = cSVRecord5.toString();
        java.lang.String str16 = cSVRecord5.toString();
        long long17 = cSVRecord5.getRecordNumber();
        boolean boolean19 = cSVRecord5.isSet("hi!");
        boolean boolean21 = cSVRecord5.isMapped("");
        int int22 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8963");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        boolean boolean11 = cSVRecord5.isConsistent();
        int int12 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8964");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "", (long) 'a');
        boolean boolean32 = cSVRecord31.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = cSVRecord31.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test8965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8965");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.lang.String str14 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test8966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8966");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord13.iterator();
        java.lang.Class<?> wildcardClass15 = cSVRecord13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8967");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        int int12 = cSVRecord10.size();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) (byte) 10);
        int int22 = cSVRecord21.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8968");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        int int14 = cSVRecord9.size();
        boolean boolean16 = cSVRecord9.isSet("");
        boolean boolean18 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8969");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.get((int) (byte) 0);
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8970");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test8971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8971");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        boolean boolean13 = cSVRecord11.isMapped("");
        java.lang.String[] strArray14 = cSVRecord11.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[hi!, , hi!]", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test8972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8972");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8973");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test8974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8974");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        long long9 = cSVRecord5.getRecordNumber();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test8975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8975");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.lang.String str14 = cSVRecord9.get((int) (byte) 0);
        java.lang.String str15 = cSVRecord9.toString();
        int int16 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test8976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8976");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) (byte) 1);
        java.lang.Class<?> wildcardClass22 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8977");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        java.lang.String[] strArray20 = cSVRecord15.values();
        java.lang.String str21 = cSVRecord15.toString();
        boolean boolean23 = cSVRecord15.isSet("hi!");
        boolean boolean25 = cSVRecord15.isSet("");
        long long26 = cSVRecord15.getRecordNumber();
        int int27 = cSVRecord15.size();
        java.lang.String str28 = cSVRecord15.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test8978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8978");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test8979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8979");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord20.iterator();
        boolean boolean23 = cSVRecord20.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test8980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8980");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        boolean boolean17 = cSVRecord15.isConsistent();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        java.lang.String[] strArray20 = cSVRecord15.values();
        java.lang.String str21 = cSVRecord15.toString();
        boolean boolean23 = cSVRecord15.isSet("hi!");
        boolean boolean25 = cSVRecord15.isSet("");
        long long26 = cSVRecord15.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord15.iterator();
        long long28 = cSVRecord15.getRecordNumber();
        int int29 = cSVRecord15.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test8981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8981");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        long long13 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test8982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8982");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.lang.String[] strArray15 = cSVRecord9.values();
        boolean boolean17 = cSVRecord9.isSet("");
        boolean boolean18 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8983");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        boolean boolean15 = cSVRecord9.isSet("");
        boolean boolean17 = cSVRecord9.isMapped("");
        java.lang.String str18 = cSVRecord9.getComment();
        int int19 = cSVRecord9.size();
        java.lang.String[] strArray20 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test8984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8984");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test8985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8985");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str12 = cSVRecord10.get((int) (short) 0);
        int int13 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass14 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8986");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.getComment();
        int int15 = cSVRecord5.size();
        boolean boolean17 = cSVRecord5.isMapped("hi!");
        boolean boolean19 = cSVRecord5.isSet("");
        java.lang.String str21 = cSVRecord5.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8987");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        boolean boolean10 = cSVRecord9.isConsistent();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.lang.String str13 = cSVRecord9.getComment();
        java.lang.String str14 = cSVRecord9.toString();
        java.lang.String str16 = cSVRecord9.get(0);
        java.lang.String str17 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8988");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.lang.String str17 = cSVRecord9.getComment();
        boolean boolean19 = cSVRecord9.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord9.spliterator();
        java.lang.String str21 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8989");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.toString();
        java.lang.String str16 = cSVRecord5.getComment();
        boolean boolean17 = cSVRecord5.isConsistent();
        int int18 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8990");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        int int13 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        int int17 = cSVRecord5.size();
        int int18 = cSVRecord5.size();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord5.spliterator();
        boolean boolean22 = cSVRecord5.isMapped("");
        long long23 = cSVRecord5.getRecordNumber();
        int int24 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test8991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8991");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test8992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8992");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        int int12 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        boolean boolean15 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8993");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isSet("");
        boolean boolean15 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord9.spliterator();
        java.lang.String str17 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8994");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        long long15 = cSVRecord9.getRecordNumber();
        int int16 = cSVRecord9.size();
        boolean boolean18 = cSVRecord9.isMapped("");
        java.lang.String str19 = cSVRecord9.getComment();
        int int20 = cSVRecord9.size();
        boolean boolean22 = cSVRecord9.isMapped("hi!");
        java.lang.String str23 = cSVRecord9.getComment();
        boolean boolean25 = cSVRecord9.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8995");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8996");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "", (long) 0);
        java.lang.String[] strArray24 = cSVRecord23.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[hi!, , hi!]", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test8997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8997");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        long long15 = cSVRecord9.getRecordNumber();
        int int16 = cSVRecord9.size();
        boolean boolean18 = cSVRecord9.isMapped("");
        java.lang.String str19 = cSVRecord9.getComment();
        boolean boolean21 = cSVRecord9.isMapped("hi!");
        boolean boolean23 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8998");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test8999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8999");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test9000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test9000");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        java.lang.String str17 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }
}

