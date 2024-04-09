package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6501");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String[] strArray11 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6502");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.getComment();
        boolean boolean13 = cSVRecord5.isSet("");
        java.lang.String str14 = cSVRecord5.getComment();
        java.lang.String str15 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6503");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord9.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6504");
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
        boolean boolean29 = cSVRecord15.isMapped("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6505");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        boolean boolean16 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6506");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("");
        boolean boolean18 = cSVRecord5.isMapped("hi!");
        java.lang.String str19 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6507");
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
        boolean boolean14 = cSVRecord5.isSet("");
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6508");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("");
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        java.lang.String str16 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6509");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        int int12 = cSVRecord5.size();
        int int13 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord5.iterator();
        boolean boolean16 = cSVRecord5.isMapped("hi!");
        java.lang.String str17 = cSVRecord5.getComment();
        java.lang.Class<?> wildcardClass18 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6510");
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
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6511");
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
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.String str15 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6512");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        long long12 = cSVRecord5.getRecordNumber();
        boolean boolean14 = cSVRecord5.isMapped("");
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        boolean boolean18 = cSVRecord5.isMapped("");
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
        java.lang.String str21 = cSVRecord5.toString();
        boolean boolean23 = cSVRecord5.isMapped("");
        boolean boolean25 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6513");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        int int12 = cSVRecord9.size();
        boolean boolean14 = cSVRecord9.isSet("");
        java.lang.String str15 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6514");
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
        java.lang.String str14 = cSVRecord5.getComment();
        int int15 = cSVRecord5.size();
        long long16 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6515");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        long long6 = cSVRecord5.getRecordNumber();
        java.lang.String str7 = cSVRecord5.toString();
        java.lang.String[] strArray8 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6516");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        boolean boolean15 = cSVRecord9.isMapped("");
        boolean boolean17 = cSVRecord9.isMapped("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        boolean boolean19 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6517");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.lang.String[] strArray14 = cSVRecord9.values();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String str16 = cSVRecord9.toString();
        java.lang.String[] strArray17 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6518");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        int int11 = cSVRecord10.size();
        long long12 = cSVRecord10.getRecordNumber();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6519");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        int int15 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isSet("");
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6520");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        java.lang.String[] strArray6 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6521");
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
        java.lang.Class<?> wildcardClass15 = cSVRecord14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6522");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.String[] strArray18 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6523");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        long long6 = cSVRecord5.getRecordNumber();
        java.lang.String str7 = cSVRecord5.toString();
        java.lang.String[] strArray8 = cSVRecord5.values();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6524");
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
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "", 1L);
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
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6525");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        boolean boolean14 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        boolean boolean17 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6526");
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
        int int14 = cSVRecord5.size();
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6527");
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
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord19.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6528");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "", (long) (short) 1);
        java.lang.String str25 = cSVRecord24.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6529");
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
        java.lang.String str20 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6530");
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
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6531");
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
        java.lang.String str21 = cSVRecord16.getComment();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6532");
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
        java.lang.String str27 = cSVRecord23.toString();
        java.lang.String str28 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6533");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.getComment();
        java.lang.String str13 = cSVRecord9.getComment();
        boolean boolean15 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6534");
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
        int int22 = cSVRecord9.size();
        java.lang.String str23 = cSVRecord9.getComment();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6535");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6536");
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
        int int15 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6537");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord9.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6538");
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
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord5.iterator();
        int int18 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        int int20 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6539");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isMapped("");
        boolean boolean18 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6540");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", (long) (byte) 10);
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord22.iterator();
        long long24 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6541");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6542");
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
        boolean boolean16 = cSVRecord5.isConsistent();
        boolean boolean18 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6543");
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
        boolean boolean32 = cSVRecord31.isConsistent();
        java.util.Iterator<java.lang.String> strItor33 = cSVRecord31.iterator();
        java.lang.String str34 = cSVRecord31.toString();
        boolean boolean36 = cSVRecord31.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = cSVRecord31.get((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6544");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6545");
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
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) 10);
        java.lang.Class<?> wildcardClass21 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6546");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 1L);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        java.lang.Class<?> wildcardClass13 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6547");
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
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6548");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "", (long) (short) 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6549");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        boolean boolean19 = cSVRecord5.isMapped("");
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
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6550");
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
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6551");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean15 = cSVRecord9.isSet("hi!");
        boolean boolean17 = cSVRecord9.isMapped("hi!");
        java.lang.String str18 = cSVRecord9.getComment();
        int int19 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6552");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6553");
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
        java.lang.String str16 = cSVRecord5.toString();
        boolean boolean18 = cSVRecord5.isMapped("hi!");
        java.lang.String str19 = cSVRecord5.getComment();
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
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6554");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord9.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6555");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        long long8 = cSVRecord4.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord4.spliterator();
        boolean boolean11 = cSVRecord4.isMapped("");
        boolean boolean13 = cSVRecord4.isSet("hi!");
        java.lang.String str14 = cSVRecord4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6556");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.lang.String str12 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6557");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        long long6 = cSVRecord5.getRecordNumber();
        java.lang.String str7 = cSVRecord5.toString();
        java.lang.Class<?> wildcardClass8 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6558");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        int int12 = cSVRecord9.size();
        boolean boolean13 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6559");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord14.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6560");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord27.get("hi!");
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
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6561");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 1L);
        int int11 = cSVRecord10.size();
        java.lang.String str12 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6562");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        boolean boolean16 = cSVRecord9.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        boolean boolean19 = cSVRecord9.isSet("hi!");
        boolean boolean21 = cSVRecord9.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord9.spliterator();
        java.lang.Class<?> wildcardClass23 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6563");
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
        boolean boolean23 = cSVRecord21.isMapped("hi!");
        boolean boolean25 = cSVRecord21.isSet("");
        java.lang.String str26 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6564");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        long long11 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6565");
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
        int int16 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6566");
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
        long long16 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6567");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6568");
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
        int int26 = cSVRecord23.size();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord23.spliterator();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord23.iterator();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertNotNull(strItor28);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6569");
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
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6570");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6571");
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
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6572");
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
        int int24 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass25 = cSVRecord5.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6573");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        org.junit.Assert.assertNotNull(strSpliterator5);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6574");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass13 = strItor12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6575");
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
        int int15 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6576");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        boolean boolean10 = cSVRecord9.isConsistent();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.lang.String str13 = cSVRecord9.getComment();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6577");
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
        java.lang.String str20 = cSVRecord10.get((int) (byte) 0);
        int int21 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6578");
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
        boolean boolean29 = cSVRecord28.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6579");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.lang.String[] strArray5 = cSVRecord4.values();
        java.lang.String str6 = cSVRecord4.getComment();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6580");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", 0L);
        long long32 = cSVRecord31.getRecordNumber();
        int int33 = cSVRecord31.size();
        java.util.Iterator<java.lang.String> strItor34 = cSVRecord31.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strItor34);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6581");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String str12 = cSVRecord10.getComment();
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6582");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        boolean boolean6 = cSVRecord4.isSet("");
        java.lang.Class<?> wildcardClass7 = cSVRecord4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6583");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6584");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        long long7 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6585");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "hi!", (long) (short) 0);
        java.lang.String str23 = cSVRecord22.getComment();
        long long24 = cSVRecord22.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord22.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6586");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        boolean boolean16 = cSVRecord9.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        boolean boolean19 = cSVRecord9.isSet("hi!");
        java.lang.String str20 = cSVRecord9.getComment();
        java.lang.String[] strArray21 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6587");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        boolean boolean15 = cSVRecord9.isSet("");
        java.lang.String str16 = cSVRecord9.toString();
        boolean boolean17 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6588");
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
        boolean boolean17 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6589");
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
        java.lang.Class<?> wildcardClass22 = cSVRecord9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6590");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        boolean boolean6 = cSVRecord4.isSet("");
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord4.iterator();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6591");
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
        int int25 = cSVRecord23.size();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6592");
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
        boolean boolean15 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6593");
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
        java.lang.String[] strArray19 = cSVRecord18.values();
        boolean boolean20 = cSVRecord18.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6594");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", (long) (short) 1);
        boolean boolean18 = cSVRecord16.isSet("hi!");
        java.lang.String[] strArray19 = cSVRecord16.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6595");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6596");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6597");
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
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6598");
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
        java.lang.String[] strArray20 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", (long) (byte) 10);
        java.lang.String[] strArray25 = cSVRecord24.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6599");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isMapped("");
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.String str13 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6600");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "hi!", (long) ' ');
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord13.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6601");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 0);
        boolean boolean5 = cSVRecord4.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord4.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6602");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6603");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        boolean boolean16 = cSVRecord9.isMapped("hi!");
        boolean boolean17 = cSVRecord9.isConsistent();
        int int18 = cSVRecord9.size();
        java.lang.String[] strArray19 = cSVRecord9.values();
        int int20 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6604");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        boolean boolean14 = cSVRecord5.isMapped("");
        boolean boolean16 = cSVRecord5.isSet("");
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
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6605");
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
        boolean boolean24 = cSVRecord10.isSet("");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6606");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = null;
        org.apache.commons.csv.CSVRecord cSVRecord7 = new org.apache.commons.csv.CSVRecord(strArray3, strMap4, "hi!", (long) (short) -1);
        java.lang.String[] strArray8 = cSVRecord7.values();
        int int9 = cSVRecord7.size();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6607");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strSpliterator9);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6608");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        int int11 = cSVRecord5.size();
        java.lang.String str12 = cSVRecord5.getComment();
        java.lang.String[] strArray13 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6609");
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
        java.lang.String str19 = cSVRecord13.getComment();
        java.lang.Class<?> wildcardClass20 = cSVRecord13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6610");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
        boolean boolean20 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6611");
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
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6612");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isSet("");
        boolean boolean14 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6613");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6614");
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
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray7, strMap16, "", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6615");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str12 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord17.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6616");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6617");
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
        java.lang.String str19 = cSVRecord10.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6618");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "", 1L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6619");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        long long14 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6620");
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
        boolean boolean18 = cSVRecord5.isMapped("");
        int int19 = cSVRecord5.size();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6621");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        long long8 = cSVRecord5.getRecordNumber();
        long long9 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6622");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord5.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6623");
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
        boolean boolean16 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6624");
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
        java.lang.String str18 = cSVRecord9.toString();
        java.lang.String str19 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6625");
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
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.lang.String str17 = cSVRecord5.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        java.lang.String[] strArray19 = cSVRecord5.values();
        boolean boolean21 = cSVRecord5.isMapped("hi!");
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6626");
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
        java.lang.String str16 = cSVRecord5.toString();
        int int17 = cSVRecord5.size();
        java.lang.String str18 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord5.get(1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6627");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        boolean boolean14 = cSVRecord9.isConsistent();
        boolean boolean15 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6628");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        java.lang.String str11 = cSVRecord5.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6629");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        long long12 = cSVRecord9.getRecordNumber();
        long long13 = cSVRecord9.getRecordNumber();
        boolean boolean15 = cSVRecord9.isSet("");
        boolean boolean16 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6630");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        java.lang.String str16 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6631");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 0);
        boolean boolean6 = cSVRecord4.isSet("hi!");
        java.lang.String str7 = cSVRecord4.getComment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6632");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String str7 = cSVRecord5.toString();
        boolean boolean8 = cSVRecord5.isConsistent();
        java.lang.String str10 = cSVRecord5.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6633");
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
        long long15 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6634");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean15 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6635");
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
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
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
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6636");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) (byte) 10);
        int int22 = cSVRecord21.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6637");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        java.lang.Class<?> wildcardClass9 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6638");
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
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord15.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6639");
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
        boolean boolean20 = cSVRecord9.isMapped("hi!");
        java.lang.Class<?> wildcardClass21 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6640");
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
        java.lang.String str20 = cSVRecord5.toString();
        java.lang.String str21 = cSVRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6641");
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
        boolean boolean17 = cSVRecord15.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6642");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        boolean boolean20 = cSVRecord18.isMapped("hi!");
        boolean boolean21 = cSVRecord18.isConsistent();
        boolean boolean22 = cSVRecord18.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6643");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        boolean boolean10 = cSVRecord9.isConsistent();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.lang.String str14 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6644");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) '4');
        java.lang.String str23 = cSVRecord22.getComment();
        java.lang.String[] strArray24 = cSVRecord22.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6645");
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
        java.lang.Class<?> wildcardClass25 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6646");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("hi!");
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
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6647");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        java.lang.String str15 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6648");
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
        long long17 = cSVRecord13.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord13.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6649");
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
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord14.iterator();
        long long16 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6650");
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
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        int int17 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6651");
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
        boolean boolean20 = cSVRecord18.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6652");
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
        java.lang.String str24 = cSVRecord21.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord21.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6653");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        boolean boolean9 = cSVRecord5.isMapped("");
        int int10 = cSVRecord5.size();
        long long11 = cSVRecord5.getRecordNumber();
        boolean boolean13 = cSVRecord5.isMapped("");
        java.lang.String[] strArray14 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6654");
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
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        int int17 = cSVRecord10.size();
        int int18 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6655");
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
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "hi!", (long) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6656");
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
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.String[] strArray17 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6657");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray1, strMap14, "", (long) (byte) 10);
        java.lang.String str18 = cSVRecord17.toString();
        boolean boolean20 = cSVRecord17.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord17.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6658");
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
        boolean boolean15 = cSVRecord5.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6659");
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
        boolean boolean18 = cSVRecord10.isConsistent();
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6660");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) (short) 100);
        int int6 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6661");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        int int7 = cSVRecord4.size();
        boolean boolean9 = cSVRecord4.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6662");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (-1));
        java.lang.String str13 = cSVRecord12.toString();
        boolean boolean15 = cSVRecord12.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6663");
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
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord5.iterator();
        java.lang.String str22 = cSVRecord5.getComment();
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
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6664");
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
        java.lang.String str21 = cSVRecord20.toString();
        java.lang.String str22 = cSVRecord20.toString();
        boolean boolean24 = cSVRecord20.isSet("");
        long long25 = cSVRecord20.getRecordNumber();
        java.lang.String str26 = cSVRecord20.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6665");
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
            java.lang.String str13 = cSVRecord5.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6666");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.lang.String[] strArray14 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6667");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        boolean boolean15 = cSVRecord9.isMapped("");
        boolean boolean17 = cSVRecord9.isMapped("");
        boolean boolean19 = cSVRecord9.isSet("hi!");
        java.lang.String str20 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6668");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("");
        int int17 = cSVRecord5.size();
        int int18 = cSVRecord5.size();
        boolean boolean20 = cSVRecord5.isSet("hi!");
        long long21 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray22 = cSVRecord5.values();
        java.lang.String str23 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6669");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isSet("hi!");
        java.lang.String str10 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6670");
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
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) (short) 10);
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
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6671");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.lang.String str12 = cSVRecord9.getComment();
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        java.lang.Class<?> wildcardClass15 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6672");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6673");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("hi!");
        java.lang.String str14 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6674");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6675");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray1, strMap14, "", (long) (byte) 10);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.lang.String str19 = cSVRecord17.getComment();
        java.lang.String[] strArray20 = cSVRecord17.values();
        long long21 = cSVRecord17.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord17.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6676");
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
        java.lang.String str19 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6677");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        int int12 = cSVRecord5.size();
        boolean boolean13 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6678");
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
        boolean boolean14 = cSVRecord5.isSet("");
        java.lang.String[] strArray15 = cSVRecord5.values();
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
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6679");
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
        boolean boolean20 = cSVRecord5.isConsistent();
        java.lang.String str21 = cSVRecord5.toString();
        java.lang.String str22 = cSVRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6680");
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
        long long20 = cSVRecord19.getRecordNumber();
        java.lang.Class<?> wildcardClass21 = cSVRecord19.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6681");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        boolean boolean16 = cSVRecord13.isMapped("hi!");
        java.lang.String[] strArray17 = cSVRecord13.values();
        java.lang.Class<?> wildcardClass18 = cSVRecord13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6682");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        int int15 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6683");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord17.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6684");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        boolean boolean16 = cSVRecord13.isMapped("hi!");
        java.lang.String str17 = cSVRecord13.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6685");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord18.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6686");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6687");
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
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
        java.lang.String str20 = cSVRecord5.toString();
        long long21 = cSVRecord5.getRecordNumber();
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
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6688");
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
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isSet("hi!");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6689");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        long long12 = cSVRecord5.getRecordNumber();
        boolean boolean14 = cSVRecord5.isMapped("");
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        boolean boolean18 = cSVRecord5.isMapped("");
        java.lang.Class<?> wildcardClass19 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6690");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass20 = cSVRecord5.getClass();
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
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6691");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        long long8 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass10 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6692");
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
        boolean boolean16 = cSVRecord5.isSet("hi!");
        java.lang.String str17 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6693");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        boolean boolean12 = cSVRecord10.isMapped("");
        boolean boolean14 = cSVRecord10.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6694");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.lang.String[] strArray5 = cSVRecord4.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord4.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6695");
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
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6696");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6697");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord22.get("hi!");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6698");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        boolean boolean10 = cSVRecord5.isMapped("hi!");
        boolean boolean12 = cSVRecord5.isSet("hi!");
        java.lang.String str13 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isConsistent();
        java.lang.String str15 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6699");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        boolean boolean6 = cSVRecord4.isSet("");
        java.lang.String str7 = cSVRecord4.getComment();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6700");
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
        boolean boolean29 = cSVRecord26.isConsistent();
        java.lang.String str30 = cSVRecord26.toString();
        java.util.Iterator<java.lang.String> strItor31 = cSVRecord26.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(strItor31);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6701");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) 'a');
        int int12 = cSVRecord11.size();
        boolean boolean14 = cSVRecord11.isSet("hi!");
        boolean boolean16 = cSVRecord11.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6702");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord18.get("");
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
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6703");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        boolean boolean13 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6704");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("");
        int int17 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6705");
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
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "", (long) '#');
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        boolean boolean23 = cSVRecord20.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6706");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) (short) 0);
        boolean boolean6 = cSVRecord4.isSet("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6707");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        boolean boolean15 = cSVRecord9.isMapped("");
        java.lang.String str16 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6708");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "", 0L);
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
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6709");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        boolean boolean10 = cSVRecord5.isSet("hi!");
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6710");
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
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", (long) (short) 100);
        boolean boolean33 = cSVRecord31.isMapped("hi!");
        boolean boolean34 = cSVRecord31.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6711");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6712");
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
        boolean boolean21 = cSVRecord10.isMapped("");
        boolean boolean23 = cSVRecord10.isMapped("");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6713");
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
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord5.iterator();
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
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6714");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        boolean boolean15 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6715");
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
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord27.iterator();
        boolean boolean30 = cSVRecord27.isSet("");
        long long31 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6716");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.lang.String str15 = cSVRecord9.toString();
        boolean boolean16 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6717");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        long long9 = cSVRecord5.getRecordNumber();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6718");
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
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6719");
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
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean17 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6720");
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
        java.lang.String str17 = cSVRecord9.getComment();
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6721");
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
        java.lang.Class<?> wildcardClass16 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6722");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        boolean boolean13 = cSVRecord5.isSet("hi!");
        boolean boolean15 = cSVRecord5.isSet("");
        boolean boolean16 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6723");
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
        java.lang.String str21 = cSVRecord20.toString();
        java.lang.String str22 = cSVRecord20.toString();
        boolean boolean24 = cSVRecord20.isSet("");
        boolean boolean26 = cSVRecord20.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6724");
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
        long long14 = cSVRecord5.getRecordNumber();
        boolean boolean16 = cSVRecord5.isMapped("");
        boolean boolean18 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6725");
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
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6726");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        long long12 = cSVRecord9.getRecordNumber();
        long long13 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord9.values();
        boolean boolean16 = cSVRecord9.isSet("");
        int int17 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6727");
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
        int int25 = cSVRecord23.size();
        java.lang.String str26 = cSVRecord23.toString();
        java.lang.String str27 = cSVRecord23.getComment();
        java.lang.String[] strArray28 = cSVRecord23.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord23.get("");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6728");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
        java.lang.String[] strArray20 = cSVRecord5.values();
        java.lang.String[] strArray21 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6729");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        int int9 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String str12 = cSVRecord5.getComment();
        int int13 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6730");
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
        boolean boolean23 = cSVRecord22.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord22.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6731");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass15 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6732");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray1, strMap14, "", (long) (byte) 10);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", (long) 'a');
        int int23 = cSVRecord22.size();
        boolean boolean25 = cSVRecord22.isSet("");
        java.lang.String str26 = cSVRecord22.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6733");
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
        int int13 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6734");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.toString();
        int int11 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6735");
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
        boolean boolean17 = cSVRecord5.isMapped("hi!");
        java.lang.String str19 = cSVRecord5.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6736");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String[] strArray13 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6737");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) 10);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6738");
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
        boolean boolean17 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6739");
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
        boolean boolean14 = cSVRecord5.isSet("");
        java.lang.String[] strArray15 = cSVRecord5.values();
        int int16 = cSVRecord5.size();
        boolean boolean18 = cSVRecord5.isMapped("");
        boolean boolean20 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6740");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6741");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String str10 = cSVRecord5.getComment();
        java.lang.String str11 = cSVRecord5.toString();
        long long12 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6742");
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
        java.lang.String str15 = cSVRecord5.toString();
        int int16 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.String str18 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6743");
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
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6744");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord21.get(100);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6745");
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
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6746");
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
        long long15 = cSVRecord5.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6747");
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
        java.lang.String str20 = cSVRecord16.toString();
        boolean boolean22 = cSVRecord16.isMapped("");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6748");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        boolean boolean13 = cSVRecord9.isSet("");
        boolean boolean15 = cSVRecord9.isSet("");
        int int16 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6749");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6750");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        java.lang.String str15 = cSVRecord9.getComment();
        java.lang.String str16 = cSVRecord9.getComment();
        boolean boolean17 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6751");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray1, strMap14, "", 0L);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6752");
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
        int int24 = cSVRecord23.size();
        long long25 = cSVRecord23.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord23.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6753");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        boolean boolean9 = cSVRecord5.isMapped("");
        boolean boolean10 = cSVRecord5.isConsistent();
        int int11 = cSVRecord5.size();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6754");
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
        boolean boolean23 = cSVRecord21.isSet("hi!");
        java.lang.String str24 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6755");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) '4');
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6756");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSpliterator10);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6757");
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
        boolean boolean19 = cSVRecord9.isMapped("hi!");
        int int20 = cSVRecord9.size();
        java.lang.String str21 = cSVRecord9.toString();
        int int22 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6758");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        long long13 = cSVRecord9.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6759");
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
        boolean boolean22 = cSVRecord17.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6760");
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
        boolean boolean22 = cSVRecord16.isMapped("");
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
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6761");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        java.lang.String str15 = cSVRecord14.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord14.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord14.spliterator();
        java.lang.String[] strArray18 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6762");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        java.lang.String[] strArray12 = cSVRecord11.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) (short) 1);
        int int21 = cSVRecord20.size();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord20.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6763");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6764");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean12 = cSVRecord9.isConsistent();
        int int13 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass15 = strItor14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6765");
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
        int int14 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6766");
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
        java.lang.String str14 = cSVRecord5.getComment();
        int int15 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6767");
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
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.lang.String str14 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6768");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (short) 0);
        java.lang.String[] strArray12 = cSVRecord11.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6769");
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
        int int20 = cSVRecord19.size();
        boolean boolean22 = cSVRecord19.isSet("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6770");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        int int12 = cSVRecord9.size();
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6771");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        int int14 = cSVRecord13.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord13.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6772");
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
        boolean boolean15 = cSVRecord5.isMapped("");
        boolean boolean17 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6773");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        long long13 = cSVRecord9.getRecordNumber();
        java.lang.String str15 = cSVRecord9.get(0);
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6774");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord5.spliterator();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord11.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6775");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        boolean boolean16 = cSVRecord9.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "hi!", (long) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6776");
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
        int int17 = cSVRecord16.size();
        boolean boolean18 = cSVRecord16.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6777");
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
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6778");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 1);
        long long5 = cSVRecord4.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6779");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        boolean boolean12 = cSVRecord10.isMapped("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6780");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6781");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) 100);
        java.lang.String str5 = cSVRecord4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6782");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "", (long) (byte) -1);
        java.lang.String[] strArray16 = cSVRecord15.values();
        long long17 = cSVRecord15.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6783");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) (byte) 100);
        java.lang.String str21 = cSVRecord20.getComment();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6784");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6785");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6786");
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
        int int17 = cSVRecord5.size();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6787");
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
        int int18 = cSVRecord10.size();
        int int19 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6788");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "", (long) (byte) -1);
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6789");
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
        long long18 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6790");
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
        java.lang.String str26 = cSVRecord25.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6791");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6792");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord5.get((int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6793");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        java.lang.String str11 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6794");
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
        boolean boolean18 = cSVRecord17.isConsistent();
        int int19 = cSVRecord17.size();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord17.iterator();
        java.lang.Class<?> wildcardClass21 = cSVRecord17.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6795");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord5.get("");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6796");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        long long8 = cSVRecord4.getRecordNumber();
        boolean boolean10 = cSVRecord4.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord4.spliterator();
        java.lang.Class<?> wildcardClass12 = cSVRecord4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6797");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        boolean boolean16 = cSVRecord13.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord13.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6798");
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
        java.lang.String str17 = cSVRecord9.get(0);
        java.lang.Class<?> wildcardClass18 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6799");
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
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", (-1L));
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
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6800");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        boolean boolean14 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6801");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        int int13 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass15 = strItor14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6802");
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
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        long long15 = cSVRecord5.getRecordNumber();
        java.lang.String str16 = cSVRecord5.getComment();
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
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6803");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        boolean boolean20 = cSVRecord18.isMapped("hi!");
        int int21 = cSVRecord18.size();
        int int22 = cSVRecord18.size();
        long long23 = cSVRecord18.getRecordNumber();
        java.lang.String str24 = cSVRecord18.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6804");
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
        boolean boolean19 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6805");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (long) '4');
        java.lang.String str9 = cSVRecord8.toString();
        boolean boolean10 = cSVRecord8.isConsistent();
        int int11 = cSVRecord8.size();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6806");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6807");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6808");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        java.lang.Class<?> wildcardClass16 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6809");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass10 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6810");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        boolean boolean17 = cSVRecord9.isSet("");
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.lang.String[] strArray19 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6811");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        boolean boolean15 = cSVRecord9.isSet("");
        java.lang.String str16 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6812");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray1, strMap14, "", (long) (byte) 10);
        java.lang.String str18 = cSVRecord17.toString();
        boolean boolean20 = cSVRecord17.isMapped("hi!");
        java.lang.String str21 = cSVRecord17.getComment();
        java.lang.String[] strArray22 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6813");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.String[] strArray18 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get((int) (short) -1);
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
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6814");
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
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        long long20 = cSVRecord5.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord5.iterator();
        java.lang.String str22 = cSVRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6815");
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
        boolean boolean19 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6816");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.getComment();
        java.lang.String str14 = cSVRecord5.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6817");
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
        java.lang.String str19 = cSVRecord18.toString();
        java.lang.String str20 = cSVRecord18.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6818");
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
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord5.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6819");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "", 0L);
        long long12 = cSVRecord11.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord11.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6820");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        java.lang.String str9 = cSVRecord5.toString();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6821");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        boolean boolean15 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6822");
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
        boolean boolean19 = cSVRecord5.isSet("");
        java.lang.Class<?> wildcardClass20 = cSVRecord5.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6823");
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
        int int15 = cSVRecord5.size();
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
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6824");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        boolean boolean10 = cSVRecord9.isConsistent();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.lang.String str13 = cSVRecord9.getComment();
        boolean boolean15 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6825");
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
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
        boolean boolean21 = cSVRecord5.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord5.iterator();
        java.lang.String str24 = cSVRecord5.get(0);
        java.lang.Class<?> wildcardClass25 = cSVRecord5.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6826");
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
        java.lang.String str28 = cSVRecord27.getComment();
        java.lang.String[] strArray29 = cSVRecord27.values();
        java.lang.String str30 = cSVRecord27.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6827");
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
        java.lang.String str17 = cSVRecord16.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6828");
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
        java.lang.String str19 = cSVRecord17.getComment();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6829");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String str13 = cSVRecord5.toString();
        java.lang.String str14 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6830");
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
        long long13 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6831");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        int int6 = cSVRecord4.size();
        java.lang.String[] strArray7 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (short) 100);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6832");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isMapped("hi!");
        int int15 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6833");
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
        java.lang.String str27 = cSVRecord26.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord26.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6834");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String[] strArray8 = cSVRecord5.values();
        long long9 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6835");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        boolean boolean6 = cSVRecord5.isConsistent();
        boolean boolean7 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6836");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        boolean boolean18 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6837");
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
        java.lang.String str15 = cSVRecord5.toString();
        int int16 = cSVRecord5.size();
        boolean boolean18 = cSVRecord5.isSet("hi!");
        java.lang.String str19 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6838");
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
        boolean boolean16 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6839");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.lang.String str9 = cSVRecord5.get((int) (byte) 0);
        boolean boolean10 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6840");
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
        long long21 = cSVRecord13.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6841");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        long long8 = cSVRecord4.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord4.spliterator();
        boolean boolean11 = cSVRecord4.isMapped("");
        boolean boolean13 = cSVRecord4.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord4.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6842");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        boolean boolean6 = cSVRecord4.isSet("");
        java.lang.Class<?> wildcardClass7 = cSVRecord4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6843");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        int int8 = cSVRecord5.size();
        java.lang.String str9 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6844");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6845");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        boolean boolean6 = cSVRecord4.isSet("");
        int int7 = cSVRecord4.size();
        int int8 = cSVRecord4.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6846");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("hi!");
        java.lang.String str13 = cSVRecord9.getComment();
        boolean boolean15 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord9.spliterator();
        java.lang.Class<?> wildcardClass17 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6847");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isSet("");
        java.lang.String[] strArray22 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6848");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean13 = cSVRecord10.isConsistent();
        boolean boolean14 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6849");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        boolean boolean10 = cSVRecord4.isMapped("");
        java.lang.Class<?> wildcardClass11 = cSVRecord4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6850");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6851");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord15.get((int) (short) -1);
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
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6852");
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
        java.lang.String[] strArray24 = cSVRecord23.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6853");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "hi!", (long) (byte) 0);
        int int25 = cSVRecord24.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6854");
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
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.lang.Class<?> wildcardClass19 = cSVRecord17.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6855");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        int int14 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        long long16 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6856");
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
        java.lang.String[] strArray19 = cSVRecord16.values();
        long long20 = cSVRecord16.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord16.spliterator();
        boolean boolean23 = cSVRecord16.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord16.get("");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6857");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6858");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isSet("");
        int int11 = cSVRecord5.size();
        java.lang.String[] strArray12 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6859");
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
        boolean boolean22 = cSVRecord5.isSet("");
        java.lang.String str23 = cSVRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6860");
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
        long long27 = cSVRecord23.getRecordNumber();
        java.lang.String[] strArray28 = cSVRecord23.values();
        java.lang.String str30 = cSVRecord23.get(0);
        java.lang.Class<?> wildcardClass31 = cSVRecord23.getClass();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6861");
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
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.lang.String str17 = cSVRecord5.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        java.lang.String[] strArray19 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6862");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", (-1L));
        java.lang.String str22 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6863");
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
        java.lang.Class<?> wildcardClass23 = cSVRecord22.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6864");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (long) '4');
        java.lang.String str9 = cSVRecord8.getComment();
        java.lang.String[] strArray10 = cSVRecord8.values();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6865");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        boolean boolean14 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        int int17 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6866");
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
        boolean boolean21 = cSVRecord16.isSet("");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6867");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        int int13 = cSVRecord9.size();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6868");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6869");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        int int15 = cSVRecord9.size();
        boolean boolean16 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6870");
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
        java.lang.String str16 = cSVRecord5.getComment();
        boolean boolean17 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6871");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isMapped("");
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        int int14 = cSVRecord5.size();
        boolean boolean16 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        java.lang.String str18 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6872");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get("");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6873");
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
        java.lang.Class<?> wildcardClass17 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6874");
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
        int int15 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6875");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isConsistent();
        java.lang.String str9 = cSVRecord5.toString();
        int int10 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6876");
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
        boolean boolean19 = cSVRecord9.isMapped("hi!");
        int int20 = cSVRecord9.size();
        long long21 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray22 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6877");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
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
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6878");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        long long13 = cSVRecord9.getRecordNumber();
        java.lang.String str14 = cSVRecord9.toString();
        java.lang.String[] strArray15 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6879");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) 100);
        boolean boolean21 = cSVRecord20.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6880");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6881");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        boolean boolean15 = cSVRecord9.isMapped("");
        long long16 = cSVRecord9.getRecordNumber();
        boolean boolean18 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6882");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 10L);
        long long18 = cSVRecord17.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord17.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6883");
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
        boolean boolean18 = cSVRecord5.isSet("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6884");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean12 = cSVRecord9.isConsistent();
        int int13 = cSVRecord9.size();
        java.lang.String str14 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6885");
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
        boolean boolean20 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6886");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean14 = cSVRecord9.isMapped("");
        java.lang.String str15 = cSVRecord9.toString();
        boolean boolean17 = cSVRecord9.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6887");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isSet("");
        java.lang.String[] strArray14 = cSVRecord5.values();
        long long15 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6888");
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
        boolean boolean16 = cSVRecord9.isConsistent();
        java.lang.String str17 = cSVRecord9.toString();
        boolean boolean18 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6889");
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
        boolean boolean18 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord5.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6890");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String str7 = cSVRecord5.toString();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6891");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String str15 = cSVRecord13.get(0);
        java.lang.String str17 = cSVRecord13.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord13.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6892");
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
        java.lang.String[] strArray17 = cSVRecord9.values();
        int int18 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        boolean boolean21 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6893");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.lang.String[] strArray8 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "hi!", (long) (short) 0);
        java.lang.String[] strArray17 = cSVRecord16.values();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6894");
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
        boolean boolean18 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6895");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String[] strArray6 = cSVRecord4.values();
        long long7 = cSVRecord4.getRecordNumber();
        boolean boolean9 = cSVRecord4.isMapped("");
        java.lang.String str10 = cSVRecord4.getComment();
        long long11 = cSVRecord4.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord4.iterator();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6896");
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
        boolean boolean19 = cSVRecord5.isSet("");
        java.lang.String str20 = cSVRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6897");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        int int14 = cSVRecord9.size();
        long long15 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord9.iterator();
        long long17 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6898");
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
        int int19 = cSVRecord17.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord17.spliterator();
        java.lang.String[] strArray21 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "hi!", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6899");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        boolean boolean10 = cSVRecord5.isMapped("hi!");
        boolean boolean12 = cSVRecord5.isSet("");
        boolean boolean13 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6900");
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
        boolean boolean20 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord5.get("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6901");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray7, strMap12, "", (long) (-1));
        boolean boolean17 = cSVRecord15.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6902");
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
        boolean boolean18 = cSVRecord15.isSet("");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        long long20 = cSVRecord15.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6903");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        java.lang.String str15 = cSVRecord5.toString();
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "", (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord24.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6904");
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
        java.lang.Class<?> wildcardClass21 = strItor20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6905");
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
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord5.get("");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6906");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6907");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        int int13 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6908");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord10.spliterator();
        java.lang.String str13 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6909");
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
        boolean boolean15 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6910");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        long long12 = cSVRecord5.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6911");
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
        boolean boolean20 = cSVRecord17.isMapped("hi!");
        java.lang.String str21 = cSVRecord17.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6912");
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
        int int22 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6913");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        int int11 = cSVRecord5.size();
        boolean boolean13 = cSVRecord5.isSet("");
        long long14 = cSVRecord5.getRecordNumber();
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6914");
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
        long long15 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6915");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", 0L);
        boolean boolean15 = cSVRecord14.isConsistent();
        java.lang.String str16 = cSVRecord14.toString();
        java.lang.String str17 = cSVRecord14.getComment();
        boolean boolean19 = cSVRecord14.isSet("");
        int int20 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6916");
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
        boolean boolean15 = cSVRecord5.isSet("");
        boolean boolean17 = cSVRecord5.isMapped("");
        java.lang.String str18 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6917");
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
        boolean boolean17 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6918");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) ' ');
        boolean boolean22 = cSVRecord20.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6919");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6920");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        long long13 = cSVRecord9.getRecordNumber();
        java.lang.String str15 = cSVRecord9.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6921");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean14 = cSVRecord9.isMapped("");
        boolean boolean16 = cSVRecord9.isSet("");
        long long17 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6922");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray8, strMap17, "", (long) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6923");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String str14 = cSVRecord13.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord13.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6924");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str12 = cSVRecord10.get((int) (short) 0);
        java.lang.String[] strArray13 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) 1);
        int int22 = cSVRecord21.size();
        java.lang.String str23 = cSVRecord21.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6925");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        boolean boolean11 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6926");
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
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", (long) (short) 1);
        java.lang.String str17 = cSVRecord16.toString();
        java.lang.String str19 = cSVRecord16.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6927");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        int int6 = cSVRecord4.size();
        boolean boolean8 = cSVRecord4.isSet("hi!");
        java.lang.String[] strArray9 = cSVRecord4.values();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6928");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord9.iterator();
        boolean boolean21 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6929");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.getComment();
        java.lang.String str13 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6930");
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
        boolean boolean18 = cSVRecord16.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord16.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6931");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        boolean boolean16 = cSVRecord13.isConsistent();
        boolean boolean18 = cSVRecord13.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6932");
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
        int int21 = cSVRecord15.size();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6933");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "", 0L);
        java.lang.String str21 = cSVRecord20.toString();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6934");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", 10L);
        java.lang.String str19 = cSVRecord18.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6935");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6936");
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
        java.lang.String str20 = cSVRecord5.getComment();
        boolean boolean22 = cSVRecord5.isMapped("");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6937");
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
        boolean boolean17 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6938");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        boolean boolean9 = cSVRecord5.isMapped("");
        boolean boolean10 = cSVRecord5.isConsistent();
        int int11 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6939");
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
        boolean boolean23 = cSVRecord10.isSet("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6940");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "", (long) (byte) -1);
        java.lang.Class<?> wildcardClass14 = cSVRecord13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6941");
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
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", 100L);
        long long26 = cSVRecord25.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6942");
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
        java.lang.String str17 = cSVRecord5.getComment();
        boolean boolean19 = cSVRecord5.isSet("hi!");
        java.lang.String str20 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord5.iterator();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6943");
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
        int int14 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6944");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        int int6 = cSVRecord4.size();
        java.lang.String str7 = cSVRecord4.getComment();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6945");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord10.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6946");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        int int13 = cSVRecord9.size();
        java.lang.String str14 = cSVRecord9.getComment();
        java.lang.String str16 = cSVRecord9.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6947");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.toString();
        long long15 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6948");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        java.lang.String[] strArray16 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6949");
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
        boolean boolean14 = cSVRecord5.isMapped("");
        boolean boolean16 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6950");
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
        java.lang.String str20 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord5.get("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6951");
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
        java.lang.String[] strArray19 = cSVRecord16.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6952");
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
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord5.iterator();
        long long18 = cSVRecord5.getRecordNumber();
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
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6953");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        boolean boolean9 = cSVRecord4.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord4.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6954");
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
        boolean boolean24 = cSVRecord10.isConsistent();
        java.lang.String str25 = cSVRecord10.toString();
        boolean boolean27 = cSVRecord10.isSet("");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6955");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        boolean boolean11 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6956");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        boolean boolean14 = cSVRecord10.isSet("hi!");
        boolean boolean15 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6957");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6958");
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
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", (-1L));
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
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6959");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray23, strMap32, "", (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = cSVRecord35.get("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6960");
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
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 100L);
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord17.iterator();
        boolean boolean19 = cSVRecord17.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord17.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6961");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String[] strArray11 = cSVRecord5.values();
        long long12 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6962");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        int int15 = cSVRecord9.size();
        long long16 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6963");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        java.lang.String str6 = cSVRecord4.toString();
        boolean boolean8 = cSVRecord4.isMapped("");
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord4.iterator();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6964");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        java.lang.String[] strArray12 = cSVRecord11.values();
        int int13 = cSVRecord11.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6965");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6966");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = null;
        org.apache.commons.csv.CSVRecord cSVRecord7 = new org.apache.commons.csv.CSVRecord(strArray3, strMap4, "hi!", (long) (short) -1);
        boolean boolean8 = cSVRecord7.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord7.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6967");
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
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray12, strMap17, "hi!", (long) 'a');
        boolean boolean22 = cSVRecord20.isMapped("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord20.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6968");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        boolean boolean16 = cSVRecord9.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        boolean boolean19 = cSVRecord9.isSet("hi!");
        boolean boolean21 = cSVRecord9.isMapped("hi!");
        boolean boolean22 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6969");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6970");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        boolean boolean6 = cSVRecord4.isSet("");
        boolean boolean8 = cSVRecord4.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord4.spliterator();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSpliterator9);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6971");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        boolean boolean13 = cSVRecord5.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6972");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String[] strArray13 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6973");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String str10 = cSVRecord9.toString();
        boolean boolean12 = cSVRecord9.isSet("");
        java.lang.String str13 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        boolean boolean16 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6974");
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
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        boolean boolean23 = cSVRecord10.isSet("");
        boolean boolean25 = cSVRecord10.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord10.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6975");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.lang.String[] strArray14 = cSVRecord9.values();
        long long15 = cSVRecord9.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord9.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        boolean boolean18 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6976");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        boolean boolean14 = cSVRecord5.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord5.spliterator();
        long long16 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6977");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6978");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        boolean boolean16 = cSVRecord13.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord13.iterator();
        long long18 = cSVRecord13.getRecordNumber();
        int int19 = cSVRecord13.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6979");
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
        int int24 = cSVRecord23.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord23.iterator();
        java.lang.String str26 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6980");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "", (long) (byte) 100);
        int int16 = cSVRecord15.size();
        long long17 = cSVRecord15.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord15.get("hi!");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6981");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (-1L));
        int int9 = cSVRecord8.size();
        java.lang.String[] strArray10 = cSVRecord8.values();
        boolean boolean11 = cSVRecord8.isConsistent();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6982");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isConsistent();
        long long15 = cSVRecord9.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6983");
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
        long long21 = cSVRecord19.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6984");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean14 = cSVRecord5.isSet("hi!");
        int int15 = cSVRecord5.size();
        boolean boolean17 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord5.values();
        java.lang.String[] strArray19 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6985");
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
        java.lang.String str15 = cSVRecord5.getComment();
        int int16 = cSVRecord5.size();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6986");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", 0L);
        boolean boolean24 = cSVRecord22.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6987");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        java.lang.String str11 = cSVRecord5.get((int) (byte) 0);
        int int12 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6988");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        boolean boolean18 = cSVRecord5.isMapped("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6989");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.lang.String str12 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6990");
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
        java.lang.String str23 = cSVRecord22.getComment();
        long long24 = cSVRecord22.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord22.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6991");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) (byte) 1);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str11 = cSVRecord9.getComment();
        long long12 = cSVRecord9.getRecordNumber();
        long long13 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6992");
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
        java.lang.String str17 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord9.spliterator();
        java.lang.String[] strArray19 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6993");
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
        java.lang.String[] strArray15 = cSVRecord5.values();
        boolean boolean17 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6994");
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
        java.lang.String str32 = cSVRecord31.toString();
        long long33 = cSVRecord31.getRecordNumber();
        int int34 = cSVRecord31.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 97L + "'", long33 == 97L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6995");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord4.spliterator();
        long long7 = cSVRecord4.getRecordNumber();
        java.lang.String str8 = cSVRecord4.toString();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6996");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6997");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str12 = cSVRecord10.get((int) (short) 0);
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6998");
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
        java.lang.String str14 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isSet("");
        long long17 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord5.values();
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
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test6999");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        boolean boolean13 = cSVRecord9.isSet("");
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        java.lang.String str16 = cSVRecord9.getComment();
        boolean boolean17 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest13.test7000");
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
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "", (long) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
    }
}

