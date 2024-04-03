package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7001");
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
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7002");
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
        boolean boolean25 = cSVRecord22.isMapped("");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7003");
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
        int int19 = cSVRecord5.size();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7004");
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
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7005");
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
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7006");
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
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7007");
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
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7008");
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
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7009");
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
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7010");
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
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7011");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        boolean boolean6 = cSVRecord4.isMapped("");
        boolean boolean8 = cSVRecord4.isMapped("");
        java.lang.String str9 = cSVRecord4.getComment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7012");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isSet("");
        java.lang.String str10 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7013");
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
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7014");
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
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7015");
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
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7016");
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
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7017");
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
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7018");
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
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7019");
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
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7020");
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
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7021");
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
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7022");
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
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7023");
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
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7024");
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
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7025");
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
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7026");
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
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7027");
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
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7028");
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
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7029");
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
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7030");
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
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7031");
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
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7032");
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
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7033");
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
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7034");
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
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7035");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21, "hi!", 100L);
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
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7036");
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
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7037");
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
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7038");
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
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7039");
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
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7040");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7041");
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
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7042");
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
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7043");
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
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7044");
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
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7045");
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
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7046");
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
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7047");
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
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7048");
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
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7049");
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
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7050");
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
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7051");
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
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7052");
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
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7053");
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
        boolean boolean18 = cSVRecord9.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7054");
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
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7055");
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
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7056");
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
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7057");
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
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7058");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7059");
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
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7060");
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
        java.lang.String str16 = cSVRecord5.toString();
        int int17 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7061");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) (short) 0);
        boolean boolean6 = cSVRecord4.isSet("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7062");
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
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7063");
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
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7064");
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
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7065");
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
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7066");
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
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7067");
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
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7068");
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
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7069");
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
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7070");
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
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7071");
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
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7072");
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
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7073");
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
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7074");
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
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7075");
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
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7076");
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
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7077");
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
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7078");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7079");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        boolean boolean6 = cSVRecord4.isConsistent();
        boolean boolean7 = cSVRecord4.isConsistent();
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7080");
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
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7081");
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
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7082");
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
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7083");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7084");
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
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7085");
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
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7086");
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
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7087");
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
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7088");
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
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7089");
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
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7090");
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
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7091");
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
        java.lang.String[] strArray16 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (short) 10);
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
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7092");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String str7 = cSVRecord5.getComment();
        boolean boolean9 = cSVRecord5.isMapped("");
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.getComment();
        int int12 = cSVRecord5.size();
        boolean boolean14 = cSVRecord5.isSet("hi!");
        boolean boolean16 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7093");
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
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7094");
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
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7095");
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
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7096");
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
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7097");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) 10);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7098");
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
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7099");
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
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7100");
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
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7101");
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
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7102");
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
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7103");
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
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7104");
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
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7105");
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
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7106");
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
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7107");
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
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7108");
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
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7109");
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
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7110");
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
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7111");
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
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7112");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        boolean boolean14 = cSVRecord9.isSet("");
        java.lang.String str16 = cSVRecord9.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord9.spliterator();
        boolean boolean18 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7113");
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
        java.lang.String[] strArray17 = cSVRecord16.values();
        java.lang.String[] strArray18 = cSVRecord16.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7114");
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
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7115");
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
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7116");
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
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7117");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        boolean boolean21 = cSVRecord9.isSet("hi!");
        boolean boolean23 = cSVRecord9.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7118");
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
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7119");
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
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7120");
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
        int int17 = cSVRecord5.size();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7121");
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
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7122");
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
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7123");
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
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7124");
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
        boolean boolean17 = cSVRecord9.isConsistent();
        java.lang.String[] strArray18 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7125");
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
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7126");
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
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7127");
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
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7128");
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
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7129");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (-1));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7130");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) (short) 10);
        java.util.Iterator<java.lang.String> strItor5 = cSVRecord4.iterator();
        int int6 = cSVRecord4.size();
        java.lang.String[] strArray7 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "", (long) '#');
        long long12 = cSVRecord11.getRecordNumber();
        boolean boolean14 = cSVRecord11.isMapped("hi!");
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7131");
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
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7132");
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
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7133");
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
        boolean boolean14 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7134");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "hi!", (long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray0, strMap9, "hi!", 0L);
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7135");
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
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7136");
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
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7137");
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
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7138");
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
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7139");
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
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7140");
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
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7141");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7142");
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
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7143");
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
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7144");
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
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7145");
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
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7146");
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
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7147");
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
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7148");
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
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7149");
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
        int int19 = cSVRecord5.size();
        java.lang.String str20 = cSVRecord5.toString();
        java.lang.String[] strArray21 = cSVRecord5.values();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7150");
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
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7151");
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
        long long24 = cSVRecord22.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7152");
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
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7153");
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
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7154");
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
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7155");
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
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7156");
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
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7157");
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
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7158");
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
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7159");
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
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7160");
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
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7161");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7162");
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
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7163");
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
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7164");
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
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7165");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSpliterator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7166");
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
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7167");
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
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7168");
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
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7169");
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
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7170");
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
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7171");
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
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7172");
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
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7173");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        int int6 = cSVRecord5.size();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.lang.String[] strArray8 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = null;
        org.apache.commons.csv.CSVRecord cSVRecord12 = new org.apache.commons.csv.CSVRecord(strArray8, strMap9, "", (long) (short) 100);
        java.lang.String str13 = cSVRecord12.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord12.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7174");
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
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7175");
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
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7176");
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
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7177");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7178");
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
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7179");
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
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7180");
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
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7181");
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
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7182");
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
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSpliterator15);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7183");
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
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7184");
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
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7185");
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
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7186");
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
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7187");
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
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7188");
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
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7189");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        boolean boolean12 = cSVRecord10.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord10.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7190");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord5.iterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.toString();
        boolean boolean13 = cSVRecord5.isSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7191");
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
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7192");
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
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7193");
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
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7194");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        int int10 = cSVRecord9.size();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord9.spliterator();
        int int12 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor13 = cSVRecord9.iterator();
        long long14 = cSVRecord9.getRecordNumber();
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(strItor15);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7195");
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
        boolean boolean28 = cSVRecord23.isMapped("hi!");
        long long29 = cSVRecord23.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator30 = cSVRecord23.spliterator();
        java.lang.String str31 = cSVRecord23.toString();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(strSpliterator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7196");
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
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7197");
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
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7198");
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
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7199");
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
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7200");
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
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7201");
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
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7202");
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
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7203");
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
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7204");
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
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7205");
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
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7206");
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
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7207");
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
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7208");
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
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7209");
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
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7210");
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
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7211");
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
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7212");
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
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7213");
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
        int int14 = cSVRecord5.size();
        java.lang.String[] strArray15 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7214");
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
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7215");
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
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7216");
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
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7217");
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
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7218");
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
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7219");
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
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7220");
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
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7221");
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
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7222");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7223");
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
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7224");
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
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7225");
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
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7226");
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
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7227");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) 1);
        boolean boolean6 = cSVRecord4.isSet("");
        java.lang.Class<?> wildcardClass7 = cSVRecord4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7228");
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
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7229");
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
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7230");
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
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7231");
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
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7232");
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
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7233");
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
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7234");
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
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7235");
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
        java.lang.String[] strArray20 = cSVRecord14.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7236");
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
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7237");
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
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7238");
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
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7239");
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
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7240");
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
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7241");
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
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7242");
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
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7243");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "hi!", 0L);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7244");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "hi!", (long) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = null;
        org.apache.commons.csv.CSVRecord cSVRecord8 = new org.apache.commons.csv.CSVRecord(strArray0, strMap5, "", (-1L));
        int int9 = cSVRecord8.size();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", 0L);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7245");
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
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7246");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7247");
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
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7248");
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
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7249");
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
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7250");
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
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7251");
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
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7252");
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
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7253");
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
        boolean boolean18 = cSVRecord5.isMapped("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7254");
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
        boolean boolean18 = cSVRecord5.isSet("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7255");
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
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7256");
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
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7257");
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
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7258");
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
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7259");
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
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7260");
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
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7261");
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
        java.lang.String str16 = cSVRecord9.get(0);
        java.lang.String str17 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7262");
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
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7263");
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
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7264");
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
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7265");
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
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7266");
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
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7267");
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
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7268");
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
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7269");
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
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7270");
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
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7271");
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
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7272");
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
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7273");
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
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7274");
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
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7275");
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
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7276");
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
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7277");
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
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7278");
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
        java.lang.String str13 = cSVRecord5.toString();
        long long14 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7279");
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
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7280");
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
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7281");
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
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7282");
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
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7283");
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
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7284");
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
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7285");
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
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7286");
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
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord5.iterator();
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
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7287");
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
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7288");
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
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7289");
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
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7290");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (byte) 100);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        boolean boolean13 = cSVRecord10.isSet("");
        long long14 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7291");
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
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7292");
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
        java.lang.String[] strArray19 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7293");
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
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7294");
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
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7295");
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
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7296");
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
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7297");
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
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7298");
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
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7299");
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
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7300");
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
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7301");
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
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7302");
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
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7303");
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
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7304");
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
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7305");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7306");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7307");
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
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7308");
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
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7309");
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
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7310");
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
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7311");
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
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7312");
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
        org.apache.commons.csv.CSVRecord cSVRecord18 = new org.apache.commons.csv.CSVRecord(strArray10, strMap15, "hi!", 100L);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7313");
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
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7314");
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
        java.lang.String str17 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7315");
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
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7316");
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
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7317");
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
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7318");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        boolean boolean8 = cSVRecord5.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7319");
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
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7320");
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
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7321");
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
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7322");
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
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7323");
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
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7324");
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
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord27.iterator();
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord27.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strItor29);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7325");
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
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7326");
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
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7327");
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
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7328");
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
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7329");
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
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7330");
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
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7331");
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
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7332");
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
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7333");
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
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7334");
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
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7335");
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
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7336");
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
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7337");
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
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7338");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7339");
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
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7340");
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
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7341");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord13.spliterator();
        boolean boolean17 = cSVRecord13.isConsistent();
        java.lang.String str18 = cSVRecord13.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7342");
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
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7343");
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
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7344");
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
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7345");
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
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7346");
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
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7347");
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
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7348");
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
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7349");
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
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7350");
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
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7351");
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
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7352");
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
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7353");
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
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7354");
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
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7355");
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
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7356");
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
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7357");
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
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7358");
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
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7359");
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
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7360");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", 10L);
        java.lang.String str15 = cSVRecord13.get(0);
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord13.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord13.spliterator();
        java.lang.String str18 = cSVRecord13.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7361");
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
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7362");
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
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7363");
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
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7364");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        boolean boolean12 = cSVRecord10.isMapped("");
        boolean boolean14 = cSVRecord10.isMapped("");
        boolean boolean15 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7365");
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
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7366");
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
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7367");
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
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7368");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7369");
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
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7370");
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
        boolean boolean20 = cSVRecord16.isMapped("");
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
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7371");
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
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7372");
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
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7373");
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
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7374");
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
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7375");
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
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7376");
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
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7377");
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
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7378");
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
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7379");
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
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7380");
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
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7381");
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
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7382");
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
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7383");
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
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7384");
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
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7385");
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
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7386");
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
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7387");
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
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7388");
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
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7389");
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
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7390");
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
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7391");
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
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7392");
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
        boolean boolean20 = cSVRecord14.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7393");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7394");
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
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7395");
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
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7396");
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
        boolean boolean22 = cSVRecord5.isMapped("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7397");
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
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7398");
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
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7399");
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
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7400");
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
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7401");
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
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7402");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        java.lang.String str10 = cSVRecord5.toString();
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        java.lang.String str13 = cSVRecord5.getComment();
        boolean boolean14 = cSVRecord5.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7403");
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
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7404");
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
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7405");
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
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7406");
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
        int int13 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7407");
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
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7408");
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
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7409");
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
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7410");
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
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7411");
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
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7412");
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
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7413");
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
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7414");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        boolean boolean10 = cSVRecord5.isSet("");
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord5.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7415");
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
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7416");
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
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7417");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isSet("hi!");
        java.lang.String str11 = cSVRecord5.toString();
        java.lang.String[] strArray12 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7418");
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
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7419");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        org.apache.commons.csv.CSVRecord cSVRecord13 = new org.apache.commons.csv.CSVRecord(strArray1, strMap10, "", (long) (short) 0);
        int int14 = cSVRecord13.size();
        java.lang.String str15 = cSVRecord13.getComment();
        boolean boolean17 = cSVRecord13.isMapped("hi!");
        long long18 = cSVRecord13.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7420");
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
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7421");
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

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7422");
        java.lang.String[] strArray0 = null;
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = null;
        org.apache.commons.csv.CSVRecord cSVRecord4 = new org.apache.commons.csv.CSVRecord(strArray0, strMap1, "", (long) '#');
        java.lang.String str5 = cSVRecord4.getComment();
        boolean boolean7 = cSVRecord4.isMapped("hi!");
        java.util.Iterator<java.lang.String> strItor8 = cSVRecord4.iterator();
        java.util.Iterator<java.lang.String> strItor9 = cSVRecord4.iterator();
        java.lang.String[] strArray10 = cSVRecord4.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "", (long) (short) 1);
        long long15 = cSVRecord14.getRecordNumber();
        java.util.Spliterator<java.lang.String> strSpliterator16 = cSVRecord14.spliterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7423");
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
        boolean boolean17 = cSVRecord16.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7424");
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
        java.lang.String[] strArray21 = cSVRecord5.values();
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
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7425");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator9 = cSVRecord5.spliterator();
        boolean boolean10 = cSVRecord5.isConsistent();
        java.lang.String[] strArray11 = cSVRecord5.values();
        boolean boolean13 = cSVRecord5.isMapped("hi!");
        java.util.Spliterator<java.lang.String> strSpliterator14 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7426");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.lang.String[] strArray7 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = null;
        org.apache.commons.csv.CSVRecord cSVRecord11 = new org.apache.commons.csv.CSVRecord(strArray7, strMap8, "hi!", (long) (byte) -1);
        java.lang.String[] strArray12 = cSVRecord11.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord16 = new org.apache.commons.csv.CSVRecord(strArray12, strMap13, "hi!", (long) (byte) -1);
        boolean boolean17 = cSVRecord16.isConsistent();
        boolean boolean19 = cSVRecord16.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7427");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String str12 = cSVRecord10.getComment();
        boolean boolean14 = cSVRecord10.isMapped("");
        java.lang.String[] strArray15 = cSVRecord10.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = cSVRecord10.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7428");
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
        java.util.Iterator<java.lang.String> strItor15 = cSVRecord5.iterator();
        java.lang.String str16 = cSVRecord5.getComment();
        java.lang.String str18 = cSVRecord5.get(0);
        int int19 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7429");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap14, "", (long) (byte) -1);
        boolean boolean18 = cSVRecord17.isConsistent();
        long long19 = cSVRecord17.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7430");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.lang.String str11 = cSVRecord9.get(0);
        int int12 = cSVRecord9.size();
        boolean boolean14 = cSVRecord9.isSet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7431");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord9.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strItor14);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7432");
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
        java.lang.String str15 = cSVRecord5.getComment();
        long long16 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7433");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray8, strMap17, "", (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7434");
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
        boolean boolean18 = cSVRecord9.isConsistent();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord9.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7435");
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
        long long17 = cSVRecord5.getRecordNumber();
        java.lang.String str18 = cSVRecord5.getComment();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord5.iterator();
        boolean boolean21 = cSVRecord5.isMapped("hi!");
        boolean boolean22 = cSVRecord5.isConsistent();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7436");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        java.lang.String str12 = cSVRecord9.get(0);
        boolean boolean13 = cSVRecord9.isConsistent();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord9.iterator();
        boolean boolean16 = cSVRecord9.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = cSVRecord9.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7437");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7438");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        boolean boolean6 = cSVRecord5.isConsistent();
        java.util.Iterator<java.lang.String> strItor7 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        long long9 = cSVRecord5.getRecordNumber();
        int int10 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7439");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.util.Spliterator<java.lang.String> strSpliterator8 = cSVRecord5.spliterator();
        boolean boolean9 = cSVRecord5.isConsistent();
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean11 = cSVRecord5.isConsistent();
        long long12 = cSVRecord5.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7440");
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
        boolean boolean19 = cSVRecord5.isMapped("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord5.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7441");
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
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord9.iterator();
        long long19 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7442");
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
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18, "hi!", (long) 100);
        boolean boolean23 = cSVRecord21.isMapped("hi!");
        boolean boolean24 = cSVRecord21.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7443");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        int int12 = cSVRecord9.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cSVRecord9.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7444");
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
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7445");
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
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray15, strMap20, "", 0L);
        long long24 = cSVRecord23.getRecordNumber();
        int int25 = cSVRecord23.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord23.get("hi!");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7446");
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
        boolean boolean17 = cSVRecord5.isMapped("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7447");
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
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray16, strMap17, "hi!", (long) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7448");
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
        int int23 = cSVRecord10.size();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7449");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        boolean boolean9 = cSVRecord5.isMapped("");
        long long10 = cSVRecord5.getRecordNumber();
        boolean boolean12 = cSVRecord5.isMapped("");
        java.lang.String str13 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7450");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.lang.String str9 = cSVRecord5.toString();
        java.lang.String[] strArray10 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray10, strMap11, "hi!", 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = cSVRecord14.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header mapping was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7451");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isSet("");
        int int11 = cSVRecord5.size();
        java.lang.String[] strArray12 = cSVRecord5.values();
        boolean boolean14 = cSVRecord5.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7452");
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
        java.lang.String str16 = cSVRecord5.toString();
        java.lang.Class<?> wildcardClass17 = cSVRecord5.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7453");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7454");
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
        boolean boolean19 = cSVRecord5.isSet("hi!");
        int int20 = cSVRecord5.size();
        boolean boolean22 = cSVRecord5.isSet("");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7455");
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
        java.lang.String[] strArray19 = cSVRecord17.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7456");
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
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7457");
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
        boolean boolean20 = cSVRecord5.isConsistent();
        java.lang.String str21 = cSVRecord5.toString();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord5.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7458");
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
        long long21 = cSVRecord13.getRecordNumber();
        java.lang.String[] strArray22 = cSVRecord13.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7459");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord17.spliterator();
        boolean boolean20 = cSVRecord17.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7460");
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
        boolean boolean28 = cSVRecord23.isMapped("hi!");
        boolean boolean30 = cSVRecord23.isMapped("");
        java.lang.String str31 = cSVRecord23.getComment();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7461");
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
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7462");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 0L);
        java.lang.String str11 = cSVRecord10.getComment();
        java.lang.String[] strArray12 = cSVRecord10.values();
        java.lang.String str13 = cSVRecord10.getComment();
        boolean boolean14 = cSVRecord10.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7463");
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
        java.lang.String str20 = cSVRecord5.toString();
        boolean boolean22 = cSVRecord5.isMapped("");
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7464");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", (long) (short) 1);
        boolean boolean12 = cSVRecord10.isSet("hi!");
        java.lang.String str13 = cSVRecord10.getComment();
        java.util.Iterator<java.lang.String> strItor14 = cSVRecord10.iterator();
        java.lang.String[] strArray15 = cSVRecord10.values();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord10.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7465");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", 0L);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "", 1L);
        long long11 = cSVRecord10.getRecordNumber();
        int int12 = cSVRecord10.size();
        boolean boolean13 = cSVRecord10.isConsistent();
        long long14 = cSVRecord10.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7466");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.util.Spliterator<java.lang.String> strSpliterator10 = cSVRecord9.spliterator();
        long long11 = cSVRecord9.getRecordNumber();
        boolean boolean13 = cSVRecord9.isSet("");
        java.lang.String str14 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7467");
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
        boolean boolean24 = cSVRecord5.isMapped("");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7468");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", (long) 'a');
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        long long11 = cSVRecord9.getRecordNumber();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7469");
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
        boolean boolean14 = cSVRecord5.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7470");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass13 = cSVRecord9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7471");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        java.lang.String[] strArray11 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isConsistent();
        int int13 = cSVRecord9.size();
        boolean boolean14 = cSVRecord9.isConsistent();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7472");
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
        java.lang.String str16 = cSVRecord9.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7473");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        int int7 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.getComment();
        boolean boolean10 = cSVRecord5.isSet("");
        java.lang.String[] strArray11 = cSVRecord5.values();
        java.lang.String str12 = cSVRecord5.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7474");
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strItor21);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7475");
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
        java.lang.String str18 = cSVRecord5.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7476");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7477");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "", 0L);
        java.lang.String[] strArray10 = cSVRecord9.values();
        int int11 = cSVRecord9.size();
        java.lang.String str12 = cSVRecord9.toString();
        java.util.Spliterator<java.lang.String> strSpliterator13 = cSVRecord9.spliterator();
        boolean boolean15 = cSVRecord9.isSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7478");
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
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        java.lang.Class<?> wildcardClass17 = strItor16.getClass();
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
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7479");
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
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7480");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = cSVRecord27.get(100);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7481");
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
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord18.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7482");
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
        java.util.Iterator<java.lang.String> strItor18 = cSVRecord5.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord5.spliterator();
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
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7483");
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
        int int19 = cSVRecord18.size();
        boolean boolean21 = cSVRecord18.isSet("");
        int int22 = cSVRecord18.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7484");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.util.Iterator<java.lang.String> strItor10 = cSVRecord9.iterator();
        boolean boolean11 = cSVRecord9.isConsistent();
        java.lang.String[] strArray12 = cSVRecord9.values();
        boolean boolean14 = cSVRecord9.isMapped("");
        boolean boolean16 = cSVRecord9.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7485");
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
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord16.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7486");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = null;
        org.apache.commons.csv.CSVRecord cSVRecord10 = new org.apache.commons.csv.CSVRecord(strArray6, strMap7, "hi!", (long) 10);
        java.util.Iterator<java.lang.String> strItor11 = cSVRecord10.iterator();
        int int12 = cSVRecord10.size();
        java.lang.String str13 = cSVRecord10.getComment();
        int int14 = cSVRecord10.size();
        java.lang.String[] strArray15 = cSVRecord10.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7487");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray16, strMap25, "", (long) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7488");
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
        java.lang.Class<?> wildcardClass20 = cSVRecord17.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7489");
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
        java.lang.String str25 = cSVRecord23.get(0);
        long long26 = cSVRecord23.getRecordNumber();
        boolean boolean28 = cSVRecord23.isMapped("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7490");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        boolean boolean11 = cSVRecord9.isSet("hi!");
        java.lang.String str12 = cSVRecord9.toString();
        boolean boolean14 = cSVRecord9.isSet("");
        java.lang.String str15 = cSVRecord9.toString();
        java.lang.String[] strArray16 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7491");
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
        int int19 = cSVRecord9.size();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord9.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7492");
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
        boolean boolean19 = cSVRecord9.isMapped("hi!");
        java.lang.String str20 = cSVRecord9.getComment();
        java.lang.String[] strArray21 = cSVRecord9.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7493");
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7494");
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
        boolean boolean19 = cSVRecord15.isSet("");
        boolean boolean21 = cSVRecord15.isSet("hi!");
        java.lang.String[] strArray22 = cSVRecord15.values();
        java.lang.String str23 = cSVRecord15.toString();
        java.lang.String[] strArray24 = cSVRecord15.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7495");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String str10 = cSVRecord9.getComment();
        boolean boolean12 = cSVRecord9.isSet("");
        java.lang.String str13 = cSVRecord9.getComment();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7496");
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
        boolean boolean22 = cSVRecord10.isConsistent();
        java.lang.String str23 = cSVRecord10.getComment();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7497");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        org.apache.commons.csv.CSVRecord cSVRecord9 = new org.apache.commons.csv.CSVRecord(strArray1, strMap6, "hi!", (long) (byte) -1);
        java.lang.String[] strArray10 = cSVRecord9.values();
        boolean boolean12 = cSVRecord9.isMapped("hi!");
        java.lang.String str13 = cSVRecord9.getComment();
        java.lang.String[] strArray14 = cSVRecord9.values();
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7498");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = null;
        org.apache.commons.csv.CSVRecord cSVRecord5 = new org.apache.commons.csv.CSVRecord(strArray1, strMap2, "", (long) 10);
        int int6 = cSVRecord5.size();
        java.lang.String str8 = cSVRecord5.get((int) (short) 0);
        java.lang.String[] strArray9 = cSVRecord5.values();
        boolean boolean11 = cSVRecord5.isSet("hi!");
        java.lang.String[] strArray12 = cSVRecord5.values();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7499");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test7500");
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
        int int17 = cSVRecord9.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }
}

