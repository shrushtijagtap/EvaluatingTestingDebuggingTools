package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        boolean boolean12 = cSVRecord11.isConsistent();
        long long13 = cSVRecord11.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord11.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 100);
        boolean boolean19 = cSVRecord18.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
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
        boolean boolean19 = cSVRecord9.isMapped("hi!");
        int int20 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        boolean boolean13 = cSVRecord11.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
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
        int int13 = cSVRecord5.size();
        boolean boolean15 = cSVRecord5.isMapped("");
        java.lang.String str16 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
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
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str10 = cSVRecord5.toString();
        long long11 = cSVRecord5.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
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
        int int16 = cSVRecord5.size();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String str12 = cSVRecord10.toString();
        long long13 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
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
        boolean boolean17 = cSVRecord5.isSet("hi!");
        boolean boolean18 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
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
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
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
        boolean boolean15 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
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
        long long13 = cSVRecord5.getRecordNumber();
        boolean boolean14 = cSVRecord5.isConsistent();
        int int15 = cSVRecord5.size();
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.lang.String[] strArray17 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String str7 = cSVRecord5.toString();
        int int8 = cSVRecord5.size();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
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
        int int19 = cSVRecord9.size();
        int int20 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
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
        boolean boolean20 = cSVRecord5.isSet("hi!");
        java.lang.Class<?> wildcardClass21 = cSVRecord5.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.String[] strArray11 = cSVRecord10.values();
        int int12 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
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
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "hi!", (long) (byte) 0);
        boolean boolean29 = cSVRecord27.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
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
        boolean boolean19 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord5.values();
        boolean boolean15 = cSVRecord5.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get("hi!");
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord4.spliterator();
        long long7 = cSVRecord4.getRecordNumber();
        boolean boolean8 = cSVRecord4.isConsistent();
        long long9 = cSVRecord4.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
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
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) ' ');
        java.lang.String str23 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        java.lang.String[] strArray13 = cSVRecord5.values();
        long long14 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
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
        boolean boolean22 = cSVRecord10.isConsistent();
        boolean boolean24 = cSVRecord10.isSet("");
        boolean boolean25 = cSVRecord10.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
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
        java.lang.String str17 = cSVRecord5.getComment();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
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
        java.lang.String str32 = cSVRecord27.toString();
        boolean boolean34 = cSVRecord27.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        long long12 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
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
        java.lang.String str16 = cSVRecord5.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord26.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String[] strArray8 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) (short) 100);
        long long6 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
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
        java.lang.String str22 = cSVRecord5.get(0);
        java.lang.String str23 = cSVRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "hi!", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray10, strMap19, "", (long) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
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
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
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
        long long17 = cSVRecord9.getRecordNumber();
        int int18 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
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
        long long15 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
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
        java.lang.String str19 = cSVRecord9.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord9.spliterator();
        java.lang.String str21 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isSet("");
        boolean boolean14 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        boolean boolean15 = cSVRecord5.isSet("");
        boolean boolean16 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        long long8 = cSVRecord4.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord4.spliterator();
        boolean boolean11 = cSVRecord4.isMapped("");
        java.lang.String str12 = cSVRecord4.toString();
        java.lang.String[] strArray13 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
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
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
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
        java.lang.String str18 = cSVRecord17.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
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
        boolean boolean24 = cSVRecord22.isMapped("");
        int int25 = cSVRecord22.size();
        boolean boolean26 = cSVRecord22.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
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
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord25.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
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
        java.lang.String str24 = cSVRecord23.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 'a');
        boolean boolean6 = cSVRecord4.isSet("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        long long11 = cSVRecord5.getRecordNumber();
        long long12 = cSVRecord5.getRecordNumber();
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        boolean boolean12 = cSVRecord9.isSet("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray13, strMap22, "", (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord25.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        boolean boolean6 = cSVRecord4.isConsistent();
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray6, strMap15, "", (long) 10);
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
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
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String str6 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
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
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        boolean boolean17 = cSVRecord9.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord9.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
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
        long long13 = cSVRecord5.getRecordNumber();
        java.lang.String str14 = cSVRecord5.getComment();
        java.lang.String str15 = cSVRecord5.toString();
        java.lang.String str16 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
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
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
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
        boolean boolean21 = cSVRecord5.isSet("[hi!, , hi!]");
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
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        boolean boolean17 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
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
        java.lang.String[] strArray27 = cSVRecord15.values();
        java.lang.String str28 = cSVRecord15.toString();
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
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord17.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord17.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
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
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord23.iterator();
        java.lang.Class<?> wildcardClass30 = cSVRecord23.getClass();
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
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
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
        java.lang.String str15 = cSVRecord5.getComment();
        boolean boolean17 = cSVRecord5.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        long long9 = cSVRecord5.getRecordNumber();
        int int10 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str13 = cSVRecord5.get((int) (byte) 0);
        java.lang.String str14 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
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
        java.lang.Class<?> wildcardClass30 = cSVRecord27.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
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
        long long22 = cSVRecord5.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        int int11 = cSVRecord5.size();
        java.lang.String str12 = cSVRecord5.getComment();
        java.lang.String str13 = cSVRecord5.getComment();
        java.lang.String str14 = cSVRecord5.toString();
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        long long13 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isSet("hi!");
        long long10 = cSVRecord5.getRecordNumber();
        long long11 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
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
        java.lang.String[] strArray18 = cSVRecord9.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean11 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isSet("");
        int int14 = cSVRecord5.size();
        long long15 = cSVRecord5.getRecordNumber();
        java.lang.String str16 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        boolean boolean15 = cSVRecord9.isConsistent();
        java.lang.String[] strArray16 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
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
        boolean boolean13 = cSVRecord5.isConsistent();
        int int14 = cSVRecord5.size();
        boolean boolean15 = cSVRecord5.isConsistent();
        java.lang.String[] strArray16 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
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
        boolean boolean24 = cSVRecord21.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isSet("");
        boolean boolean10 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
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
        java.lang.String str32 = cSVRecord27.get(0);
        boolean boolean34 = cSVRecord27.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
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
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        boolean boolean20 = cSVRecord5.isSet("");
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
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        boolean boolean15 = cSVRecord9.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
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
        boolean boolean16 = cSVRecord9.isConsistent();
        int int17 = cSVRecord9.size();
        java.lang.String str18 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
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
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
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
        int int16 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isConsistent();
        int int18 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        java.lang.String str8 = cSVRecord4.getComment();
        java.lang.String[] strArray9 = cSVRecord4.values();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
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
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "", (long) '4');
        java.lang.String str30 = cSVRecord29.getComment();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
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
        boolean boolean19 = cSVRecord16.isSet("hi!");
        java.lang.Class<?> wildcardClass20 = cSVRecord16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
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
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray11, strMap20, "hi!", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray11, strMap24, "[hi!, , hi!]", (long) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord9.get("[hi!, , hi!]");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord5.spliterator();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "", (long) (short) 10);
        java.lang.Class<?> wildcardClass12 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.lang.String str15 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord17.spliterator();
        long long19 = cSVRecord17.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord17.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "", (long) ' ');
        java.lang.String[] strArray26 = cSVRecord25.values();
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
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
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
        int int20 = cSVRecord10.size();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
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
        java.lang.String[] strArray22 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) (short) 100);
        boolean boolean28 = cSVRecord26.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord26.get((int) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
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
            java.lang.String str22 = cSVRecord5.get((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        long long12 = cSVRecord5.getRecordNumber();
        boolean boolean14 = cSVRecord5.isSet("[hi!, , hi!]");
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
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
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get(10);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord4.iterator();
        long long10 = cSVRecord4.getRecordNumber();
        java.lang.Class<?> wildcardClass11 = cSVRecord4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (-1L));
        java.lang.String str9 = cSVRecord8.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord8.spliterator();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSpliterator10);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        long long12 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.lang.String str15 = cSVRecord5.get(0);
        java.lang.String str16 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
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
        java.lang.String str15 = cSVRecord5.toString();
        boolean boolean16 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord5.iterator();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
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
        boolean boolean24 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord5.get("[hi!, , hi!]");
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
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
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
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
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
        int int18 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
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
        java.lang.String str17 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
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
        java.lang.String[] strArray15 = cSVRecord5.values();
        java.lang.String str16 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
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
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.String str17 = cSVRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
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
        int int26 = cSVRecord23.size();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray9, strMap10, "", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray9, strMap14, "hi!", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord17.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
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
        int int30 = cSVRecord27.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.lang.String str14 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
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
        boolean boolean17 = cSVRecord5.isSet("[hi!, , hi!]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String str12 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
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
        java.lang.String[] strArray19 = cSVRecord5.values();
        int int20 = cSVRecord5.size();
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
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
        boolean boolean19 = cSVRecord17.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
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
        java.lang.String str13 = cSVRecord5.getComment();
        java.lang.String str14 = cSVRecord5.getComment();
        boolean boolean16 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
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
        java.lang.String str19 = cSVRecord16.toString();
        java.lang.String str20 = cSVRecord16.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
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
        java.lang.String str23 = cSVRecord9.getComment();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
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
        boolean boolean18 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord4.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
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
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        boolean boolean18 = cSVRecord5.isMapped("hi!");
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
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
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
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord16.iterator();
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
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
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
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        boolean boolean12 = cSVRecord5.isSet("");
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
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
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray11, strMap28, "hi!", (long) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray4, strMap9, "", (-1L));
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
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
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
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
        boolean boolean16 = cSVRecord9.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        int int11 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", (long) (short) 1);
        java.lang.String[] strArray32 = cSVRecord31.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.lang.String[] strArray9 = cSVRecord5.values();
        long long10 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord4.iterator();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
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
        java.lang.String str15 = cSVRecord5.get((int) (byte) 0);
        java.lang.String str16 = cSVRecord5.toString();
        long long17 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get(0);
        boolean boolean10 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
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
        long long16 = cSVRecord5.getRecordNumber();
        java.lang.String str17 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord14.spliterator();
        java.lang.String str16 = cSVRecord14.getComment();
        boolean boolean18 = cSVRecord14.isSet("hi!");
        java.lang.String[] strArray19 = cSVRecord14.values();
        java.lang.String[] strArray20 = cSVRecord14.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!]", 1L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        long long7 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
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
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
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
        int int18 = cSVRecord9.size();
        java.lang.String str19 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) 'a');
        int int12 = cSVRecord11.size();
        boolean boolean14 = cSVRecord11.isSet("hi!");
        java.lang.String str15 = cSVRecord11.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
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
        long long21 = cSVRecord10.getRecordNumber();
        long long22 = cSVRecord10.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
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
        boolean boolean19 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
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
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str10 = cSVRecord5.toString();
        int int11 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
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
        long long22 = cSVRecord21.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        long long11 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
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
        java.lang.String str18 = cSVRecord13.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord4.iterator();
        long long7 = cSVRecord4.getRecordNumber();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
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
        long long16 = cSVRecord9.getRecordNumber();
        int int17 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        boolean boolean17 = cSVRecord5.isConsistent();
        boolean boolean19 = cSVRecord5.isSet("");
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isSet("");
        java.lang.String str10 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
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
        int int28 = cSVRecord15.size();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
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
        java.lang.String str16 = cSVRecord15.toString();
        java.lang.String str17 = cSVRecord15.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        java.lang.String str10 = cSVRecord5.get((int) (byte) 0);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
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
        boolean boolean29 = cSVRecord27.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (byte) 0);
        java.lang.String str5 = cSVRecord4.toString();
        boolean boolean6 = cSVRecord4.isConsistent();
        boolean boolean8 = cSVRecord4.isMapped("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 100L);
        java.lang.String str5 = cSVRecord4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
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
        java.lang.String str18 = cSVRecord10.getComment();
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
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
        java.lang.String str16 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        boolean boolean8 = cSVRecord5.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
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
        boolean boolean22 = cSVRecord20.isSet("");
        long long23 = cSVRecord20.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
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
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord5.iterator();
        int int17 = cSVRecord5.size();
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
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord5.get("[hi!, , hi!]");
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
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        java.lang.String str9 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
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
        boolean boolean20 = cSVRecord5.isMapped("");
        java.lang.String str21 = cSVRecord5.getComment();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
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
        long long32 = cSVRecord31.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str10 = cSVRecord5.toString();
        int int11 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        boolean boolean12 = cSVRecord11.isConsistent();
        int int13 = cSVRecord11.size();
        int int14 = cSVRecord11.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) (byte) -1);
        int int15 = cSVRecord14.size();
        java.lang.String[] strArray16 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        long long9 = cSVRecord5.getRecordNumber();
        java.lang.String str10 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
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
        long long16 = cSVRecord5.getRecordNumber();
        long long17 = cSVRecord5.getRecordNumber();
        java.lang.String str18 = cSVRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
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
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isMapped("[hi!, , hi!]");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
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
        java.lang.String str19 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        int int12 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord16.get("hi!");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) 'a');
        java.lang.String str5 = cSVRecord4.toString();
        java.lang.String[] strArray6 = cSVRecord4.values();
        java.lang.String str7 = cSVRecord4.toString();
        int int8 = cSVRecord4.size();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
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
        java.lang.Class<?> wildcardClass23 = strSpliterator22.getClass();
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
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.lang.String[] strArray7 = cSVRecord5.values();
        boolean boolean9 = cSVRecord5.isMapped("hi!");
        boolean boolean11 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
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
        java.util.Spliterator<java.lang.String> strSpliterator32 = cSVRecord27.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = cSVRecord27.get("");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(strSpliterator32);
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
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
        java.util.Spliterator<java.lang.String> strSpliterator36 = cSVRecord35.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator36);
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord9.spliterator();
        int int12 = cSVRecord9.size();
        int int13 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        long long14 = cSVRecord13.getRecordNumber();
        boolean boolean16 = cSVRecord13.isSet("hi!");
        long long17 = cSVRecord13.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
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
        boolean boolean17 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
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
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray21, strMap26, "", (long) (byte) 0);
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
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
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
        java.lang.String[] strArray32 = cSVRecord31.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
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
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord9.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
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
        int int16 = cSVRecord14.size();
        int int17 = cSVRecord14.size();
        long long18 = cSVRecord14.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "", 1L);
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord18.spliterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord18.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
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
        int int14 = cSVRecord5.size();
        long long15 = cSVRecord5.getRecordNumber();
        boolean boolean17 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        long long11 = cSVRecord5.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        long long11 = cSVRecord5.getRecordNumber();
        long long12 = cSVRecord5.getRecordNumber();
        boolean boolean14 = cSVRecord5.isMapped("");
        int int15 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord5.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord9.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord20.get("[hi!, , hi!]");
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
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String str10 = cSVRecord9.toString();
        boolean boolean12 = cSVRecord9.isSet("");
        boolean boolean14 = cSVRecord9.isSet("hi!");
        java.lang.String str15 = cSVRecord9.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
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
        java.lang.String str17 = cSVRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
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
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[hi!, , hi!]", (long) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String[] strArray5 = cSVRecord4.values();
        boolean boolean6 = cSVRecord4.isConsistent();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str12 = cSVRecord10.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
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
        boolean boolean20 = cSVRecord9.isMapped("");
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.lang.String[] strArray10 = cSVRecord5.values();
        long long11 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
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
        java.lang.String str20 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (short) 0);
        java.lang.String str12 = cSVRecord11.getComment();
        java.lang.String[] strArray13 = cSVRecord11.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
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
        java.lang.String str31 = cSVRecord27.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        boolean boolean15 = cSVRecord13.isMapped("");
        java.lang.String[] strArray16 = cSVRecord13.values();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord13.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord9.spliterator();
        long long19 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
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
        boolean boolean20 = cSVRecord5.isMapped("");
        java.lang.String str21 = cSVRecord5.getComment();
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord21.get("");
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
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
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
        java.lang.String str18 = cSVRecord16.getComment();
        boolean boolean20 = cSVRecord16.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 10L);
        java.lang.String str18 = cSVRecord17.toString();
        boolean boolean20 = cSVRecord17.isSet("");
        boolean boolean22 = cSVRecord17.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
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
        int int13 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
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
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean8 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        int int12 = cSVRecord5.size();
        long long13 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        int int12 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
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
        boolean boolean15 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
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
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        boolean boolean12 = cSVRecord5.isSet("");
        boolean boolean13 = cSVRecord5.isConsistent();
        boolean boolean14 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
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
        boolean boolean23 = cSVRecord21.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "[hi!, , hi!]", (-1L));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.toString();
        java.lang.String str13 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
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
        boolean boolean23 = cSVRecord17.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
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
        long long19 = cSVRecord5.getRecordNumber();
        boolean boolean21 = cSVRecord5.isMapped("hi!");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        int int9 = cSVRecord5.size();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "[hi!, , hi!]", 0L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray8, strMap13, "", 1L);
        java.lang.Class<?> wildcardClass17 = cSVRecord16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
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
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord20.spliterator();
        java.lang.String str23 = cSVRecord20.get(0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        boolean boolean6 = cSVRecord4.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord4.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
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
        boolean boolean20 = cSVRecord9.isSet("hi!");
        int int21 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        boolean boolean12 = cSVRecord10.isConsistent();
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
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
        int int17 = cSVRecord9.size();
        long long18 = cSVRecord9.getRecordNumber();
        long long19 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "[hi!, , hi!]", (long) 100);
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        boolean boolean11 = cSVRecord9.isSet("");
        java.lang.String str12 = cSVRecord9.toString();
        long long13 = cSVRecord9.getRecordNumber();
        int int14 = cSVRecord9.size();
        long long15 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        java.lang.String str14 = cSVRecord5.getComment();
        java.lang.String str15 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get("hi!");
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
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
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
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord23.spliterator();
        boolean boolean29 = cSVRecord23.isMapped("hi!");
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
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", (long) 'a');
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord15.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
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
        java.lang.String[] strArray20 = cSVRecord16.values();
        java.lang.Class<?> wildcardClass21 = cSVRecord16.getClass();
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 0);
        boolean boolean5 = cSVRecord4.isConsistent();
        java.lang.String str6 = cSVRecord4.toString();
        java.lang.String[] strArray7 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) 1);
        boolean boolean13 = cSVRecord11.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        long long10 = cSVRecord9.getRecordNumber();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.String str12 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        boolean boolean13 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = cSVRecord31.get("hi!");
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
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
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
        boolean boolean19 = cSVRecord9.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord9.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
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
        boolean boolean19 = cSVRecord5.isMapped("");
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
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) (short) 100);
        int int6 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
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
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
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
        long long17 = cSVRecord5.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean14 = cSVRecord9.isMapped("");
        java.lang.String str15 = cSVRecord9.getComment();
        java.lang.String str16 = cSVRecord9.getComment();
        boolean boolean18 = cSVRecord9.isSet("hi!");
        int int19 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
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
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord14.spliterator();
        java.lang.String str16 = cSVRecord14.getComment();
        boolean boolean18 = cSVRecord14.isMapped("hi!");
        boolean boolean20 = cSVRecord14.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
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
        java.lang.String str24 = cSVRecord22.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord22.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
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
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord23.iterator();
        long long30 = cSVRecord23.getRecordNumber();
        boolean boolean32 = cSVRecord23.isSet("");
        java.lang.String[] strArray33 = cSVRecord23.values();
        java.lang.String str34 = cSVRecord23.toString();
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
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
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
        java.lang.String str15 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
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
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "hi!", (long) 'a');
        long long16 = cSVRecord15.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord15.spliterator();
        int int18 = cSVRecord15.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        int int11 = cSVRecord10.size();
        long long12 = cSVRecord10.getRecordNumber();
        int int13 = cSVRecord10.size();
        java.lang.String str14 = cSVRecord10.getComment();
        int int15 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
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
        int int16 = cSVRecord9.size();
        boolean boolean17 = cSVRecord9.isConsistent();
        boolean boolean19 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.lang.String[] strArray8 = cSVRecord4.values();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord4.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strSpliterator9);
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
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
        java.lang.String str16 = cSVRecord9.getComment();
        long long17 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord4.iterator();
        long long10 = cSVRecord4.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
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
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
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
        boolean boolean20 = cSVRecord19.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord19.get((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord17.spliterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord17.iterator();
        boolean boolean21 = cSVRecord17.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord17.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
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
        java.lang.String str17 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        int int12 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
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
        int int19 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray11, strMap36, "", (long) (short) 100);
        long long40 = cSVRecord39.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "", (long) 'a');
        int int20 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean12 = cSVRecord5.isConsistent();
        java.lang.String[] strArray13 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        java.lang.String[] strArray15 = cSVRecord13.values();
        boolean boolean17 = cSVRecord13.isSet("");
        long long18 = cSVRecord13.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
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
        boolean boolean19 = cSVRecord17.isSet("");
        boolean boolean21 = cSVRecord17.isSet("[hi!, , hi!]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
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
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray6, strMap19, "hi!", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray6, strMap23, "[hi!, , hi!]", (long) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
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
        int int14 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[hi!, , hi!]", (long) (-1));
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
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
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
        boolean boolean16 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass17 = cSVRecord5.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
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
        boolean boolean31 = cSVRecord26.isConsistent();
        int int32 = cSVRecord26.size();
        java.util.Spliterator<java.lang.String> strSpliterator33 = cSVRecord26.spliterator();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(strSpliterator33);
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
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
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord9.iterator();
        int int18 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.String[] strArray13 = cSVRecord5.values();
        boolean boolean15 = cSVRecord5.isSet("hi!");
        boolean boolean17 = cSVRecord5.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        int int19 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord5.iterator();
        int int21 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord5.get(10);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "", (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord11.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
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
        java.lang.String[] strArray18 = cSVRecord16.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "hi!", (long) (short) 1);
        long long27 = cSVRecord26.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord26.get("hi!");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        int int11 = cSVRecord5.size();
        java.lang.String str12 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("[hi!, , hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
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
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        int int10 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass11 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator18);
    }
}

