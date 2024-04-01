package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.String str24 = cSVRecord22.get((int) (short) 0);
        boolean boolean26 = cSVRecord22.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", 6L);
        java.lang.String str5 = cSVRecord4.toString();
        java.lang.String[] strArray6 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 1);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        int int16 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 0);
        java.lang.String str19 = cSVRecord18.toString();
        boolean boolean21 = cSVRecord18.isSet("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord18.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray15, strMap28, "hi!", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray15, strMap32, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray15, strMap36, "hi!", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray15, strMap40, "[hi!, hi!, [, hi!, hi!, , , ]]", 1L);
        java.util.Spliterator<java.lang.String> strSpliterator44 = cSVRecord43.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator44);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.lang.String str21 = cSVRecord10.toString();
        java.lang.String str22 = cSVRecord10.toString();
        java.lang.String str23 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        boolean boolean38 = cSVRecord36.isSet("");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        int int17 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        java.lang.String str26 = cSVRecord20.get(4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.lang.String str23 = cSVRecord10.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[]", (long) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        long long16 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("");
        boolean boolean19 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord18.spliterator();
        java.lang.String str21 = cSVRecord18.getComment();
        int int22 = cSVRecord18.size();
        boolean boolean24 = cSVRecord18.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean25 = cSVRecord18.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        long long23 = cSVRecord22.getRecordNumber();
        boolean boolean25 = cSVRecord22.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        int int26 = cSVRecord22.size();
        boolean boolean28 = cSVRecord22.isSet("[, hi!, hi!, , , ]");
        boolean boolean30 = cSVRecord22.isSet("hi!");
        long long31 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        boolean boolean23 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass25 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "[, hi!, hi!, , , ]", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray17, strMap30, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) 10);
        java.lang.String[] strArray34 = cSVRecord33.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        long long13 = cSVRecord10.getRecordNumber();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("[]");
        java.lang.String str18 = cSVRecord10.get((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 32L);
        boolean boolean21 = cSVRecord20.isConsistent();
        java.lang.String str23 = cSVRecord20.get(0);
        java.lang.Class<?> wildcardClass24 = cSVRecord20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) -1);
        java.lang.Class<?> wildcardClass30 = cSVRecord29.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        java.lang.String str26 = cSVRecord10.toString();
        int int27 = cSVRecord10.size();
        int int28 = cSVRecord10.size();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (byte) 1);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        java.lang.String str23 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        java.lang.String[] strArray25 = cSVRecord10.values();
        int int26 = cSVRecord10.size();
        boolean boolean28 = cSVRecord10.isMapped("");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray21 = cSVRecord10.values();
        long long22 = cSVRecord10.getRecordNumber();
        boolean boolean24 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        long long25 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        int int22 = cSVRecord10.size();
        long long23 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray24 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isSet("hi!");
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, hi!, hi!, , , ]", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "", 0L);
        java.lang.String[] strArray27 = cSVRecord26.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray27, strMap28, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray27, strMap32, "", (long) '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.getComment();
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
            java.lang.String str21 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean24 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.toString();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        boolean boolean23 = cSVRecord21.isSet("[]");
        java.lang.String[] strArray24 = cSVRecord21.values();
        boolean boolean25 = cSVRecord21.isConsistent();
        boolean boolean26 = cSVRecord21.isConsistent();
        java.lang.String[] strArray27 = cSVRecord21.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.lang.String str21 = cSVRecord18.getComment();
        boolean boolean23 = cSVRecord18.isSet("[]");
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord18.iterator();
        java.lang.String[] strArray25 = cSVRecord18.values();
        int int26 = cSVRecord18.size();
        long long27 = cSVRecord18.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord18.iterator();
        boolean boolean30 = cSVRecord18.isSet("hi!");
        long long31 = cSVRecord18.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        boolean boolean22 = cSVRecord10.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "[, hi!, hi!, , , ]" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = null;
        org.apache.commons.csv.CSVRecord cSVRecord7 = new org.apache.commons.csv.CSVRecord(strArray3, strMap4, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord7.iterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = cSVRecord7.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) ' ');
        long long23 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        java.lang.String str24 = cSVRecord23.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]" + "'", str24, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean20 = cSVRecord10.isSet("hi!");
        boolean boolean22 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean24 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        int int17 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isSet("");
        int int17 = cSVRecord10.size();
        long long18 = cSVRecord10.getRecordNumber();
        int int19 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String[] strArray22 = cSVRecord10.values();
        int int23 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean19 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        long long20 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.lang.String str21 = cSVRecord10.toString();
        int int22 = cSVRecord10.size();
        long long23 = cSVRecord10.getRecordNumber();
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        boolean boolean19 = cSVRecord10.isMapped("[]");
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        boolean boolean23 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        int int18 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.get(0);
        java.lang.Class<?> wildcardClass21 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("");
        boolean boolean21 = cSVRecord10.isMapped("");
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String str24 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord10.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        boolean boolean21 = cSVRecord10.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 0L);
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
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "[, hi!, hi!, , , ]" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = null;
        org.apache.commons.csv.CSVRecord cSVRecord7 = new org.apache.commons.csv.CSVRecord(strArray3, strMap4, "", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray3, strMap8, "[]", (long) '#');
        boolean boolean13 = cSVRecord11.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        boolean boolean19 = cSVRecord18.isConsistent();
        java.lang.String str21 = cSVRecord18.get((int) (byte) 0);
        boolean boolean23 = cSVRecord18.isMapped("[]");
        int int24 = cSVRecord18.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord18.spliterator();
        java.lang.String str27 = cSVRecord18.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) '4');
        long long20 = cSVRecord19.getRecordNumber();
        int int21 = cSVRecord19.size();
        java.lang.String[] strArray22 = cSVRecord19.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (byte) 10);
        boolean boolean6 = cSVRecord4.isSet("");
        boolean boolean8 = cSVRecord4.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.Class<?> wildcardClass9 = cSVRecord4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        java.lang.String str31 = cSVRecord26.getComment();
        boolean boolean32 = cSVRecord26.isConsistent();
        java.lang.String str33 = cSVRecord26.getComment();
        int int34 = cSVRecord26.size();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String str19 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        java.lang.String str31 = cSVRecord26.getComment();
        boolean boolean33 = cSVRecord26.isSet("hi!");
        java.lang.String[] strArray34 = cSVRecord26.values();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        java.lang.String str23 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        int int26 = cSVRecord10.size();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        long long17 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.Class<?> wildcardClass14 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray22, strMap27, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (byte) -1);
        java.util.Spliterator<java.lang.String> strSpliterator31 = cSVRecord30.spliterator();
        boolean boolean33 = cSVRecord30.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        int int20 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String[] strArray19 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        boolean boolean21 = cSVRecord10.isConsistent();
        boolean boolean23 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.lang.String str19 = cSVRecord10.getComment();
        long long20 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.get((int) (short) 0);
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        java.lang.String str29 = cSVRecord28.getComment();
        int int30 = cSVRecord28.size();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        boolean boolean26 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        long long22 = cSVRecord10.getRecordNumber();
        boolean boolean23 = cSVRecord10.isConsistent();
        boolean boolean25 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray15, strMap28, "hi!", 100L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray15, strMap32, "", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray15, strMap36, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray15, strMap40, "", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap44 = null;
        org.apache.commons.csv.CSVRecord cSVRecord47 = new org.apache.commons.csv.CSVRecord(strArray15, strMap44, "[, hi!, hi!, , , ]", (long) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        boolean boolean27 = cSVRecord23.isSet("");
        long long28 = cSVRecord23.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord23.iterator();
        java.lang.Class<?> wildcardClass30 = cSVRecord23.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        long long21 = cSVRecord10.getRecordNumber();
        boolean boolean23 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[]", 1L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.get(3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("[]");
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 32L);
        boolean boolean21 = cSVRecord20.isConsistent();
        boolean boolean23 = cSVRecord20.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean20 = cSVRecord10.isConsistent();
        boolean boolean22 = cSVRecord10.isSet("");
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long25 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.lang.String[] strArray25 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("hi!");
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
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        boolean boolean19 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isSet("hi!");
        boolean boolean17 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 97L);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.lang.String str30 = cSVRecord24.getComment();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[, hi!, hi!, , , ]", (long) 'a');
        java.lang.String str23 = cSVRecord22.getComment();
        java.lang.String str24 = cSVRecord22.toString();
        java.lang.String str25 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[, hi!, hi!, , , ]" + "'", str25, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "", 0L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray22, strMap27, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (byte) -1);
        java.util.Spliterator<java.lang.String> strSpliterator31 = cSVRecord30.spliterator();
        long long32 = cSVRecord30.getRecordNumber();
        boolean boolean34 = cSVRecord30.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSpliterator31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        boolean boolean27 = cSVRecord18.isMapped("[, hi!, hi!, , , ]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord18.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.toString();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.String str20 = cSVRecord10.getComment();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) -1);
        java.lang.String str30 = cSVRecord29.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[hi!, hi!, [, hi!, hi!, , , ]]" + "'", str30, "[hi!, hi!, [, hi!, hi!, , , ]]");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        java.lang.String[] strArray25 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray25, strMap26, "[]", (long) (byte) -1);
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
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str18 = cSVRecord10.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        java.lang.String str21 = cSVRecord20.getComment();
        long long22 = cSVRecord20.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "[, hi!, hi!, , , ]" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = null;
        org.apache.commons.csv.CSVRecord cSVRecord7 = new org.apache.commons.csv.CSVRecord(strArray3, strMap4, "", (long) 1);
        long long8 = cSVRecord7.getRecordNumber();
        java.lang.String str9 = cSVRecord7.getComment();
        java.lang.String str10 = cSVRecord7.getComment();
        java.lang.String[] strArray11 = cSVRecord7.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = null;
        org.apache.commons.csv.CSVRecord cSVRecord15 = new org.apache.commons.csv.CSVRecord(strArray11, strMap12, "[hi!, hi!, [, hi!, hi!, , , ]]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray11, strMap16, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 1L);
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        boolean boolean22 = cSVRecord20.isConsistent();
        int int23 = cSVRecord20.size();
        java.lang.String[] strArray24 = cSVRecord20.values();
        java.lang.String str26 = cSVRecord20.get(0);
        int int27 = cSVRecord20.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        boolean boolean22 = cSVRecord10.isSet("[]");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass24 = strSpliterator23.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.String[] strArray4 = new java.lang.String[] { "[, hi!, hi!, , , ]", "", "", "[, hi!, hi!, , , ]" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray4, strMap5, "[, hi!, hi!, , , ]", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray4, strMap9, "hi!", 0L);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.toString();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        boolean boolean25 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str26 = cSVRecord10.get((int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isSet("");
        long long21 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        int int21 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[, hi!, hi!, , , ]", (long) (byte) 1);
        boolean boolean25 = cSVRecord23.isSet("[]");
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord23.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        int int21 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "hi!", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "hi!", 97L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isSet("[]");
        boolean boolean18 = cSVRecord10.isConsistent();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isSet("[]");
        java.lang.String str19 = cSVRecord10.get((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 10);
        java.lang.String str23 = cSVRecord22.getComment();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord22.iterator();
        java.lang.String str25 = cSVRecord22.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]" + "'", str23, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[, hi!, hi!, , , ]" + "'", str25, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String str22 = cSVRecord10.get(0);
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.lang.String str24 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        int int17 = cSVRecord10.size();
        int int18 = cSVRecord10.size();
        java.lang.String[] strArray19 = cSVRecord10.values();
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        long long13 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) (short) 1);
        long long19 = cSVRecord18.getRecordNumber();
        boolean boolean21 = cSVRecord18.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        int int23 = cSVRecord22.size();
        boolean boolean25 = cSVRecord22.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        boolean boolean27 = cSVRecord22.isSet("[, hi!, hi!, , , ]");
        java.lang.String str29 = cSVRecord22.get((int) (short) 1);
        boolean boolean31 = cSVRecord22.isSet("");
        boolean boolean33 = cSVRecord22.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        boolean boolean34 = cSVRecord32.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String[] strArray24 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        boolean boolean20 = cSVRecord10.isSet("hi!");
        boolean boolean22 = cSVRecord10.isMapped("");
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        int int27 = cSVRecord10.size();
        boolean boolean28 = cSVRecord10.isConsistent();
        java.lang.String str29 = cSVRecord10.getComment();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        java.lang.String str27 = cSVRecord24.get(4);
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord24.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSpliterator28);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        java.lang.String str20 = cSVRecord10.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, hi!, hi!, , , ]", (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord22.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.lang.String str25 = cSVRecord18.toString();
        java.lang.String str26 = cSVRecord18.getComment();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord18.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[, hi!, hi!, , , ]" + "'", str25, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.get((int) (short) 0);
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        java.lang.String[] strArray23 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", 32L);
        boolean boolean29 = cSVRecord27.isSet("[]");
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord27.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strItor30);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        boolean boolean21 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        boolean boolean19 = cSVRecord18.isConsistent();
        boolean boolean20 = cSVRecord18.isConsistent();
        long long21 = cSVRecord18.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[, hi!, hi!, , , ]", 97L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord18.spliterator();
        java.lang.String str21 = cSVRecord18.getComment();
        int int22 = cSVRecord18.size();
        boolean boolean24 = cSVRecord18.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 1L);
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        boolean boolean22 = cSVRecord20.isConsistent();
        int int23 = cSVRecord20.size();
        java.lang.String[] strArray24 = cSVRecord20.values();
        java.lang.String str26 = cSVRecord20.get(0);
        java.lang.Class<?> wildcardClass27 = cSVRecord20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        long long27 = cSVRecord10.getRecordNumber();
        boolean boolean29 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.Class<?> wildcardClass30 = cSVRecord10.getClass();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray21 = cSVRecord10.values();
        long long22 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", (long) '4');
        java.lang.String str21 = cSVRecord19.get((int) (byte) 0);
        long long22 = cSVRecord19.getRecordNumber();
        int int23 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.Class<?> wildcardClass14 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        java.lang.String[] strArray21 = cSVRecord10.values();
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
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        java.lang.String str27 = cSVRecord10.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[, hi!, hi!, , , ]" + "'", str27, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", 6L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "[]", (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord29.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        int int27 = cSVRecord26.size();
        int int28 = cSVRecord26.size();
        java.lang.String[] strArray29 = cSVRecord26.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord26.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) 4);
        boolean boolean28 = cSVRecord27.isConsistent();
        boolean boolean30 = cSVRecord27.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) ' ');
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord22.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord22.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        boolean boolean20 = cSVRecord19.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        int int22 = cSVRecord19.size();
        boolean boolean24 = cSVRecord19.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.Class<?> wildcardClass25 = cSVRecord19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord18.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord18.spliterator();
        java.lang.Class<?> wildcardClass26 = cSVRecord18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[]", (long) 6);
        java.lang.String[] strArray23 = cSVRecord22.values();
        boolean boolean25 = cSVRecord22.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        boolean boolean19 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) 4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String str16 = cSVRecord10.toString();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean19 = cSVRecord10.isSet("");
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[, hi!, hi!, , , ]", (long) 10);
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
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        long long24 = cSVRecord10.getRecordNumber();
        boolean boolean26 = cSVRecord10.isMapped("");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("");
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[, hi!, hi!, , , ]", 1L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) (short) 0);
        int int28 = cSVRecord27.size();
        java.lang.String[] strArray29 = cSVRecord27.values();
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord27.iterator();
        java.lang.String str31 = cSVRecord27.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator32 = cSVRecord27.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[, hi!, hi!, , , ]" + "'", str31, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator32);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord24.spliterator();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord24.iterator();
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
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int22 = cSVRecord10.size();
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String str25 = cSVRecord10.get(0);
        long long26 = cSVRecord10.getRecordNumber();
        java.lang.String str27 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[, hi!, hi!, , , ]" + "'", str27, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long17 = cSVRecord10.getRecordNumber();
        int int18 = cSVRecord10.size();
        long long19 = cSVRecord10.getRecordNumber();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord18.iterator();
        long long25 = cSVRecord18.getRecordNumber();
        boolean boolean27 = cSVRecord18.isSet("");
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord18.iterator();
        java.lang.String[] strArray29 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray29, strMap30, "", (long) 10);
        java.lang.Class<?> wildcardClass34 = strArray29.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        int int24 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord18.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray21 = cSVRecord10.values();
        long long22 = cSVRecord10.getRecordNumber();
        boolean boolean23 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[, hi!, hi!, , , ]", (long) (byte) -1);
        int int24 = cSVRecord23.size();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord23.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord21.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.get((int) (byte) 1);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray14 = cSVRecord10.values();
        int int15 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.lang.String str22 = cSVRecord10.get(1);
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.lang.String str25 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[, hi!, hi!, , , ]" + "'", str25, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        boolean boolean25 = cSVRecord24.isConsistent();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord24.iterator();
        boolean boolean27 = cSVRecord24.isConsistent();
        java.lang.String str29 = cSVRecord24.get((int) (short) 0);
        boolean boolean31 = cSVRecord24.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        long long32 = cSVRecord24.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) (short) 0);
        int int28 = cSVRecord27.size();
        java.lang.String[] strArray29 = cSVRecord27.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray29, strMap30, "[, hi!, hi!, , , ]", (long) 6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[, hi!, hi!, , , ]", (long) 'a');
        java.lang.String str23 = cSVRecord22.getComment();
        java.lang.String str24 = cSVRecord22.toString();
        java.lang.Class<?> wildcardClass25 = cSVRecord22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        boolean boolean23 = cSVRecord21.isSet("[]");
        java.lang.String[] strArray24 = cSVRecord21.values();
        boolean boolean26 = cSVRecord21.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        boolean boolean36 = cSVRecord35.isConsistent();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        long long23 = cSVRecord22.getRecordNumber();
        java.lang.String str24 = cSVRecord22.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
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
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str18 = cSVRecord10.get((int) (byte) 1);
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        java.lang.String str19 = cSVRecord18.getComment();
        java.lang.String str20 = cSVRecord18.getComment();
        boolean boolean21 = cSVRecord18.isConsistent();
        boolean boolean23 = cSVRecord18.isSet("");
        java.lang.String[] strArray24 = cSVRecord18.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isMapped("");
        java.lang.String str24 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord10.spliterator();
        boolean boolean28 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String str29 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.getComment();
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        long long20 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        boolean boolean17 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean19 = cSVRecord10.isMapped("hi!");
        java.lang.Class<?> wildcardClass20 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "[]", (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord19.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean20 = cSVRecord10.isSet("hi!");
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        int int23 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        boolean boolean25 = cSVRecord10.isSet("[]");
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
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "", 32L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        boolean boolean27 = cSVRecord23.isMapped("[]");
        boolean boolean28 = cSVRecord23.isConsistent();
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord23.iterator();
        long long30 = cSVRecord23.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        int int17 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean23 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        java.lang.String str25 = cSVRecord10.getComment();
        long long26 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        int int20 = cSVRecord10.size();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        int int27 = cSVRecord26.size();
        int int28 = cSVRecord26.size();
        int int29 = cSVRecord26.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord26.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[]", (long) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        boolean boolean24 = cSVRecord21.isSet("");
        java.lang.String[] strArray25 = cSVRecord21.values();
        java.lang.String str26 = cSVRecord21.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord21.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.getComment();
        int int22 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        long long24 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        boolean boolean19 = cSVRecord18.isConsistent();
        java.lang.String str20 = cSVRecord18.toString();
        java.lang.String str21 = cSVRecord18.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        long long22 = cSVRecord10.getRecordNumber();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        boolean boolean23 = cSVRecord10.isSet("[]");
        java.lang.String str24 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        int int26 = cSVRecord10.size();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 10);
        java.lang.String[] strArray23 = cSVRecord22.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.getComment();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        java.lang.String str23 = cSVRecord10.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        long long24 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        long long37 = cSVRecord36.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", (long) (byte) 1);
        boolean boolean22 = cSVRecord21.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord10.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String str19 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        boolean boolean22 = cSVRecord10.isMapped("");
        java.lang.String str24 = cSVRecord10.get(0);
        boolean boolean26 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        int int27 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        boolean boolean25 = cSVRecord24.isConsistent();
        boolean boolean27 = cSVRecord24.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        long long28 = cSVRecord24.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("");
        int int21 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isMapped("[]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int25 = cSVRecord10.size();
        boolean boolean26 = cSVRecord10.isConsistent();
        long long27 = cSVRecord10.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        boolean boolean20 = cSVRecord19.isConsistent();
        boolean boolean22 = cSVRecord19.isSet("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        boolean boolean24 = cSVRecord19.isConsistent();
        int int25 = cSVRecord19.size();
        java.lang.String str26 = cSVRecord19.toString();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord19.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        int int24 = cSVRecord18.size();
        boolean boolean26 = cSVRecord18.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord18.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isMapped("");
        boolean boolean21 = cSVRecord10.isMapped("");
        long long22 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.lang.String str18 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        java.lang.String[] strArray19 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isMapped("");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[, hi!, hi!, , , ]", (long) (short) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("");
        long long23 = cSVRecord10.getRecordNumber();
        int int24 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        int int27 = cSVRecord24.size();
        boolean boolean29 = cSVRecord24.isMapped("hi!");
        java.lang.String[] strArray30 = cSVRecord24.values();
        long long31 = cSVRecord24.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str20 = cSVRecord10.get(4);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isMapped("[]");
        boolean boolean25 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        boolean boolean20 = cSVRecord19.isConsistent();
        boolean boolean22 = cSVRecord19.isSet("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        boolean boolean24 = cSVRecord19.isConsistent();
        java.lang.Class<?> wildcardClass25 = cSVRecord19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        java.lang.String str25 = cSVRecord22.get((int) (byte) 0);
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord22.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isConsistent();
        int int18 = cSVRecord10.size();
        java.lang.String[] strArray19 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[, hi!, hi!, , , ]", 35L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "", (long) (byte) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        java.lang.String str19 = cSVRecord18.getComment();
        java.lang.String str20 = cSVRecord18.getComment();
        int int21 = cSVRecord18.size();
        int int22 = cSVRecord18.size();
        boolean boolean23 = cSVRecord18.isConsistent();
        int int24 = cSVRecord18.size();
        boolean boolean26 = cSVRecord18.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSpliterator27);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        int int17 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean19 = cSVRecord10.isConsistent();
        int int20 = cSVRecord10.size();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[]", (long) (byte) 1);
        java.lang.String str27 = cSVRecord25.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.get((int) (short) 0);
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.lang.String[] strArray23 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.get((int) (short) 1);
        long long21 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "hi!", (long) (byte) 10);
        java.lang.String str26 = cSVRecord25.toString();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord25.spliterator();
        java.lang.Class<?> wildcardClass28 = cSVRecord25.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[, hi!, hi!, , , ]" + "'", str26, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        int int20 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        boolean boolean22 = cSVRecord10.isConsistent();
        boolean boolean24 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (-1L));
        java.lang.String str20 = cSVRecord19.getComment();
        boolean boolean21 = cSVRecord19.isConsistent();
        int int22 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean20 = cSVRecord10.isSet("hi!");
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        long long26 = cSVRecord10.getRecordNumber();
        long long27 = cSVRecord10.getRecordNumber();
        int int28 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        int int27 = cSVRecord10.size();
        boolean boolean28 = cSVRecord10.isConsistent();
        java.lang.String str29 = cSVRecord10.toString();
        boolean boolean31 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        int int32 = cSVRecord10.size();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[, hi!, hi!, , , ]" + "'", str29, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("");
        java.lang.String str16 = cSVRecord10.get((int) (short) 1);
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass19 = strItor18.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String str22 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long16 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord10.spliterator();
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray15, strMap28, "hi!", 100L);
        long long32 = cSVRecord31.getRecordNumber();
        boolean boolean33 = cSVRecord31.isConsistent();
        int int34 = cSVRecord31.size();
        java.lang.String str35 = cSVRecord31.toString();
        int int36 = cSVRecord31.size();
        boolean boolean37 = cSVRecord31.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[, hi!, hi!, , , ]" + "'", str35, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        long long20 = cSVRecord10.getRecordNumber();
        long long21 = cSVRecord10.getRecordNumber();
        int int22 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        boolean boolean19 = cSVRecord10.isSet("");
        boolean boolean21 = cSVRecord10.isMapped("hi!");
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String[] strArray23 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String str24 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord24.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String str20 = cSVRecord10.toString();
        boolean boolean22 = cSVRecord10.isSet("hi!");
        boolean boolean24 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean18 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass20 = strSpliterator19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        boolean boolean18 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        java.lang.String[] strArray26 = cSVRecord18.values();
        java.lang.String[] strArray27 = cSVRecord18.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean21 = cSVRecord10.isMapped("");
        java.lang.String str22 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord24.spliterator();
        boolean boolean28 = cSVRecord24.isSet("[]");
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
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass23 = strArray22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.get((int) (short) 1);
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSpliterator20);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord10.iterator();
        boolean boolean25 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        boolean boolean28 = cSVRecord10.isMapped("");
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
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean26 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str28 = cSVRecord10.get((int) (byte) 0);
        java.lang.String str29 = cSVRecord10.getComment();
        java.lang.String str31 = cSVRecord10.get(0);
        boolean boolean33 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord18.iterator();
        boolean boolean25 = cSVRecord18.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord18.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        long long20 = cSVRecord10.getRecordNumber();
        long long21 = cSVRecord10.getRecordNumber();
        long long22 = cSVRecord10.getRecordNumber();
        boolean boolean24 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isSet("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        int int18 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        boolean boolean25 = cSVRecord24.isConsistent();
        boolean boolean27 = cSVRecord24.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        java.lang.String str19 = cSVRecord10.toString();
        java.lang.String str20 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isMapped("[]");
        long long23 = cSVRecord10.getRecordNumber();
        java.lang.Class<?> wildcardClass24 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        boolean boolean25 = cSVRecord24.isConsistent();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord24.iterator();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord24.iterator();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord24.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(strItor28);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        boolean boolean28 = cSVRecord26.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.lang.String str29 = cSVRecord26.getComment();
        java.lang.String str30 = cSVRecord26.toString();
        boolean boolean31 = cSVRecord26.isConsistent();
        java.util.Iterator<java.lang.String> strItor32 = cSVRecord26.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strItor32);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        java.lang.String[] strArray25 = cSVRecord10.values();
        long long26 = cSVRecord10.getRecordNumber();
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
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[, hi!, hi!, , , ]", (-1L));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        boolean boolean24 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        java.lang.String str27 = cSVRecord10.getComment();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        int int17 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isConsistent();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[hi!, hi!, [, hi!, hi!, , , ]]", (-1L));
        boolean boolean25 = cSVRecord23.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String[] strArray26 = cSVRecord23.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        int int33 = cSVRecord32.size();
        java.lang.String str34 = cSVRecord32.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[, hi!, hi!, , , ]" + "'", str34, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        int int18 = cSVRecord10.size();
        java.lang.String str20 = cSVRecord10.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        boolean boolean23 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.lang.String str14 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        java.util.Iterator<java.lang.String> strItor37 = cSVRecord36.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator38 = cSVRecord36.spliterator();
        java.lang.Class<?> wildcardClass39 = strSpliterator38.getClass();
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
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strSpliterator38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("");
        boolean boolean18 = cSVRecord10.isSet("hi!");
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "hi!", (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray17, strMap30, "", (long) '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str24 = cSVRecord10.get(3);
        int int25 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord10.spliterator();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        java.lang.String str29 = cSVRecord24.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        boolean boolean22 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean23 = cSVRecord10.isConsistent();
        java.lang.String str24 = cSVRecord10.toString();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isSet("");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.toString();
        int int19 = cSVRecord10.size();
        boolean boolean21 = cSVRecord10.isSet("hi!");
        long long22 = cSVRecord10.getRecordNumber();
        int int23 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord22.spliterator();
        int int25 = cSVRecord22.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord22.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        long long23 = cSVRecord10.getRecordNumber();
        int int24 = cSVRecord10.size();
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
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String str22 = cSVRecord10.toString();
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isMapped("[]");
        int int26 = cSVRecord10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord10.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[, hi!, hi!, , , ]", (long) 0);
        java.lang.String str5 = cSVRecord4.getComment();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[, hi!, hi!, , , ]" + "'", str5, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        boolean boolean24 = cSVRecord10.isConsistent();
        long long25 = cSVRecord10.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[hi!, hi!, [, hi!, hi!, , , ]]", 52L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord10.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        int int21 = cSVRecord10.size();
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.get((int) (byte) 1);
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String[] strArray21 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[, hi!, hi!, , , ]", (long) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        int int21 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        int int19 = cSVRecord10.size();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str17 = cSVRecord10.getComment();
        boolean boolean18 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean24 = cSVRecord10.isMapped("[]");
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        boolean boolean17 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        long long18 = cSVRecord10.getRecordNumber();
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        boolean boolean24 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord10.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        long long24 = cSVRecord10.getRecordNumber();
        long long25 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "", 1L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        int int19 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        java.lang.String str22 = cSVRecord10.get(1);
        java.lang.String str24 = cSVRecord10.get((int) (short) 0);
        boolean boolean25 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        long long26 = cSVRecord22.getRecordNumber();
        int int27 = cSVRecord22.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isMapped("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord10.spliterator();
        int int21 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray21 = cSVRecord10.values();
        boolean boolean23 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        boolean boolean20 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        long long22 = cSVRecord10.getRecordNumber();
        java.lang.String str23 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "hi!", (long) ' ');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        org.apache.commons.csv.CSVRecord cSVRecord40 = new org.apache.commons.csv.CSVRecord(strArray20, strMap37, "[, hi!, hi!, , , ]", (long) 100);
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
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[, hi!, hi!, , , ]", (long) 4);
        int int24 = cSVRecord23.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord23.spliterator();
        boolean boolean26 = cSVRecord23.isConsistent();
        java.lang.String str27 = cSVRecord23.toString();
        int int28 = cSVRecord23.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[, hi!, hi!, , , ]" + "'", str27, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "", (long) (byte) 0);
        int int24 = cSVRecord23.size();
        boolean boolean26 = cSVRecord23.isMapped("[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        int int23 = cSVRecord18.size();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isSet("");
        int int17 = cSVRecord10.size();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        int int21 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        boolean boolean23 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        boolean boolean21 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord10.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 32L);
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord26.iterator();
        java.lang.String[] strArray28 = cSVRecord26.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String[] strArray18 = cSVRecord10.values();
        int int19 = cSVRecord10.size();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap22, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.getComment();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "hi!", (long) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "[]", (long) (short) 10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[]", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "", (long) (-1));
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord27.iterator();
        java.lang.String[] strArray29 = cSVRecord27.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord33 = new org.apache.commons.csv.CSVRecord(strArray29, strMap30, "[]", 35L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.toString();
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        long long13 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray14 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord10.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        java.lang.String[] strArray19 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[]", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord23.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", 1L);
        java.lang.String[] strArray26 = cSVRecord25.values();
        int int27 = cSVRecord25.size();
        long long28 = cSVRecord25.getRecordNumber();
        java.lang.String str29 = cSVRecord25.getComment();
        boolean boolean31 = cSVRecord25.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        long long27 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray28 = cSVRecord10.values();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        boolean boolean24 = cSVRecord10.isSet("hi!");
        int int25 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord10.iterator();
        java.lang.Class<?> wildcardClass27 = strItor26.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String str16 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[, hi!, hi!, , , ]", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "hi!", (long) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        boolean boolean23 = cSVRecord10.isSet("[]");
        boolean boolean25 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String str20 = cSVRecord10.get(0);
        boolean boolean22 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean23 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("[hi!, hi!, [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass24 = cSVRecord10.getClass();
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", 0L);
        java.lang.String[] strArray5 = cSVRecord4.values();
        boolean boolean6 = cSVRecord4.isConsistent();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        boolean boolean20 = cSVRecord19.isConsistent();
        boolean boolean22 = cSVRecord19.isSet("");
        java.lang.String[] strArray23 = cSVRecord19.values();
        boolean boolean25 = cSVRecord19.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        boolean boolean19 = cSVRecord18.isConsistent();
        boolean boolean21 = cSVRecord18.isSet("hi!");
        long long22 = cSVRecord18.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String[] strArray19 = cSVRecord10.values();
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord20.spliterator();
        boolean boolean23 = cSVRecord20.isSet("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord20.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray22, strMap23, "hi!", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray22, strMap27, "", 32L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray22, strMap31, "[]", 1L);
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
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "[, hi!, hi!, , , ]", (long) (byte) 1);
        boolean boolean27 = cSVRecord26.isConsistent();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord26.iterator();
        java.lang.String str29 = cSVRecord26.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[, hi!, hi!, , , ]" + "'", str29, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.toString();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "[, hi!, hi!, , , ]", (long) (short) 1);
        int int23 = cSVRecord22.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        boolean boolean32 = cSVRecord24.isMapped("[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = cSVRecord24.get("[hi!, hi!, [, hi!, hi!, , , ]]");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) ' ');
        boolean boolean25 = cSVRecord24.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        java.lang.Class<?> wildcardClass21 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        boolean boolean22 = cSVRecord10.isConsistent();
        boolean boolean23 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String[] strArray19 = cSVRecord10.values();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.getComment();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        java.lang.String str17 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.getComment();
        long long19 = cSVRecord10.getRecordNumber();
        int int20 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 1L);
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord20.iterator();
        boolean boolean22 = cSVRecord20.isConsistent();
        int int23 = cSVRecord20.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord20.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        long long14 = cSVRecord10.getRecordNumber();
        int int15 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isMapped("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str20 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", 1L);
        java.lang.String[] strArray26 = cSVRecord25.values();
        int int27 = cSVRecord25.size();
        long long28 = cSVRecord25.getRecordNumber();
        java.lang.String str29 = cSVRecord25.getComment();
        java.lang.String str30 = cSVRecord25.toString();
        java.lang.String[] strArray31 = cSVRecord25.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", (long) (short) 10);
        java.lang.String str19 = cSVRecord18.getComment();
        java.lang.String str20 = cSVRecord18.getComment();
        boolean boolean22 = cSVRecord18.isMapped("");
        java.lang.String[] strArray23 = cSVRecord18.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "", (long) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray23, strMap28, "", 32L);
        java.lang.String[] strArray32 = cSVRecord31.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        long long21 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.lang.String str24 = cSVRecord10.get(0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        int int14 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isConsistent();
        long long16 = cSVRecord10.getRecordNumber();
        boolean boolean18 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str19 = cSVRecord10.toString();
        long long20 = cSVRecord10.getRecordNumber();
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.Class<?> wildcardClass24 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.getComment();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[]", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray16, strMap21, "[, hi!, hi!, , , ]", (long) (byte) 1);
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
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
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        boolean boolean25 = cSVRecord24.isConsistent();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord24.iterator();
        boolean boolean27 = cSVRecord24.isConsistent();
        java.lang.String str29 = cSVRecord24.get((int) (short) 0);
        java.lang.Class<?> wildcardClass30 = cSVRecord24.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isMapped("");
        int int22 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        java.util.Iterator<java.lang.String> strItor24 = cSVRecord18.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord18.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord18.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord18.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str23 = cSVRecord10.toString();
        boolean boolean25 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String[] strArray26 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[, hi!, hi!, , , ]", (long) 100);
        int int5 = cSVRecord4.size();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        boolean boolean25 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean27 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        boolean boolean28 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        java.lang.String str27 = cSVRecord10.getComment();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        boolean boolean17 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "", 52L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord26.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long19 = cSVRecord10.getRecordNumber();
        java.lang.Class<?> wildcardClass20 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean26 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str28 = cSVRecord10.get((int) (byte) 0);
        java.lang.String str29 = cSVRecord10.getComment();
        java.lang.String str31 = cSVRecord10.get(0);
        java.util.Iterator<java.lang.String> strItor32 = cSVRecord10.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strItor32);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String[] strArray19 = cSVRecord10.values();
        boolean boolean21 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        int int22 = cSVRecord10.size();
        java.lang.String str24 = cSVRecord10.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.lang.String str17 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        boolean boolean20 = cSVRecord10.isMapped("");
        long long21 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        boolean boolean20 = cSVRecord19.isConsistent();
        boolean boolean22 = cSVRecord19.isSet("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        boolean boolean24 = cSVRecord19.isConsistent();
        boolean boolean26 = cSVRecord19.isMapped("[, hi!, hi!, , , ]");
        boolean boolean28 = cSVRecord19.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap20, "[, hi!, hi!, , , ]", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray19, strMap24, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) -1);
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord27.spliterator();
        long long29 = cSVRecord27.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean17 = cSVRecord10.isMapped("");
        boolean boolean19 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        java.lang.String str22 = cSVRecord10.getComment();
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String str24 = cSVRecord10.getComment();
        boolean boolean26 = cSVRecord10.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str23 = cSVRecord10.toString();
        long long24 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord10.iterator();
        long long26 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator27);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        long long24 = cSVRecord10.getRecordNumber();
        boolean boolean26 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray27 = cSVRecord10.values();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord10.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        java.lang.String str20 = cSVRecord10.getComment();
        int int21 = cSVRecord10.size();
        boolean boolean23 = cSVRecord10.isSet("");
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        java.lang.Class<?> wildcardClass26 = strSpliterator25.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[]", (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord24.get((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String str17 = cSVRecord10.getComment();
        int int18 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass19 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean22 = cSVRecord10.isConsistent();
        boolean boolean24 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        int int14 = cSVRecord10.size();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String[] strArray18 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "hi!", (long) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray23 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) ' ');
        boolean boolean29 = cSVRecord27.isSet("[]");
        boolean boolean31 = cSVRecord27.isMapped("");
        java.lang.String str32 = cSVRecord27.toString();
        java.util.Spliterator<java.lang.String> strSpliterator33 = cSVRecord27.spliterator();
        java.lang.String str34 = cSVRecord27.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[, hi!, hi!, , , ]" + "'", str32, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[hi!, hi!, [, hi!, hi!, , , ]]" + "'", str34, "[hi!, hi!, [, hi!, hi!, , , ]]");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean21 = cSVRecord10.isMapped("");
        long long22 = cSVRecord10.getRecordNumber();
        int int23 = cSVRecord10.size();
        java.lang.String str24 = cSVRecord10.toString();
        java.lang.Class<?> wildcardClass25 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[, hi!, hi!, , , ]" + "'", str24, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        boolean boolean21 = cSVRecord10.isSet("[]");
        int int22 = cSVRecord10.size();
        java.lang.String str23 = cSVRecord10.toString();
        java.lang.String[] strArray24 = cSVRecord10.values();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[hi!, hi!, [, hi!, hi!, , , ]]", 0L);
        boolean boolean5 = cSVRecord4.isConsistent();
        java.lang.String str6 = cSVRecord4.toString();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord4.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "[, hi!, hi!, , , ]", 32L);
        boolean boolean21 = cSVRecord20.isConsistent();
        boolean boolean23 = cSVRecord20.isMapped("[]");
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord20.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        java.lang.String[] strArray23 = cSVRecord10.values();
        boolean boolean25 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.lang.String str16 = cSVRecord10.getComment();
        java.lang.String str18 = cSVRecord10.get((int) (byte) 0);
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        boolean boolean14 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", 100L);
        java.lang.String[] strArray20 = cSVRecord19.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "[]", (long) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25, "[]", (long) (short) 100);
        boolean boolean30 = cSVRecord28.isMapped("");
        java.lang.String str31 = cSVRecord28.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[hi!, hi!, [, hi!, hi!, , , ]]", 6L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray17, strMap22, "hi!", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray17, strMap26, "", (long) (short) 10);
        java.lang.String str30 = cSVRecord29.toString();
        boolean boolean31 = cSVRecord29.isConsistent();
        int int32 = cSVRecord29.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "[, hi!, hi!, , , ]", 1L);
        int int19 = cSVRecord18.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isMapped("hi!");
        boolean boolean20 = cSVRecord10.isSet("");
        java.lang.String str21 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isSet("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "hi!", (long) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "[]", 97L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.lang.Class<?> wildcardClass25 = strArray24.getClass();
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
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String[] strArray16 = cSVRecord10.values();
        boolean boolean18 = cSVRecord10.isSet("");
        java.lang.String str20 = cSVRecord10.get(0);
        boolean boolean22 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String[] strArray23 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long17 = cSVRecord10.getRecordNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord10.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isMapped("");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str19 = cSVRecord10.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        java.lang.String str21 = cSVRecord10.toString();
        java.lang.String[] strArray22 = cSVRecord10.values();
        boolean boolean24 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("[]");
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        boolean boolean23 = cSVRecord10.isSet("hi!");
        boolean boolean24 = cSVRecord10.isConsistent();
        int int25 = cSVRecord10.size();
        boolean boolean27 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str29 = cSVRecord10.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
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
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord24.spliterator();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord24.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord24.get("[hi!, hi!, [, hi!, hi!, , , ]]");
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
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertNotNull(strItor28);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        java.lang.String str22 = cSVRecord10.getComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = cSVRecord10.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isSet("");
        int int17 = cSVRecord10.size();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean20 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isMapped("hi!");
        long long18 = cSVRecord10.getRecordNumber();
        java.lang.String[] strArray19 = cSVRecord10.values();
        java.lang.String str21 = cSVRecord10.get((int) (short) 1);
        java.lang.String[] strArray22 = cSVRecord10.values();
        java.lang.String str24 = cSVRecord10.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String str21 = cSVRecord10.getComment();
        boolean boolean23 = cSVRecord10.isMapped("");
        java.lang.String str24 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        int int26 = cSVRecord10.size();
        java.lang.String str27 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        long long24 = cSVRecord23.getRecordNumber();
        boolean boolean26 = cSVRecord23.isMapped("");
        boolean boolean27 = cSVRecord23.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean20 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 6);
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord18.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray18, strMap23, "", (-1L));
        boolean boolean27 = cSVRecord26.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord26.spliterator();
        boolean boolean29 = cSVRecord26.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord26.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        java.lang.String str19 = cSVRecord10.getComment();
        boolean boolean21 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        boolean boolean24 = cSVRecord10.isMapped("");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        int int15 = cSVRecord10.size();
        java.lang.String[] strArray16 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) ' ');
        boolean boolean21 = cSVRecord20.isConsistent();
        boolean boolean23 = cSVRecord20.isSet("");
        int int24 = cSVRecord20.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        java.lang.String str30 = cSVRecord24.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String str15 = cSVRecord10.toString();
        long long16 = cSVRecord10.getRecordNumber();
        java.lang.String str17 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isMapped("");
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String str21 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        java.lang.String str19 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        boolean boolean21 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String[] strArray24 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        long long23 = cSVRecord22.getRecordNumber();
        java.lang.String[] strArray24 = cSVRecord22.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25, "[, hi!, hi!, , , ]", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray24, strMap29, "[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]", (long) ' ');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isConsistent();
        boolean boolean16 = cSVRecord10.isConsistent();
        int int17 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord10.spliterator();
        java.lang.String str19 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.lang.String str18 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        boolean boolean22 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        java.lang.String str23 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord10.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord10.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19, "", 0L);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord22.iterator();
        java.lang.String str24 = cSVRecord22.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '4');
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        boolean boolean15 = cSVRecord10.isSet("");
        int int16 = cSVRecord10.size();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        java.lang.String str19 = cSVRecord10.getComment();
        java.lang.Class<?> wildcardClass20 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray15, strMap28, "hi!", 100L);
        long long32 = cSVRecord31.getRecordNumber();
        int int33 = cSVRecord31.size();
        boolean boolean34 = cSVRecord31.isConsistent();
        java.lang.String str36 = cSVRecord31.get(0);
        int int37 = cSVRecord31.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.toString();
        boolean boolean17 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isSet("");
        java.lang.String str20 = cSVRecord10.toString();
        java.lang.String str21 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord10.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[, hi!, hi!, , , ]" + "'", str21, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        int int15 = cSVRecord10.size();
        long long16 = cSVRecord10.getRecordNumber();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("hi!");
        java.lang.String str14 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean16 = cSVRecord10.isConsistent();
        boolean boolean18 = cSVRecord10.isMapped("[]");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.lang.String str15 = cSVRecord10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        boolean boolean20 = cSVRecord10.isConsistent();
        java.lang.String str21 = cSVRecord10.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        boolean boolean18 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isConsistent();
        java.lang.String str20 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[, hi!, hi!, , , ]" + "'", str20, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        boolean boolean22 = cSVRecord10.isMapped("hi!");
        java.lang.String str23 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("[]");
        java.lang.String str18 = cSVRecord10.getComment();
        java.lang.String str19 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord10.get("[, hi!, hi!, , , ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        boolean boolean15 = cSVRecord10.isConsistent();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str18 = cSVRecord10.get(0);
        long long19 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("");
        boolean boolean19 = cSVRecord10.isSet("hi!");
        java.lang.String[] strArray20 = cSVRecord10.values();
        java.lang.String[] strArray21 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord24.spliterator();
        java.lang.String str27 = cSVRecord24.get(4);
        boolean boolean29 = cSVRecord24.isMapped("[, hi!, hi!, , , ]");
        boolean boolean31 = cSVRecord24.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
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
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        int int21 = cSVRecord10.size();
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        java.lang.String str23 = cSVRecord10.get(1);
        java.lang.String str25 = cSVRecord10.get(0);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        boolean boolean20 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long21 = cSVRecord10.getRecordNumber();
        boolean boolean22 = cSVRecord10.isConsistent();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        boolean boolean24 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        boolean boolean17 = cSVRecord10.isSet("[]");
        boolean boolean18 = cSVRecord10.isConsistent();
        boolean boolean20 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord10.spliterator();
        java.lang.String[] strArray22 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        boolean boolean22 = cSVRecord10.isMapped("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord10.iterator();
        boolean boolean25 = cSVRecord10.isMapped("[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        long long15 = cSVRecord10.getRecordNumber();
        java.lang.String str16 = cSVRecord10.toString();
        java.lang.String str17 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.toString();
        boolean boolean19 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        int int27 = cSVRecord26.size();
        int int28 = cSVRecord26.size();
        java.lang.String[] strArray29 = cSVRecord26.values();
        java.lang.Class<?> wildcardClass30 = cSVRecord26.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        int int16 = cSVRecord10.size();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String str16 = cSVRecord10.get((int) (byte) 1);
        boolean boolean18 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        int int20 = cSVRecord10.size();
        long long21 = cSVRecord10.getRecordNumber();
        java.lang.String str22 = cSVRecord10.getComment();
        long long23 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord20.iterator();
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
        org.junit.Assert.assertNotNull(strItor29);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        java.lang.String str22 = cSVRecord10.get(1);
        java.lang.String str23 = cSVRecord10.getComment();
        java.lang.String[] strArray24 = cSVRecord10.values();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        long long21 = cSVRecord10.getRecordNumber();
        long long22 = cSVRecord10.getRecordNumber();
        int int23 = cSVRecord10.size();
        boolean boolean25 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String[] strArray26 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, hi!, hi!, , , ]" + "'", str16, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        long long14 = cSVRecord10.getRecordNumber();
        boolean boolean16 = cSVRecord10.isMapped("");
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.get((int) (short) 0);
        long long17 = cSVRecord10.getRecordNumber();
        long long18 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord10.spliterator();
        boolean boolean20 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        long long29 = cSVRecord18.getRecordNumber();
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.get((int) (short) 0);
        long long17 = cSVRecord10.getRecordNumber();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        java.lang.Class<?> wildcardClass22 = cSVRecord10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        boolean boolean21 = cSVRecord10.isMapped("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        int int20 = cSVRecord10.size();
        java.lang.String str21 = cSVRecord10.getComment();
        int int22 = cSVRecord10.size();
        java.lang.String str23 = cSVRecord10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[, hi!, hi!, , , ]" + "'", str23, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        int int15 = cSVRecord10.size();
        int int16 = cSVRecord10.size();
        long long17 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        long long13 = cSVRecord10.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord10.spliterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "", (-1L));
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "[, hi!, hi!, , , ]", (long) (byte) -1);
        boolean boolean24 = cSVRecord23.isConsistent();
        java.lang.String str25 = cSVRecord23.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[, hi!, hi!, , , ]" + "'", str25, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray15, strMap16, "hi!", 10L);
        boolean boolean20 = cSVRecord19.isConsistent();
        boolean boolean22 = cSVRecord19.isSet("");
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        boolean boolean24 = cSVRecord19.isConsistent();
        int int25 = cSVRecord19.size();
        java.lang.String[] strArray26 = cSVRecord19.values();
        long long27 = cSVRecord19.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "hi!", (long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray14, strMap19, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray14, strMap23, "hi!", (long) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord26.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (byte) 1);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord26.spliterator();
        java.lang.String str28 = cSVRecord26.toString();
        long long29 = cSVRecord26.getRecordNumber();
        java.lang.String str30 = cSVRecord26.getComment();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[, hi!, hi!, , , ]" + "'", str28, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[, hi!, hi!, , , ]" + "'", str30, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        boolean boolean20 = cSVRecord10.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        int int13 = cSVRecord10.size();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord10.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = cSVRecord10.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        boolean boolean14 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str15 = cSVRecord10.getComment();
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        long long18 = cSVRecord10.getRecordNumber();
        boolean boolean19 = cSVRecord10.isConsistent();
        boolean boolean21 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord10.spliterator();
        java.lang.String str24 = cSVRecord10.get(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord10.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord10.spliterator();
        long long26 = cSVRecord10.getRecordNumber();
        long long27 = cSVRecord10.getRecordNumber();
        boolean boolean29 = cSVRecord10.isMapped("");
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
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.lang.String str22 = cSVRecord10.get(1);
        boolean boolean24 = cSVRecord10.isMapped("hi!");
        boolean boolean26 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        boolean boolean28 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str29 = cSVRecord10.getComment();
        boolean boolean30 = cSVRecord10.isConsistent();
        boolean boolean31 = cSVRecord10.isConsistent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.lang.String str14 = cSVRecord10.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord10.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        long long20 = cSVRecord10.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord10.iterator();
        java.lang.String str22 = cSVRecord10.toString();
        boolean boolean23 = cSVRecord10.isConsistent();
        java.lang.String[] strArray24 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[, hi!, hi!, , , ]" + "'", str22, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        boolean boolean15 = cSVRecord10.isSet("[, hi!, hi!, , , ]");
        java.lang.String str16 = cSVRecord10.getComment();
        boolean boolean17 = cSVRecord10.isConsistent();
        java.lang.String str18 = cSVRecord10.toString();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, hi!, hi!, , , ]" + "'", str18, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.toString();
        java.lang.String str14 = cSVRecord10.toString();
        java.lang.String str15 = cSVRecord10.getComment();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord10.spliterator();
        java.lang.String[] strArray17 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray17, strMap18, "[, hi!, hi!, , , ]", (long) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[, hi!, hi!, , , ]" + "'", str13, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        java.lang.String str12 = cSVRecord10.toString();
        boolean boolean13 = cSVRecord10.isConsistent();
        java.lang.String[] strArray14 = cSVRecord10.values();
        boolean boolean16 = cSVRecord10.isSet("[hi!, hi!, [, hi!, hi!, , , ]]");
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, hi!, hi!, , , ]" + "'", str12, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", (long) 0);
        java.lang.String str19 = cSVRecord18.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord18.get("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[, hi!, hi!, , , ]" + "'", str19, "[, hi!, hi!, , , ]");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isMapped("[, hi!, hi!, , , ]");
        java.lang.String[] strArray14 = cSVRecord10.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = null;
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray14, strMap15, "", 0L);
        boolean boolean20 = cSVRecord18.isMapped("[, hi!, hi!, , , ]");
        boolean boolean22 = cSVRecord18.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "[]", (-1L));
        boolean boolean5 = cSVRecord4.isConsistent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray15, strMap24, "[, hi!, hi!, , , ]", (long) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray15, strMap28, "[hi!, hi!, [, hi!, hi!, , , ]]", (long) (short) 0);
        java.lang.String str32 = cSVRecord31.getComment();
        java.util.Iterator<java.lang.String> strItor33 = cSVRecord31.iterator();
        boolean boolean35 = cSVRecord31.isMapped("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = cSVRecord31.get("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[hi!, hi!, [, hi!, hi!, , , ]]" + "'", str32, "[hi!, hi!, [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        boolean boolean20 = cSVRecord10.isSet("[[, hi!, hi!, , , ], , , [, hi!, hi!, , , ]]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[, hi!, hi!, , , ]" + "'", str14, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[, hi!, hi!, , , ]" + "'", str15, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, hi!, hi!, , , ]" + "'", str17, "[, hi!, hi!, , , ]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

