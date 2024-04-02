package org.apache.commons.collections4;

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
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator1 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean2 = strComparableComparator0.equals((java.lang.Object) strComparableComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator3);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int15 = strComparableComparator12.compare("hi!", "hi!");
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int19 = strComparableComparator12.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator20 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        boolean boolean21 = strComparableComparator9.equals((java.lang.Object) strComparator20);
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator9);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator25 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int28 = strComparableComparator25.compare("hi!", "hi!");
        java.lang.String str29 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator25);
        int int32 = strComparableComparator25.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator33 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator34 = strComparableComparator25.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator33);
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator9.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator33);
        java.util.Comparator comparator36 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator37 = strComparableComparator33.thenComparing((java.util.Comparator<java.lang.String>) comparator36);
        java.lang.String str38 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) comparator36);
        java.util.Comparator<java.lang.String> strComparator39 = strComparator3.thenComparing((java.util.Comparator<java.lang.String>) comparator36);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator44 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int47 = strComparableComparator44.compare("hi!", "hi!");
        java.lang.String str48 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator44);
        int int51 = strComparableComparator44.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator52 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator53 = strComparableComparator44.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.lang.String str54 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.util.Comparator<java.lang.String> strComparator55 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.util.Comparator<java.lang.String> strComparator56 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.util.Comparator<java.lang.String> strComparator57 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator56);
        java.util.Comparator<java.lang.String> strComparator58 = strComparator3.thenComparing(strComparator57);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator63 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator66 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int69 = strComparableComparator66.compare("hi!", "hi!");
        java.lang.String str70 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator66);
        int int73 = strComparableComparator66.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator74 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator66);
        boolean boolean75 = strComparableComparator63.equals((java.lang.Object) strComparator74);
        java.lang.String str76 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator63);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor81 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray80);
        boolean boolean82 = strComparableComparator63.equals((java.lang.Object) strArray80);
        java.util.Comparator<java.lang.String> strComparator83 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator63);
        java.lang.String str84 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", strComparator83);
        java.util.Comparator<java.lang.String> strComparator85 = strComparator3.thenComparing(strComparator83);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator9);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strComparableComparator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator33);
        org.junit.Assert.assertNotNull(strComparator34);
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertNotNull(strComparableComparator44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator52);
        org.junit.Assert.assertNotNull(strComparator53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strComparator55);
        org.junit.Assert.assertNotNull(strComparator56);
        org.junit.Assert.assertNotNull(strComparator57);
        org.junit.Assert.assertNotNull(strComparator58);
        org.junit.Assert.assertNotNull(strComparableComparator63);
        org.junit.Assert.assertNotNull(strComparableComparator66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertNotNull(strComparator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strItor81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strComparator83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(strComparator85);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][][] wildcardItorListArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]> wildcardItorListArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardItorListArray0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("");
        boolean boolean2 = strItor1.hasNext();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator14 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int17 = strComparableComparator14.compare("hi!", "hi!");
        java.lang.String str18 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator14);
        java.util.Comparator<java.lang.String> strComparator19 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator14);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean22 = strComparableComparator20.equals((java.lang.Object) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator23 = strComparator19.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator24 = strComparableComparator2.thenComparing(strComparator19);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator25 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int28 = strComparableComparator25.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator32 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int35 = strComparableComparator32.compare("hi!", "hi!");
        java.lang.String str36 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator32);
        int int39 = strComparableComparator32.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator40 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator41 = strComparableComparator32.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator40);
        java.util.Comparator<java.lang.String> strComparator42 = strComparableComparator29.thenComparing(strComparator41);
        boolean boolean43 = strComparableComparator25.equals((java.lang.Object) strComparableComparator29);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator46 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int49 = strComparableComparator46.compare("hi!", "hi!");
        java.lang.String str50 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator46);
        int int53 = strComparableComparator46.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator54 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator55 = strComparableComparator46.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator54);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor56 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator46);
        int int59 = strComparableComparator46.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator60 = strComparableComparator29.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator46);
        java.util.Comparator<java.lang.String> strComparator61 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator29);
        java.util.Comparator<java.lang.String> strComparator62 = strComparator61.reversed();
        java.util.Comparator<java.lang.String> strComparator63 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator61);
        boolean boolean64 = strComparableComparator2.equals((java.lang.Object) strComparator61);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparableComparator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparableComparator32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator40);
        org.junit.Assert.assertNotNull(strComparator41);
        org.junit.Assert.assertNotNull(strComparator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strComparableComparator46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator54);
        org.junit.Assert.assertNotNull(strComparator55);
        org.junit.Assert.assertNotNull(objItor56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-3) + "'", int59 == (-3));
        org.junit.Assert.assertNotNull(strComparator60);
        org.junit.Assert.assertNotNull(strComparator61);
        org.junit.Assert.assertNotNull(strComparator62);
        org.junit.Assert.assertNotNull(strComparator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
        java.util.Comparator<org.apache.commons.collections4.MapIterator>[][] mapIteratorComparatorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorComparatorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        java.lang.String str11 = strItor4.previous();
        boolean boolean12 = strItor4.hasPrevious();
        java.lang.String str13 = strItor4.next();
        int int14 = strItor4.nextIndex();
        boolean boolean15 = strItor4.hasPrevious();
        int int16 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        int int5 = strItor0.previousIndex();
        int int6 = strItor0.nextIndex();
        boolean boolean7 = strItor0.hasNext();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.util.Comparator<org.apache.commons.collections4.MapIterator>[][]> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        boolean boolean6 = strItor4.hasPrevious();
        strItor4.set("");
        int int9 = strItor4.nextIndex();
        int int10 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        boolean boolean11 = strItor4.hasNext();
        int int12 = strItor4.nextIndex();
        int int13 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        java.lang.String str9 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        boolean boolean16 = strItor4.hasNext();
        boolean boolean17 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][], java.util.Iterator> typeItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItorArrayItor0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        boolean boolean9 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][], java.lang.Class<?>[]> typeItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass1 = typeItorArrayItor0.getClass();
        org.junit.Assert.assertNotNull(typeItorArrayItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, org.apache.commons.collections4.MapIterator> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorListArrayComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]>[]) comparatorArray1);
        java.util.Comparator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorListArrayComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[]>[]) comparatorArray1);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) comparatorArray1);
        java.util.Comparator<java.lang.Class<?>[][]> wildcardClassArrayComparator7 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.Class<?>[][]>[]) comparatorArray1);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(wildcardItorListArrayComparator4);
        org.junit.Assert.assertNotNull(wildcardItorListArrayComparator5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(wildcardClassArrayComparator7);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type[][][][][], java.util.RandomAccess[]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.CharSequence> charSequenceItor1 = org.apache.commons.collections4.IteratorUtils.chainedIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0);
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence[][]> charSequenceArrayItor2 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.CharSequence[][]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceArrayItor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArrayItor1);
        org.junit.Assert.assertNotNull(charSequenceArrayItor2);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        boolean boolean9 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        // The following exception was thrown during execution in test generation
        try {
            strItor10.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        strItor4.set("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.next();
        java.lang.String str15 = strItor7.previous();
        strItor7.set("hi!");
        java.lang.String str18 = strItor7.previous();
        boolean boolean19 = strItor7.hasPrevious();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray23);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray23);
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray27);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray27);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArray27);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor34 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean35 = typeItor34.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator36 = typeItor34.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList37 = typeItor34.getIterators();
        boolean boolean38 = charSequenceItorReverseComparator0.equals((java.lang.Object) typeItor34);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator39 = typeItor34.getComparator();
        boolean boolean40 = typeItor34.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = typeItor34.getIteratorIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value has been returned yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceItor24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor28);
        org.junit.Assert.assertNotNull(genericDeclarationItor31);
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(wildcardComparator36);
        org.junit.Assert.assertNotNull(wildcardItorList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(wildcardComparator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        int int10 = strItor4.previousIndex();
        boolean boolean11 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor12 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int13 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> charSequenceItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItorItor0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator9 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean11 = charSequenceItorReverseComparator9.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray15);
        boolean boolean17 = strItor16.hasPrevious();
        boolean boolean18 = strItor16.hasNext();
        int int19 = strItor16.previousIndex();
        java.lang.String str20 = strItor16.next();
        boolean boolean21 = charSequenceItorReverseComparator9.equals((java.lang.Object) strItor16);
        java.lang.Class<?> wildcardClass22 = strItor16.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.String str32 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass33 = strComparableComparator27.getClass();
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor34 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass35 = charSequenceItorItor34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass7;
        wildcardClassArray38[1] = wildcardClass22;
        wildcardClassArray38[2] = wildcardClass33;
        wildcardClassArray38[3] = wildcardClass35;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38, (int) (byte) 0, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor50 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38);
        java.lang.Class<?> wildcardClass51 = wildcardClassItor50.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor52 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClass51);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(charSequenceItorItor34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassItor49);
        org.junit.Assert.assertNotNull(wildcardClassItor50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClassItor52);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strItor5.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        boolean boolean16 = strItor4.hasNext();
        java.lang.String str17 = strItor4.next();
        java.lang.String str18 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1533");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        strItor4.set("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator5 = typeItor0.getComparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertNull(wildcardComparator5);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray4);
        boolean boolean6 = strItor5.hasPrevious();
        boolean boolean7 = strItor5.hasNext();
        int int8 = strItor5.previousIndex();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray12);
        boolean boolean14 = strItor13.hasPrevious();
        int int15 = strItor13.nextIndex();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strItor20.hasPrevious();
        boolean boolean22 = strItor20.hasPrevious();
        int int23 = strItor20.previousIndex();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray25 = new org.apache.commons.collections4.ResettableListIterator[4];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray26 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray25;
        strItorArray26[0] = resettableListIterator0;
        strItorArray26[1] = strItor5;
        strItorArray26[2] = strItor13;
        strItorArray26[3] = strItor20;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray26);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray26);
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(resettableListIteratorArray25);
        org.junit.Assert.assertNotNull(strItorArray26);
        org.junit.Assert.assertNotNull(strItorItor35);
        org.junit.Assert.assertNotNull(strItorItor36);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator2 = typeItor0.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList4 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor5 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardComparator2);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList4);
        org.junit.Assert.assertNotNull(wildcardItorItor5);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        boolean boolean16 = strItor4.hasNext();
        int int17 = strItor4.previousIndex();
        boolean boolean18 = strItor4.hasPrevious();
        java.util.Iterator<?> wildcardItor19 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardItor19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int16 = strComparableComparator12.compare("hi!", "hi!");
        int int19 = strComparableComparator12.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator20 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator22 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean24 = charSequenceItorReverseComparator22.equals((java.lang.Object) 100.0f);
        boolean boolean25 = strComparableComparator12.equals((java.lang.Object) charSequenceItorReverseComparator22);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator26 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean28 = charSequenceItorReverseComparator26.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray32);
        boolean boolean34 = strItor33.hasPrevious();
        boolean boolean35 = strItor33.hasNext();
        int int36 = strItor33.previousIndex();
        java.lang.String str37 = strItor33.next();
        boolean boolean38 = charSequenceItorReverseComparator26.equals((java.lang.Object) strItor33);
        java.lang.String str39 = strItor33.next();
        java.lang.String str40 = strItor33.next();
        java.lang.String str41 = strItor33.previous();
        strItor33.set("hi!");
        boolean boolean44 = strComparableComparator12.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        int int6 = strItor4.nextIndex();
        java.lang.String str7 = strItor4.next();
        boolean boolean8 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1540");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        boolean boolean12 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("");
        boolean boolean16 = strItor4.hasPrevious();
        java.lang.String str17 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        int int3 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        boolean boolean9 = strItor4.hasPrevious();
        java.lang.String str10 = strItor4.next();
        java.lang.String str11 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean3 = iteratorItor2.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor2);
        boolean boolean5 = iteratorItor2.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[] iteratorItorArray9 = (org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[]) orderedMapIteratorArray8;
        iteratorItorArray9[0] = iteratorItor0;
        iteratorItorArray9[1] = iteratorItor2;
        iteratorItorArray9[2] = orderedMapIterator6;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorItorArray9, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorItorArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorItorArray9, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(iteratorItorArray9);
        org.junit.Assert.assertNotNull(iteratorItorItor17);
        org.junit.Assert.assertNotNull(iteratorItorItor18);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.lang.String str16 = strItor4.previous();
        boolean boolean17 = strItor4.hasPrevious();
        int int18 = strItor4.nextIndex();
        java.lang.String str19 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
        org.apache.commons.collections4.MapIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[], java.lang.String[]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorListArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardItorListArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) boolean3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator10 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.Class<?> wildcardClass11 = strComparator10.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator14 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int17 = strComparableComparator14.compare("hi!", "hi!");
        java.lang.String str18 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator14);
        int int21 = strComparableComparator14.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator22 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator14);
        java.lang.Class<?> wildcardClass23 = strComparator22.getClass();
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass23 };
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        int int34 = strComparableComparator27.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator35 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass36 = strComparator35.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator39 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int42 = strComparableComparator39.compare("hi!", "hi!");
        java.lang.String str43 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator39);
        int int46 = strComparableComparator39.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator47 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator39);
        java.lang.Class<?> wildcardClass48 = strComparator47.getClass();
        java.lang.reflect.Type[] typeArray49 = new java.lang.reflect.Type[] { wildcardClass36, wildcardClass48 };
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator52 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int55 = strComparableComparator52.compare("hi!", "hi!");
        java.lang.String str56 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator52);
        int int59 = strComparableComparator52.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator60 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.lang.Class<?> wildcardClass61 = strComparator60.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator64 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int67 = strComparableComparator64.compare("hi!", "hi!");
        java.lang.String str68 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator64);
        int int71 = strComparableComparator64.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator72 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator64);
        java.lang.Class<?> wildcardClass73 = strComparator72.getClass();
        java.lang.reflect.Type[] typeArray74 = new java.lang.reflect.Type[] { wildcardClass61, wildcardClass73 };
        java.lang.reflect.Type[][] typeArray75 = new java.lang.reflect.Type[][] { typeArray24, typeArray49, typeArray74 };
        java.lang.reflect.Type[][][] typeArray76 = new java.lang.reflect.Type[][][] { typeArray75 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor77 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor79 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray76, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strComparableComparator14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(strComparator22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(strComparableComparator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(strComparator47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strComparableComparator52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(strComparator60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(strComparableComparator64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strComparator72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArrayItor77);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator2 = typeItor0.getComparator();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator3 = typeItor0.getComparator();
        boolean boolean4 = typeItor0.hasNext();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor5 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean6 = typeItor5.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator7 = typeItor5.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList8 = typeItor5.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor5);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator10 = typeItor5.getComparator();
        boolean boolean11 = typeItor5.hasNext();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor12 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean13 = typeItor12.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator14 = typeItor12.getComparator();
        boolean boolean15 = typeItor12.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator16 = typeItor12.getComparator();
        boolean boolean17 = typeItor12.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList18 = typeItor12.getIterators();
        boolean boolean19 = typeItor12.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList20 = typeItor12.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList21 = typeItor12.getIterators();
        org.apache.commons.collections4.iterators.CollatingIterator[] collatingIteratorArray23 = new org.apache.commons.collections4.iterators.CollatingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[] typeItorArray24 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]) collatingIteratorArray23;
        typeItorArray24[0] = typeItor0;
        typeItorArray24[1] = typeItor5;
        typeItorArray24[2] = typeItor12;
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor31 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean32 = typeItor31.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator33 = typeItor31.getComparator();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator34 = typeItor31.getComparator();
        boolean boolean35 = typeItor31.hasNext();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor36 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean37 = typeItor36.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator38 = typeItor36.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList39 = typeItor36.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor40 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor36);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator41 = typeItor36.getComparator();
        boolean boolean42 = typeItor36.hasNext();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor43 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean44 = typeItor43.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator45 = typeItor43.getComparator();
        boolean boolean46 = typeItor43.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator47 = typeItor43.getComparator();
        boolean boolean48 = typeItor43.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList49 = typeItor43.getIterators();
        boolean boolean50 = typeItor43.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList51 = typeItor43.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList52 = typeItor43.getIterators();
        org.apache.commons.collections4.iterators.CollatingIterator[] collatingIteratorArray54 = new org.apache.commons.collections4.iterators.CollatingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[] typeItorArray55 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]) collatingIteratorArray54;
        typeItorArray55[0] = typeItor31;
        typeItorArray55[1] = typeItor36;
        typeItorArray55[2] = typeItor43;
        org.apache.commons.collections4.iterators.CollatingIterator[][] collatingIteratorArray63 = new org.apache.commons.collections4.iterators.CollatingIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][] typeItorArray64 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][]) collatingIteratorArray63;
        typeItorArray64[0] = typeItorArray24;
        typeItorArray64[1] = typeItorArray55;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]> typeItorArrayItor70 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray64, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardComparator2);
        org.junit.Assert.assertNull(wildcardComparator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(wildcardItorList8);
        org.junit.Assert.assertNotNull(typeItorItor9);
        org.junit.Assert.assertNull(wildcardComparator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardComparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardItorList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardItorList20);
        org.junit.Assert.assertNotNull(wildcardItorList21);
        org.junit.Assert.assertNotNull(collatingIteratorArray23);
        org.junit.Assert.assertNotNull(typeItorArray24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(wildcardComparator33);
        org.junit.Assert.assertNull(wildcardComparator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardComparator38);
        org.junit.Assert.assertNotNull(wildcardItorList39);
        org.junit.Assert.assertNotNull(typeItorItor40);
        org.junit.Assert.assertNull(wildcardComparator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(wildcardComparator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(wildcardComparator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardItorList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardItorList51);
        org.junit.Assert.assertNotNull(wildcardItorList52);
        org.junit.Assert.assertNotNull(collatingIteratorArray54);
        org.junit.Assert.assertNotNull(typeItorArray55);
        org.junit.Assert.assertNotNull(collatingIteratorArray63);
        org.junit.Assert.assertNotNull(typeItorArray64);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasNext();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1552");
        org.apache.commons.collections4.OrderedIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorCollectionArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorCollectionArrayItor0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
        org.apache.commons.collections4.OrderedIterator<java.lang.Class<?>[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.io.Serializable> serializableComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.io.Serializable>[]) comparatorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) comparatorArray1);
        java.util.Comparator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]> charSequenceArrayItorArrayComparator7 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]>[]) comparatorArray1);
        java.util.Comparator<java.lang.String[][]> strArrayComparator8 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.String[][]>[]) comparatorArray1);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(serializableComparator5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayComparator7);
        org.junit.Assert.assertNotNull(strArrayComparator8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][] charSequenceArrayItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]) zippingIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray2, 0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArrayItorArray2);
        java.lang.Class<?> wildcardClass6 = charSequenceArrayItorArrayItor5.getClass();
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray2);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor4);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator9 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean11 = charSequenceItorReverseComparator9.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray15);
        boolean boolean17 = strItor16.hasPrevious();
        boolean boolean18 = strItor16.hasNext();
        int int19 = strItor16.previousIndex();
        java.lang.String str20 = strItor16.next();
        boolean boolean21 = charSequenceItorReverseComparator9.equals((java.lang.Object) strItor16);
        java.lang.Class<?> wildcardClass22 = strItor16.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.String str32 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass33 = strComparableComparator27.getClass();
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor34 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass35 = charSequenceItorItor34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass7;
        wildcardClassArray38[1] = wildcardClass22;
        wildcardClassArray38[2] = wildcardClass33;
        wildcardClassArray38[3] = wildcardClass35;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38, (int) (byte) 0, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor50 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor51 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor53 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray38, 4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(charSequenceItorItor34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassItor49);
        org.junit.Assert.assertNotNull(wildcardClassItor50);
        org.junit.Assert.assertNotNull(wildcardClassItor51);
        org.junit.Assert.assertNotNull(typeItor53);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator[], java.lang.Class<?>[]> mapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(mapIteratorArrayItor0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1560");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItorReverseComparator0);
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        boolean boolean15 = orderedMapIterator14.hasPrevious();
        boolean boolean16 = orderedMapIterator14.hasPrevious();
        boolean boolean17 = orderedMapIterator14.hasPrevious();
        boolean boolean18 = orderedMapIterator14.hasPrevious();
        boolean boolean19 = charSequenceItorReverseComparator0.equals((java.lang.Object) boolean18);
        java.util.Iterator<?> wildcardItor21 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) (byte) 10);
        boolean boolean22 = charSequenceItorReverseComparator0.equals((java.lang.Object) wildcardItor21);
        org.apache.commons.collections4.iterators.CollatingIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor23 = new org.apache.commons.collections4.iterators.CollatingIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]>();
        boolean boolean24 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparableComparatorArrayItor23);
        java.util.Comparator[] comparatorArray26 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray27 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray26;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator28 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray26);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator29 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray26);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator30 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray26);
        java.util.Comparator<java.util.ArrayList<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorListComparator31 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.ArrayList<java.util.Iterator<? extends java.lang.reflect.Type>>>[]) comparatorArray26);
        java.util.Comparator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayComparator32 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.GenericDeclaration[][]>[]) comparatorArray26);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArrayComparator32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor13);
        org.junit.Assert.assertNotNull(orderedMapIterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(comparatorArray26);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray27);
        org.junit.Assert.assertNotNull(strComparatorComparator28);
        org.junit.Assert.assertNotNull(annotatedElementComparator29);
        org.junit.Assert.assertNotNull(annotatedElementComparator30);
        org.junit.Assert.assertNotNull(wildcardItorListComparator31);
        org.junit.Assert.assertNotNull(genericDeclarationArrayComparator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        boolean boolean16 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor4, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItor9);
        java.util.Iterator[] iteratorArray12 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray13 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray12;
        java.util.Iterator<java.lang.String[]> strArrayItor14 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray12);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor15 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray12);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor16 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItor15);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray18 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray19 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray18;
        charSequenceArrayItorArray19[0] = charSequenceArrayItor4;
        charSequenceArrayItorArray19[1] = charSequenceArrayItor9;
        charSequenceArrayItorArray19[2] = charSequenceArrayItor15;
        java.util.Iterator[] iteratorArray27 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray28 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray27;
        java.util.Iterator<java.lang.String[]> strArrayItor29 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray27);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor30 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray27);
        java.util.Iterator[] iteratorArray32 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray33 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray32;
        java.util.Iterator<java.lang.String[]> strArrayItor34 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray32);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor35 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray32);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor36 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItor35);
        java.util.Iterator[] iteratorArray38 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray39 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray38;
        java.util.Iterator<java.lang.String[]> strArrayItor40 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray38);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor41 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray38);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor42 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItor41);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray44 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray45 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray44;
        charSequenceArrayItorArray45[0] = charSequenceArrayItor30;
        charSequenceArrayItorArray45[1] = charSequenceArrayItor35;
        charSequenceArrayItorArray45[2] = charSequenceArrayItor41;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray53 = new org.apache.commons.collections4.iterators.ZippingIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][] charSequenceArrayItorArray54 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]) zippingIteratorArray53;
        charSequenceArrayItorArray54[0] = charSequenceArrayItorArray19;
        charSequenceArrayItorArray54[1] = charSequenceArrayItorArray45;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor60 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArrayItorArray54, (int) (byte) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Cloneable> cloneableItor61 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Cloneable[]) charSequenceArrayItorArray54);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor62 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[][]) charSequenceArrayItorArray54);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor63 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItorArray54);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor64 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[][]) charSequenceArrayItorArray54);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor10);
        org.junit.Assert.assertNotNull(iteratorArray12);
        org.junit.Assert.assertNotNull(wildcardItorArray13);
        org.junit.Assert.assertNotNull(strArrayItor14);
        org.junit.Assert.assertNotNull(charSequenceArrayItor15);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor16);
        org.junit.Assert.assertNotNull(zippingIteratorArray18);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray19);
        org.junit.Assert.assertNotNull(iteratorArray27);
        org.junit.Assert.assertNotNull(wildcardItorArray28);
        org.junit.Assert.assertNotNull(strArrayItor29);
        org.junit.Assert.assertNotNull(charSequenceArrayItor30);
        org.junit.Assert.assertNotNull(iteratorArray32);
        org.junit.Assert.assertNotNull(wildcardItorArray33);
        org.junit.Assert.assertNotNull(strArrayItor34);
        org.junit.Assert.assertNotNull(charSequenceArrayItor35);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor36);
        org.junit.Assert.assertNotNull(iteratorArray38);
        org.junit.Assert.assertNotNull(wildcardItorArray39);
        org.junit.Assert.assertNotNull(strArrayItor40);
        org.junit.Assert.assertNotNull(charSequenceArrayItor41);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor42);
        org.junit.Assert.assertNotNull(zippingIteratorArray44);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray45);
        org.junit.Assert.assertNotNull(zippingIteratorArray53);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray54);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor60);
        org.junit.Assert.assertNotNull(cloneableItor61);
        org.junit.Assert.assertNotNull(iteratorArrayItor62);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor63);
        org.junit.Assert.assertNotNull(iteratorArrayItor64);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray7 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray8 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray7;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray8, 0);
        boolean boolean11 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparableComparatorItor10);
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(iteratorItor12);
        boolean boolean14 = iteratorItor12.hasPrevious();
        boolean boolean15 = charSequenceItorReverseComparator0.equals((java.lang.Object) iteratorItor12);
        boolean boolean16 = iteratorItor12.hasPrevious();
        boolean boolean17 = iteratorItor12.hasPrevious();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertNotNull(comparableComparatorArray7);
        org.junit.Assert.assertNotNull(strComparableComparatorArray8);
        org.junit.Assert.assertNotNull(strComparableComparatorItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iteratorItor12);
        org.junit.Assert.assertNotNull(iteratorItorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasNext();
        boolean boolean8 = strItor0.hasNext();
        java.util.Iterator<?> wildcardItor9 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) boolean8);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardItor9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.next();
        java.lang.String str15 = strItor7.previous();
        // The following exception was thrown during execution in test generation
        try {
            strItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(mapIteratorItor0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][]> iteratorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(iteratorItorArrayItor0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
        java.util.ArrayList<java.util.Iterator<? extends java.lang.reflect.Type>>[] wildcardItorListArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ArrayList<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorListItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorListArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor6.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1571");
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableItor1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1572");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasNext();
        boolean boolean8 = strItor0.hasNext();
        boolean boolean9 = strItor0.hasPrevious();
        int int10 = strItor0.nextIndex();
        int int11 = strItor0.nextIndex();
        boolean boolean12 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1573");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.next();
        java.lang.String str15 = strItor7.previous();
        java.lang.String str16 = strItor7.next();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strItor7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1574");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("");
        boolean boolean2 = strItor1.hasPrevious();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1575");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.lang.String str16 = strItor4.previous();
        boolean boolean17 = strItor4.hasPrevious();
        strItor4.set("hi!");
        java.lang.String str20 = strItor4.previous();
        boolean boolean21 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1576");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        int int14 = strComparableComparator10.compare("hi!", "hi!");
        int int17 = strComparableComparator10.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator18 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator10);
        java.util.ListIterator<java.io.Serializable> serializableItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.io.Serializable) strComparableComparator10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor19, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(serializableItor19);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1577");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[][][]> mapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) mapIteratorArrayItor0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArrayItor0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1578");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        boolean boolean14 = strItor4.hasPrevious();
        int int15 = strItor4.nextIndex();
        boolean boolean16 = strItor4.hasPrevious();
        int int17 = strItor4.nextIndex();
        java.util.ListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strItorItor18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1579");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1580");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasNext();
        boolean boolean6 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int8 = strItor7.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor7.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1581");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator15 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator7);
        boolean boolean16 = strComparableComparator4.equals((java.lang.Object) strComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int23 = strComparableComparator20.compare("hi!", "hi!");
        java.lang.String str24 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator20);
        int int27 = strComparableComparator20.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator28 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator29 = strComparableComparator20.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator28);
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator28);
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.min("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor32 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator28);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1582");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator9 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator11 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean12 = strComparableComparator10.equals((java.lang.Object) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = strComparator9.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator14 = strComparator13.reversed();
        java.util.Comparator<java.lang.String> strComparator15 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator13);
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.max("", "", strComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparator15.reversed();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator22 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int25 = strComparableComparator22.compare("hi!", "hi!");
        java.lang.String str26 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator22);
        int int29 = strComparableComparator22.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator30 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator31 = strComparableComparator22.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator30);
        java.lang.String str32 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator30);
        int int35 = strComparableComparator30.compare("", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator38 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int41 = strComparableComparator38.compare("hi!", "hi!");
        java.lang.String str42 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator38);
        int int45 = strComparableComparator38.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator46 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator47 = strComparableComparator38.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator46);
        int int50 = strComparableComparator46.compare("hi!", "hi!");
        java.util.Comparator<java.lang.String> strComparator51 = strComparableComparator30.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator46);
        java.util.Comparator<java.lang.String> strComparator52 = strComparator17.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator30);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor57 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray56);
        boolean boolean58 = strItor57.hasPrevious();
        boolean boolean59 = strItor57.hasNext();
        int int60 = strItor57.previousIndex();
        java.lang.String str61 = strItor57.next();
        java.lang.String str62 = strItor57.previous();
        int int63 = strItor57.previousIndex();
        java.lang.String str64 = strItor57.next();
        boolean boolean65 = strItor57.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor66 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor57);
        strItor57.set("");
        java.lang.String str69 = strItor57.previous();
        java.util.ListIterator<java.lang.String> strItor70 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor57);
        int int71 = strItor70.previousIndex();
        boolean boolean72 = strComparableComparator30.equals((java.lang.Object) strItor70);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor75 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator30, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertNotNull(strComparableComparator22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-3) + "'", int35 == (-3));
        org.junit.Assert.assertNotNull(strComparableComparator38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator46);
        org.junit.Assert.assertNotNull(strComparator47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(strComparator51);
        org.junit.Assert.assertNotNull(strComparator52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strItor66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strItor70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1583");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        java.lang.String str9 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1584");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int17 = strItor16.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1585");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray1 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray2 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray3 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray4 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][] typeArray5 = new java.lang.reflect.Type[][][] {};
        java.lang.reflect.Type[][][][] typeArray6 = new java.lang.reflect.Type[][][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        java.lang.reflect.Type[][][][][] typeArray7 = new java.lang.reflect.Type[][][][][] { typeArray6 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][][][]> typeArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray7);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][][][][]> typeArrayItor9 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeArray7);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArrayItor8);
        org.junit.Assert.assertNotNull(typeArrayItor9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1586");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.previous();
        int int15 = strItor7.nextIndex();
        java.util.ListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor7);
        boolean boolean17 = strItor7.hasPrevious();
        java.lang.String str18 = strItor7.next();
        // The following exception was thrown during execution in test generation
        try {
            strItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1587");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasNext();
        boolean boolean8 = strItor0.hasNext();
        boolean boolean9 = strItor0.hasPrevious();
        boolean boolean10 = strItor0.hasPrevious();
        boolean boolean11 = strItor0.hasPrevious();
        boolean boolean12 = strItor0.hasPrevious();
        boolean boolean13 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1588");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        int int24 = strComparableComparator2.compare("", "");
        java.util.Comparator<java.lang.String> strComparator25 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator26 = null;
        java.util.Comparator<java.lang.String> strComparator27 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator26);
        java.util.Comparator<java.lang.String> strComparator29 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator28);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator34 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator37 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int40 = strComparableComparator37.compare("hi!", "hi!");
        java.lang.String str41 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator37);
        int int44 = strComparableComparator37.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator45 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator37);
        boolean boolean46 = strComparableComparator34.equals((java.lang.Object) strComparator45);
        java.lang.String str47 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator34);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator50 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int53 = strComparableComparator50.compare("hi!", "hi!");
        java.lang.String str54 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator50);
        int int57 = strComparableComparator50.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator58 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator59 = strComparableComparator50.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator58);
        java.util.Comparator<java.lang.String> strComparator60 = strComparableComparator34.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator58);
        java.util.Comparator comparator61 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator62 = strComparableComparator58.thenComparing((java.util.Comparator<java.lang.String>) comparator61);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor63 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparator58);
        int int66 = strComparableComparator58.compare("hi!", "");
        java.lang.String str67 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator58);
        java.util.Comparator<java.lang.String> strComparator68 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator58);
        java.util.Comparator<java.lang.String> strComparator69 = strComparator28.thenComparing(strComparator68);
        boolean boolean70 = strComparableComparator2.equals((java.lang.Object) strComparator68);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparableComparator34);
        org.junit.Assert.assertNotNull(strComparableComparator37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(strComparator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strComparableComparator50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator58);
        org.junit.Assert.assertNotNull(strComparator59);
        org.junit.Assert.assertNotNull(strComparator60);
        org.junit.Assert.assertNotNull(comparator61);
        org.junit.Assert.assertNotNull(strComparator62);
        org.junit.Assert.assertNotNull(strComparableComparatorItor63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(strComparator68);
        org.junit.Assert.assertNotNull(strComparator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1589");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        boolean boolean2 = iteratorItor0.hasPrevious();
        boolean boolean3 = iteratorItor0.hasPrevious();
        boolean boolean4 = iteratorItor0.hasPrevious();
        boolean boolean5 = iteratorItor0.hasPrevious();
        boolean boolean6 = iteratorItor0.hasPrevious();
        boolean boolean7 = iteratorItor0.hasPrevious();
        boolean boolean8 = iteratorItor0.hasPrevious();
        boolean boolean9 = iteratorItor0.hasPrevious();
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1590");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor0.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]> charSequenceArrayItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1591");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        // The following exception was thrown during execution in test generation
        try {
            strItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1592");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        int int6 = strItor0.previousIndex();
        boolean boolean7 = strItor0.hasPrevious();
        boolean boolean8 = strItor0.hasNext();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1593");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1594");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.lang.String str16 = strItor4.previous();
        boolean boolean17 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1595");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        int int5 = strItor0.previousIndex();
        int int6 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean8 = strItor7.hasNext();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1596");
        org.apache.commons.collections4.OrderedMapIterator[][][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][][] iteratorItorArray2 = (org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][][]) orderedMapIteratorArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][]> iteratorItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorItorArray2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertNotNull(iteratorItorArray2);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1597");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        boolean boolean4 = listIterator0.hasNext();
        boolean boolean5 = listIterator0.hasPrevious();
        int int6 = listIterator0.previousIndex();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray10);
        boolean boolean12 = strItor11.hasPrevious();
        boolean boolean13 = strItor11.hasNext();
        int int14 = strItor11.previousIndex();
        boolean boolean15 = strItor11.hasNext();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean17 = strItor16.hasNext();
        int int18 = strItor16.nextIndex();
        java.util.ListIterator<java.lang.String> strItor19 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor16);
        boolean boolean20 = strItor16.hasPrevious();
        java.util.ListIterator[] listIteratorArray22 = new java.util.ListIterator[3];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray23 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray22;
        strItorArray23[0] = listIterator0;
        strItorArray23[1] = strItor11;
        strItorArray23[2] = strItor16;
        java.util.ListIterator[][] listIteratorArray31 = new java.util.ListIterator[1][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray32 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray31;
        strItorArray32[0] = strItorArray23;
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[]> strItorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray32, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][]) strItorArray32, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>[]> strItorArrayItor41 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray32, 2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIteratorArray22);
        org.junit.Assert.assertNotNull(strItorArray23);
        org.junit.Assert.assertNotNull(listIteratorArray31);
        org.junit.Assert.assertNotNull(strItorArray32);
        org.junit.Assert.assertNotNull(strItorArrayItor36);
        org.junit.Assert.assertNotNull(iteratorArrayItor38);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1598");
        org.apache.commons.collections4.iterators.CollatingIterator[][] collatingIteratorArray1 = new org.apache.commons.collections4.iterators.CollatingIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][] typeItorArray2 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][]) collatingIteratorArray1;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]> typeItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]> typeItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeItorArray2, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collatingIteratorArray1);
        org.junit.Assert.assertNotNull(typeItorArray2);
        org.junit.Assert.assertNotNull(typeItorArrayItor3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1599");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int16 = strComparableComparator12.compare("hi!", "hi!");
        int int19 = strComparableComparator12.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator20 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator22 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean24 = charSequenceItorReverseComparator22.equals((java.lang.Object) 100.0f);
        boolean boolean25 = strComparableComparator12.equals((java.lang.Object) charSequenceItorReverseComparator22);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor26 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean27 = strItor26.hasNext();
        int int28 = strItor26.nextIndex();
        java.util.Iterator<?> wildcardItor29 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor26);
        boolean boolean30 = charSequenceItorReverseComparator22.equals((java.lang.Object) strItor26);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray34);
        boolean boolean36 = strItor35.hasPrevious();
        boolean boolean37 = strItor35.hasNext();
        int int38 = strItor35.previousIndex();
        java.lang.String str39 = strItor35.next();
        java.lang.String str40 = strItor35.previous();
        int int41 = strItor35.previousIndex();
        java.util.ListIterator<java.lang.String> strItor42 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor35);
        boolean boolean43 = strItor35.hasPrevious();
        int int44 = strItor35.nextIndex();
        java.lang.String str45 = strItor35.next();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strItor35);
        strItor35.set("hi!");
        boolean boolean49 = charSequenceItorReverseComparator22.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strItorItor46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1600");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        boolean boolean5 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator6 = typeItor0.getComparator();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = typeItor0.getIteratorIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value has been returned yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1601");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        boolean boolean5 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator6 = typeItor0.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList7 = typeItor0.getIterators();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
        org.junit.Assert.assertNotNull(wildcardItorList7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1602");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        int int11 = strItor4.previousIndex();
        int int12 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1603");
        org.apache.commons.collections4.OrderedIterator<java.lang.Iterable[][]> iterableArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iterableArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterableArrayItor0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1604");
        java.util.RandomAccess[][][] randomAccessArray0 = new java.util.RandomAccess[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.RandomAccess[][]> randomAccessArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(randomAccessArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(randomAccessArray0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1605");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        int int5 = strItor0.previousIndex();
        int int6 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1606");
        java.util.Comparator comparator2 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str3 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) comparator2);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) comparator2);
        java.util.Comparator<java.lang.String> strComparator5 = comparator2.reversed();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator11 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int14 = strComparableComparator11.compare("hi!", "hi!");
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator11);
        int int18 = strComparableComparator11.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator19 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator11);
        boolean boolean20 = strComparableComparator8.equals((java.lang.Object) strComparator19);
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator8);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor26 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray25);
        boolean boolean27 = strComparableComparator8.equals((java.lang.Object) strArray25);
        java.util.Comparator<java.lang.String> strComparator28 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator8);
        java.util.Comparator<java.lang.String> strComparator29 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator8);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator32 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int35 = strComparableComparator32.compare("hi!", "hi!");
        java.lang.String str36 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator32);
        java.util.Comparator<java.lang.String> strComparator37 = strComparableComparator32.reversed();
        java.util.Comparator<java.lang.String> strComparator38 = strComparator29.thenComparing(strComparator37);
        java.util.Comparator<java.lang.String> strComparator39 = strComparator5.thenComparing(strComparator38);
        org.junit.Assert.assertNotNull(comparator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertNotNull(strComparableComparator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparableComparator32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(strComparator39);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1607");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int7 = strItor6.previousIndex();
        boolean boolean8 = strItor6.hasNext();
        java.lang.Class<?> wildcardClass9 = strItor6.getClass();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1608");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1609");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(mapIteratorArrayItor0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1610");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator5 = typeItor0.getComparator();
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertNull(wildcardComparator5);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1611");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator, java.util.Iterator> mapIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(mapIteratorItor0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1612");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        boolean boolean16 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.lang.Class<?> wildcardClass18 = strItor17.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1613");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int12 = strItor11.nextIndex();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor11);
        int int14 = strItor13.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strItor13.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1614");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.lang.String str16 = strItor4.previous();
        int int17 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1615");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        java.util.ListIterator[] listIteratorArray10 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray11 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray10;
        strItorArray11[0] = strItor4;
        java.util.ListIterator[][] listIteratorArray15 = new java.util.ListIterator[1][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray16 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray15;
        strItorArray16[0] = strItorArray11;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray22);
        boolean boolean24 = strItor23.hasPrevious();
        boolean boolean25 = strItor23.hasPrevious();
        int int26 = strItor23.previousIndex();
        boolean boolean27 = strItor23.hasNext();
        java.util.ListIterator[] listIteratorArray29 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray30 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray29;
        strItorArray30[0] = strItor23;
        java.util.ListIterator[][] listIteratorArray34 = new java.util.ListIterator[1][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray35 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray34;
        strItorArray35[0] = strItorArray30;
        java.util.ListIterator[][][] listIteratorArray39 = new java.util.ListIterator[2][][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][][] strItorArray40 = (java.util.ListIterator<java.lang.String>[][][]) listIteratorArray39;
        strItorArray40[0] = strItorArray16;
        strItorArray40[1] = strItorArray35;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[][]> strItorArrayItor46 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray40, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(listIteratorArray10);
        org.junit.Assert.assertNotNull(strItorArray11);
        org.junit.Assert.assertNotNull(listIteratorArray15);
        org.junit.Assert.assertNotNull(strItorArray16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(listIteratorArray29);
        org.junit.Assert.assertNotNull(strItorArray30);
        org.junit.Assert.assertNotNull(listIteratorArray34);
        org.junit.Assert.assertNotNull(strItorArray35);
        org.junit.Assert.assertNotNull(listIteratorArray39);
        org.junit.Assert.assertNotNull(strItorArray40);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1616");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        java.lang.String str6 = strItor4.next();
        int int7 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1617");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Class<?>[], java.util.RandomAccess[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1618");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.nextIndex();
        boolean boolean8 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1619");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: must call next() or previous() before a call to set()");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1620");
        org.apache.commons.collections4.OrderedIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1621");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        java.lang.String str9 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1622");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        java.lang.String str10 = strItor4.previous();
        strItor4.set("");
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean14 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Comparator<java.lang.String>> strComparatorItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1623");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1624");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        java.util.Comparator<java.lang.String> strComparator22 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator23 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int29 = strComparableComparator26.compare("hi!", "hi!");
        java.lang.String str30 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator31 = strComparableComparator26.reversed();
        java.util.Comparator<java.lang.String> strComparator32 = strComparator23.thenComparing(strComparator31);
        java.util.Comparator<java.lang.String> strComparator33 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator32);
        java.util.Comparator<java.lang.String> strComparator34 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator32);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strComparator22);
        org.junit.Assert.assertNotNull(strComparator23);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(strComparator33);
        org.junit.Assert.assertNotNull(strComparator34);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1625");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator2 = typeItor0.getComparator();
        boolean boolean3 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        boolean boolean5 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList6 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor7 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList6);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor8 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardComparator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardItorList6);
        org.junit.Assert.assertNotNull(wildcardItorItor7);
        org.junit.Assert.assertNotNull(wildcardItorItor8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1626");
        java.util.RandomAccess[] randomAccessArray0 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray1 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray2 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray3 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray4 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray5 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[][] randomAccessArray6 = new java.util.RandomAccess[][] { randomAccessArray0, randomAccessArray1, randomAccessArray2, randomAccessArray3, randomAccessArray4, randomAccessArray5 };
        org.apache.commons.collections4.ResettableIterator<java.util.RandomAccess[]> randomAccessArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(randomAccessArray6);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Cloneable> cloneableItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Cloneable[]) randomAccessArray6);
        org.apache.commons.collections4.ResettableIterator<java.util.RandomAccess[][]> randomAccessArrayItor9 = org.apache.commons.collections4.IteratorUtils.singletonIterator(randomAccessArray6);
        java.util.ListIterator<java.util.RandomAccess[][]> randomAccessArrayItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(randomAccessArray6);
        org.junit.Assert.assertNotNull(randomAccessArray0);
        org.junit.Assert.assertNotNull(randomAccessArray1);
        org.junit.Assert.assertNotNull(randomAccessArray2);
        org.junit.Assert.assertNotNull(randomAccessArray3);
        org.junit.Assert.assertNotNull(randomAccessArray4);
        org.junit.Assert.assertNotNull(randomAccessArray5);
        org.junit.Assert.assertNotNull(randomAccessArray6);
        org.junit.Assert.assertNotNull(randomAccessArrayItor7);
        org.junit.Assert.assertNotNull(cloneableItor8);
        org.junit.Assert.assertNotNull(randomAccessArrayItor9);
        org.junit.Assert.assertNotNull(randomAccessArrayItor10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1627");
        org.apache.commons.collections4.ResettableIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorListItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardItorListItor0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1628");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasNext();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray6;
        strItorArray7[0] = strItor0;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray7);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.ListIterator<java.lang.String>[]) strItorArray7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray7);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(strItorArray7);
        org.junit.Assert.assertNotNull(strItorItor10);
        org.junit.Assert.assertNotNull(strItorItor11);
        org.junit.Assert.assertNotNull(strItorItor12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1629");
        java.util.Comparator<java.lang.String> strComparator0 = null;
        java.util.Comparator<java.lang.String> strComparator1 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator2 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator1);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.util.Comparator<java.lang.String> strComparator7 = strComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator3);
        java.util.Comparator<java.lang.String> strComparator8 = strComparator2.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparator8);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1630");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1631");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str14 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.util.Comparator<java.lang.String> strComparator15 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor17 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableComparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1632");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("hi!");
        boolean boolean2 = strItor1.hasPrevious();
        int int3 = strItor1.nextIndex();
        int int4 = strItor1.nextIndex();
        int int5 = strItor1.nextIndex();
        boolean boolean6 = strItor1.hasNext();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1633");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Class<?>[], org.apache.commons.collections4.MapIterator[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1634");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        java.lang.String str9 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("hi!");
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(strItorItor13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1635");
        org.apache.commons.collections4.MapIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[][], java.lang.reflect.Type[][]> mapIteratorComparatorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(mapIteratorComparatorArrayItor0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1636");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        boolean boolean12 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("");
        java.lang.String str16 = strItor4.previous();
        java.lang.String str17 = strItor4.next();
        boolean boolean18 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1637");
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[][]> strItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strItorArrayItor0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1638");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1639");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasNext();
        boolean boolean6 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean8 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1640");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1641");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray8, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor13);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1642");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() not supported for empty Iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1643");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.String[]> strArrayComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.String[]>[]) comparatorArray1);
        java.util.Comparator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<org.apache.commons.collections4.MapIterator[][]>[]) comparatorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Cloneable> cloneableItor6 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Cloneable) comparatorArray1);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(strArrayComparator4);
        org.junit.Assert.assertNotNull(mapIteratorArrayComparator5);
        org.junit.Assert.assertNotNull(cloneableItor6);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1644");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        int int4 = strItor3.nextIndex();
        boolean boolean5 = strItor3.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor3.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1645");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator10 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.Class<?> wildcardClass11 = strComparator10.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator14 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int17 = strComparableComparator14.compare("hi!", "hi!");
        java.lang.String str18 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator14);
        int int21 = strComparableComparator14.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator22 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator14);
        java.lang.Class<?> wildcardClass23 = strComparator22.getClass();
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass23 };
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        int int34 = strComparableComparator27.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator35 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass36 = strComparator35.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator39 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int42 = strComparableComparator39.compare("hi!", "hi!");
        java.lang.String str43 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator39);
        int int46 = strComparableComparator39.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator47 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator39);
        java.lang.Class<?> wildcardClass48 = strComparator47.getClass();
        java.lang.reflect.Type[] typeArray49 = new java.lang.reflect.Type[] { wildcardClass36, wildcardClass48 };
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator52 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int55 = strComparableComparator52.compare("hi!", "hi!");
        java.lang.String str56 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator52);
        int int59 = strComparableComparator52.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator60 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.lang.Class<?> wildcardClass61 = strComparator60.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator64 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int67 = strComparableComparator64.compare("hi!", "hi!");
        java.lang.String str68 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator64);
        int int71 = strComparableComparator64.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator72 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator64);
        java.lang.Class<?> wildcardClass73 = strComparator72.getClass();
        java.lang.reflect.Type[] typeArray74 = new java.lang.reflect.Type[] { wildcardClass61, wildcardClass73 };
        java.lang.reflect.Type[][] typeArray75 = new java.lang.reflect.Type[][] { typeArray24, typeArray49, typeArray74 };
        java.lang.reflect.Type[][][] typeArray76 = new java.lang.reflect.Type[][][] { typeArray75 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor77 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray76);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][][]> typeArrayItor78 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeArray76);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strComparableComparator14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(strComparator22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(strComparableComparator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(strComparator47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strComparableComparator52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(strComparator60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(strComparableComparator64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(strComparator72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArrayItor77);
        org.junit.Assert.assertNotNull(typeArrayItor78);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1646");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.AnnotatedElement, org.apache.commons.collections4.MapIterator[][][]> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1647");
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][] charSequenceArrayItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]) zippingIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray2, 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceArrayItorArray2, 0, (int) (byte) 0);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]> charSequenceArrayItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItorArray2);
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray2);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor4);
        org.junit.Assert.assertNotNull(strArrayItor7);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1648");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator6 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int9 = strComparableComparator6.compare("hi!", "hi!");
        java.lang.String str10 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator6);
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator6);
        java.util.Comparator<java.lang.String> strComparator12 = strComparableComparator6.reversed();
        int int15 = strComparableComparator6.compare("", "");
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1649");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.GenericDeclaration[][]>[]) comparatorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) comparatorArray1, 0);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(genericDeclarationArrayComparator5);
        org.junit.Assert.assertNotNull(charSequenceItor7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1650");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1651");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        boolean boolean9 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1652");
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[][]> strComparableComparatorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1653");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int18 = strComparableComparator15.compare("hi!", "hi!");
        java.lang.String str19 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        int int22 = strComparableComparator15.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator24 = strComparableComparator15.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator12.thenComparing(strComparator24);
        java.util.Comparator<java.lang.String> strComparator26 = strComparableComparator10.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.Class<?> wildcardClass27 = strComparator26.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        java.lang.Class[][] classArray34 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray35 = (java.lang.Class<?>[][]) classArray34;
        wildcardClassArray35[0] = wildcardClassArray30;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray35);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor41 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[][]) wildcardClassArray35, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor38);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor39);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1654");
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray0 = new org.apache.commons.collections4.MapIterator[][][][] {};
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[][][]> mapIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray0);
        org.junit.Assert.assertNotNull(mapIteratorArray0);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor1);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1655");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        boolean boolean2 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList4 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor5 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardItorList4);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor7 = org.apache.commons.collections4.IteratorUtils.loopingIterator((java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>) wildcardItorList4);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor8 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Iterable[]> iterableArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList4);
        org.junit.Assert.assertNotNull(wildcardItorItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(wildcardItorItor8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1656");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        int int10 = strItor4.previousIndex();
        boolean boolean11 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor12 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.lang.String str13 = strItor12.next();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1657");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.lang.Class<?>> wildcardClassComparator6 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.Class<?>>[]) comparatorArray1);
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) comparatorArray1);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(annotatedElementComparator5);
        org.junit.Assert.assertNotNull(wildcardClassComparator6);
        org.junit.Assert.assertNotNull(wildcardItor7);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1658");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator7 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean10 = strComparableComparator8.equals((java.lang.Object) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator12 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator7);
        java.util.Comparator<java.lang.String> strComparator13 = strComparator7.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator13, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1659");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        boolean boolean12 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("");
        boolean boolean16 = strItor4.hasPrevious();
        boolean boolean17 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1660");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean9 = strItor8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.RandomAccess[][]> randomAccessArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItor8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1661");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[], org.apache.commons.collections4.ResettableListIterator<java.lang.String>> typeItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItorArrayItor0);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1662");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator6 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int9 = strComparableComparator6.compare("hi!", "hi!");
        java.lang.String str10 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator6);
        int int13 = strComparableComparator6.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator14 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator6);
        boolean boolean15 = strComparableComparator3.equals((java.lang.Object) strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator29 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator21);
        boolean boolean30 = strComparableComparator18.equals((java.lang.Object) strComparator29);
        java.util.Comparator<java.lang.String> strComparator31 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator18);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray33 = new org.apache.commons.collections4.comparators.ComparableComparator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray34 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray33;
        strComparableComparatorArray34[0] = strComparableComparator0;
        strComparableComparatorArray34[1] = strComparableComparator3;
        strComparableComparatorArray34[2] = strComparableComparator18;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor41 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray34);
        org.apache.commons.collections4.ResettableIterator<java.util.Comparator<java.lang.String>> strComparatorItor42 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Comparator<java.lang.String>[]) strComparableComparatorArray34);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor43 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray34);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor44 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparatorArray34);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor45 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strComparableComparatorArray34);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertNotNull(strComparableComparator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(comparableComparatorArray33);
        org.junit.Assert.assertNotNull(strComparableComparatorArray34);
        org.junit.Assert.assertNotNull(strComparableComparatorItor41);
        org.junit.Assert.assertNotNull(strComparatorItor42);
        org.junit.Assert.assertNotNull(strComparableComparatorItor43);
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor44);
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor45);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1663");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.String>>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strItorItor4);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1664");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor9);
        // The following exception was thrown during execution in test generation
        try {
            strItor10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1665");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]> typeItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1666");
        java.util.Comparator[][] comparatorArray1 = new java.util.Comparator[0][];
        @SuppressWarnings("unchecked")
        java.util.Comparator<org.apache.commons.collections4.MapIterator>[][] mapIteratorComparatorArray2 = (java.util.Comparator<org.apache.commons.collections4.MapIterator>[][]) comparatorArray1;
        org.apache.commons.collections4.ResettableListIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorComparatorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorComparatorArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArray2);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArrayItor3);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1667");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        int int24 = strComparableComparator2.compare("", "");
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator2.reversed();
        java.util.Comparator<java.lang.String> strComparator26 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator26, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator26);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1668");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        boolean boolean6 = strItor5.hasNext();
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1669");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        java.lang.String str9 = strItor4.next();
        boolean boolean10 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1670");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.util.Iterator[]> iteratorArrayComparator6 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Iterator[]>[]) comparatorArray1);
        java.util.Comparator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayComparator7 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]>[]) comparatorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[]> strArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) comparatorArray1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(annotatedElementComparator5);
        org.junit.Assert.assertNotNull(iteratorArrayComparator6);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayComparator7);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1671");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasPrevious();
        boolean boolean9 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1672");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor8);
        java.lang.Class<?> wildcardClass10 = strItor8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1673");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray12 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11;
        java.util.Iterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray11);
        java.util.Iterator[] iteratorArray16 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray17 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray16;
        java.util.Iterator<java.lang.String[]> strArrayItor18 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray16);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor19 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray16);
        java.util.Iterator[] iteratorArray21 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray22 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray21;
        java.util.Iterator<java.lang.String[]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray21);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor24 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray21);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray26 = new org.apache.commons.collections4.iterators.ZippingIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray27 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray26;
        charSequenceArrayItorArray27[0] = charSequenceArrayItor4;
        charSequenceArrayItorArray27[1] = charSequenceArrayItor9;
        charSequenceArrayItorArray27[2] = charSequenceArrayItor14;
        charSequenceArrayItorArray27[3] = charSequenceArrayItor19;
        charSequenceArrayItorArray27[4] = charSequenceArrayItor24;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray27);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItorArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor42 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray27, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(wildcardItorArray12);
        org.junit.Assert.assertNotNull(strArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(iteratorArray16);
        org.junit.Assert.assertNotNull(wildcardItorArray17);
        org.junit.Assert.assertNotNull(strArrayItor18);
        org.junit.Assert.assertNotNull(charSequenceArrayItor19);
        org.junit.Assert.assertNotNull(iteratorArray21);
        org.junit.Assert.assertNotNull(wildcardItorArray22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(charSequenceArrayItor24);
        org.junit.Assert.assertNotNull(zippingIteratorArray26);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray27);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor38);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor39);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1674");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>> strItorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray3, 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strItorItor7);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1675");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray12 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11;
        java.util.Iterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray11);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor15 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItor14);
        java.util.Iterator[] iteratorArray17 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray18 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray17;
        java.util.Iterator<java.lang.String[]> strArrayItor19 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray17);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor20 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray17);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItor20);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray23 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray24 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray23;
        charSequenceArrayItorArray24[0] = charSequenceArrayItor9;
        charSequenceArrayItorArray24[1] = charSequenceArrayItor14;
        charSequenceArrayItorArray24[2] = charSequenceArrayItor20;
        java.util.Iterator[] iteratorArray32 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray33 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray32;
        java.util.Iterator<java.lang.String[]> strArrayItor34 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray32);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor35 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray32);
        java.util.Iterator[] iteratorArray37 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray38 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray37;
        java.util.Iterator<java.lang.String[]> strArrayItor39 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray37);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor40 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray37);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor41 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItor40);
        java.util.Iterator[] iteratorArray43 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray44 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray43;
        java.util.Iterator<java.lang.String[]> strArrayItor45 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray43);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor46 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray43);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor47 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItor46);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray49 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray50 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray49;
        charSequenceArrayItorArray50[0] = charSequenceArrayItor35;
        charSequenceArrayItorArray50[1] = charSequenceArrayItor40;
        charSequenceArrayItorArray50[2] = charSequenceArrayItor46;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray58 = new org.apache.commons.collections4.iterators.ZippingIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][] charSequenceArrayItorArray59 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]) zippingIteratorArray58;
        charSequenceArrayItorArray59[0] = charSequenceArrayItorArray24;
        charSequenceArrayItorArray59[1] = charSequenceArrayItorArray50;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor65 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArrayItorArray59, (int) (byte) 1);
        boolean boolean66 = charSequenceItorReverseComparator0.equals((java.lang.Object) (byte) 1);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator67 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean69 = charSequenceItorReverseComparator67.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator74 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int77 = strComparableComparator74.compare("hi!", "hi!");
        java.lang.String str78 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator74);
        int int81 = strComparableComparator74.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator82 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator83 = strComparableComparator74.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator82);
        java.lang.String str84 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator82);
        boolean boolean85 = charSequenceItorReverseComparator67.equals((java.lang.Object) "");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor86 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean87 = typeItor86.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator88 = typeItor86.getComparator();
        boolean boolean89 = typeItor86.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator90 = typeItor86.getComparator();
        boolean boolean91 = charSequenceItorReverseComparator67.equals((java.lang.Object) wildcardComparator90);
        boolean boolean92 = charSequenceItorReverseComparator0.equals((java.lang.Object) charSequenceItorReverseComparator67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(wildcardItorArray12);
        org.junit.Assert.assertNotNull(strArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor15);
        org.junit.Assert.assertNotNull(iteratorArray17);
        org.junit.Assert.assertNotNull(wildcardItorArray18);
        org.junit.Assert.assertNotNull(strArrayItor19);
        org.junit.Assert.assertNotNull(charSequenceArrayItor20);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor21);
        org.junit.Assert.assertNotNull(zippingIteratorArray23);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray24);
        org.junit.Assert.assertNotNull(iteratorArray32);
        org.junit.Assert.assertNotNull(wildcardItorArray33);
        org.junit.Assert.assertNotNull(strArrayItor34);
        org.junit.Assert.assertNotNull(charSequenceArrayItor35);
        org.junit.Assert.assertNotNull(iteratorArray37);
        org.junit.Assert.assertNotNull(wildcardItorArray38);
        org.junit.Assert.assertNotNull(strArrayItor39);
        org.junit.Assert.assertNotNull(charSequenceArrayItor40);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor41);
        org.junit.Assert.assertNotNull(iteratorArray43);
        org.junit.Assert.assertNotNull(wildcardItorArray44);
        org.junit.Assert.assertNotNull(strArrayItor45);
        org.junit.Assert.assertNotNull(charSequenceArrayItor46);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor47);
        org.junit.Assert.assertNotNull(zippingIteratorArray49);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray50);
        org.junit.Assert.assertNotNull(zippingIteratorArray58);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray59);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strComparableComparator74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 3 + "'", int81 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator82);
        org.junit.Assert.assertNotNull(strComparator83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(wildcardComparator88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(wildcardComparator90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1676");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.RandomAccess[]> randomAccessArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1677");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        boolean boolean10 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.util.ListIterator<java.lang.String> strItor12 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor11);
        int int13 = strItor11.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1678");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int11 = strItor10.previousIndex();
        java.lang.String str12 = strItor10.next();
        // The following exception was thrown during execution in test generation
        try {
            strItor10.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1679");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Cloneable> cloneableItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Cloneable>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[][][][]> mapIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) cloneableItor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(wildcardItorCollectionItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
        org.junit.Assert.assertNotNull(typeItorItor8);
        org.junit.Assert.assertNotNull(cloneableItor9);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1680");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        int int14 = strComparableComparator2.compare("hi!", "hi!");
        int int17 = strComparableComparator2.compare("hi!", "hi!");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][], java.util.RandomAccess[]> charSequenceArrayItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        boolean boolean19 = strComparableComparator2.equals((java.lang.Object) charSequenceArrayItorArrayItor18);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1681");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][] typeItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]> typeItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1682");
        org.apache.commons.collections4.OrderedIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorListItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorListItor0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1683");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Class<?>[], java.lang.Class<?>[]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][][]> wildcardItorListArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArrayItor0, 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1684");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray23);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray23);
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray27);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray27);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArray27);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor34 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean35 = typeItor34.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator36 = typeItor34.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList37 = typeItor34.getIterators();
        boolean boolean38 = charSequenceItorReverseComparator0.equals((java.lang.Object) typeItor34);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator39 = typeItor34.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList40 = typeItor34.getIterators();
        boolean boolean41 = typeItor34.hasNext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceItor24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor28);
        org.junit.Assert.assertNotNull(genericDeclarationItor31);
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(wildcardComparator36);
        org.junit.Assert.assertNotNull(wildcardItorList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(wildcardComparator39);
        org.junit.Assert.assertNotNull(wildcardItorList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1685");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray8 = new java.lang.reflect.GenericDeclaration[] { wildcardClass7 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray8);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray8, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(genericDeclarationArray8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1686");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray8 = new org.apache.commons.collections4.comparators.ComparableComparator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray9 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray8;
        strComparableComparatorArray9[0] = strComparableComparator2;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor15 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(comparableComparatorArray8);
        org.junit.Assert.assertNotNull(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparatorItor12);
        org.junit.Assert.assertNotNull(strComparableComparatorItor13);
        org.junit.Assert.assertNotNull(strComparableComparatorItor14);
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor15);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1687");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.apache.commons.collections4.OrderedIterator<java.util.Iterator> iteratorItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        boolean boolean15 = strComparableComparator0.equals((java.lang.Object) iteratorItor14);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(iteratorItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparator16);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1688");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        boolean boolean5 = strItor0.hasPrevious();
        boolean boolean6 = strItor0.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1689");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        java.lang.String str9 = strItor4.next();
        boolean boolean10 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1690");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator[], java.lang.reflect.AnnotatedElement> mapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(mapIteratorArrayItor0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1691");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator9 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator11 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean12 = strComparableComparator10.equals((java.lang.Object) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = strComparator9.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator11.reversed();
        java.util.Iterator<?> wildcardItor15 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strComparator14);
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.min("", "", strComparator14);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(wildcardItor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1692");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        boolean boolean16 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1693");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator13 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator5.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator13);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator5);
        int int18 = strComparableComparator5.compare("", "hi!");
        boolean boolean19 = strComparableComparator2.equals((java.lang.Object) strComparableComparator5);
        java.lang.String str20 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int23 = strComparableComparator5.compare("", "hi!");
        int int26 = strComparableComparator5.compare("hi!", "hi!");
        int int29 = strComparableComparator5.compare("", "hi!");
        java.util.Iterator[] iteratorArray31 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray32 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray31;
        java.util.Iterator<java.lang.String[]> strArrayItor33 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray31);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor34 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray31);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor35 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>>[]) iteratorArray31);
        boolean boolean36 = strComparableComparator5.equals((java.lang.Object) iteratorArray31);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3) + "'", int29 == (-3));
        org.junit.Assert.assertNotNull(iteratorArray31);
        org.junit.Assert.assertNotNull(wildcardItorArray32);
        org.junit.Assert.assertNotNull(strArrayItor33);
        org.junit.Assert.assertNotNull(strComparableItor34);
        org.junit.Assert.assertNotNull(iteratorItorItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1694");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][] typeItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]> typeItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray0, (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1695");
        org.apache.commons.collections4.MapIterator[][][] mapIteratorArray0 = new org.apache.commons.collections4.MapIterator[][][] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) mapIteratorArray0);
        org.junit.Assert.assertNotNull(mapIteratorArray0);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1696");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean12 = strItor4.hasPrevious();
        int int13 = strItor4.nextIndex();
        java.lang.String str14 = strItor4.next();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strItor4);
        java.lang.Class<?> wildcardClass16 = strItor4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strItorItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1697");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean10 = strItor4.hasNext();
        java.lang.String str11 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1698");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strItor8.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1699");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor5);
        // The following exception was thrown during execution in test generation
        try {
            strItor5.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1700");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1701");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.util.Iterator> iteratorComparator6 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Iterator>[]) comparatorArray1);
        java.util.ListIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor7 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.Comparator<org.apache.commons.collections4.MapIterator>[]) comparatorArray1);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(annotatedElementComparator5);
        org.junit.Assert.assertNotNull(iteratorComparator6);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArrayItor7);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1702");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator13 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator5.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator13);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator5);
        int int18 = strComparableComparator5.compare("", "");
        java.util.Iterator<?> wildcardItor19 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) "");
        boolean boolean20 = strComparableComparator2.equals((java.lang.Object) wildcardItor19);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int29 = strComparableComparator26.compare("hi!", "hi!");
        java.lang.String str30 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator26);
        int int33 = strComparableComparator26.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator34 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator26);
        boolean boolean35 = strComparableComparator23.equals((java.lang.Object) strComparator34);
        java.lang.String str36 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator23);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator39 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int42 = strComparableComparator39.compare("hi!", "hi!");
        java.lang.String str43 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator39);
        int int46 = strComparableComparator39.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator47 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator48 = strComparableComparator39.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator47);
        java.util.Comparator<java.lang.String> strComparator49 = strComparableComparator23.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator47);
        java.util.Comparator comparator50 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator51 = strComparableComparator47.thenComparing((java.util.Comparator<java.lang.String>) comparator50);
        java.util.Comparator<java.lang.String> strComparator52 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator47);
        java.util.Comparator<java.lang.String> strComparator53 = strComparableComparator47.reversed();
        java.util.Comparator<java.lang.String> strComparator54 = strComparableComparator2.thenComparing(strComparator53);
        java.lang.String str55 = org.apache.commons.collections4.ComparatorUtils.max("", "", strComparator54);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(strComparator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strComparableComparator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator47);
        org.junit.Assert.assertNotNull(strComparator48);
        org.junit.Assert.assertNotNull(strComparator49);
        org.junit.Assert.assertNotNull(comparator50);
        org.junit.Assert.assertNotNull(strComparator51);
        org.junit.Assert.assertNotNull(strComparator52);
        org.junit.Assert.assertNotNull(strComparator53);
        org.junit.Assert.assertNotNull(strComparator54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1703");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasNext();
        boolean boolean8 = strItor0.hasNext();
        boolean boolean9 = strItor0.hasPrevious();
        int int10 = strItor0.nextIndex();
        int int11 = strItor0.nextIndex();
        int int12 = strItor0.previousIndex();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1704");
        java.util.ListIterator<java.lang.String>[][] strItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[]> strItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray0, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1705");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator7 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator8 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean10 = strComparableComparator8.equals((java.lang.Object) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator11 = strComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator9);
        java.util.Comparator<java.lang.String> strComparator12 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator11);
        java.util.Iterator<?> wildcardItor13 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strComparator12);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(wildcardItor13);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1706");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        boolean boolean5 = listIterator0.hasPrevious();
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1707");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor4);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1708");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator13 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator5.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator13);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator5);
        int int18 = strComparableComparator5.compare("", "hi!");
        boolean boolean19 = strComparableComparator2.equals((java.lang.Object) strComparableComparator5);
        java.lang.String str20 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int23 = strComparableComparator5.compare("", "hi!");
        int int26 = strComparableComparator5.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator31 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int34 = strComparableComparator31.compare("hi!", "hi!");
        java.lang.String str35 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator31);
        int int38 = strComparableComparator31.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator39 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator31);
        java.lang.String str40 = org.apache.commons.collections4.ComparatorUtils.min("", "hi!", strComparator39);
        java.util.Comparator<java.lang.String> strComparator41 = strComparableComparator5.thenComparing(strComparator39);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strComparator41);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1709");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.AbstractList<java.util.Iterator<? extends java.lang.reflect.Type>>> charSequenceArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArrayItor0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1710");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        strItor4.set("hi!");
        java.util.ListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strItor16);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1711");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        boolean boolean4 = typeItor0.hasNext();
        boolean boolean5 = typeItor0.hasNext();
        boolean boolean6 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList7 = typeItor0.getIterators();
        boolean boolean8 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator9 = typeItor0.getComparator();
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardItorList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardComparator9);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1712");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        int int6 = strItor4.nextIndex();
        java.lang.String str7 = strItor4.next();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1713");
        org.apache.commons.collections4.OrderedIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1714");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        java.lang.String str10 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1715");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        boolean boolean14 = strItor4.hasPrevious();
        int int15 = strItor4.nextIndex();
        boolean boolean16 = strItor4.hasPrevious();
        int int17 = strItor4.nextIndex();
        int int18 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1716");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        boolean boolean14 = strItor4.hasPrevious();
        int int15 = strItor4.nextIndex();
        boolean boolean16 = strItor4.hasPrevious();
        boolean boolean17 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1717");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>, org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][]> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1718");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        int int14 = strComparableComparator10.compare("hi!", "hi!");
        int int17 = strComparableComparator10.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator18 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator10);
        java.util.ListIterator<java.io.Serializable> serializableItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.io.Serializable) strComparableComparator10);
        java.util.Comparator<java.lang.String> strComparator20 = strComparableComparator10.reversed();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int29 = strComparableComparator26.compare("hi!", "hi!");
        java.lang.String str30 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator26);
        int int33 = strComparableComparator26.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator34 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator26);
        boolean boolean35 = strComparableComparator23.equals((java.lang.Object) strComparator34);
        java.util.Comparator<java.lang.String> strComparator36 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.lang.String str37 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator38 = strComparator20.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator39 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(serializableItor19);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(strComparator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(strComparator39);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1719");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator10 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int13 = strComparableComparator2.compare("", "");
        org.apache.commons.collections4.OrderedIterator<java.lang.CharSequence[][]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        boolean boolean15 = strComparableComparator2.equals((java.lang.Object) charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1720");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        boolean boolean10 = strItor4.hasNext();
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardItor11);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1721");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorCollectionArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) boolean6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1722");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor19 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean20 = typeItor19.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator21 = typeItor19.getComparator();
        boolean boolean22 = typeItor19.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator23 = typeItor19.getComparator();
        boolean boolean24 = charSequenceItorReverseComparator0.equals((java.lang.Object) wildcardComparator23);
        org.apache.commons.collections4.ResettableIterator resettableIterator25 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor26 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = charSequenceItorReverseComparator0.compare((org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator25, charSequenceItor26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.EmptyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardComparator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardComparator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(resettableIterator25);
        org.junit.Assert.assertNotNull(charSequenceItor26);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1723");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean9 = strItor8.hasNext();
        int int10 = strItor8.previousIndex();
        java.lang.String str11 = strItor8.next();
        // The following exception was thrown during execution in test generation
        try {
            strItor8.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1724");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        java.lang.String str9 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>[][]> strItorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1725");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasNext();
        java.util.ListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean5 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1726");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        boolean boolean5 = typeItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorListArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) boolean5, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1727");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int21 = strComparableComparator18.compare("hi!", "hi!");
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator18);
        int int25 = strComparableComparator18.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator27 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator28 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator comparator29 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator26.thenComparing((java.util.Comparator<java.lang.String>) comparator29);
        java.util.Comparator<java.lang.String> strComparator31 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator26);
        java.util.Comparator<java.lang.String> strComparator32 = strComparableComparator26.reversed();
        java.util.ListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor33 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strComparableComparator26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparatorItor33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(strComparableComparatorItor33);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1728");
        org.apache.commons.collections4.MapIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][], java.lang.reflect.GenericDeclaration[][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1729");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator2 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean4 = charSequenceItorReverseComparator2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSequenceItorReverseComparator2.equals(obj5);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor7 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray9 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray10 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray10, 0);
        boolean boolean13 = charSequenceItorReverseComparator2.equals((java.lang.Object) strComparableComparatorItor12);
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator(iteratorItor14);
        boolean boolean16 = iteratorItor14.hasPrevious();
        boolean boolean17 = charSequenceItorReverseComparator2.equals((java.lang.Object) iteratorItor14);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        java.util.Comparator<java.lang.String> strComparator31 = strComparableComparator18.thenComparing(strComparator30);
        java.util.Comparator<java.lang.String> strComparator32 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator30);
        java.util.Comparator<java.lang.String> strComparator33 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator30);
        boolean boolean34 = charSequenceItorReverseComparator2.equals((java.lang.Object) strComparator30);
        java.lang.String str35 = org.apache.commons.collections4.ComparatorUtils.min("", "hi!", strComparator30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor7);
        org.junit.Assert.assertNotNull(comparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparatorArray10);
        org.junit.Assert.assertNotNull(strComparableComparatorItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iteratorItor14);
        org.junit.Assert.assertNotNull(iteratorItorItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(strComparator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1730");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        int int6 = strItor4.nextIndex();
        strItor4.set("hi!");
        java.lang.String str9 = strItor4.previous();
        boolean boolean10 = strItor4.hasPrevious();
        java.lang.String str11 = strItor4.next();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1731");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int12 = strItor11.nextIndex();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor11);
        java.lang.Class<?> wildcardClass14 = strItor11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1732");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        boolean boolean11 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1733");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>, org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> typeItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItorItor0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1734");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        int int11 = strItor4.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Comparator<java.lang.String>> strComparatorItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) int11, (-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1735");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasNext();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[]> iteratorItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItor0, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1736");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.previous();
        int int15 = strItor7.nextIndex();
        int int16 = strItor7.previousIndex();
        boolean boolean17 = strItor7.hasNext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1737");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator6 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int12 = strComparableComparator9.compare("hi!", "hi!");
        java.lang.String str13 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator9);
        int int16 = strComparableComparator9.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator17 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator18 = strComparableComparator9.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator17);
        java.util.Comparator<java.lang.String> strComparator19 = strComparableComparator6.thenComparing(strComparator18);
        boolean boolean20 = strComparableComparator2.equals((java.lang.Object) strComparableComparator6);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int26 = strComparableComparator23.compare("hi!", "hi!");
        java.lang.String str27 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator23);
        int int30 = strComparableComparator23.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator31 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator32 = strComparableComparator23.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator31);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor33 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator23);
        int int36 = strComparableComparator23.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator37 = strComparableComparator6.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator38 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator6);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator39 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int42 = strComparableComparator39.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator43 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator46 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int49 = strComparableComparator46.compare("hi!", "hi!");
        java.lang.String str50 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator46);
        int int53 = strComparableComparator46.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator54 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator55 = strComparableComparator46.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator54);
        java.util.Comparator<java.lang.String> strComparator56 = strComparableComparator43.thenComparing(strComparator55);
        boolean boolean57 = strComparableComparator39.equals((java.lang.Object) strComparableComparator43);
        java.util.Comparator<java.lang.String> strComparator58 = strComparator38.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator39);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator65 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int68 = strComparableComparator65.compare("hi!", "hi!");
        java.lang.String str69 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator65);
        int int72 = strComparableComparator65.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator73 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator74 = strComparableComparator65.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator73);
        int int77 = strComparableComparator73.compare("hi!", "hi!");
        int int80 = strComparableComparator73.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator81 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator73);
        java.lang.String str82 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator73);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator83 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean85 = charSequenceItorReverseComparator83.equals((java.lang.Object) 100.0f);
        boolean boolean86 = strComparableComparator73.equals((java.lang.Object) charSequenceItorReverseComparator83);
        int int89 = strComparableComparator73.compare("hi!", "hi!");
        java.lang.String str90 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator73);
        java.util.Comparator<java.lang.String> strComparator91 = strComparator38.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator73);
        java.lang.String str92 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator73);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator6);
        org.junit.Assert.assertNotNull(strComparableComparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator17);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator31);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(objItor33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(strComparableComparator39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator43);
        org.junit.Assert.assertNotNull(strComparableComparator46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator54);
        org.junit.Assert.assertNotNull(strComparator55);
        org.junit.Assert.assertNotNull(strComparator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strComparator58);
        org.junit.Assert.assertNotNull(strComparableComparator65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator73);
        org.junit.Assert.assertNotNull(strComparator74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(strComparator81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(strComparator91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1738");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator11 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator12 = strComparableComparator3.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator0.thenComparing(strComparator12);
        java.util.Comparator<java.lang.String> strComparator14 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator12);
        java.util.Comparator<java.lang.String> strComparator15 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator12);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator16 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator19 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int22 = strComparableComparator19.compare("hi!", "hi!");
        java.lang.String str23 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator19);
        int int26 = strComparableComparator19.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator27 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator19);
        boolean boolean28 = strComparableComparator16.equals((java.lang.Object) strComparator27);
        java.util.Comparator<java.lang.String> strComparator29 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator16);
        java.util.Comparator<java.lang.String> strComparator30 = strComparator15.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator16);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor31 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList32 = typeItor31.getIterators();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator33 = typeItor31.getComparator();
        boolean boolean34 = typeItor31.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList35 = typeItor31.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList36 = typeItor31.getIterators();
        boolean boolean37 = strComparableComparator16.equals((java.lang.Object) typeItor31);
        java.util.Comparator<java.lang.String> strComparator38 = null;
        java.util.Comparator<java.lang.String> strComparator39 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator38);
        java.util.Comparator<java.lang.String> strComparator40 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator39);
        java.util.Comparator<java.lang.String> strComparator41 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator39);
        java.util.Comparator<java.lang.String> strComparator42 = strComparableComparator16.thenComparing(strComparator41);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor43 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strComparableComparator16);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparableComparator16);
        org.junit.Assert.assertNotNull(strComparableComparator19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(wildcardItorList32);
        org.junit.Assert.assertNull(wildcardComparator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardItorList35);
        org.junit.Assert.assertNotNull(wildcardItorList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertNotNull(strComparator40);
        org.junit.Assert.assertNotNull(strComparator41);
        org.junit.Assert.assertNotNull(strComparator42);
        org.junit.Assert.assertNotNull(strComparableComparatorItor43);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1739");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>[], org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]> strItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(strItorArrayItor0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1740");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int7 = strItor6.previousIndex();
        boolean boolean8 = strItor6.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor6.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1741");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator10 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.Class<?> wildcardClass12 = strComparableComparator2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][]> typeArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1742");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray2 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator0, charSequenceArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator3 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator3, charSequenceArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator6, charSequenceArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator9 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray11 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator9, charSequenceArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator12 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray14 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator12, charSequenceArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator15 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray17 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator15, charSequenceArrayItor16 };
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray18 = new org.apache.commons.collections4.MapIterator[][] { mapIteratorArray2, mapIteratorArray5, mapIteratorArray8, mapIteratorArray11, mapIteratorArray14, mapIteratorArray17 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonIterator(mapIteratorArray18);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(mapIteratorArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray18, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIterator0);
        org.junit.Assert.assertNotNull(charSequenceArrayItor1);
        org.junit.Assert.assertNotNull(mapIteratorArray2);
        org.junit.Assert.assertNotNull(orderedMapIterator3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(charSequenceArrayItor7);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
        org.junit.Assert.assertNotNull(orderedMapIterator9);
        org.junit.Assert.assertNotNull(charSequenceArrayItor10);
        org.junit.Assert.assertNotNull(mapIteratorArray11);
        org.junit.Assert.assertNotNull(orderedMapIterator12);
        org.junit.Assert.assertNotNull(charSequenceArrayItor13);
        org.junit.Assert.assertNotNull(mapIteratorArray14);
        org.junit.Assert.assertNotNull(orderedMapIterator15);
        org.junit.Assert.assertNotNull(charSequenceArrayItor16);
        org.junit.Assert.assertNotNull(mapIteratorArray17);
        org.junit.Assert.assertNotNull(mapIteratorArray18);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor20);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor21);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1743");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        boolean boolean4 = listIterator0.hasNext();
        boolean boolean5 = listIterator0.hasPrevious();
        int int6 = listIterator0.previousIndex();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray10);
        boolean boolean12 = strItor11.hasPrevious();
        boolean boolean13 = strItor11.hasNext();
        int int14 = strItor11.previousIndex();
        boolean boolean15 = strItor11.hasNext();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean17 = strItor16.hasNext();
        int int18 = strItor16.nextIndex();
        java.util.ListIterator<java.lang.String> strItor19 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor16);
        boolean boolean20 = strItor16.hasPrevious();
        java.util.ListIterator[] listIteratorArray22 = new java.util.ListIterator[3];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray23 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray22;
        strItorArray23[0] = listIterator0;
        strItorArray23[1] = strItor11;
        strItorArray23[2] = strItor16;
        java.util.ListIterator[][] listIteratorArray31 = new java.util.ListIterator[1][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray32 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray31;
        strItorArray32[0] = strItorArray23;
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[]> strItorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray32, (int) (byte) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Cloneable> cloneableItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Cloneable[]) strItorArray32);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>[][]> strItorArrayItor38 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strItorArray32);
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIteratorArray22);
        org.junit.Assert.assertNotNull(strItorArray23);
        org.junit.Assert.assertNotNull(listIteratorArray31);
        org.junit.Assert.assertNotNull(strItorArray32);
        org.junit.Assert.assertNotNull(strItorArrayItor36);
        org.junit.Assert.assertNotNull(cloneableItor37);
        org.junit.Assert.assertNotNull(strItorArrayItor38);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1744");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        java.lang.String str10 = strItor4.previous();
        boolean boolean11 = strItor4.hasPrevious();
        int int12 = strItor4.nextIndex();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1745");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][][]> typeArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) str6, (int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1746");
        java.util.RandomAccess[] randomAccessArray0 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray1 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray2 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray3 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray4 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray5 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[][] randomAccessArray6 = new java.util.RandomAccess[][] { randomAccessArray0, randomAccessArray1, randomAccessArray2, randomAccessArray3, randomAccessArray4, randomAccessArray5 };
        org.apache.commons.collections4.ResettableIterator<java.util.RandomAccess[]> randomAccessArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(randomAccessArray6);
        org.apache.commons.collections4.ResettableListIterator<java.util.RandomAccess[]> randomAccessArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(randomAccessArray6);
        org.junit.Assert.assertNotNull(randomAccessArray0);
        org.junit.Assert.assertNotNull(randomAccessArray1);
        org.junit.Assert.assertNotNull(randomAccessArray2);
        org.junit.Assert.assertNotNull(randomAccessArray3);
        org.junit.Assert.assertNotNull(randomAccessArray4);
        org.junit.Assert.assertNotNull(randomAccessArray5);
        org.junit.Assert.assertNotNull(randomAccessArray6);
        org.junit.Assert.assertNotNull(randomAccessArrayItor7);
        org.junit.Assert.assertNotNull(randomAccessArrayItor8);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1747");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        boolean boolean2 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.ListIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>) wildcardItorList3);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor5 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorIterableItor4);
        org.junit.Assert.assertNotNull(wildcardItorItor5);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1748");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean9 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1749");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        int int6 = strItor0.previousIndex();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor8.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1750");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        boolean boolean12 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("");
        boolean boolean16 = strItor4.hasPrevious();
        java.lang.String str17 = strItor4.previous();
        boolean boolean18 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1751");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        boolean boolean10 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1752");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        boolean boolean12 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int14 = strItor13.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor13.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1753");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray23);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray23);
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray27);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray27);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArray27);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor34 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean35 = typeItor34.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator36 = typeItor34.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList37 = typeItor34.getIterators();
        boolean boolean38 = charSequenceItorReverseComparator0.equals((java.lang.Object) typeItor34);
        java.util.Comparator<java.lang.String> strComparator39 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
        java.util.Comparator<java.lang.String> strComparator40 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator39);
        boolean boolean41 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparator39);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor42 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean43 = charSequenceItorReverseComparator0.equals((java.lang.Object) typeItor42);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = typeItor42.getIteratorIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value has been returned yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceItor24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor28);
        org.junit.Assert.assertNotNull(genericDeclarationItor31);
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(wildcardComparator36);
        org.junit.Assert.assertNotNull(wildcardItorList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertNotNull(strComparator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1754");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        java.lang.String str9 = strItor4.next();
        boolean boolean10 = strItor4.hasPrevious();
        int int11 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1755");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasNext();
        boolean boolean3 = listIterator0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1756");
        org.apache.commons.collections4.iterators.CollatingIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>[]> strItorArrayItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>[]>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItorArrayItor0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1757");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        boolean boolean5 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1758");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor0);
        boolean boolean3 = iteratorItor0.hasPrevious();
        boolean boolean4 = iteratorItor0.hasPrevious();
        boolean boolean5 = iteratorItor0.hasPrevious();
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1759");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasNext();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1760");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][]> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1761");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor9);
        java.lang.String str11 = strItor10.next();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1762");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1763");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        // The following exception was thrown during execution in test generation
        try {
            listIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1764");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor5.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1765");
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray1 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray2 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray1;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray2, 4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableComparatorArray1);
        org.junit.Assert.assertNotNull(strComparableComparatorArray2);
        org.junit.Assert.assertNotNull(strComparableComparatorItor4);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1766");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        boolean boolean4 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator5 = typeItor0.getComparator();
        boolean boolean6 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList7 = typeItor0.getIterators();
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardItorList7);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1767");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.ListIterator<java.lang.String>) strItor0);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertNotNull(strItorItor2);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1768");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>, java.util.Iterator> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1769");
        org.apache.commons.collections4.comparators.ComparableComparator comparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.INSTANCE;
        org.apache.commons.collections4.comparators.ReverseComparator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayReverseComparator1 = new org.apache.commons.collections4.comparators.ReverseComparator<java.lang.reflect.GenericDeclaration[][]>();
        boolean boolean2 = comparableComparator0.equals((java.lang.Object) genericDeclarationArrayReverseComparator1);
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>, java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean4 = comparableComparator0.equals((java.lang.Object) typeItorItor3);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor5 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean6 = typeItor5.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator7 = typeItor5.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList8 = typeItor5.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor5);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor10 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList11 = typeItor10.getIterators();
        boolean boolean12 = typeItor10.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator13 = typeItor10.getComparator();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor14 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean15 = typeItor14.hasNext();
        boolean boolean16 = typeItor14.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor14);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator18 = typeItor14.getComparator();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor19 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList20 = typeItor19.getIterators();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator21 = typeItor19.getComparator();
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator22 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean24 = charSequenceItorReverseComparator22.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int32 = strComparableComparator29.compare("hi!", "hi!");
        java.lang.String str33 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator29);
        int int36 = strComparableComparator29.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator37 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator38 = strComparableComparator29.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator37);
        java.lang.String str39 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator37);
        boolean boolean40 = charSequenceItorReverseComparator22.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor46 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray45);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor47 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray45);
        java.lang.Class<?> wildcardClass48 = objItor47.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray49 = new java.lang.reflect.GenericDeclaration[] { wildcardClass48 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor50 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray49);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor53 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray49, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor54 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray49);
        boolean boolean55 = charSequenceItorReverseComparator22.equals((java.lang.Object) genericDeclarationArray49);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor56 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean57 = typeItor56.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator58 = typeItor56.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList59 = typeItor56.getIterators();
        boolean boolean60 = charSequenceItorReverseComparator22.equals((java.lang.Object) typeItor56);
        java.util.Comparator<java.lang.String> strComparator61 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
        java.util.Comparator<java.lang.String> strComparator62 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator61);
        boolean boolean63 = charSequenceItorReverseComparator22.equals((java.lang.Object) strComparator61);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor64 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean65 = charSequenceItorReverseComparator22.equals((java.lang.Object) typeItor64);
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor66 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor64);
        org.apache.commons.collections4.iterators.CollatingIterator[] collatingIteratorArray68 = new org.apache.commons.collections4.iterators.CollatingIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[] typeItorArray69 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]) collatingIteratorArray68;
        typeItorArray69[0] = typeItor5;
        typeItorArray69[1] = typeItor10;
        typeItorArray69[2] = typeItor14;
        typeItorArray69[3] = typeItor19;
        typeItorArray69[4] = typeItor64;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor80 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray69);
        boolean boolean81 = comparableComparator0.equals((java.lang.Object) typeItorArray69);
        org.junit.Assert.assertNotNull(comparableComparator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(wildcardItorList8);
        org.junit.Assert.assertNotNull(typeItorItor9);
        org.junit.Assert.assertNotNull(wildcardItorList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardComparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeItorItor17);
        org.junit.Assert.assertNull(wildcardComparator18);
        org.junit.Assert.assertNotNull(wildcardItorList20);
        org.junit.Assert.assertNull(wildcardComparator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceItor46);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(genericDeclarationArray49);
        org.junit.Assert.assertNotNull(genericDeclarationItor50);
        org.junit.Assert.assertNotNull(genericDeclarationItor53);
        org.junit.Assert.assertNotNull(objItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(wildcardComparator58);
        org.junit.Assert.assertNotNull(wildcardItorList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparator61);
        org.junit.Assert.assertNotNull(strComparator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(typeItorItor66);
        org.junit.Assert.assertNotNull(collatingIteratorArray68);
        org.junit.Assert.assertNotNull(typeItorArray69);
        org.junit.Assert.assertNotNull(typeItorItor80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1770");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.next();
        java.lang.String str15 = strItor7.previous();
        java.lang.String str16 = strItor7.next();
        boolean boolean17 = strItor7.hasNext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1771");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparator13);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1772");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.io.Serializable> serializableComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.io.Serializable>[]) comparatorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) comparatorArray1);
        java.util.Comparator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]> charSequenceArrayItorArrayComparator7 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][][]>[]) comparatorArray1);
        java.util.Comparator<java.lang.CharSequence[]> charSequenceArrayComparator8 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.CharSequence[]>[]) comparatorArray1);
        org.apache.commons.collections4.ResettableIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor9 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Comparator<org.apache.commons.collections4.MapIterator>[]) comparatorArray1);
        java.lang.Class<?> wildcardClass10 = comparatorArray1.getClass();
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(serializableComparator5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayComparator7);
        org.junit.Assert.assertNotNull(charSequenceArrayComparator8);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArrayItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1773");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int3 = strComparableComparator0.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparableComparator4.thenComparing(strComparator16);
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator21);
        int int34 = strComparableComparator21.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator36 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator37 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int40 = strComparableComparator37.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator41 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator44 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int47 = strComparableComparator44.compare("hi!", "hi!");
        java.lang.String str48 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator44);
        int int51 = strComparableComparator44.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator52 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator53 = strComparableComparator44.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.util.Comparator<java.lang.String> strComparator54 = strComparableComparator41.thenComparing(strComparator53);
        boolean boolean55 = strComparableComparator37.equals((java.lang.Object) strComparableComparator41);
        java.util.Comparator<java.lang.String> strComparator56 = strComparator36.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator37);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator63 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int66 = strComparableComparator63.compare("hi!", "hi!");
        java.lang.String str67 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator63);
        int int70 = strComparableComparator63.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator71 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator72 = strComparableComparator63.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator71);
        int int75 = strComparableComparator71.compare("hi!", "hi!");
        int int78 = strComparableComparator71.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator79 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator71);
        java.lang.String str80 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator71);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator81 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean83 = charSequenceItorReverseComparator81.equals((java.lang.Object) 100.0f);
        boolean boolean84 = strComparableComparator71.equals((java.lang.Object) charSequenceItorReverseComparator81);
        int int87 = strComparableComparator71.compare("hi!", "hi!");
        java.lang.String str88 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator71);
        java.util.Comparator<java.lang.String> strComparator89 = strComparator36.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator71);
        int int92 = strComparableComparator71.compare("hi!", "");
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparableComparator37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator41);
        org.junit.Assert.assertNotNull(strComparableComparator44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator52);
        org.junit.Assert.assertNotNull(strComparator53);
        org.junit.Assert.assertNotNull(strComparator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strComparator56);
        org.junit.Assert.assertNotNull(strComparableComparator63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator71);
        org.junit.Assert.assertNotNull(strComparator72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 3 + "'", int78 == 3);
        org.junit.Assert.assertNotNull(strComparator79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
        org.junit.Assert.assertNotNull(strComparator89);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 3 + "'", int92 == 3);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1774");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        boolean boolean14 = strItor4.hasPrevious();
        int int15 = strItor4.nextIndex();
        boolean boolean16 = strItor4.hasPrevious();
        int int17 = strItor4.previousIndex();
        boolean boolean18 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1775");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        java.util.ListIterator<java.lang.CharSequence[]> charSequenceArrayItor22 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.CharSequence[]) strArray19);
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray19);
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor25 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray19, 0);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charSequenceArrayItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(charSequenceItor25);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1776");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        // The following exception was thrown during execution in test generation
        try {
            strItor7.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1777");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        boolean boolean12 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("");
        boolean boolean16 = strItor4.hasPrevious();
        int int17 = strItor4.nextIndex();
        java.lang.String str18 = strItor4.previous();
        int int19 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strItor13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1778");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray9);
        boolean boolean11 = strItor10.hasPrevious();
        boolean boolean12 = strItor10.hasNext();
        int int13 = strItor10.previousIndex();
        boolean boolean14 = strItor10.hasNext();
        boolean boolean15 = charSequenceItorReverseComparator0.equals((java.lang.Object) boolean14);
        java.util.Iterator[] iteratorArray17 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray18 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray17;
        java.util.Iterator<java.lang.String[]> strArrayItor19 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray17);
        java.util.Iterator<?> wildcardItor20 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray17);
        java.util.Iterator<java.lang.reflect.AnnotatedElement> annotatedElementItor21 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement>[]) iteratorArray17);
        boolean boolean22 = charSequenceItorReverseComparator0.equals((java.lang.Object) annotatedElementItor21);
        java.util.ListIterator listIterator23 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int24 = listIterator23.nextIndex();
        boolean boolean25 = listIterator23.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor26 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator23);
        int int27 = strItor26.nextIndex();
        boolean boolean28 = strItor26.hasNext();
        boolean boolean29 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor30 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceItorReverseComparator0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iteratorArray17);
        org.junit.Assert.assertNotNull(wildcardItorArray18);
        org.junit.Assert.assertNotNull(strArrayItor19);
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertNotNull(annotatedElementItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1779");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean10 = strItor4.hasNext();
        java.lang.String str11 = strItor4.next();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1780");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator16 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int19 = strComparableComparator16.compare("hi!", "hi!");
        java.lang.String str20 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator16);
        int int23 = strComparableComparator16.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator24 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator16.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator24);
        int int28 = strComparableComparator16.compare("hi!", "hi!");
        int int31 = strComparableComparator16.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator32 = strComparableComparator0.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator16);
        java.util.Comparator comparator35 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str36 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) comparator35);
        java.util.Comparator<java.lang.String> strComparator37 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) comparator35);
        java.util.Comparator<java.lang.String> strComparator38 = strComparableComparator0.thenComparing(strComparator37);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor39 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparator0);
        int int42 = strComparableComparator0.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator43 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor44 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean45 = typeItor44.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator46 = typeItor44.getComparator();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator47 = typeItor44.getComparator();
        boolean boolean48 = strComparableComparator0.equals((java.lang.Object) typeItor44);
        java.util.Comparator<java.lang.String> strComparator49 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparableComparator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(strComparableComparatorItor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(strComparator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(wildcardComparator46);
        org.junit.Assert.assertNull(wildcardComparator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strComparator49);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1781");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        boolean boolean6 = strItor4.hasPrevious();
        strItor4.set("");
        int int9 = strItor4.previousIndex();
        boolean boolean10 = strItor4.hasPrevious();
        boolean boolean11 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}

