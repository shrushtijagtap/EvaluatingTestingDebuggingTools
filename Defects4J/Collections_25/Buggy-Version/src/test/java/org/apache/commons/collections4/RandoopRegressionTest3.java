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
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence[][]> charSequenceArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorListArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceArrayItor0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArrayItor0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        java.lang.Object obj6 = null;
        boolean boolean7 = charSequenceItorReverseComparator0.equals(obj6);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray11);
        boolean boolean13 = strItor12.hasPrevious();
        boolean boolean14 = strItor12.hasNext();
        int int15 = strItor12.previousIndex();
        java.lang.String str16 = strItor12.next();
        java.lang.String str17 = strItor12.previous();
        int int18 = strItor12.previousIndex();
        boolean boolean19 = strItor12.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor12);
        int int21 = strItor20.nextIndex();
        boolean boolean22 = charSequenceItorReverseComparator0.equals((java.lang.Object) int21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
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
        org.apache.commons.collections4.MapIterator mapIterator16 = org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE;
        boolean boolean17 = charSequenceItorReverseComparator0.equals((java.lang.Object) mapIterator16);
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
        org.junit.Assert.assertNotNull(mapIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
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
        java.util.Comparator<java.lang.String> strComparator26 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator25);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
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
        java.util.ListIterator<java.util.ListIterator<java.lang.String>[][]> strItorArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strItorArray32);
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
        org.junit.Assert.assertNotNull(strItorArrayItor39);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
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
            strItor7.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        int int5 = strItor0.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasNext();
        boolean boolean6 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor0.next();
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
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        boolean boolean2 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList4 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor5 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor7 = org.apache.commons.collections4.IteratorUtils.loopingIterator((java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>) wildcardItorList4);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor8 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor9 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor10 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList4);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList4);
        org.junit.Assert.assertNotNull(wildcardItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(wildcardItorItor8);
        org.junit.Assert.assertNotNull(wildcardItorItor9);
        org.junit.Assert.assertNotNull(wildcardItorItor10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
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
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
        java.util.Comparator<java.lang.String> strComparator0 = null;
        java.util.Comparator<java.lang.String> strComparator1 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator2 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator3 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator2);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator2);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasNext();
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
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        int int10 = strItor4.previousIndex();
        java.lang.String str11 = strItor4.next();
        int int12 = strItor4.previousIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasPrevious();
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor0.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
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
        java.util.ListIterator<java.lang.Class<?>[]> wildcardClassArrayItor52 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray38);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor54 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray38, 1);
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
        org.junit.Assert.assertNotNull(wildcardClassArrayItor52);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor54);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        int int3 = strItor0.nextIndex();
        int int4 = strItor0.nextIndex();
        boolean boolean5 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[][][][][]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("hi!");
        int int2 = strItor1.nextIndex();
        int int3 = strItor1.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor1.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported by this iterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        java.util.Comparator<java.lang.String> strComparator0 = null;
        java.util.Comparator<java.lang.String> strComparator1 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator2 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int13 = strComparableComparator10.compare("hi!", "hi!");
        java.lang.String str14 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator10);
        int int17 = strComparableComparator10.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator18 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator10);
        boolean boolean19 = strComparableComparator7.equals((java.lang.Object) strComparator18);
        java.lang.String str20 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int26 = strComparableComparator23.compare("hi!", "hi!");
        java.lang.String str27 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator23);
        int int30 = strComparableComparator23.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator31 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator32 = strComparableComparator23.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator31);
        java.util.Comparator<java.lang.String> strComparator33 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator31);
        java.util.Comparator comparator34 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator31.thenComparing((java.util.Comparator<java.lang.String>) comparator34);
        java.lang.String str36 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator31);
        java.util.Comparator<java.lang.String> strComparator37 = strComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator31);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(strComparator33);
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strComparator37);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
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
        java.util.Comparator<java.lang.String> strComparator39 = strComparableComparator6.reversed();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor40 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean41 = strItor40.hasNext();
        int int42 = strItor40.nextIndex();
        boolean boolean43 = strItor40.hasPrevious();
        boolean boolean44 = strItor40.hasPrevious();
        boolean boolean45 = strComparableComparator6.equals((java.lang.Object) strItor40);
        java.lang.String str46 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator6);
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
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        boolean boolean2 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList4 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList5 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor6 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList5);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList4);
        org.junit.Assert.assertNotNull(wildcardItorList5);
        org.junit.Assert.assertNotNull(wildcardItorItor6);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
        java.util.List[][] listArray1 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray2 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]) listArray1;
        java.util.List[][] listArray4 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray5 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]) listArray4;
        java.util.List[][][] listArray7 = new java.util.List[2][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][] wildcardItorListArray8 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]) listArray7;
        wildcardItorListArray8[0] = wildcardItorListArray2;
        wildcardItorListArray8[1] = wildcardItorListArray5;
        java.util.List[][] listArray14 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray15 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]) listArray14;
        java.util.List[][] listArray17 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray18 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]) listArray17;
        java.util.List[][][] listArray20 = new java.util.List[2][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][] wildcardItorListArray21 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]) listArray20;
        wildcardItorListArray21[0] = wildcardItorListArray15;
        wildcardItorListArray21[1] = wildcardItorListArray18;
        java.util.List[][] listArray27 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray28 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]) listArray27;
        java.util.List[][] listArray30 = new java.util.List[0][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][] wildcardItorListArray31 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]) listArray30;
        java.util.List[][][] listArray33 = new java.util.List[2][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][] wildcardItorListArray34 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]) listArray33;
        wildcardItorListArray34[0] = wildcardItorListArray28;
        wildcardItorListArray34[1] = wildcardItorListArray31;
        java.util.List[][][][] listArray40 = new java.util.List[3][][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][][] wildcardItorListArray41 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][][]) listArray40;
        wildcardItorListArray41[0] = wildcardItorListArray8;
        wildcardItorListArray41[1] = wildcardItorListArray21;
        wildcardItorListArray41[2] = wildcardItorListArray34;
        org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]> wildcardItorListArrayItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorListArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]> wildcardItorListArrayItor50 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorListArray41, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(wildcardItorListArray2);
        org.junit.Assert.assertNotNull(listArray4);
        org.junit.Assert.assertNotNull(wildcardItorListArray5);
        org.junit.Assert.assertNotNull(listArray7);
        org.junit.Assert.assertNotNull(wildcardItorListArray8);
        org.junit.Assert.assertNotNull(listArray14);
        org.junit.Assert.assertNotNull(wildcardItorListArray15);
        org.junit.Assert.assertNotNull(listArray17);
        org.junit.Assert.assertNotNull(wildcardItorListArray18);
        org.junit.Assert.assertNotNull(listArray20);
        org.junit.Assert.assertNotNull(wildcardItorListArray21);
        org.junit.Assert.assertNotNull(listArray27);
        org.junit.Assert.assertNotNull(wildcardItorListArray28);
        org.junit.Assert.assertNotNull(listArray30);
        org.junit.Assert.assertNotNull(wildcardItorListArray31);
        org.junit.Assert.assertNotNull(listArray33);
        org.junit.Assert.assertNotNull(wildcardItorListArray34);
        org.junit.Assert.assertNotNull(listArray40);
        org.junit.Assert.assertNotNull(wildcardItorListArray41);
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor48);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
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
        java.util.Comparator<java.lang.String> strComparator39 = null;
        java.util.Comparator<java.lang.String> strComparator40 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator39);
        java.util.Comparator<java.lang.String> strComparator41 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator39);
        java.util.Comparator<java.lang.String> strComparator42 = strComparator41.reversed();
        java.util.Comparator<java.lang.String> strComparator43 = strComparator41.reversed();
        java.util.Comparator<java.lang.String> strComparator44 = strComparator38.thenComparing(strComparator43);
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
        org.junit.Assert.assertNotNull(strComparator40);
        org.junit.Assert.assertNotNull(strComparator41);
        org.junit.Assert.assertNotNull(strComparator42);
        org.junit.Assert.assertNotNull(strComparator43);
        org.junit.Assert.assertNotNull(strComparator44);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasPrevious();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator2 = typeItor0.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor5 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList6 = typeItor5.getIterators();
        boolean boolean7 = typeItor5.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator8 = typeItor5.getComparator();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor9 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean10 = typeItor9.hasNext();
        boolean boolean11 = typeItor9.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor9);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator13 = typeItor9.getComparator();
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor14 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList15 = typeItor14.getIterators();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator16 = typeItor14.getComparator();
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator17 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean19 = charSequenceItorReverseComparator17.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator24 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int27 = strComparableComparator24.compare("hi!", "hi!");
        java.lang.String str28 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator24);
        int int31 = strComparableComparator24.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator32 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator33 = strComparableComparator24.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator32);
        java.lang.String str34 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator32);
        boolean boolean35 = charSequenceItorReverseComparator17.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor41 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray40);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray40);
        java.lang.Class<?> wildcardClass43 = objItor42.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray44 = new java.lang.reflect.GenericDeclaration[] { wildcardClass43 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor45 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray44);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray44, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray44);
        boolean boolean50 = charSequenceItorReverseComparator17.equals((java.lang.Object) genericDeclarationArray44);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor51 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean52 = typeItor51.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator53 = typeItor51.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList54 = typeItor51.getIterators();
        boolean boolean55 = charSequenceItorReverseComparator17.equals((java.lang.Object) typeItor51);
        java.util.Comparator<java.lang.String> strComparator56 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
        java.util.Comparator<java.lang.String> strComparator57 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator56);
        boolean boolean58 = charSequenceItorReverseComparator17.equals((java.lang.Object) strComparator56);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor59 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean60 = charSequenceItorReverseComparator17.equals((java.lang.Object) typeItor59);
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor61 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor59);
        org.apache.commons.collections4.iterators.CollatingIterator[] collatingIteratorArray63 = new org.apache.commons.collections4.iterators.CollatingIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[] typeItorArray64 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]) collatingIteratorArray63;
        typeItorArray64[0] = typeItor0;
        typeItorArray64[1] = typeItor5;
        typeItorArray64[2] = typeItor9;
        typeItorArray64[3] = typeItor14;
        typeItorArray64[4] = typeItor59;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor75 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray64);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardComparator2);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(typeItorItor4);
        org.junit.Assert.assertNotNull(wildcardItorList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardComparator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeItorItor12);
        org.junit.Assert.assertNull(wildcardComparator13);
        org.junit.Assert.assertNotNull(wildcardItorList15);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableComparator24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator32);
        org.junit.Assert.assertNotNull(strComparator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceItor41);
        org.junit.Assert.assertNotNull(objItor42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(genericDeclarationArray44);
        org.junit.Assert.assertNotNull(genericDeclarationItor45);
        org.junit.Assert.assertNotNull(genericDeclarationItor48);
        org.junit.Assert.assertNotNull(objItor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(wildcardComparator53);
        org.junit.Assert.assertNotNull(wildcardItorList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strComparator56);
        org.junit.Assert.assertNotNull(strComparator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(typeItorItor61);
        org.junit.Assert.assertNotNull(collatingIteratorArray63);
        org.junit.Assert.assertNotNull(typeItorArray64);
        org.junit.Assert.assertNotNull(typeItorItor75);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[], java.util.Comparator<java.lang.String>> typeItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeItorArrayItor0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray1 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray2 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray1;
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray4 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray5 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray4;
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray7 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray8 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray7;
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray10 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray11 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray10;
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray13 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray14 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray13;
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray16 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray17 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray16;
        org.apache.commons.collections4.comparators.ComparableComparator[][] comparableComparatorArray19 = new org.apache.commons.collections4.comparators.ComparableComparator[6][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[][] strComparableComparatorArray20 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[][]) comparableComparatorArray19;
        strComparableComparatorArray20[0] = strComparableComparatorArray2;
        strComparableComparatorArray20[1] = comparableComparatorArray4;
        strComparableComparatorArray20[2] = strComparableComparatorArray8;
        strComparableComparatorArray20[3] = strComparableComparatorArray11;
        strComparableComparatorArray20[4] = comparableComparatorArray13;
        strComparableComparatorArray20[5] = strComparableComparatorArray17;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray20);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor35 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray20, 3);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray20);
        org.junit.Assert.assertNotNull(comparableComparatorArray1);
        org.junit.Assert.assertNotNull(strComparableComparatorArray2);
        org.junit.Assert.assertNotNull(comparableComparatorArray4);
        org.junit.Assert.assertNotNull(strComparableComparatorArray5);
        org.junit.Assert.assertNotNull(comparableComparatorArray7);
        org.junit.Assert.assertNotNull(strComparableComparatorArray8);
        org.junit.Assert.assertNotNull(comparableComparatorArray10);
        org.junit.Assert.assertNotNull(strComparableComparatorArray11);
        org.junit.Assert.assertNotNull(comparableComparatorArray13);
        org.junit.Assert.assertNotNull(strComparableComparatorArray14);
        org.junit.Assert.assertNotNull(comparableComparatorArray16);
        org.junit.Assert.assertNotNull(strComparableComparatorArray17);
        org.junit.Assert.assertNotNull(comparableComparatorArray19);
        org.junit.Assert.assertNotNull(strComparableComparatorArray20);
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor33);
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor35);
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor36);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int15 = strComparableComparator12.compare("hi!", "hi!");
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int19 = strComparableComparator12.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator21 = strComparableComparator12.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator20);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator22 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator25 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int28 = strComparableComparator25.compare("hi!", "hi!");
        java.lang.String str29 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator25);
        int int32 = strComparableComparator25.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator33 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator34 = strComparableComparator25.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator33);
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator22.thenComparing(strComparator34);
        java.util.Comparator<java.lang.String> strComparator36 = strComparableComparator20.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator22);
        java.util.Comparator<java.lang.String> strComparator37 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator20);
        java.util.Comparator<java.lang.String> strComparator38 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator20);
        org.apache.commons.collections4.ResettableIterator resettableIterator39 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        resettableIterator39.reset();
        resettableIterator39.reset();
        boolean boolean42 = strComparableComparator20.equals((java.lang.Object) resettableIterator39);
        boolean boolean43 = strComparableComparator4.equals((java.lang.Object) strComparableComparator20);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray47);
        boolean boolean49 = strItor48.hasPrevious();
        boolean boolean50 = strItor48.hasNext();
        java.util.ListIterator<java.lang.String> strItor51 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor48);
        java.util.ListIterator<java.lang.String> strItor52 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor48);
        boolean boolean53 = strComparableComparator4.equals((java.lang.Object) strItor52);
        boolean boolean54 = strItor52.hasPrevious();
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertNotNull(strComparator21);
        org.junit.Assert.assertNotNull(strComparableComparator22);
        org.junit.Assert.assertNotNull(strComparableComparator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator33);
        org.junit.Assert.assertNotNull(strComparator34);
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(resettableIterator39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strItor51);
        org.junit.Assert.assertNotNull(strItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
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
        // The following exception was thrown during execution in test generation
        try {
            strItor12.set("");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        int int5 = strItor0.previousIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[][][]> mapIteratorArrayItor45 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparator41, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
        java.util.Comparator[] comparatorArray1 = new java.util.Comparator[0];
        @SuppressWarnings("unchecked")
        java.util.Comparator<java.util.Comparator<java.lang.String>>[] strComparatorComparatorArray2 = (java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1;
        java.util.Comparator<java.util.Comparator<java.lang.String>> strComparatorComparator3 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.util.Comparator<java.lang.String>>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.AnnotatedElement> annotatedElementComparator4 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.AnnotatedElement>[]) comparatorArray1);
        java.util.Comparator<java.io.Serializable> serializableComparator5 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.io.Serializable>[]) comparatorArray1);
        java.util.Comparator<java.lang.reflect.Type> typeComparator6 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<java.lang.reflect.Type>[]) comparatorArray1);
        java.util.Comparator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayComparator7 = org.apache.commons.collections4.ComparatorUtils.chainedComparator((java.util.Comparator<org.apache.commons.collections4.MapIterator[][]>[]) comparatorArray1);
        java.util.ListIterator<java.util.Comparator<org.apache.commons.collections4.MapIterator>[]> mapIteratorComparatorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.Comparator<org.apache.commons.collections4.MapIterator>[]) comparatorArray1);
        org.junit.Assert.assertNotNull(comparatorArray1);
        org.junit.Assert.assertNotNull(strComparatorComparatorArray2);
        org.junit.Assert.assertNotNull(strComparatorComparator3);
        org.junit.Assert.assertNotNull(annotatedElementComparator4);
        org.junit.Assert.assertNotNull(serializableComparator5);
        org.junit.Assert.assertNotNull(typeComparator6);
        org.junit.Assert.assertNotNull(mapIteratorArrayComparator7);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArrayItor8);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
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
        java.util.Comparator<java.lang.String> strComparator37 = strComparableComparator4.reversed();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor38 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean39 = strItor38.hasNext();
        int int40 = strItor38.nextIndex();
        boolean boolean41 = strItor38.hasPrevious();
        boolean boolean42 = strItor38.hasPrevious();
        boolean boolean43 = strComparableComparator4.equals((java.lang.Object) strItor38);
        boolean boolean44 = strItor38.hasNext();
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
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int7 = strItor0.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
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
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
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
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        int int14 = strItor4.previousIndex();
        boolean boolean15 = strItor4.hasPrevious();
        java.lang.String str16 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
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
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
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
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor50 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.Type[]) wildcardClassArray38);
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
        org.junit.Assert.assertNotNull(typeItor50);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("");
        boolean boolean2 = strItor1.hasNext();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1552");
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.util.Comparator<org.apache.commons.collections4.MapIterator>[][]> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItor0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][], java.util.Iterator> typeItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItorArrayItor0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[][], java.lang.Class<?>[]> typeItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass1 = typeItorArrayItor0.getClass();
        org.junit.Assert.assertNotNull(typeItorArrayItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1560");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, org.apache.commons.collections4.MapIterator> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.Type[][][][][], java.util.RandomAccess[]> typeArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(typeArrayItor0);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
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
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
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
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
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
        strItor4.set("hi!");
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
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1571");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1572");
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1573");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> charSequenceItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItorItor0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1574");
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1575");
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1576");
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1577");
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1578");
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1579");
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1580");
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1581");
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1582");
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1583");
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1584");
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1585");
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
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1586");
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1587");
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1588");
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
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1589");
        org.apache.commons.collections4.MapIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[], java.lang.String[]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1590");
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1591");
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1592");
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1593");
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1594");
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1595");
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1596");
        org.apache.commons.collections4.OrderedIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorCollectionArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorCollectionArrayItor0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1597");
        org.apache.commons.collections4.OrderedIterator<java.lang.Class<?>[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1598");
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1599");
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
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1600");
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1601");
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1602");
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1603");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator[], java.lang.Class<?>[]> mapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(mapIteratorArrayItor0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1604");
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1605");
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
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1606");
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1607");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean9 = strItor8.hasNext();
        int int10 = strItor8.previousIndex();
        java.lang.String str11 = strItor8.next();
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
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1608");
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1609");
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1610");
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1611");
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1612");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(mapIteratorItor0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1613");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[][]> iteratorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(iteratorItorArrayItor0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1614");
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
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1615");
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1616");
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1617");
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableItor1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1618");
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1619");
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
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1620");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("");
        boolean boolean2 = strItor1.hasPrevious();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1621");
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
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1622");
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1623");
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1624");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasNext();
        java.util.ListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1625");
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1626");
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1627");
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1628");
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1629");
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1630");
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
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1631");
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1632");
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1633");
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1634");
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
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1635");
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1636");
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1637");
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1638");
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
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1639");
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
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator16 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator19 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int22 = strComparableComparator19.compare("hi!", "hi!");
        java.lang.String str23 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator19);
        int int26 = strComparableComparator19.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator28 = strComparableComparator19.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.util.Comparator<java.lang.String> strComparator29 = strComparableComparator16.thenComparing(strComparator28);
        java.util.Comparator<java.lang.String> strComparator30 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator28);
        java.util.Comparator<java.lang.String> strComparator31 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator28);
        boolean boolean32 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparator28);
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
        org.junit.Assert.assertNotNull(strComparableComparator16);
        org.junit.Assert.assertNotNull(strComparableComparator19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1640");
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1641");
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1642");
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
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1643");
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
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1644");
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
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1645");
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1646");
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1647");
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
}

