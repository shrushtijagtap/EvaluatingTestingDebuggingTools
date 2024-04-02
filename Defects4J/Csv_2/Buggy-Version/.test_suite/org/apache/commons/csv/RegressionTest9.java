package org.apache.commons.csv;

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
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", (long) 'a');
        java.lang.String[] strArray22 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) (short) 10);
        boolean boolean27 = cSVRecord26.isConsistent();
        long long28 = cSVRecord26.getRecordNumber();
        boolean boolean30 = cSVRecord26.isSet("[, hi!, hi!, , , ]");
        boolean boolean32 = cSVRecord26.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (short) 1);
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord23.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isMapped("");
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        boolean boolean23 = cSVRecord10.isConsistent();
        boolean boolean24 = cSVRecord10.isConsistent();
        int int25 = cSVRecord10.size();
        java.lang.String str26 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        long long15 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "[, hi!, hi!, , , ]", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray20, strMap29, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray20, strMap33, "", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap37 = null;
        org.apache.commons.csv.CSVRecord cSVRecord40 = new org.apache.commons.csv.CSVRecord(strArray20, strMap37, "", (long) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.get(0);
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean25 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        int int26 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", (long) (short) -1);
        boolean boolean26 = cSVRecord24.isSet("");
        boolean boolean28 = cSVRecord24.isSet("");
        java.lang.String[] strArray29 = cSVRecord24.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray29, strMap30, "", (long) 0);
        boolean boolean35 = cSVRecord33.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String str23 = cSVRecord10.toString();
        int int24 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "", 32L);
        java.lang.String[] strArray25 = cSVRecord24.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray25, strMap26, "", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.get(4);
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean25 = cSVRecord10.isSet("");
        int int26 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isMapped("");
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long22 = cSVRecord10.getRecordNumber();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", (long) (byte) 1);
        java.lang.String[] strArray23 = cSVRecord22.values();
        boolean boolean25 = cSVRecord22.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String str19 = cSVRecord10.toString();
        long long20 = cSVRecord10.getRecordNumber();
        int int21 = cSVRecord10.size();
        java.lang.String str22 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[]", (long) (-1));
        java.lang.Class<?> wildcardClass23 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        boolean boolean21 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean23 = cSVRecord10.isSet("[]");
        boolean boolean25 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str21 = cSVRecord10.get(4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[]", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray18, strMap27, "hi!", 0L);
        java.lang.String str31 = cSVRecord30.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.lang.String[] strArray4 = new java.lang.String[] { "[, hi!, hi!, , , ]", "", "", "[, hi!, hi!, , , ]" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "[, hi!, hi!, , , ]", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray4, strMap9, "", (long) (byte) -1);
        java.lang.String[] strArray13 = cSVRecord12.values();
        java.lang.Class<?> wildcardClass14 = cSVRecord12.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (-1L));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", 0L);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        int int23 = cSVRecord21.size();
        int int24 = cSVRecord21.size();
        int int25 = cSVRecord21.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, hi!, , , ]", (long) 6);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", 0L);
        boolean boolean25 = cSVRecord23.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str26 = cSVRecord23.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", (long) ' ');
        java.lang.Class<?> wildcardClass28 = cSVRecord27.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", 32L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) 0);
        long long32 = cSVRecord31.getRecordNumber();
        java.lang.String str33 = cSVRecord31.toString();
        boolean boolean34 = cSVRecord31.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[, hi!, hi!, , , ]" + "'", str33, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) 3);
        boolean boolean25 = cSVRecord23.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[, hi!, hi!, , , ]", 6L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord23.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str16 = cSVRecord10.get((int) (short) 1);
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", 10L);
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord22.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "", (long) 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String[] strArray19 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[]", (long) (short) 10);
        boolean boolean23 = cSVRecord21.isMapped("hi!");
        int int24 = cSVRecord21.size();
        java.lang.String str25 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        long long22 = cSVRecord10.getRecordNumber();
        boolean boolean24 = cSVRecord10.isMapped("hi!");
        boolean boolean26 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", (long) (short) -1);
        boolean boolean26 = cSVRecord24.isSet("");
        boolean boolean28 = cSVRecord24.isSet("");
        boolean boolean29 = cSVRecord24.isConsistent();
        int int30 = cSVRecord24.size();
        int int31 = cSVRecord24.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = cSVRecord24.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String str22 = cSVRecord10.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) 0);
        java.lang.String[] strArray24 = cSVRecord23.values();
        java.lang.String str25 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isSet("");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord10.values();
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "hi!", 32L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) 0);
        boolean boolean33 = cSVRecord31.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean34 = cSVRecord31.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "[hi!, hi!, [, hi!, hi!, , , ]]", 32L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord25.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isSet("");
        boolean boolean24 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, hi!, , , ]", (long) 6);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord23.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean18 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        boolean boolean24 = cSVRecord10.isConsistent();
        boolean boolean25 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", 0L);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.lang.String str24 = cSVRecord22.toString();
        int int25 = cSVRecord22.size();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[, hi!, hi!, , , ]", (long) ' ');
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord23.iterator();
        boolean boolean25 = cSVRecord23.isConsistent();
        boolean boolean26 = cSVRecord23.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "hi!", 32L);
        boolean boolean26 = cSVRecord24.isMapped("[]");
        java.lang.String str27 = cSVRecord24.toString();
        java.lang.String[] strArray28 = cSVRecord24.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[, hi!, hi!, , , ]" + "'", str27, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isMapped("[]");
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.Class<?> wildcardClass18 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        long long18 = cSVRecord10.getRecordNumber();
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean23 = cSVRecord10.isConsistent();
        int int24 = cSVRecord10.size();
        boolean boolean26 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        int int15 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        long long18 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean25 = cSVRecord10.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord10.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "", 32L);
        boolean boolean26 = cSVRecord24.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean28 = cSVRecord24.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator29 = cSVRecord24.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSpliterator29);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str16 = cSVRecord10.get((int) (short) 1);
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String str20 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 6);
        java.lang.Class<?> wildcardClass19 = cSVRecord18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean21 = cSVRecord10.isMapped("");
        java.lang.String str23 = cSVRecord10.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str20 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[]", (long) 6);
        java.lang.String[] strArray27 = cSVRecord26.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isMapped("");
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        int int24 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean24 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        int int21 = cSVRecord10.size();
        java.lang.String[] strArray22 = cSVRecord10.values();
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        int int22 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.lang.String str24 = cSVRecord10.getComment();
        boolean boolean26 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "hi!", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray23, strMap32, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 0L);
        java.lang.String[] strArray36 = cSVRecord35.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[]", (long) (short) 0);
        java.lang.String str23 = cSVRecord22.getComment();
        int int24 = cSVRecord22.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, hi!, hi!, , , ]", (long) (byte) -1);
        java.lang.String str23 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", (long) (byte) 1);
        int int23 = cSVRecord22.size();
        boolean boolean24 = cSVRecord22.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord22.spliterator();
        java.lang.String str26 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "hi!", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray20, strMap29, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray20, strMap33, "", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap37 = null;
        org.apache.commons.csv.CSVRecord cSVRecord40 = new org.apache.commons.csv.CSVRecord(strArray20, strMap37, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (short) 100);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 0);
        long long19 = cSVRecord18.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord18.spliterator();
        boolean boolean21 = cSVRecord18.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("");
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "hi!", 0L);
        boolean boolean26 = cSVRecord24.isMapped("[]");
        boolean boolean28 = cSVRecord24.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray19 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        int int18 = cSVRecord10.size();
        java.lang.String[] strArray19 = cSVRecord10.values();
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        long long20 = cSVRecord10.getRecordNumber();
        int int21 = cSVRecord10.size();
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[]", (-1L));
        java.lang.String[] strArray28 = cSVRecord27.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray28, strMap29, "[, hi!, hi!, , , ]", (long) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", 100L);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        long long21 = cSVRecord19.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", (long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[, hi!, hi!, , , ]", 0L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isSet("hi!");
        boolean boolean25 = cSVRecord10.isConsistent();
        int int26 = cSVRecord10.size();
        boolean boolean28 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String[] strArray29 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isSet("[]");
        java.lang.String str26 = cSVRecord10.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.lang.String str23 = cSVRecord10.get((int) (short) 0);
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) -1);
        int int21 = cSVRecord20.size();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord20.spliterator();
        boolean boolean24 = cSVRecord20.isMapped("[]");
        boolean boolean26 = cSVRecord20.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean28 = cSVRecord20.isSet("");
        long long29 = cSVRecord20.getRecordNumber();
        java.lang.String str30 = cSVRecord20.toString();
        boolean boolean32 = cSVRecord20.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (short) 10);
        boolean boolean25 = cSVRecord23.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String str23 = cSVRecord10.toString();
        long long24 = cSVRecord10.getRecordNumber();
        boolean boolean26 = cSVRecord10.isSet("hi!");
        int int27 = cSVRecord10.size();
        boolean boolean28 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strItor29);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isSet("[]");
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        int int18 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        boolean boolean20 = cSVRecord18.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String[] strArray21 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[]", (long) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean23 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String str22 = cSVRecord10.getComment();
        int int23 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray18 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isMapped("[]");
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String[] strArray22 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isMapped("");
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        long long24 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.lang.String str20 = cSVRecord18.getComment();
        boolean boolean22 = cSVRecord18.isMapped("[, hi!, hi!, , , ]");
        boolean boolean24 = cSVRecord18.isMapped("");
        boolean boolean25 = cSVRecord18.isConsistent();
        java.lang.String str26 = cSVRecord18.toString();
        java.lang.String[] strArray27 = cSVRecord18.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        long long18 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String str21 = cSVRecord10.get((int) (short) 1);
        boolean boolean23 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) -1);
        java.lang.String[] strArray21 = cSVRecord20.values();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord20.spliterator();
        long long23 = cSVRecord20.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 6L);
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord24.iterator();
        java.lang.String str26 = cSVRecord24.toString();
        java.lang.String[] strArray27 = cSVRecord24.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray27, strMap28, "[]", (long) (byte) 0);
        java.lang.String str32 = cSVRecord31.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[, hi!, hi!, , , ]" + "'", str32, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (-1));
        boolean boolean6 = cSVRecord4.isMapped("hi!");
        int int7 = cSVRecord4.size();
        boolean boolean8 = cSVRecord4.isConsistent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", (long) (byte) 1);
        boolean boolean23 = cSVRecord22.isConsistent();
        long long24 = cSVRecord22.getRecordNumber();
        int int25 = cSVRecord22.size();
        int int26 = cSVRecord22.size();
        boolean boolean28 = cSVRecord22.isSet("[, hi!, hi!, , , ]");
        java.lang.String str29 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, hi!, , , ]", (long) 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        java.lang.String str22 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass24 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.toString();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isSet("");
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        boolean boolean24 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean26 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String str27 = cSVRecord10.getComment();
        java.lang.String str28 = cSVRecord10.getComment();
        java.lang.String str29 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        int int14 = cSVRecord10.size();
        java.lang.String str16 = cSVRecord10.get(1);
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        int int19 = cSVRecord10.size();
        int int20 = cSVRecord10.size();
        long long21 = cSVRecord10.getRecordNumber();
        long long22 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[]");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        boolean boolean24 = cSVRecord10.isConsistent();
        java.lang.String str25 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.lang.String str20 = cSVRecord18.getComment();
        int int21 = cSVRecord18.size();
        java.lang.String str22 = cSVRecord18.getComment();
        boolean boolean24 = cSVRecord18.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String[] strArray25 = cSVRecord18.values();
        java.lang.String str26 = cSVRecord18.toString();
        java.lang.String str27 = cSVRecord18.getComment();
        boolean boolean29 = cSVRecord18.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[, hi!, hi!, , , ]", (long) 0);
        int int27 = cSVRecord26.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        int int16 = cSVRecord10.size();
        java.lang.String[] strArray17 = cSVRecord10.values();
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        int int18 = cSVRecord10.size();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass20 = strArray19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 4L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass18 = strArray17.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean19 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        long long20 = cSVRecord10.getRecordNumber();
        int int21 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        int int22 = cSVRecord10.size();
        boolean boolean24 = cSVRecord10.isMapped("");
        boolean boolean25 = cSVRecord10.isConsistent();
        java.lang.String[] strArray26 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.lang.String str20 = cSVRecord18.getComment();
        boolean boolean22 = cSVRecord18.isSet("[]");
        java.lang.Class<?> wildcardClass23 = cSVRecord18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) 4);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("");
        long long17 = cSVRecord10.getRecordNumber();
        int int18 = cSVRecord10.size();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isMapped("");
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str23 = cSVRecord10.get((int) (byte) 1);
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str23 = cSVRecord10.getComment();
        int int24 = cSVRecord10.size();
        java.lang.String[] strArray25 = cSVRecord10.values();
        java.lang.String str26 = cSVRecord10.toString();
        long long27 = cSVRecord10.getRecordNumber();
        boolean boolean29 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String str30 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray20, strMap29, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray20, strMap33, "", 6L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap37 = null;
        org.apache.commons.csv.CSVRecord cSVRecord40 = new org.apache.commons.csv.CSVRecord(strArray20, strMap37, "", (long) (-1));
        boolean boolean42 = cSVRecord40.isMapped("[]");
        boolean boolean44 = cSVRecord40.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", 0L);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        boolean boolean24 = cSVRecord21.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String str25 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", (long) ' ');
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord27.iterator();
        long long29 = cSVRecord27.getRecordNumber();
        java.lang.String[] strArray30 = cSVRecord27.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = cSVRecord27.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.get(0);
        boolean boolean23 = cSVRecord10.isConsistent();
        boolean boolean25 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        java.lang.String str27 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[, hi!, hi!, , , ]" + "'", str27, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) 6);
        long long23 = cSVRecord22.getRecordNumber();
        java.lang.Class<?> wildcardClass24 = cSVRecord22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 6L + "'", long23 == 6L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass21 = strArray20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", 0L);
        boolean boolean23 = cSVRecord22.isConsistent();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord22.iterator();
        long long25 = cSVRecord22.getRecordNumber();
        boolean boolean27 = cSVRecord22.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.get(0);
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean25 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) 6);
        long long23 = cSVRecord22.getRecordNumber();
        int int24 = cSVRecord22.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 6L + "'", long23 == 6L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        long long19 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.lang.String[] strArray5 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray5, strMap6, "", 32L);
        int int10 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.String str23 = cSVRecord10.get((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long24 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        java.lang.String str26 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isMapped("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        int int16 = cSVRecord10.size();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.toString();
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass21 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        java.lang.String str23 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        boolean boolean18 = cSVRecord10.isConsistent();
        int int19 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) 100);
        boolean boolean23 = cSVRecord21.isMapped("hi!");
        java.lang.String str24 = cSVRecord21.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, [, hi!, hi!, , , ]]" + "'", str24, "[hi!, hi!, [, hi!, hi!, , , ]]");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        int int18 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[, hi!, hi!, , , ]", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isMapped("");
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        long long22 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean18 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        int int23 = cSVRecord10.size();
        java.lang.String str24 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord10.spliterator();
        long long27 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 6L);
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord24.iterator();
        boolean boolean27 = cSVRecord24.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[, hi!, hi!, , , ]", (long) 6);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[]", (long) (short) -1);
        boolean boolean25 = cSVRecord23.isSet("");
        java.lang.String[] strArray26 = cSVRecord23.values();
        boolean boolean28 = cSVRecord23.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray21, strMap26, "[]", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray21, strMap30, "[]", 1L);
        java.lang.String[] strArray34 = cSVRecord33.values();
        boolean boolean35 = cSVRecord33.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.lang.String str20 = cSVRecord18.getComment();
        java.lang.String str22 = cSVRecord18.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord18.spliterator();
        boolean boolean25 = cSVRecord18.isSet("");
        java.lang.String[] strArray26 = cSVRecord18.values();
        boolean boolean28 = cSVRecord18.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str30 = cSVRecord18.get(3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) -1);
        int int21 = cSVRecord20.size();
        boolean boolean22 = cSVRecord20.isConsistent();
        java.lang.String[] strArray23 = cSVRecord20.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[, hi!, hi!, , , ]", 6L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (short) 1);
        java.lang.String[] strArray32 = cSVRecord31.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray32, strMap33, "", (long) ' ');
        boolean boolean38 = cSVRecord36.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str24 = cSVRecord10.getComment();
        boolean boolean26 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean20 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", (long) 4);
        boolean boolean27 = cSVRecord25.isSet("");
        long long28 = cSVRecord25.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 4L + "'", long28 == 4L);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "", (long) (short) -1);
        boolean boolean26 = cSVRecord24.isSet("");
        boolean boolean28 = cSVRecord24.isSet("");
        boolean boolean29 = cSVRecord24.isConsistent();
        int int30 = cSVRecord24.size();
        boolean boolean32 = cSVRecord24.isMapped("[, hi!, hi!, , , ]");
        int int33 = cSVRecord24.size();
        long long34 = cSVRecord24.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isSet("");
        long long19 = cSVRecord10.getRecordNumber();
        long long20 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        int int16 = cSVRecord10.size();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.toString();
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isSet("[]");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray22, strMap27, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 4);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray22, strMap31, "", 32L);
        java.util.Spliterator<java.lang.String> strSpliterator35 = cSVRecord34.spliterator();
        java.lang.String str36 = cSVRecord34.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSpliterator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[, hi!, hi!, , , ]" + "'", str36, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        boolean boolean22 = cSVRecord10.isConsistent();
        java.lang.String str24 = cSVRecord10.get(0);
        java.lang.String[] strArray25 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 6);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[]", 6L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[, hi!, hi!, , , ]", (long) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.lang.String[] strArray19 = cSVRecord18.values();
        int int20 = cSVRecord18.size();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord18.iterator();
        boolean boolean23 = cSVRecord18.isSet("[]");
        boolean boolean25 = cSVRecord18.isSet("[]");
        java.lang.String str27 = cSVRecord18.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.lang.String[] strArray5 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray5, strMap6, "", 32L);
        long long10 = cSVRecord9.getRecordNumber();
        boolean boolean12 = cSVRecord9.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str20 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        long long23 = cSVRecord10.getRecordNumber();
        boolean boolean25 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isMapped("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "hi!", (long) '4');
        long long26 = cSVRecord25.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord25.spliterator();
        java.lang.String str29 = cSVRecord25.get(4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        boolean boolean20 = cSVRecord10.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean24 = cSVRecord10.isMapped("[]");
        boolean boolean26 = cSVRecord10.isMapped("[]");
        java.lang.String str27 = cSVRecord10.toString();
        java.lang.String str28 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[, hi!, hi!, , , ]" + "'", str27, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        int int19 = cSVRecord10.size();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.lang.String str24 = cSVRecord10.get((int) (byte) 1);
        int int25 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean20 = cSVRecord10.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        int int18 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String[] strArray20 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "", 0L);
        boolean boolean24 = cSVRecord22.isSet("[, hi!, hi!, , , ]");
        int int25 = cSVRecord22.size();
        boolean boolean26 = cSVRecord22.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isSet("[]");
        boolean boolean18 = cSVRecord10.isConsistent();
        long long19 = cSVRecord10.getRecordNumber();
        long long20 = cSVRecord10.getRecordNumber();
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        int int19 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String[] strArray21 = cSVRecord10.values();
        boolean boolean23 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long24 = cSVRecord10.getRecordNumber();
        int int25 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isMapped("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        long long21 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("");
        java.lang.String str18 = cSVRecord10.toString();
        long long19 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str21 = cSVRecord10.getComment();
        int int22 = cSVRecord10.size();
        boolean boolean23 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        boolean boolean21 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        int int15 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isConsistent();
        long long17 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("");
        int int18 = cSVRecord10.size();
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String str22 = cSVRecord10.toString();
        java.lang.String str24 = cSVRecord10.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        long long13 = cSVRecord10.getRecordNumber();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("[]");
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) 1);
        boolean boolean23 = cSVRecord21.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String str24 = cSVRecord21.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord21.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!, [, hi!, hi!, , , ]]" + "'", str24, "[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        boolean boolean19 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int20 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) (-1));
        boolean boolean28 = cSVRecord26.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean30 = cSVRecord26.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean31 = cSVRecord26.isConsistent();
        boolean boolean33 = cSVRecord26.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass20 = strSpliterator19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.get(4);
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass7 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass11 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str12 = cSVRecord5.get((int) (short) 0);
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
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord10.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
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
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.Class<?> wildcardClass10 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get("");
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
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass8 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.Class<?> wildcardClass10 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
        int int12 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass10 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        java.lang.Class<?> wildcardClass6 = strItor5.getClass();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.lang.Class<?> wildcardClass5 = cSVRecord4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        java.lang.Class<?> wildcardClass14 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
            java.lang.String str16 = cSVRecord10.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get((int) (byte) 10);
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
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        java.lang.String str11 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord10.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
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
        java.lang.Class<?> wildcardClass16 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord19.get((int) (byte) 1);
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
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strSpliterator8);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        java.lang.Class<?> wildcardClass12 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        boolean boolean13 = cSVRecord9.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean11 = cSVRecord5.isConsistent();
        boolean boolean13 = cSVRecord5.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
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
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get("hi!");
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
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        int int11 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String[] strArray13 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean13 = cSVRecord9.isConsistent();
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.Class<?> wildcardClass11 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String str11 = cSVRecord5.getComment();
        boolean boolean13 = cSVRecord5.isSet("");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        int int8 = cSVRecord5.size();
        java.lang.Class<?> wildcardClass9 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        java.lang.Class<?> wildcardClass15 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.Class<?> wildcardClass6 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Iterator<java.lang.String> strItor6 = cSVRecord5.iterator();
        java.lang.String str7 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strSpliterator8);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        java.lang.String str8 = cSVRecord5.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord15.get("hi!");
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
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord9.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str12 = cSVRecord10.get((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
            java.lang.String str19 = cSVRecord9.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        java.lang.Class<?> wildcardClass13 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean11 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
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
        java.lang.Class<?> wildcardClass14 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        java.lang.Class<?> wildcardClass14 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("");
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
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.Class<?> wildcardClass6 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        long long6 = cSVRecord5.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass11 = strSpliterator10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass10 = strSpliterator9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord5.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        boolean boolean16 = cSVRecord9.isSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "", (long) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
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
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass11 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord9.spliterator();
        int int12 = cSVRecord9.size();
        int int13 = cSVRecord9.size();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        java.lang.String[] strArray11 = cSVRecord5.values();
        int int12 = cSVRecord5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) (-1));
        java.lang.Class<?> wildcardClass10 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        int int11 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        long long6 = cSVRecord5.getRecordNumber();
        boolean boolean8 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord14.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        int int12 = cSVRecord9.size();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.lang.Class<?> wildcardClass5 = cSVRecord4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
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
        java.lang.Class<?> wildcardClass26 = cSVRecord23.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass16 = strItor15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        boolean boolean9 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
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
        java.lang.Class<?> wildcardClass16 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
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
        long long16 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("hi!");
        java.lang.String str13 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get((int) (short) 10);
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
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        boolean boolean13 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        long long12 = cSVRecord9.getRecordNumber();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        java.lang.Class<?> wildcardClass12 = cSVRecord11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        java.lang.Class<?> wildcardClass11 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
        java.lang.Class<?> wildcardClass14 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
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
        boolean boolean25 = cSVRecord23.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("");
        java.lang.String str13 = cSVRecord9.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator6 = cSVRecord5.spliterator();
        java.lang.String[] strArray7 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord14.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        java.lang.String[] strArray14 = cSVRecord13.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord13.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass13 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
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
        int int17 = cSVRecord9.size();
        long long18 = cSVRecord9.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord9.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
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
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass14 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord5.get(1);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.Class<?> wildcardClass15 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        java.lang.Class<?> wildcardClass16 = cSVRecord5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
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
        java.lang.Class<?> wildcardClass17 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
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
        java.lang.String str18 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String[] strArray6 = cSVRecord4.values();
        boolean boolean8 = cSVRecord4.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        java.lang.String str16 = cSVRecord13.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord13.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.Class<?> wildcardClass14 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.Class<?> wildcardClass9 = strSpliterator8.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord9.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((-1));
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
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
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord23.get("");
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
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String str12 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.Class<?> wildcardClass12 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.Class<?> wildcardClass11 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
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
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.Class<?> wildcardClass11 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord9.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord27.get("");
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
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isSet("");
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord9.spliterator();
        boolean boolean16 = cSVRecord9.isConsistent();
        java.lang.Class<?> wildcardClass17 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
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
        java.lang.Class<?> wildcardClass19 = cSVRecord18.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass12 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
        boolean boolean16 = cSVRecord15.isConsistent();
        boolean boolean18 = cSVRecord15.isSet("");
        java.lang.Class<?> wildcardClass19 = cSVRecord15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.lang.Class<?> wildcardClass12 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isSet("");
        java.lang.String str10 = cSVRecord5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
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
        java.lang.Class<?> wildcardClass24 = strArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass13 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        boolean boolean12 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord15.get("");
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
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
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
        boolean boolean15 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        boolean boolean14 = cSVRecord9.isMapped("");
        boolean boolean15 = cSVRecord9.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        java.lang.String[] strArray12 = cSVRecord11.values();
        java.lang.String str13 = cSVRecord11.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord9.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String str8 = cSVRecord5.toString();
        java.lang.String[] strArray9 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass10 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", (long) (byte) -1);
        java.lang.String str15 = cSVRecord14.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        java.lang.String str16 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
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
        boolean boolean29 = cSVRecord27.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", (long) (byte) -1);
        int int15 = cSVRecord14.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get(1);
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
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass10 = strItor9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        java.lang.Class<?> wildcardClass21 = cSVRecord5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        java.lang.Class<?> wildcardClass16 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
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
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        java.lang.Class<?> wildcardClass9 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get(1);
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
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean7 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
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
        int int14 = cSVRecord5.size();
        java.lang.String str15 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
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
        java.lang.Class<?> wildcardClass18 = cSVRecord16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get("hi!");
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
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord16.spliterator();
        java.lang.Class<?> wildcardClass18 = strSpliterator17.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        java.lang.String str6 = cSVRecord4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean7 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord5.iterator();
        int int9 = cSVRecord5.size();
        int int10 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        long long9 = cSVRecord5.getRecordNumber();
        boolean boolean11 = cSVRecord5.isSet("");
        java.lang.String str12 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVRecord5.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
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
        java.lang.String str16 = cSVRecord5.getComment();
        java.lang.Class<?> wildcardClass17 = cSVRecord5.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isMapped("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
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
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "", 100L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord18.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord14.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord5.iterator();
        java.lang.String[] strArray11 = cSVRecord5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String[] strArray6 = cSVRecord4.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord4.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        long long11 = cSVRecord9.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String str12 = cSVRecord9.toString();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        boolean boolean13 = cSVRecord5.isConsistent();
        java.lang.String str14 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isMapped("hi!");
        boolean boolean16 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
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
        java.lang.String str21 = cSVRecord10.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "hi!", (long) 100);
        java.lang.Class<?> wildcardClass15 = cSVRecord14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", 1L);
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
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
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
        java.lang.Class<?> wildcardClass15 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass11 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord5.get("");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        boolean boolean15 = cSVRecord9.isMapped("");
        java.lang.String str16 = cSVRecord9.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.lang.String str11 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord10.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.String str12 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        boolean boolean11 = cSVRecord5.isConsistent();
        int int12 = cSVRecord5.size();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord5.iterator();
        boolean boolean15 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
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
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord16.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        boolean boolean14 = cSVRecord9.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("hi!");
        java.lang.String str13 = cSVRecord9.getComment();
        boolean boolean15 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.String str6 = cSVRecord4.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord4.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord5.get((int) 'a');
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.lang.String str8 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSpliterator9);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.Class<?> wildcardClass6 = strSpliterator5.getClass();
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        int int13 = cSVRecord9.size();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isMapped("hi!");
        boolean boolean10 = cSVRecord5.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord5.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord18.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (long) '4');
        java.lang.String str9 = cSVRecord8.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord8.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
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
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass15 = strItor14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        java.lang.String str11 = cSVRecord9.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
            java.lang.String str13 = cSVRecord5.get("");
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
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isMapped("hi!");
        java.lang.String[] strArray15 = cSVRecord9.values();
        boolean boolean17 = cSVRecord9.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord9.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) 'a');
        boolean boolean6 = cSVRecord4.isSet("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray6, strMap11, "", (long) (short) 0);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean12 = cSVRecord9.isMapped("");
        boolean boolean13 = cSVRecord9.isConsistent();
        java.lang.String str14 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
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
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord17.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.util.Spliterator<java.lang.String> strSpliterator5 = cSVRecord4.spliterator();
        java.lang.Class<?> wildcardClass6 = strSpliterator5.getClass();
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
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
        java.lang.Class<?> wildcardClass24 = cSVRecord5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
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
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        boolean boolean12 = cSVRecord9.isConsistent();
        java.lang.String str13 = cSVRecord9.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord9.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean14 = cSVRecord9.isConsistent();
        java.lang.String[] strArray15 = cSVRecord9.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        boolean boolean24 = cSVRecord22.isMapped("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
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
        boolean boolean17 = cSVRecord5.isMapped("");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        boolean boolean13 = cSVRecord9.isSet("hi!");
        boolean boolean15 = cSVRecord9.isMapped("hi!");
        int int16 = cSVRecord9.size();
        boolean boolean18 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
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
        java.lang.String[] strArray17 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", 1L);
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
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
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
        java.lang.String str16 = cSVRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        int int12 = cSVRecord9.size();
        java.lang.String[] strArray13 = cSVRecord9.values();
        boolean boolean15 = cSVRecord9.isSet("");
        java.lang.Class<?> wildcardClass16 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord10.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        java.lang.String str26 = cSVRecord23.getComment();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        boolean boolean8 = cSVRecord5.isMapped("");
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord5.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        java.lang.Class<?> wildcardClass17 = cSVRecord15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.toString();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = cSVRecord5.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
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
        java.lang.String str21 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("hi!");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
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
        java.lang.String str16 = cSVRecord5.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
        long long18 = cSVRecord5.getRecordNumber();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        long long12 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        java.lang.Class<?> wildcardClass14 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isSet("");
        java.lang.Class<?> wildcardClass9 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVRecord10.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str10 = cSVRecord5.toString();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord5.spliterator();
        java.lang.String str12 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
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
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord5.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str11 = cSVRecord5.get(0);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        java.lang.String str7 = cSVRecord4.toString();
        long long8 = cSVRecord4.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVRecord4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        java.lang.Class<?> wildcardClass12 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
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
        int int20 = cSVRecord18.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        java.lang.String str11 = cSVRecord9.getComment();
        int int12 = cSVRecord9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
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
        java.lang.Class<?> wildcardClass19 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.toString();
        long long6 = cSVRecord4.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cSVRecord4.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.get(0);
        long long11 = cSVRecord5.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
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
        java.lang.String str17 = cSVRecord5.toString();
        java.lang.String str18 = cSVRecord5.getComment();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        int int21 = cSVRecord16.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord16.get((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        boolean boolean11 = cSVRecord5.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cSVRecord5.get((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}

